package com.leaf.melodybase.dtos;

import com.leaf.melodybase.models.ArtistModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
public class SongDTO {
    private Long id;
    private String title;
    private ArtistModel artist;
    private String album;
    private LocalDate releaseYear;

    public SongDTO() {
    }

    public SongDTO(String album, ArtistModel artist, Long id, LocalDate releaseYear, String title) {
        this.album = album;
        this.artist = artist;
        this.id = id;
        this.releaseYear = releaseYear;
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public ArtistModel getArtist() {
        return artist;
    }

    public void setArtist(ArtistModel artist) {
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
