<%@ page import="dto.UserDTO" %>
<%@ page import="java.util.List" %>
<%@ page import="dto.DepDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<tr>
    <th>ID</th>
    <th>DEPARTAMENT ADI</th>
    <th>DEPARTAMENT DIREKTORU</th>
</tr>
<%
    List<DepDTO> deps = (List<DepDTO>) request.getAttribute("depList");
    for(DepDTO dep:deps){
%>
<tr>
    <td><%=dep.getId()%></td>
    <td><%=dep.getDepname()%></td>
    <td><%=dep.getDepmanager()%></td>
</tr>
<%}%>

