<%@ page import="dto.UserDTO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<tr>
    <th>ID</th>
    <th>AD</th>
    <th>SOYAD</th>
    <th>DOGUM YERI</th>
    <th>DEPARTAMENT ADI</th>
    <th>DEPARTAMENT DIREKTORU</th>
</tr>

<%
    List<UserDTO> users = (List<UserDTO>) request.getAttribute("userList");
    for(UserDTO user:users){
%>
<tr>
    <td><%=user.getId()%></td>
    <td><%=user.getName()%></td>
    <td><%=user.getSurname()%></td>
    <td><%=user.getBirthplace()%></td>
    <td><%=user.getDepname()%></td>
    <td><%=user.getDepmanager()%></td>
</tr>
<%}%>

