package com.leaf.melodybase.mappers;

import com.leaf.melodybase.dtos.ArtistDTO;
import com.leaf.melodybase.models.ArtistModel;
import org.springframework.stereotype.Component;

@Component
public class ArtistMapper {

    public ArtistModel mapToModel (ArtistDTO artistDTO) {
        ArtistModel artistModel = new ArtistModel();
        artistModel.setId(artistDTO.getId());
        artistModel.setName(artistDTO.getName());
        artistModel.setMusicalGenre(artistDTO.getMusicalGenre());
        artistModel.setNationality(artistDTO.getNationality());
        artistModel.setImgUrl(artistDTO.getImgUrl());
        artistModel.setSongs(artistDTO.getSongs());
        return artistModel;
    }

    public ArtistDTO mapToDTO(ArtistModel artistModel) {
        ArtistDTO artistDTO = new ArtistDTO();
        artistDTO.setId(artistModel.getId());
        artistDTO.setName(artistModel.getName());
        artistDTO.setMusicalGenre(artistModel.getMusicalGenre());
        artistDTO.setSongs(artistModel.getSongs());
        artistDTO.setNationality(artistModel.getNationality());
        artistDTO.setImgUrl(artistModel.getImgUrl());

        return artistDTO;
    }


}
