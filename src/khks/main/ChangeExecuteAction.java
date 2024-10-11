package khks.main;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Staff;
import dao.StaffDao;
import tool.Action;


public class ChangeExecuteAction extends Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		//ローカル変数の宣言 1
		HttpSession session = req.getSession();//セッション
		Staff staff = (Staff)session.getAttribute("user");//ログインユーザー

		String url = "";
		String staff_id = "";
		String newpassword = "";
		String confirmpassword = "";
		StaffDao staffDao = new StaffDao();
		Integer rSet;

		//リクエストパラメータ―の取得 2
		staff_id = staff.getStaff_id(); // 教員ID
		newpassword = req.getParameter("newpassword");//パスワード
		confirmpassword = req.getParameter("confirmpassword");//パスワード

		//DBからデータ取得 3
		//なし

		//ビジネスロジック 4
		//なし

		//DBへデータ保存 5
		if (newpassword.equals(confirmpassword)){
			rSet = staffDao.change(staff_id, newpassword);//教員データ取得
			url = "menu.jsp";
		} else {
			// パスワードが同一ではない
			// エラーメッセージをセット
			List<String> errors = new ArrayList<>();
			errors.add("パスワードが異なっています");
			req.setAttribute("errors", errors);

			//フォワード
			url = "change.jsp";
		}

		//レスポンス値をセット 6
		//フォワード 7
		req.getRequestDispatcher(url).forward(req, res);
	}

}
