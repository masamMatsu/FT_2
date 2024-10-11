package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class StudentDaoC extends Dao {
	//学生テーブルの入学年度を検索（distinctで重複排除：ドロップダウンリスト用）
	public List<Student> search_entranceyear() throws Exception {
		List<Student> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
				"select distinct ent_year from student order by ent_year");
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Student s=new Student();
			s.setEnt_year(rs.getInt("ent_year"));
			list.add(s);
		}

		st.close();
		con.close();

		return list;
	}

}
