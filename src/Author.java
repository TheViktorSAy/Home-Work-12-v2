import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;
    @Override
    public String toString() {
        return firstName + secondName;
    }

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    //геттеры для автора
    public String getFirstName() {
        return this.firstName = firstName;
    }
    public String getSecondName() {
        return this.secondName = secondName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(secondName, author.secondName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }


}