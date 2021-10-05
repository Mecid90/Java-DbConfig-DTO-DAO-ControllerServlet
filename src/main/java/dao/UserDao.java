package dao;

import dto.DepDTO;
import dto.UserDTO;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    List<UserDTO> getUserlist() throws SQLException, NamingException;
    List<DepDTO> getDepList() throws SQLException, NamingException;
    void insertUser(DepDTO data);



}
