<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%--
  Created by IntelliJ IDEA.
  User: jaechango_cudo
  Date: 2022/01/11
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //request, response 사용 가능
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberSaveServlet.service");

    String username = request.getParameter("username");

    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username,age);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id = ${member.id}</li>
    <li>username = ${member.username}</li>
    <li>age = ${member.age}</li>
</ul>
<a href="/index.html">메인 </a>
</body>
</html>
