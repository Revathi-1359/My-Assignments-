package week1.Day2;

public class Library {
    public void addBook() {
        String bookTitle = "Wings of Fire";
        System.out.println("Book added successfully");
        System.out.println("Booktitle:"+bookTitle);

    }

    public void issueBook(){
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {
        Library bookdetails = new Library();
        bookdetails.addBook();
        bookdetails.issueBook();
    }

}
