<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Todo Page</title>
  <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <form:form action="/add-todo" method="post" modelAttribute="todo">
            <fieldset class="form-group">
                <form:label for="description" path="description">Description</form:label>
                <form:input type="text" id="description" path="description" class="form-control" required="required"/>
            </fieldset>
            <button type="submit" class="btn btn-success">Add Todo</button>
        </form:form>
    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>