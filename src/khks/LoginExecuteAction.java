package khks;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Staff;
import dao.StaffDao;
import tool.Action;


public class LoginExecuteAction extends Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		//ローカル変数の宣言 1
		String url = "";
		String staff_id = "";
		String password = "";
		StaffDao staffDao = new StaffDao();
		Staff staff = null;

		//リクエストパラメータ―の取得 2
		staff_id = req.getParameter("staff_id");// 教員ID
		password = req.getParameter("password");//パスワード

		//DBからデータ取得 3
		staff = staffDao.login(staff_id, password);//教員データ取得

		//ビジネスロジック 4
		//DBへデータ保存 5
		//レスポンス値をセット 6
		//フォワード 7
		//条件で手順4~7の内容が分岐
		if (staff != null) {// 認証成功の場合
			// セッション情報を取得
			HttpSession session = req.getSession(true);
			// 認証済みフラグを立てる
			staff.setAuthenticated(true);
			// セッションにログイン情報を保存
			session.setAttribute("user", staff);

			//リダイレクト
			url = "main/Menu.action";
			res.sendRedirect(url);
		} else {
			// 認証失敗の場合
			// エラーメッセージをセット
			List<String> errors = new ArrayList<>();
			errors.add("IDまたはパスワードが確認できませんでした");
			req.setAttribute("errors", errors);
			// 入力された教員IDをセット
			req.setAttribute("staff_id", staff_id);

			//フォワード
			url = "login.jsp";
			req.getRequestDispatcher(url).forward(req, res);
		}

//		req.getRequestDispatcher(url).forward(req, res);
	}

}
