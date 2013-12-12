package milka.milka;

import java.util.ArrayList;
import java.util.List;

public class Action {
    private String name;
    private String handler;
    private List<Param> params = new ArrayList<>();

    public List<Param> getParams() {
        return params;
    }

    public void addParam(Param param) {
        params.add(param);
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
