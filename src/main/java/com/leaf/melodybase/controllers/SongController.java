package com.leaf.melodybase.controllers;

import com.leaf.melodybase.dtos.SongDTO;
import com.leaf.melodybase.services.SongService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ClientHttpResponseDecorator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
