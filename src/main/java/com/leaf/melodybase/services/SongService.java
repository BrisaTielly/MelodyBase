package com.leaf.melodybase.services;

import com.leaf.melodybase.dtos.SongDTO;
import com.leaf.melodybase.mappers.SongMapper;
import com.leaf.melodybase.models.SongModel;
import com.leaf.melodybase.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SongService {

    private final SongRepository songRepository;
    private final SongMapper songMapper;

    public SongService(SongMapper songMapper, SongRepository songRepository) {
        this.songMapper = songMapper;
        this.songRepository = songRepository;
    }

    public List<SongDTO> findAll(){
        List<SongModel> songModel = songRepository.findAll();
        return songModel.stream()
                .map(songMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public SongDTO findById(Long id){
        Optional<SongModel> songModel = songRepository.findById(id);
        return  songModel.map(songMapper::mapToDTO).orElse(null);
    }

    public SongDTO save(SongDTO songDTO){
        SongModel songModel = songMapper.mapToModel(songDTO);
        songModel = songRepository.save(songModel);
        return songMapper.mapToDTO(songModel);
    }
}
