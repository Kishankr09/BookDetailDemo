import java.util.Scanner;
class Book{
	int bCode,bQty;
	float bPrice;
	String bName,bAuthor;
}
class BookInsert{
	void ins(Book bo) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Book Name ");
		bo.bName = s.nextLine();
		System.out.println("ENter The Book Author");
		bo.bAuthor = s.nextLine();
		System.out.println("Enter The Book Code ");
		bo.bCode = s.nextInt();
		System.out.println("Enter The Book price ");
		bo.bPrice = s.nextFloat();
		System.out.println("ENter The Qantity");
		bo.bQty = s.nextInt();
	}
}
class Display{
	void dis(Book b) {
		System.out.println("Book Code: "+b.bCode + "\nBook Name :"+ b.bName);
		System.out.println("Book Author :" + b.bAuthor + "Book Quantity :" + b.bQty);
		System.out.println("Book Price :" + b.bPrice);
	}
}
public class BookDetailsDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Book bk = new Book();
		BookInsert bi = new BookInsert();
		bi.ins(bk);
		Display d = new Display();
		d.dis(bk);
	}

}
