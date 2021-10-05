package dao;

import dbconfig.DbConfig;
import dto.DepDTO;
import dto.UserDTO;
import utility.Query;

import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<UserDTO> getUserlist() throws SQLException, NamingException {

        List<UserDTO> datas = new ArrayList<>();
        Connection con = DbConfig.open();
        PreparedStatement pst = con.prepareStatement((Query.USER_LIST.getQuery()));
        ResultSet resultSet = pst.executeQuery();

        while(resultSet.next()){

            Integer id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String surname = resultSet.getString(3);
            String birthplace = resultSet.getString(4);
            String depname = resultSet.getString(5);
            String depmanager = resultSet.getString(6);

            UserDTO userDTO = new UserDTO(id,name,surname,birthplace,depname,depmanager);

            datas.add(userDTO);

        }
        return datas;
    }

    @Override
    public List<DepDTO> getDepList() throws SQLException, NamingException {

        List<DepDTO> datas = new ArrayList<>();
        Connection con = DbConfig.open();
        PreparedStatement pst = con.prepareStatement((Query.DEP_LIST.getQuery()));
        ResultSet resultSet = pst.executeQuery();

        while(resultSet.next()) {

            Integer id = resultSet.getInt(1);
            String depname = resultSet.getString(2);
            String depmanager = resultSet.getString(3);

            DepDTO depDTO = new DepDTO(id,depname,depmanager);


            datas.add(depDTO);
        }

        return datas;

    }

    @Override
    public void insertUser(DepDTO data) {

        try {
            Connection con = DbConfig.open();
            String sqlcommand = "INSERT INTO DEPARTMENT VALUES (ORIENT_SEQ.NEXTVAL,?,?)";
            PreparedStatement pst = con.prepareStatement(sqlcommand);
            pst.setString(1, data.getDepname());
            pst.setString(2,data.getDepmanager());
            pst.execute();

        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
