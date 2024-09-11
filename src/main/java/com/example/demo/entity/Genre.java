//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "Genre"
)
public class Genre {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long Id;
    @Column(
            name = "name"
    )
    private String name;
    @Column(
            name = "Description"
    )
    private String description;
    @ManyToMany(
            mappedBy = "genres"
    )
    private List<Beat> beats = new ArrayList();
    @ManyToMany(
            mappedBy = "genres"
    )
    private List<Song> songs = new ArrayList();

    public Genre() {
    }

    public Long getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public List<Beat> getBeats() {
        return this.beats;
    }

    public List<Song> getSongs() {
        return this.songs;
    }

    public void setId(final Long Id) {
        this.Id = Id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setBeats(final List<Beat> beats) {
        this.beats = beats;
    }

    public void setSongs(final List<Song> songs) {
        this.songs = songs;
    }
}
