package com.leaf.melodybase.dtos;

import com.leaf.melodybase.models.ArtistModel;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class SongDTO {
    private Long id;
    private String title;
    private ArtistModel artist;
    private String album;
    private LocalDate releaseYear;
}
