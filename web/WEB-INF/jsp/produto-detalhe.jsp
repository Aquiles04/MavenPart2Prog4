<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="modelos.Produto"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Produto ${produto.id}</h1>
        
        
                   
        
        <p>Id: ${produto.id} </p>
        <p>Nome do Produto: ${produto.nome} </p>
        <p>Quantidade: ${produto.quantidade} </p>
        <p>Preço:R$ ${produto.precoUnitario} </p>
        
        
    </body>
</html>
