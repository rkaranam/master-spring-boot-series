<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Todos of ${login_name}</title>
</head>
<body>
    <h3>Here are your todos:</h3>
    <table>
        <thead>
            <tr>
                <th>Description</th>
                <th>Target Date</th>
                <th>Task Completed</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.completed}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <h4><a href="/add-todo">Add a Todo</a></h4>
</body>
</html>