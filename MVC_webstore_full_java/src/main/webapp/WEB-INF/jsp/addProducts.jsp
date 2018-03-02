<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
   <title>Ajouter un produit</title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
</head>
<body>
   <section>
       <div class="jumbotron">
           <div class="container">
               <h1>Customers</h1>
           </div>
           <%--<a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btn-mini pull-right">logout</a>--%>
       </div>
   </section>
   <section class="container">
       <form:form modelAttribute="newProduct" class="form-horizontal">
           <fieldset>
               <legend>Add new product</legend>
               <div class="form-group">
                   <label class="control-label col-lg-2" for="name">Nom : </label>
                   <div class="col-lg-10">
                       <form:input id="name" path="name" type="text" class="form.input-large"/>
                   </div>
               </div>
               <div class="form-group">
                   <label class="control-label col-lg-2" for="price">Prix : </label>
                   <div class="col-lg-10">
                       <form:input id="price" path="price" type="text" class="form.input-large"/>
                   </div>
               </div>
               <div class="form-group">
                   <label class="control-label col-lg-2" for="description">Description : </label>
                   <div class="col-lg-10">
                       <form:input id="description" path="description" type="text" class="form.input-large"/>
                   </div>
               </div>
               <div class="form-group">
                   <label class="control-label col-lg-2" for="category">Catégorie : </label>
                   <div class="col-lg-10">
                       <form:input id="category" path="category" type="text" class="form.input-large"/>
                   </div>
               </div>
               <div class="form-group">
                   <label class="control-label col-lg-2" for="unitsInStock">Unité en stock : </label>
                   <div class="col-lg-10">
                       <form:input id="unitsInStock" path="unitsInStock" type="text" class="form.input-large"/>
                   </div>
               </div>
               <div class="form-group">
                   <label class="control-label col-lg-2" for="condition">Condition : </label>
                   <div class="col-lg-10">
                       <form:radiobutton id="condition" path="condition" value="New"/>New
                       <form:radiobutton id="condition" path="condition" value="Old"/>Old
                       <form:radiobutton id="condition" path="condition" value="Refurbished"/>Refurbished
                   </div>
               </div>
               <div class="form-group">
                   <div class="col-lg-offset-2 col-lg-10">
                       <input type="submit" id="btnAdd" class="btn btn-primary" value="Add"/>
                   </div>
               </div>
           </fieldset>
       </form:form>
   </section>
</body>
</html>