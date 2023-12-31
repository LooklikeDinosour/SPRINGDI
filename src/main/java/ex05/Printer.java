package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	
	/*
	 * @Autowired
	 * - 멤버변수, 생성자, setter 모두 사용
	 * - bean 중에서 주입될 수 있는 적합한 타입을 찾아서 자동 주입
	 * 
	 */
	@Autowired
	@Qualifier("document1") //빈 이름을 강제연결
	private Document document; //document를 자동으로 끌고온다. = "변수값"
	
	
	//기본생성자
	public Printer() {}
	
	//생성자 주입 OK
	public Printer (Document document) {
		this.document = document;
	}

	//게터, 세터 통합 주입 ok
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	

}
