<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body style="background : #e2e2e2;">
  <div class="container mt-4">
  
  <div class="row">
  <div class="col-md-6 offset-md-3">
 <div class="card">
 <div class="card-body">
 <h2 class="text-center text-primary">Form</h2>
 <form action="handleform" method="post">
  <div class="form-group">
    <label >Name</label>
    <input type="text" class="form-control" name="name" aria-describedby="emailHelp" placeholder="Enter Name">
  </div>
     <div class="form-group">
    <label >ID</label>
    <input type="text" class="form-control" name="Id" aria-describedby="emailHelp" placeholder="Enter ID">
  </div>
     <div class="form-group">
    <label >Date of Birth</label>
    <input type="text" class="form-control" name="date"  placeholder="dd/mm/yyyy">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect2">Select Course</label>
    <select multiple class="form-control" name="course">
      <option>Java</option>
      <option>Python</option>
      <option>.Net</option>
      <option>Testing</option>
      <option>M/L</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect2">Gender</label>
    <div class="form-check from-check-inline">
    <input class="form-check-input" type="radio" name="gender" value="male">
    <label class=form-check-label">Male</label>
    </div>
    <div class="form-check from-check-inline">
    <input class="form-check-input" type="radio" name="gender" value="Female">
    <label class=form-check-label">Female</label>
    </div>
    </div>
    <div class="form-group">
    <label for="exampleFormControlSelect2" name="type">Select Type </label>
    <select class="form-control" name="type">
    <option value="New Student">New Student</option>
    <option value="Old Student">Old Student</option>
    </select>
    </div>
 <div class=" text-center ">
 <button class="btn btn-success" type="submit">Submit</button>
 </div>
 </form>
 
 </div>
 
 </div>
  </div>
  
  </div>
  </div>
    

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>