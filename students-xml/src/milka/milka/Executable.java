package milka.milka;

/**
 * Created by Администратор on 11.12.13.
 */
public class Executable {
    private String version;

    public Registry getRegistryKey() {
        return registryKey;
    }

    public void setRegistryKey(Registry registryKey) {
        this.registryKey = registryKey;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private Registry registryKey;
}
