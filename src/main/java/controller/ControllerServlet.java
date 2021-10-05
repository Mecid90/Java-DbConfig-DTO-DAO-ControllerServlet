package controller;

import dao.UserDao;
import dao.UserDaoImpl;
import dto.DepDTO;
import dto.UserDTO;

import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ControllerServlet", value = "/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        register (request, response);

    }




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        register(request,response);
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = null;
        String action = request.getParameter("action");
        UserDao userDao = new UserDaoImpl();

        if("userList".equalsIgnoreCase(action)){

            path = "/WEB-INF/tables/users.jsp";
            try {
                List<UserDTO> users = userDao.getUserlist();
                request.setAttribute("userList",users);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NamingException e) {
                e.printStackTrace();
            } catch(Exception ex) {
                ex.printStackTrace();
            }

        }else if("depList".equalsIgnoreCase(action)){

            path = "/WEB-INF/tables/deps.jsp";
            try {
                List<DepDTO> users = userDao.getDepList();
                request.setAttribute("depList",users);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NamingException e) {
                e.printStackTrace();
            } catch(Exception ex) {
                ex.printStackTrace();
            }


        }else if ("addUser".equalsIgnoreCase(action)){
            path = "index.jsp";

            String name = request.getParameter("name");
            String email = request.getParameter("email");
            DepDTO dep = new DepDTO(name,email);

            userDao.insertUser(dep);
        }


        RequestDispatcher dispatcher =  request.getRequestDispatcher(path);
        dispatcher.forward(request,response);
    }
}
