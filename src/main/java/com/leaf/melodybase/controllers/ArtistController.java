package com.leaf.melodybase.controllers;

import com.leaf.melodybase.dtos.ArtistDTO;
import com.leaf.melodybase.repositories.ArtistRepository;
import com.leaf.melodybase.services.ArtistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<ArtistDTO>> findAll(){
        List<ArtistDTO> artistDTO = artistService.findAll();
        return ResponseEntity.status(HttpStatus.FOUND).body(artistDTO);
    }
}
