package prob02;

import java.util.Scanner;

public class BookShop {

	public static void main(String[] args) {
		Book[] books = new Book[10]; // book 객체 배열 
		
		books[0] = new Book( 1, "트와일라잇", "스테파니메이어" );
		books[1] = new Book( 2,"뉴문", "스테파니메이어" );
		books[2] = new Book( 3,"이클립스","스테파니메이어");
		books[3] = new Book( 4,"브레이킹던","스테파니메이어");
		books[4] = new Book( 5,"아리랑","조정래");
		books[5] = new Book( 6,"젊은그들","김동인");
		books[6] = new Book( 7,"아프니깐 청춘이다","김난도");
		books[7] = new Book( 8,"귀천","천상병");
		books[8] = new Book( 9,"태백산맥","조정래");
		books[9] = new Book( 10,"풀하우스","원수연");
		
		Scanner scanner = new Scanner(System.in);  //사용자 입력 받음 
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:"); 
		int num = scanner.nextInt();   // 사용자한테 정수로 받은 값 num
		scanner.close();
		
		// (1) 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드=0)을 체크 합니다.
		for( Book book : books ) {
			if( num == book.getBookNo() ) {  //
				book.rent();   // 받은 희망대여 도서의 스테이트 코드를 변경한다.  
				break;
			}
		}
		
		// (2) Book 객체의 정보를 출력
		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo( books ); // 스태틱으로
		
		
		
		
		
		
	} // 메인함수 종료 
	
	public static void displayBookInfo(Book[] books) {
		
		for (int i=0; i<books.length;i++) {
			
			books[i].print();
			
		}
		
	}
	
	

} // 퍼블릭 클래스 종료 
