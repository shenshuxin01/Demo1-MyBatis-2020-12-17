package zkr.ssx.entity;

import java.io.Serializable;

public class SpringUser implements Serializable {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "SpringUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
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

    public SpringUser(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public SpringUser() {
    }
}
