package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;
import ex03.MemberDAO;

public class MainClass {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext atx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		//genericApplicationContext 와 동일한 기능 XML, JAVA냐에 따라 다르게사용

		Hotel hotel = atx.getBean(Hotel.class);
		hotel.getChef().cooking();;
		
		MemberDAO dao = atx.getBean(MemberDAO.class);
		System.out.println(dao.getDataSource().getUrl());
		System.out.println(dao.getDataSource().getUid());
		System.out.println(dao.getDataSource().getUpw());
		
	}

}
