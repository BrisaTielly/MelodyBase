package com.leaf.melodybase.controllerUI;

import com.leaf.melodybase.dtos.SongDTO;
import com.leaf.melodybase.services.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("songs/ui")
public class SongControllerUI {

    private final SongService songService;

    public SongControllerUI(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<SongDTO> songs = songService.findAll();
        model.addAttribute("songs", songs);
        return "listSongs";
    }

    @GetMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        songService.delete(id);
        return "redirect:/songs/ui/list";
    }


}
