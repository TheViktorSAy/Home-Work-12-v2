public class Book {
    private Author author;
    private String nameBook;
    private int year;

    public Book(Author author, String nameBook, int year) {

        this.author = author;
        this.nameBook = nameBook;
        this.year = year;
    }

    //геттеры для книги
    public Author getAuthor() {
        return this.author = author;

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