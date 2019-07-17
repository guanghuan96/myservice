package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pojo.Student;

public class test1 {

	public static void main(String[] args) throws IOException {
		//加載核心配置文件
      InputStream is = Resources.getResourceAsStream("mybatis.xml");
      SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);	
      //sqlsession
      SqlSession session =sf.openSession();
	  //增刪改查
//      Student s = (Student)session.selectOne("test.selectStu", 100);
//	     System.out.println(s);
	     
	     //模糊查詢
//	    List<Student> list = session.selectList("test.selectStuByName", "s"); 
//	      System.out.println(list.size());
	    
	      //查询所有
//	      List<Student> list1 = session.selectList("test.selectall"); 
//	      System.out.println(list1);
	      
	      //插入数据
	      Student stu=new Student("刘德华","123",35,"男");
	      int rows=session.insert("test.insert", stu);
	      System.out.println(stu.getStuid());
	      session.commit();
	      System.out.println("aaCCCCaa");
	      System.out.println("aaaaasssxxxxxaa");
	    is.close();
	}
}
