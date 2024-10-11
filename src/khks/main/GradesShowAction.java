package khks.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Grades;
import bean.Student;
import dao.GradesDaoC;
import dao.StudentDaoC;
import tool.Action;


public class GradesShowAction extends Action {
	public void execute(
		HttpServletRequest req, HttpServletResponse res
	) throws Exception {

		HttpSession session=req.getSession();

		//入学年度のドロップダウンに表示するデータを取得してセッションに設定
		StudentDaoC dao=new StudentDaoC();
		List<Student> studentlist=dao.search_entranceyear();
		session.setAttribute("studentlist", studentlist);

		//クラスのドロップダウンに表示するデータを取得してセッションに設定
		GradesDaoC dao2=new GradesDaoC();
		List<Grades> gradeslist=dao2.search_classno();
		session.setAttribute("gradeslist", gradeslist);

System.out.println("rarara1");

		req.getRequestDispatcher("grades.jsp").forward(req, res);
//		return "grades.jsp";
	}
}
