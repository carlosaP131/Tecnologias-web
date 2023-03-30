<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layout/header.jsp"></jsp:include>

    
      <div class="registration-form text-center">
    <form action="${pageContext.request.contextPath}/FrutasServlet?accion=actualizar" method="POST">
                <div class="form-group">
                    <input type="hidden" name="id" value="<c:out value='${frutas.id}' />" class="form-control" id="nombreLabel" aria-describedby="emailHelp" placeholder="Nombre">
                </div>
                
                <div class="form-group">
                    <label for="nombreLabel">Nombre</label>
                    <input type="text" name="nombre" value="<c:out value='${frutas.nombre}' />" class="form-control" id="nombreLabel" aria-describedby="emailHelp" placeholder="Nombre">
                </div>
                <div class="form-group">
                    <label for="passwordLabel">Password</label>
                    <input type="text" name="tipo" value="<c:out value='${frutas.tipo}' />" class="form-control" id="passwordLabel" placeholder="Tipo de fruta">
                </div>
           
                <button type="submit" class="btn btn-primary btn-block">Guardar Registro</button>
            </form>
</div> 

<jsp:include page="../layout/footer.jsp"></jsp:include>
