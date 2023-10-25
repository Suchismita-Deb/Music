package com.chinook.music.service;

import com.chinook.music.entity.PlaylistEntity;
import com.chinook.music.repository.MusicRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    MusicRepo musicRepo;

    public PlaylistService(MusicRepo musicRepo) {
        this.musicRepo = musicRepo;
    }

    public List<PlaylistEntity> allPlayList(){
        return musicRepo.findAll();

    }

}
