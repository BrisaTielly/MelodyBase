package com.leaf.melodybase.controllerUI;

import com.leaf.melodybase.dtos.SongDTO;
import com.leaf.melodybase.services.SongService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/list/{id}")
    public String findById(@PathVariable Long id, Model model){
        SongDTO songs = songService.findById(id);
        if(songs != null){
            model.addAttribute("songs", songs);
            return "songDetail.html";
        }else{
            model.addAttribute("mensagem", "Música não encontrada");
            return "listSongs";
        }
    }

    @GetMapping("/add")
    public String showFormAddSong(Model model) {
        model.addAttribute("songs", new SongDTO());
        return "addSong";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute SongDTO song, RedirectAttributes redirectAttributes) {
        songService.save(song);
        redirectAttributes.addFlashAttribute("mensagem", "Música cadastrada com sucesso!");
        return "redirect:/songs/ui/list";
    }


}
