<%@ include file="common/header.jspf" %>
<%@ include file="common/navigator.jspf" %>
<div class="container">
<h1>Welcome ${name }</h1>
<table class="table">
<thead><tr><th>id</th><th>Description</th><th>Target Date</th><th>Done</th></tr></thead>
<tbody>
<c:forEach items="${todo }" var="todos">
<tr><td>${todos.id }</td>
<td>${todos.description }</td>
<td>${todos.targetDate }</td>
<td>${todos.done }</td>
<td><a href="delete-todo?id=${todos.id}" class="btn btn-warning">Delete ${todos.id}</a></td>
<td><a href="update-todo?id=${todos.id}" class="btn btn-success">Update ${todos.id}</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="add-todo" class="btn btn-success" >Add</a>
</div>
<%@ include file="common/footer.jspf" %>