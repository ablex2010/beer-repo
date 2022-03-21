package com.habeshadrink.meloti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="meloti")
public class Meloti {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
