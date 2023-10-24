package com.chinook.music.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="playlist")
public class PlaylistEntity {
    @Id
    private Long playlistId;
    private String name;
}
