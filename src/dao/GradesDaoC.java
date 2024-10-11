package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Grades;
import bean.Grades2;

public class GradesDaoC extends Dao {

	//成績テーブルを検索
	public List<Grades2> search() throws Exception {
		List<Grades2> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"select g.student_no as s_no,g.class_no as c_no,subject_cd,point,student_name from grades g,student s where g.student_no = s.student_no");
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Grades2 g=new Grades2();
			g.setStudent_no(rs.getString("s_no"));	//student_no
			g.setClass_no(rs.getString("c_no"));	//gradesテーブルのclass_no
			g.setSubject_cd(rs.getString("subject_cd"));
			g.setPoint(rs.getInt("point"));
			g.setStudent_name(rs.getString("student_name"));
			list.add(g);
		}

		st.close();
		con.close();

		return list;
	}

	//成績テーブルのクラスを検索（distinctで重複排除：ドロップダウンリスト用）
	public List<Grades> search_classno() throws Exception {
		List<Grades> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"select distinct class_no from grades order by class_no");
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Grades s=new Grades();
			s.setClass_no(rs.getString("class_no"));
			list.add(s);
		}

		st.close();
		con.close();

		return list;
	}

}
