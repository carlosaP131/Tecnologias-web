<%-- 
    Document   : footer
    Created on : 22 mar 2023, 17:08:11
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/font-awesome/6.3.0/css/all.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/js.js"/>

        <title>Frutas</title>        
    </head>
    <body>
       
        <nav class="nav">
            <div class="container">

                <div id="mainListDiv" class="main_list">
                    <ul class="navlinks">
                        <li>  <a class="nav-item nav-link active" href="${pageContext.request.contextPath}/pages/index.jsp">Home </a></li>
                        <li>   <a class="nav-item nav-link" href="${pageContext.request.contextPath}/pages/usuario/crearUsuario.jsp">Crear Usuario</a></li>
                        <li>  <a class="nav-item nav-link" href="${pageContext.request.contextPath}/FrutasServlet?accion=listar">Listar Frutas</a></li>

                    </ul>
                </div>
                <span class="navTrigger">
                    <i></i>
                    <i></i>
                    <i></i>
                </span>
            </div>
        </nav>
                        <div class="container">







