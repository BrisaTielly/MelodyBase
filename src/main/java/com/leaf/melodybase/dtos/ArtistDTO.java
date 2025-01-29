package com.leaf.melodybase.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.leaf.melodybase.models.SongModel;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtistDTO {
    private Long id;
    private String name;
    private String musicalGenre;
    private List<SongModel> songs;
    private String nationality;
    private String imgUrl;
}
