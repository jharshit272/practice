<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quiz</title>
</head>
<body>

<h1>Welcome to Quiz</h1>
<%session.setAttribute("questionNumber", 1);
session.setAttribute("score", 0);
%>

<h3><a href="question1.jsp">Start game</a></h3>

<p> Note: You will be given maximum 5 seconds to answer a question and it will
be moved to next question</p>

</body>
</html>