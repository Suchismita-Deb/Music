package com.chinook.music.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "playlist")
public class PlaylistEntity {
    @Id
    @Column(name = "playlistid")
    private Long playlistId;
    private String name;
}
