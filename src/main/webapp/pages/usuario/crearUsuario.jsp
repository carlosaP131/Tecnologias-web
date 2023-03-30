
<jsp:include page="../layout/header.jsp"></jsp:include>

  <div class="registration-form text-center">
    <form action="${pageContext.request.contextPath}/FrutasServlet?accion=crear" method="POST">
        <h3 class="text-center">Crea tu fruta</h3>
        <div class="form-group">
            <label for="nombreLabel">Nombre</label>
                    <input type="text" name="nombre" class="form-control item" id="nombreLabel" aria-describedby="emailHelp" placeholder="Nombre">
        </div>
        <div class="form-group">
            <input type="text" name="tipo" class="form-control item" id="passwordLabel" placeholder="Tipo de fruta">
        </div>
        <div class="form-group">
            <button class="btn btn-primary btn-block create-account" type="submit">Crear Fruta</button>
        </div>
    </form>
</div>

<jsp:include page="../layout/footer.jsp"></jsp:include>
