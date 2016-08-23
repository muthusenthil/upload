<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="/WEB-INF/views/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="row" id="login">

  <div class="col-md-4 col-md-offset-7">

    <div class="panel panel-default">

      <div class="panel-heading">

         <span class="glyphicon glyphicon-lock"></span> Login</div>

      <div class="panel-body">

      <form class="form-horizontal" role="form">

        <div class="form-group">

          <label for="username" class="col-sm-3 control-label">

           UserName</label>

          <div class="col-sm-9">

            <input type="email" class="form-control" name="username" id="username" placeholder="UserName" required>

          </div>

        </div>

        <div class="form-group">

          <label for="loginPass" class="col-sm-3 control-label">

          Password</label>

          <div class="col-sm-9">

            <input type="password" class="form-control" name="loginPass" id="loginPass" placeholder="Password" required>

          </div>
        </div>

        <div class="form-group last">

          <div class="col-sm-offset-3 col-sm-9">

            <button type="submit" class="btn btn-success btn-sm">

            Sign in</button>

          </div>

        </div>

      </form>

    </div>

   
  </div>

</div>

</body>
</html>