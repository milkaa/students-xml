package milka.milka;

import java.util.ArrayList;
import java.util.List;

public class Rubric {
    private List<Rubric> rubrics = new ArrayList<>();
    private String id;
    private String name;

    public List<Rubric> getRubrics() {
        return rubrics;
    }

    public void addRubric(Rubric rubric) {
        rubrics.add(rubric);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
