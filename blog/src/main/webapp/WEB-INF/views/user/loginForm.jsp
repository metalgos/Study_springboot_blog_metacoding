<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file ="../layout/header.jsp" %>

  <div class="container">


<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">username</label>
  <input type="username" class="form-control" id="exampleFormControlInput1" placeholder="Enter name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">password</label>
  <input type="password" class="form-control" id="exampleFormControlInput1" placeholder="******">
</div>
 <div class="form-group form-check mb-3">
     <label class="form-check-label">
       <input class="form-check-input" type="checkbox"> Remember me
     </label>
   </div>
 <button type="button" class="btn btn-primary">로그인</button>
  </div>


<%@ include file ="../layout/footer.jsp" %>