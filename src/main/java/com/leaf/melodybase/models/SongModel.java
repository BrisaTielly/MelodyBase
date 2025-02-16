package com.leaf.melodybase.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_song")
@ToString(exclude = "artist_id")
public class SongModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JsonIgnore
    //(fetch = FetchType.EAGER)
    @JoinColumn(name = "artist_id")

    private ArtistModel artist;

    @Column(name = "album")
    private String album;

    @Column(name = "release_year")
    private LocalDate releaseYear;
}
