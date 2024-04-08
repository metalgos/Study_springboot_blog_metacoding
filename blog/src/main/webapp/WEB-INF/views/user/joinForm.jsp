<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file ="../layout/header.jsp" %>

  <div class="container">

<form>
<div class="form-group">
  <label for="username" class="form-label">username</label>
  <input type="username" class="form-control" id="username" placeholder="Enter name">
</div>

<div class="mb-3">
  <label for="password" class="form-label">password</label>
  <input type="password" class="form-control" id="password" placeholder="******">
</div>

<div class="mb-3">
  <label for="email" class="form-label">Email address</label>
  <input type="email" class="form-control" id="email" placeholder="name@example.com">
</div>

</form>

<button id="btn-save" type="button" class="btn btn-primary">회원가입 완료</button>
  </div>

<script src = "/blog/js/user.js"></script>
<%@ include file ="../layout/footer.jsp" %>