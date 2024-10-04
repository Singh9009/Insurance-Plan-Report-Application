<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
          rel="stylesheet" 
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
          crossorigin="anonymous">
     
</head>

<body style="background-color:#F5FFFA;">

<div class="container">
<h2 class="pb-3 pt-3">Report Application</h2>
<form:form action="search" modelAttribute="searchmodel" method="POST">
<table>
   <tr>
      <td>Plan Name: </td>
      <td>
         <form:select path="planName">
             <form:option value="">--select--</form:option>
             <form:options items="${names}"/>
         </form:select>
      </td>
      
      
      <td>Plan Status: </td>
      <td>
         <form:select path="planStatus">
             <form:option value="">--select--</form:option>
             <form:options items="${status}"/>
         </form:select>
      </td>
      
      
      <td>Gender: </td>
      <td>
         <form:select path="gender">
             <form:option value="">--select--</form:option>
             <form:option value="Male">Male</form:option>
             <form:option value="Female">Female</form:option>
         </form:select>
      </td>
   </tr>
    
    
    <tr><td></td></tr>
    <tr><td></td></tr>
   
   <tr>
      <td>Plan Start Date:</td>
      <td>
         <form:input path="startDate" type="date" data-date-formate="mm/dd/yyyy"/>
      </td>
   
   <td>Plan End Date:</td>
      <td>
         <form:input path="endDate" type="date" data-date-formate="mm/dd/yyyy"/>
      </td>
  </tr>
  
  <tr><td></td></tr>
  <tr><td></td></tr>
  
  <tr>
     <td>
      <input type="submit" value="Search" class="btn btn-primary"/>
     </td>
  </tr>
</table>
</form:form>
<hr/>

<table class="table table-stripped table-hover">
  <thead>
     <tr>
       <th>ID</th>
       <th>Holder Name</th>
       <th>Gender</th>
       <th>Plan Name</th>
       <th>Plan Status</th>
       <th>Start Date</th>
       <th>End Date</th>
       <th>Benefit Amt</th>
     </tr>
  </thead>
  
  <tbody>
    <c:forEach items="${citizenList}" var="plan">
       <tr>
          <td>${plan.citizenId }</td>
          <td>${plan.citizenName }</td>
          <td>${plan.gender }</td>
          <td>${plan.planName }</td>
          <td>${plan.planStatus }</td>
          <td>${plan.planStartDate }</td>
          <td>${plan.planEndDate }</td>
          <td>${plan.benefitAmount }</td>
       </tr>
    </c:forEach>
    <tr>
    <c:if test="${empty citizenList}">
      <td colspan="8"><h2 style="color: red; text-align: center;">No Record Found...</h2></td>
    </c:if>
    </tr>
  </tbody>
</table>

<hr/>


Export: &nbsp;<a href="">Excel</a>&nbsp;&nbsp;&nbsp;
              <a href="">Pdf</a>

</div>



 
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
            crossorigin="anonymous">
    </script>
    
 
</body>
</html>