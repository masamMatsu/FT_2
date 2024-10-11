<%-- メニューJSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/common/base.jsp">
	<c:param name="title">
		得点管理システム
	</c:param>

	<c:param name="scripts"></c:param>

	<c:param name="content">
		<table style="border-collapse:separate;border-spacing:10px;">
			<tr>
				<th align="center">学生番号</th>
				<th align="center">学生氏名</th>
				<th align="center">得点</th>
			</tr>
			<c:forEach var="grades" items="${gradeslist}">
				<tr>
					<td>${grades.student_no}</td>
					<td>${grades.student_name}</td>
					<td>${grades.point}</td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<p><small></small></p>
		<p><small></small></p>


	</c:param>
</c:import>