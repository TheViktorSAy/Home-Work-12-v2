public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Грибоедов ", "Александр ");
        System.out.println(author1.getFirstName() + author1.getSecondName());

        Book book1 = new Book("Грибоедов "," - Горе от Ума - ",1825);
        System.out.println(book1.getNameAuthor() + book1.getNameBook() + book1.getYear());


        Author author2 = new Author("Глуховский ", "Дмитрий ");
        System.out.println(author2.getFirstName() + author2.getSecondName());

        Book book2 = new Book("Глуховский "," - Метро 2034 - ",2009);
        System.out.println(book2.getNameAuthor() + book2.getNameBook() + book2.getYear());

    }
}