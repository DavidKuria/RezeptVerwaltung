package com.example.demo.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Koch {

    @Id
    @GeneratedValue
    private Long id;

    private String mitarbeitername;
    private String mitarbeitervornamen;

    protected Koch (){}

    public Koch( String mitarbeitername, String mitarbeitervornamen) {
               this.mitarbeitername = mitarbeitername;
        this.mitarbeitervornamen = mitarbeitervornamen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getMitarbeitername() {
        return mitarbeitername;
    }

    public void setMitarbeitername(String mitarbeitername) {
        this.mitarbeitername = mitarbeitername;
    }

    public String getMitarbeitervornamen() {
        return mitarbeitervornamen;
    }

    public void setMitarbeitervornamen(String mitarbeitervornamen) {
        this.mitarbeitervornamen = mitarbeitervornamen;
    }


}
