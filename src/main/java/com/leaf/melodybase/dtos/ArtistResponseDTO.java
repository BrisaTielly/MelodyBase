package com.leaf.melodybase.dtos;

import java.util.List;

public class ArtistResponseDTO {
    private Long id;
    private String name;
    private String musicalGenre;
    private List<String> songNames;
    private List<Long> songIds;
    private String nationality;
    private String imgUrl;

    public ArtistResponseDTO() {
    }

    public ArtistResponseDTO(Long id, String imgUrl, String musicalGenre, String name, String nationality, List<Long> songIds, List<String> songNames) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.musicalGenre = musicalGenre;
        this.name = name;
        this.nationality = nationality;
        this.songIds = songIds;
        this.songNames = songNames;
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

    public List<Long> getSongIds() {
        return songIds;
    }

    public void setSongIds(List<Long> songIds) {
        this.songIds = songIds;
    }

    public List<String> getSongNames() {
        return songNames;
    }

    public void setSongNames(List<String> songNames) {
        this.songNames = songNames;
    }
}
