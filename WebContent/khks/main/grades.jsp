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
		<form action="GradesList.action" method="post">
			<table style="border-collapse:separate;border-spacing:10px;">
				<tr>
					<th align="center">入学年度</th>
					<th align="center">クラス</th>
					<th align="center">期間</th>
				</tr>
				<tr>
					<td>
						<select name="ent_year">
							<c:forEach var="student" items="${studentlist}">
								<option value="${student.ent_year}">${student.ent_year}年</option>
							</c:forEach>
						</select>
					</td>

					<td>
						<select name="class_no">
							<c:forEach var="grades" items="${gradeslist}">
								<option value="${grades.class_no}">${grades.class_no}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="action" value="成績表示">
					</td>
					<td>
						<input type="submit" name="action" value="入力科目チェック">
					</td>
					<td>
						<input type="submit" name="action" value="60点未満チェック">
					</td>
				</tr>
			</table>
		</form>
		<br>
		<p><small></small></p>
		<p><small></small></p>
	</c:param>
</c:import>