public class Main {
    public static void main(String[] args) {
        Author author = new Author("George R. R. Martin", "grrm@georgerrmartin.com", "American");
        Book book = new Book("Game of Thrones", 19.99, author);
        System.out.println(book.toString());

        Author author2 = new Author("Stieg Larsson", "hello@stieglarsson.com", "Swedish");
        Book book2 = new Book("The Girl with the Dragon Tattoo", 19.99, author2);
        System.out.println(book2.toString());
    }
}