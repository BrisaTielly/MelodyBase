package com.leaf.melodybase.services;

import com.leaf.melodybase.dtos.ArtistDTO;
import com.leaf.melodybase.mappers.ArtistMapper;
import com.leaf.melodybase.models.ArtistModel;
import com.leaf.melodybase.repositories.ArtistRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
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


}
