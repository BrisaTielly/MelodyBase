package com.leaf.melodybase.dtos;

import com.leaf.melodybase.models.ArtistModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongDTO {
    private Long id;
    private String title;
    private ArtistModel artist;
    private String album;
    private LocalDate releaseYear;
}
