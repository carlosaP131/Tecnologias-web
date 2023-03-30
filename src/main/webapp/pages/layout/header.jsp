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

        <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
            <div class="container-fluid">
                <img src="${pageContext.request.contextPath}/resources/img/manzana.png" alt="alt"/>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="navbar-nav me-auto">
                        <li>  <a class="nav-link active" href="${pageContext.request.contextPath}/pages/index.jsp">Home </a></li>
                   
                        </li>
                        <li>   <a class="nav-link" href="${pageContext.request.contextPath}/pages/usuario/crearUsuario.jsp">Crear Usuario</a></li>
                       
                        </li>
                        <li>  <a class="nav-link" href="${pageContext.request.contextPath}/FrutasServlet?accion=listar">Listar Frutas</a></li>
                       
                        </li>
                    </ul>
                   
                </div>
            </div>
        </nav>      

        <div class="container2">            







