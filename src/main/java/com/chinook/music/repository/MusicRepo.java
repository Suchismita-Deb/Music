package com.chinook.music.repository;

import com.chinook.music.entity.PlaylistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepo extends JpaRepository<PlaylistEntity,Long> {}
