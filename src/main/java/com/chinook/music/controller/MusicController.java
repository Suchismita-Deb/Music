package com.chinook.music.controller;

import com.chinook.music.entity.PlaylistEntity;
import com.chinook.music.repository.MusicRepo;
import com.chinook.music.service.PlaylistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {
    PlaylistService playlistService;

    //Constructor injection
    public MusicController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping("/")
    public String hello(){
        return "Server is good.";
    }

    @GetMapping("/music")
    public List<PlaylistEntity> getData(){
        List<PlaylistEntity> all = playlistService.allPlayList();
        return all;
    }
}
