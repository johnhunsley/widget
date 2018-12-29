package com.johnhunsley.widget.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author John Hunsley
 */
@Entity
@Table(name = "WIDGETS")
public class Widget implements Serializable {
    private static final long serialVersionUID = 100L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "GROUP_NAME")
    private String group;

    @Column(name = "PROPERTIES")
    private String properties;

    public Widget() {}

    public Widget(String properties, String group) {
        this.properties = properties;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Widget widget = (Widget) o;
        return id.equals(widget.id) &&
                group.equals(widget.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, group);
    }
}
