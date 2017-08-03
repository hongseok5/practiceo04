package prob02;

public class Book {
	
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo,String title,String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1 ;
		
	}
	
	public void rent() {
		
		if(stateCode==1) {
			stateCode=0;
			System.out.println(title + "(이)가 대여되었습니다" );
		
		}
		
		else
			System.out.println(title + "대여중입니다" );	
			
	}
	
	
	
	public void print() {
		

		if(stateCode==1) {		
		System.out.println("책 제목:"+ title + ", "
				+ "작가:" + author +", "
						+ "대여 유무: 재고있음"  );
		}
		else
		{		
			System.out.println("책 제목:"+ title + ", "
					+ "작가:" + author +", "
							+ "대여 유무: 대여중"  );
			}
			
	}

	public int getBookNo() {
		return bookNo;
	}
	

}