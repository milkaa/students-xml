package milka.milka;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String id;
    private String title;
    private List<String> copyrights = new ArrayList<String>();
    private List<String> authors = new ArrayList<String>();
    private int date;
    private List<String> publishers = new ArrayList<String>();
    private List<Book> books = new ArrayList<Book>();
    private Classification classification;
    private Handler uHandler;
    private List<Handler> handlers = new ArrayList<Handler>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCopyrights() {
        return copyrights;
    }

    public void addCopyright(String copyright) {
        copyrights.add(copyright);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public void addPublisher(String publisher) {
        publishers.add(publisher);
    }

    public List<Book> getBook() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Handler getuHandler() {
        return uHandler;
    }

    public void setuHandler(Handler uHandler) {
        this.uHandler = uHandler;
    }

    public List<Handler> getHandlers() {
        return handlers;
    }

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

}
