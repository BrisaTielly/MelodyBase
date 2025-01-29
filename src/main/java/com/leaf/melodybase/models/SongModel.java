package com.leaf.melodybase.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tb_song")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SongModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private ArtistModel artist;

    @Column(name = "album")
    private String album;

    @Column(name = "release_year")
    private LocalDate releaseYear;
}
