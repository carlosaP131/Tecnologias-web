<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layout/header.jsp"></jsp:include>



<div class="row">
    <c:forEach var="frutas" items="${listaFrutas}">
        <div class="col-2 ">

            <div class="card " style="width: 18rem;">
                
                <div class="card-header bg-dark  text-white">
                    <c:out value="${frutas.id}"></c:out>
                    </div>
                    <div class="card-body ">
                        <strong>Nombre:</strong>
                    <c:out value="${frutas.nombre}"></c:out>
                        <br>
                        <strong>Tipo:</strong>
                    <c:out value="${frutas.tipo}"></c:out>
                    </div>
                    <div class="card-footer ">
                        <button type="submit" class="btn btn-primary btn-block"><a class="tabla" href="${pageContext.request.contextPath}/FrutasServlet?accion=actualizarFormulario&id=<c:out value="${frutas.id}"></c:out>">Actualizar</a></button>
                    <br>
                    <br>
                    <br>
                        <button type="submit" class="btn btn-primary btn-block"><a class="tabla" href="${pageContext.request.contextPath}/FrutasServlet?accion=eliminar&id=<c:out value="${frutas.id}"></c:out>">Eliminar</a></button>

                    </div>
                </div>
            </div>
                    
    </c:forEach>
</div>
<jsp:include page="../layout/footer.jsp"></jsp:include>