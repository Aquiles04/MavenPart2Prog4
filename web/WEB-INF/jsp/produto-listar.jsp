<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="modelos.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Produtos</title>
    </head>
    <body>
        <h1>Hello!</h1>
        
        <c:forEach var="produto" items="${produtos}">
                   
        
        <p> ${produto.id} </p>
        <p> ${produto.nome} </p>
        <p> ${produto.quantidade} </p>
        <p> ${produto.precoUnitario} </p>
        
        </c:forEach>
        
        
    </body>
</html>
