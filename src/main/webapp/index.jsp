<%@ page import="java.util.List" %>
<%@ page import="dto.UserDTO" %>
<html>

<head>
  <link rel="stylesheet" href="content/css/jquery.dataTables.min.css">
  <link rel="stylesheet" href="content/css/mainstyle.css">
  <link rel="stylesheet" href="content/css/jquery-ui.css">
  <script src="content/js/jquery-3.6.0.min.js"></script>
  <script src="content/js/jquery-ui.js"></script>
  <script src="content/js/jquery.dataTables.min.js"></script>
  <script src="content/js/internal/load.js"></script>
  <script src="content/js/internal/action.js"></script>

</head>

<body>
<header>
  <h4 id="headerId">This header</h4>
</header>
<section>
  <nav >
    <button class="menuBtnDesign" id="prsBtnId">Emekdashlar</button>
    <button class="menuBtnDesign" id="depBtnId">Departamentler</button>
<%--    <button class="menuBtnDesign">University</button>--%>
<%--    <button class="menuBtnDesign">Luget melumatlari</button>--%>
  </nav>
  <article>
    <div id="userDiv">
      <table  class="display">
        <thead>
        </thead>
        <tbody id="userRows">
        </tbody>
      </table>
      <div id="add-user-dialog-form">
      </div>
      <button id="addUserId">AddDepartment</button>
    </div>
  </article>
</section>
<footer>
  <p>@copyright Hajikhanov </p>
</footer>
</body>

</html>
