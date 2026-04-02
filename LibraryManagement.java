package week1.Day2;

public class LibraryManagement {
    public void addBook() {
        String bookTitle = "Wings of Fire";
        System.out.println("Book added successfully");
        System.out.println("Booktitle:"+bookTitle);

    }

    public void issueBook(){
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {
        LibraryManagement LibMangement = new LibraryManagement();
        LibMangement.addBook();
        LibMangement.issueBook();
    }

}
