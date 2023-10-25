package com.chinook.music.entityOrDao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "playlist")
@Data
public class PlaylistEntity {
    @Id
    @Column(name = "playlistid")
    Long playlistId;
    @Column(name = "name")
    String name;
}
