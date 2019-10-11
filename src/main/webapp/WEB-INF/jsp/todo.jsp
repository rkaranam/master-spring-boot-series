<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Todo Page</title>
</head>
<body>
    <form action="/add-todo" method="post">
      <label for="description">Description: </label>
      <input type="text" name="description" id="description"/>
      <input type="submit" value="Add Todo">
    </form>
</body>
</html>