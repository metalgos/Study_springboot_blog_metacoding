<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">  <meta charset="UTF-8">
    <title>HelloJSP</title>
</head>
<body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/blog/">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarScroll">
      <ul class="navbar-nav mr-auto my-2 my-lg-0 navbar-nav-scroll" style="max-height: 100px;">
        <li class="nav-item active">
          <a class="nav-link" href="/user/login">로그인</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/user/join">회원가입</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Link</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control mr-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </nav>


  <div class="container">

  <div class="card m-2">
    <div class="card-body">
      <h5 class="card-title">제목 적는 부분</h5>
      <p class="card-text">내용 적는 부분</p>
      <a href="#" class="btn btn-primary">상세보기</a>
    </div>
  </div>

  <div class="card m-2">
    <div class="card-body">
      <h5 class="card-title">제목 적는 부분</h5>
      <p class="card-text">내용 적는 부분</p>
      <a href="#" class="btn btn-primary">상세보기</a>
    </div>
  </div>


  <div class="card m-2">
    <div class="card-body">
      <h5 class="card-title">제목 적는 부분</h5>
      <p class="card-text">내용 적는 부분</p>
      <a href="#" class="btn btn-primary">상세보기</a>
    </div>
  </div>

  </div>

<footer class="">
  <div class="jumbotron text-center">

    <p>Create by Cos</p>
    <p>015-2233-2322</p>
    <p>대한 서울시 33동</p>

  </div>



</footer>

   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>