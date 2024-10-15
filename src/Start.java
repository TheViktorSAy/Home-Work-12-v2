public class Start {
    public static void main(String[] args) {

        Author author1 = new Author("Грибоедов ", "Александр ");
        System.out.println(author1.getFirstName() + author1.getSecondName());

        Book book1 = new Book(author1, "- Горе от Ума - ", 1825);
        book1.setYear(1800);
        System.out.println(author1.getFirstName() + book1.getNameBook() + book1.getYear());

        Author author2 = new Author("Глуховский ", "Дмитрий ");
        System.out.println(author2.getFirstName() + author2.getSecondName());

        Book book2 = new Book(author2, " - Метро 2034 - ", 2009);
        book2.setYear(2000);
        System.out.println(author2.getFirstName() + book2.getNameBook() + book2.getYear());

    }
}





