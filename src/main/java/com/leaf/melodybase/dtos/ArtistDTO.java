package com.leaf.melodybase.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.leaf.melodybase.models.SongModel;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
public class ArtistDTO {
    private Long id;
    private String name;
    private String musicalGenre;
    private List<SongModel> songs;
    private String nationality;
    private String imgUrl;

    public ArtistDTO() {
    }

    public ArtistDTO(Long id, String imgUrl, String musicalGenre, String name, String nationality, List<SongModel> songs) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.musicalGenre = musicalGenre;
        this.name = name;
        this.nationality = nationality;
        this.songs = songs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMusicalGenre() {
        return musicalGenre;
    }

    public void setMusicalGenre(String musicalGenre) {
        this.musicalGenre = musicalGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<SongModel> getSongs() {
        return songs;
    }

    public void setSongs(List<SongModel> songs) {
        this.songs = songs;
    }
}
