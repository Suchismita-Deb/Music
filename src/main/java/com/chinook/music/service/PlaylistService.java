package com.chinook.music.service;

import com.chinook.music.dto.PlayListDto;
import com.chinook.music.entityOrDao.PlaylistEntity;
import com.chinook.music.mapperOrConverter.PlayListEntityToDtoConverter;
import com.chinook.music.repository.MusicRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    private final MusicRepo musicRepo;
    private final PlayListEntityToDtoConverter playListEntityToDtoConverter;

    public PlaylistService(MusicRepo musicRepo, PlayListEntityToDtoConverter playListEntityToDtoConverter) {
        this.musicRepo = musicRepo;
        this.playListEntityToDtoConverter = playListEntityToDtoConverter;
    }

    public List<PlayListDto> allPlayList(){
        List<PlaylistEntity> playlistEntities = musicRepo.findAll();
        List<PlayListDto> playListDtoList = playListEntityToDtoConverter.convert(playlistEntities);
        return playListDtoList;
    }

}
