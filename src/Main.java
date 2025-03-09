public class Main {

    public static class Book {
        private String bookTitle;
        private Author name;
        private int year;

        public Book(String bookTitle, Author name, int year) {
            this.bookTitle = bookTitle;
            this.name = name;
            this.year = year;
        }

        public String getBookTitle() {
            return this.bookTitle;
        }

        public Author getAuthor() {
            return this.name;
        }

        public int getYear() {
            return this.year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public static class Author {
        private String nameAuthor;
        private String surnameAuthor;

        public Author(String nameAuthor, String surnameAuthor) {
            this.nameAuthor = nameAuthor;
            this.surnameAuthor = surnameAuthor;
        }

        public String getNameAuthor() {
            return this.nameAuthor;
        }

        public String getSurnameAuthor() {
            return this.surnameAuthor;
        }
    }

    public static void main(String[] args) {
        Author author1 = new Author("Тони", "Тернер");
        Author author2 = new Author("Джордан", "Белфорт");

        Book book1 = new Book("Трейдинг", author1, 2018);
        Book book2 = new Book("Волк с Уолл-Стрит", author2, 2022);

        System.out.println("Task");
        System.out.println("book1.bookTitle = " + book1.getBookTitle());
        System.out.println("book1.author = " + book1.getAuthor());

        System.out.println("book1.year = " + book1.getYear());
        book1.setYear(2020);
        System.out.println("book1.getYear() = " + book1.getYear());

        System.out.println("book2.bookTitle = " + book2.getBookTitle());
        System.out.println("book2.author = " + book2.getAuthor());
        System.out.println("book2.year = " + book2.getYear());

        System.out.println("author1.nameAuthor = " + author1.getNameAuthor());
        System.out.println("author1.surnameAuthor = " + author1.getSurnameAuthor());

        System.out.println("author2.nameAuthor = " + author2.getNameAuthor());
        System.out.println("author2.surnameAuthor = " + author2.getSurnameAuthor());
    }
}




