package com.leaf.melodybase.services;

import com.leaf.melodybase.dtos.ArtistDTO;
import com.leaf.melodybase.dtos.SongDTO;
import com.leaf.melodybase.mappers.ArtistMapper;
import com.leaf.melodybase.models.ArtistModel;
import com.leaf.melodybase.models.SongModel;
import com.leaf.melodybase.repositories.ArtistRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;
    private final ArtistMapper artistMapper;

    public ArtistService(ArtistMapper artistMapper, ArtistRepository artistRepository) {
        this.artistMapper = artistMapper;
        this.artistRepository = artistRepository;
    }

    @Transactional(readOnly = true)
    public List<ArtistDTO> findAll() {
        List<ArtistModel> artists = artistRepository.findAll();
        return artists.stream()
                .map(artistMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public ArtistDTO findById(Long id){
        Optional<ArtistModel> artistModel = artistRepository.findById(id);
        return artistModel
                .map(artistMapper::mapToDTO).orElse(null);
    }

    public ArtistDTO save(ArtistDTO artistDTO){
        ArtistModel artistModel = artistMapper.mapToModel(artistDTO);
        artistModel = artistRepository.save(artistModel);
        return artistMapper.mapToDTO(artistModel);
    }

    public ArtistDTO update(Long id, ArtistDTO artistDTO) {
        Optional<ArtistModel> artistModel = artistRepository.findById(id);
        if(artistModel.isPresent()){
            //Encontrou uma model com esse id
            ArtistModel artistAtual = artistMapper.mapToModel(artistDTO); //Transformando em model
            artistAtual.setId(id);
            artistAtual = artistRepository.save(artistAtual);
            return artistMapper.mapToDTO(artistAtual);
        }
        return null;
    }

    public void delete(Long id){
        artistRepository.deleteById(id);
    }


}
