<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" --%>
<html>
<head>
    <title>Department CRUD Operations</title>
</head>
<body>
    <center>
        <h2>
            <a href="/createdepartment">Insert Department</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/getalldepartments">List All Departments</a> 
        </h2>
    </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Departments</h2></caption>
            <tr>
                <th>DEPTID</th>
                <th>DNAME</th>
                <th>DHEAD</th>
            </tr>
        </table>
    </div>   
</body>
</html>