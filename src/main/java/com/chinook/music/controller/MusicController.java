package com.chinook.music.controller;

import com.chinook.music.MusicApplication;
import com.chinook.music.entity.PlaylistEntity;
import com.chinook.music.repository.MusicRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {
    @Autowired
    private MusicRepo musicRepo;

    public MusicController(MusicRepo musicRepo){
        this.musicRepo = musicRepo;
    }
    @GetMapping("/")
    public String hello(){
        return "Server is good.";
    }

    @GetMapping("/music")
    public List<PlaylistEntity> getData(){
        List<PlaylistEntity> all = musicRepo.findAll();
        return all;
    }
}
