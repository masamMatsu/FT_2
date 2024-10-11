package khks.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Grades2;
import dao.GradesDaoC;
import tool.Action;


public class GradesListAction extends Action {
	public void execute(
		HttpServletRequest req, HttpServletResponse res
	) throws Exception {

		HttpSession session=req.getSession();

		//リクエストからデータを取得
		String strEnt_year=req.getParameter("ent_year");
		String strClass_no=req.getParameter("class_no");


		//成績一覧を取得してセッションに設定
		GradesDaoC dao=new GradesDaoC();
		List<Grades2> gradeslist=dao.search();
		session.setAttribute("gradeslist", gradeslist);

		System.out.println("rarara2");

		req.getRequestDispatcher("gradeslist.jsp").forward(req, res);
//		return "grades.jsp";
	}
}
