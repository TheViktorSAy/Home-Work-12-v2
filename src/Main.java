public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Грибоедов ", "Александр ");

        Book book1 = new Book(author1,"- Горе от Ума - ",1825);

        Author author2 = new Author("Глуховский ", "Дмитрий ");

        Book book2 = new Book(author2," - Метро 2034 - ",2009);


    }
}