package com.leaf.melodybase.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_artist")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "songs")
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArtistModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "musical_genre")
    private String musicalGenre;

    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<SongModel> songs;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "img_url")
    private String imgUrl;
}
