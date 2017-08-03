package prob05;

public class Base {
	public void service(String state){
		if( state.equals( "낮" ) ) {
			day();
		} else {
			night();
		}
	}
	
	public void day(){
		System.out.println("낮");
	}
	
	public void night(){
		System.out.println("night");
	}
} // 오버라이드 문제, MyBase에서 Base에 있는 것들 오버 라이딩 하는 문제 
