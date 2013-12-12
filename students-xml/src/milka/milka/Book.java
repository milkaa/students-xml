package milka.milka;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String id;
    private String title;
    private List<String> authors = new ArrayList<>();
    private int date;
    private List<String> publishers = new ArrayList<>();
    private String educationaltype;
    private List<String> keywords = new ArrayList<>();
    private List<Rubric> rubrics = new ArrayList<>();
    private int duration;
    private List<Integer> classes = new ArrayList<>();
    private Action action;

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

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthors(String author) {
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

    public String getEducationaltype() {
        return educationaltype;
    }

    public void setEducationaltype(String educationaltype) {
        this.educationaltype = educationaltype;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void addKeyword(String keyword) {
        keywords.add(keyword);
    }

    public List<Rubric> getRubrics() {
        return rubrics;
    }

    public void addRubric(Rubric rubric) {
        rubrics.add(rubric);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Integer> getClasses() {
        return classes;
    }

    public void addClasses(Integer classs) {
        classes.add(classs);
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
