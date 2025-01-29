package com.leaf.melodybase.mappers;

import com.leaf.melodybase.dtos.SongDTO;
import com.leaf.melodybase.models.SongModel;
import org.springframework.stereotype.Component;

@Component
public class SongMapper {

    public SongModel mapToModel(SongDTO songDTO){
        SongModel songModel = new SongModel();
        songModel.setId(songDTO.getId());
        songModel.setArtist(songDTO.getArtist());
        songModel.setAlbum(songDTO.getAlbum());
        songModel.setReleaseYear(songDTO.getReleaseYear());
        songModel.setTitle(songDTO.getTitle());
        return songModel;
    }

    public SongDTO mapToDTO(SongModel songModel) {
        SongDTO songDTO = new SongDTO();
        songDTO.setId(songModel.getId());
        songDTO.setArtist(songModel.getArtist());  // Aqui você pode pegar o artista completo ou só o nome, dependendo da sua necessidade
        songDTO.setAlbum(songModel.getAlbum());
        songDTO.setReleaseYear(songModel.getReleaseYear()); // Caso esteja usando LocalDate
        songDTO.setTitle(songModel.getTitle());
        return songDTO;
    }

}
