public class Book {
    private String nameAuthor;
    private String nameBook;
    private int year;

    public Book(String nameAuthor, String nameBook, int year) {

        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.year = year;
    }

    public String getNameAuthor() {
        return this.nameAuthor = nameAuthor;

    }

    public String getNameBook() {
        return this.nameBook = nameBook;
    }

    public int getYear() {
        return this.year;
    }

    // сеттер для года книги
    public void setYear(int year) {
        this.year = year;
    }


}