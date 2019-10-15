## Learn Spring Boot in 100 Steps - Beginner to Expert :rocket:

### Day 04: 09-Oct-2019
 
- [x] 09: Magic of Spring
- [x] 10: Create TodoController, list-todos view and TodoService
- [x] 11: Architecture of Web Applications
1. Learnt how below annotations work in a Spring Boot application
    - **@Component, @Controller, @Service and @Repository**
    - **@Autowired**
    - **@ComponentScan**
2. Completed a POC that explains how _**@ComponentScan**_ works
3. Created a **TodoController**(_controller_) which redirects requests to **TodoService**(_service_)
   and presents the data retrieved on a **list-todos.jsp** page(_view_)
4. Used a in-memory static arraylist of todos, which we will change in later point of course
5. Now, flow of the application is as follows:
    ```
    Browser -> /login -> LoginController -> LoginService -> validateUser
    -> false -> Invalid Credentials -> login.jsp
    -> true -> welcome.jsp -> Todos Link -> /list-todos -> TodoController
    -> TodoService -> todos -> list-todos.jsp
   ```

### Day 05: 10-Oct-2019
- [x] 12: **Session vs Model vs Request - _@SessionAttributes_**
1. Session is the way to store values across multiple requests
2. Values in request are request scope
3. Values in model are by default request scope
4. Http is a stateless protocol
5. _@SessionAttributes_ to store values across multiple request - Session

### Day 06: 11-Oct-2019
- [x] 13: Add new todo
1. Learnt how to redirect to another request mapping from the controller's method
2. Add **'redirect:/mapping'** instead of view

### Day 07: 12-Oct-2019
- [x] 14: Display Todos in a table format using **JSTL** tags
1. Added jstl dependency in pom.xml. Added jstl core taglib top of list-todos.jsp page
2. Learnt how to display todos using jstl **<c:forEach>** tag.

### Day 08: 13-Oct-2019
- [x] 15: Bootstrap for Page formatting using _webjars_
- [x] 16: Delete a todo
- [x] 17: Format add Todo page and adding basic HTML5 form validation
1. **Webjars** is the way of adding static files(bootstrap, jquery etc.) as dependencies to project
2. Added bootstrap css functionality to list-todos.jsp page
3. Played around with bootstrap css classes: _**table table-striped, container**_
4. Wrote a deleteTodo method in controller that takes id of the task to be deleted and delete
   it from the arrayList.
5. Used bootstrap css classes for button deletion: _**btn btn-warning**_
6. Learnt how to pass taskId in href of a link
7. Formatted add-todo page with bootstrap css classes: _**btn btn-success, <fieldset>, form-group, form-control**_
8. Added basic HTML5 validation using _**required="required"**_ for input

### Day 09: 14-Oct-2019
- [x] 18: Part 1 Validations with Hibernate Validator - Using **commandBean**
1. Learnt how to map entire bean to a _**FormBacking Object or commandBean**_ instead of several request params
2. Latest version of spring mvc use _**modelAttribute**_ in form instead of old commandBean
3. Use spring form tags - for both side binding. Values from the form are bound to the bean and
   values from bean are bound to the form
   
### Day 10: 15-Oct-2019
- [x] 18: Part 2 Using **JSR 349 validations**
1. We added validation on Todo bean using _**@Size**_ of java validation API
2. After adding validation on the bean, we added **@Valid** to enable validation on controller
3. Once we add _@Valid_ annotation on the bean, the result will be populated in the **BindingResult**
4. We checked if BindingResult has any errors, if any return user to todo.jsp page
5. In todo.jsp page, we added **<form-errors path=desc>** to show errors related to description field 
