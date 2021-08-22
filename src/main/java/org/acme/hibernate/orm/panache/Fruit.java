package org.acme.hibernate.orm.panache;

import javax.persistence.*;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.GeneratorType;

@Entity
@Cacheable
public class Fruit extends PanacheEntity {

    @Column(length = 40, unique = true)
    public String name;

    public Fruit() {
    }

    public Fruit(String name) {
        this.name = name;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    public void setId(Long id) {
        this.id = id;
    }
}
