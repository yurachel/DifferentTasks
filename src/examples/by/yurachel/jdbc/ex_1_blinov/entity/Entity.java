package examples.by.yurachel.jdbc.ex_1_blinov.entity;

import java.io.Serializable;

public class Entity implements Serializable,Cloneable {
    private int id;

    public Entity(int id) {
        this.id = id;
    }

    public Entity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
