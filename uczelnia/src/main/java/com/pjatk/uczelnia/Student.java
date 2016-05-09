package com.pjatk.uczelnia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    private String name;
    private Index id;

    public Student() {}

    public Student(Index id, String name) {
        this.id = id;
        this.name = name;
    }

    public Index getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Index id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
