package com.leaf.melodybase.controllers;

import com.leaf.melodybase.dtos.SongDTO;
import com.leaf.melodybase.services.SongService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ClientHttpResponseDecorator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<SongDTO>> findAll() {
        List<SongDTO> songDTO = songService.findAll();
        return ResponseEntity.ok(songDTO);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<SongDTO> findById(@PathVariable Long id){
        SongDTO songDTO = songService.findById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(songDTO);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save (@RequestBody SongDTO songDTO){
        SongDTO song = songService.save(songDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(song);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update (@PathVariable Long id, @RequestBody SongDTO songDTO){
        SongDTO song = songService.update(id,songDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(song);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete (@PathVariable Long id){
        songService.delete(id);
        return ResponseEntity.ok("Música com o id " + id + " Deletada com sucesso!!!");
    }
}
