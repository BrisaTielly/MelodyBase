package com.leaf.melodybase.controllers;

import com.leaf.melodybase.dtos.ArtistDTO;
import com.leaf.melodybase.services.ArtistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/list/{id}")
    public ResponseEntity<ArtistDTO> findById(@PathVariable Long id){
        ArtistDTO artistDTO = artistService.findById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(artistDTO);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save (@RequestBody ArtistDTO artistDTO){
        ArtistDTO artist = artistService.save(artistDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(artist);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update (@PathVariable Long id, @RequestBody ArtistDTO artistDTO){
        ArtistDTO artist = artistService.update(id,artistDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(artist);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete (@PathVariable Long id){
        artistService.delete(id);
        return ResponseEntity.ok("Música com o id " + id + " Deletada com sucesso!!!");
    }
}
