<!DOCTYPE html>
<html xmlns:th="https://thymeleaf.org/">
<head>
    <title>New person</title>
</head>
<body>
<form th:method="POST" th:action="@{/people}" th:object="${person}">
    <label for="name">Enter name: </label>
<input type="text" th:field="*{name}" id="name"/>
    <br/>
    <input type="submit" value="create.">
</form>

</body>
</html>