import java.util.Objects;

public class Book {

    private Author author;
    private String nameBook;
    @Override
    public String toString() {
        return author + nameBook + year;
    }

    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(year);
    }
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