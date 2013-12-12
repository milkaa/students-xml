package milka.milka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 11.12.13.
 */
public class Application {
    private Executable executable;
    private List<Param> params = new ArrayList<>();

    public Executable getExecutable() {
        return executable;
    }

    public void setExecutable(Executable executable) {
        this.executable = executable;
    }

    public List<Param> getParams() {
        return params;
    }

    public void addParam(Param param) {
        params.add(param);
    }
}
