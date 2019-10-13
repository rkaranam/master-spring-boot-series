<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Todos of ${login_name}</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h3>Your Todos</h3>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Task Completed</th>
                    <th>Delete Task</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.completed}</td>
                        <td>
                            <a type="button" class="btn btn-warning"
                               href="/delete-todo?id=${todo.id}">Delete</a>
                       </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div><a href="/add-todo" class="button">Add a Todo</a></div>
    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>