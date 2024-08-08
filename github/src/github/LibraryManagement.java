package github;

class Book {
	private double bookId;
	private String title;
	private String author;
	private double price;

	public Book(int bookId, String title, String author, double price) {

		if (bookId <= 0)
			throw new IllegalArgumentException("Book ID must be positive.");
		if (title == null || title.isEmpty())
			throw new IllegalArgumentException("Title cannot be empty.");
		if (author == null || author.isEmpty())
			throw new IllegalArgumentException("Author cannot be empty.");
		if (price < 0)
			throw new IllegalArgumentException("Price cannot be negative.");

		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void displayBookDetails() {
		System.out.println("Book Id :" + bookId);
		System.out.println("Title :" + title);
		System.out.println("Author :" + author);
		System.out.println("Price :" + price);
	}

	
}

class EBook extends Book {

	private double fileSize;

	public EBook(int bookId, String title, String author, double price, double fileSize) {
		super(bookId, title, author, price);
		if(fileSize<=0) throw new IllegalArgumentException("File size must be a positive in numbers");
		this.fileSize = fileSize;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayBookDetails() {
		// TODO Auto-generated method stub
		super.displayBookDetails();
		   System.out.println("File Size: " + fileSize + " MB");
	}

}

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee", 10.99);
	        Book book2 = new EBook(2, "The Martian", "Andy Weir", 8.99, 1.2);
	        Book book3 = new EBook(3, "Ready Player One", "Ernest Cline", 6.99, 2.5);
	        
	        book1.displayBookDetails();
	        System.out.println();
	        book2.displayBookDetails();
	        System.out.println();
	        book3.displayBookDetails();
	        System.out.println();
	        
	        double totalPrice = book1.getPrice()+book2.getPrice()+book3.getPrice();
	        System.out.println("Total Price of All books :"+ totalPrice);
	}

}
