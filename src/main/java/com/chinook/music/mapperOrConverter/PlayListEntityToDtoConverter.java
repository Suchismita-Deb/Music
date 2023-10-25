package com.chinook.music.mapperOrConverter;

import com.chinook.music.dto.PlayListDto;
import com.chinook.music.entityOrDao.PlaylistEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlayListEntityToDtoConverter {
    public List<PlayListDto> convert(List<PlaylistEntity> playlistEntities) {
        List<PlayListDto> collect = playlistEntities.stream()
                .map(singlePlayListEntity -> new PlayListDto(singlePlayListEntity.getName()))
                .collect(Collectors.toList());

        return collect;
    }

    public PlayListDto convert(PlaylistEntity playlistEntities) {
        return null;//TODO : Implement when needed
    }
}
