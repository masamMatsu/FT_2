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
		<section class="me-4">
			<h2 class="h3 mb-3 fw-norma bg-secondary bg-opacity-10 py-2 px-4">メニュー</h2>
			<div class="row text-center px-4 fs-3 my-5">

				<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
					style="height: 10rem; background-color: #dbb;">
					<div>
						<div class="">出欠席入力</div>
							<div class="">
								<a href="Menu.action">入力</a>
							</div>
					</div>
				</div>

				<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
					style="height: 10rem; background-color: #bdb;">
					<div>
						<div class="">出欠席照会</div>
						<div class="">
							<a href="Menu.action">クラス別</a>
						</div>
						<div class="">
							<a href="Menu.action">日次</a>
						</div>
						<div class="">
							<a href="Menu.action">週次</a>
						</div>
						<div class="">
							<a href="Menu.action">注意</a>
						</div>
					</div>
				</div>

				<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
					style="height: 10rem; background-color: #bbd;">
					<div>
						<div class="">成績入力</div>
							<div class="">
								<a href="Menu.action">入力</a>
							</div>
						</div>
					</div>

				<div class="col d-flex align-items-center justify-content-center mx-2 rounded shadow"
					style="height: 10rem; background-color: #bdd;">
					<div>
						<div class="">成績照会</div>
						<div class="">
							<a href="GradesShow.action">表示</a>
						</div>
						<div class="">
							<a href="Menu.action">科目チェック</a>
						</div>
						<div class="">
							<a href="Menu.action">60点チェック</a>
						</div>
					</div>
				</div>

			</div>
		</section>
	</c:param>
</c:import>