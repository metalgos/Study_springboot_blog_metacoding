<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file ="../layout/header.jsp" %>

  <div class="container">


<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">username</label>
  <input type="username" class="form-control" id="exampleFormControlInput1" placeholder="Enter name">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Email address</label>
  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">password</label>
  <input type="password" class="form-control" id="exampleFormControlInput1" placeholder="******">
</div>

<button type="button" class="btn btn-primary">회원가입 완료</button>

  </div>


<%@ include file ="../layout/footer.jsp" %>