package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Staff;

public class StaffDao extends Dao {
	/**
	 * getメソッド 教員IDを指定して教員インスタンスを1件取得する
	 *
	 * @param id:String
	 *            教員ID
	 * @return 教員クラスのインスタンス 存在しない場合はnull
	 * @throws Exception
	 */
	public Staff get(String staff_id) throws Exception {
		// 教員インスタンスを初期化
		Staff staff = new Staff();
		// コネクションを確立
		Connection connection = getConnection();
		// プリペアードステートメント
		PreparedStatement statement = null;

		try {
			// プリペアードステートメントにSQL文をセット
			statement = connection.prepareStatement("select * from staff where staff_id=?");
			// プリペアードステートメントに教員IDをバインド
			statement.setString(1, staff_id);
			// プリペアードステートメントを実行
			ResultSet rSet = statement.executeQuery();


			if (rSet.next()) {
				// リザルトセットが存在する場合
				// 教員インスタンスに検索結果をセット
				staff.setStaff_id(rSet.getString("staff_id"));
				staff.setPassword(rSet.getString("password"));
				staff.setStaff_name(rSet.getString("staff_name"));
			} else {
				// リザルトセットが存在しない場合
				// 教員インスタンスにnullをセット
				staff = null;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			// プリペアードステートメントを閉じる
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException sqle) {
					throw sqle;
				}
			}
			// コネクションを閉じる
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException sqle) {
					throw sqle;
				}
			}
		}

		return staff;
	}


	/**
	 * loginメソッド 教員IDとパスワードで認証する
	 *
	 * @param id:String
	 *            教員ID
	 * @param password:String
	 *            パスワード
	 * @return 認証成功:教員クラスのインスタンス, 認証失敗:null
	 * @throws Exception
	 */
	public Staff login(String staff_id, String password) throws Exception {
		// 教員クラスのインスタンスを取得
		Staff staff = get(staff_id);
		// 教員がnullまたはパスワードが一致しない場合
		if (staff == null || !staff.getPassword().equals(password)) {
			return null;
		}
		return staff;


		/**
		 * changeメソッド 教員IDのパスワードを変更する
		 *
		 * @param id:String
		 *            教員ID
		 * @param ps:String
		 *            教員パスワード
		 * @return 成功:true, 失敗:false
		 * @throws Exception
		 */
	}

	public Integer change(String staff_id, String password) throws Exception {

		// コネクションを確立
		Connection connection = getConnection();
		// プリペアードステートメント
		PreparedStatement statement = null;

		Integer rSet;

		try {
			// プリペアードステートメントにSQL文をセット
			statement = connection.prepareStatement("update staff set password=? where staff_id=?");
			// プリペアードステートメントに教員ID・パスワードをバインド
			statement.setString(2, staff_id);
			statement.setString(1, password);
			// プリペアードステートメントを実行
			rSet = statement.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			// プリペアードステートメントを閉じる
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException sqle) {
					throw sqle;
				}
			}
			// コネクションを閉じる
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException sqle) {
					throw sqle;
				}
			}
		}

		return rSet;
	}

}
