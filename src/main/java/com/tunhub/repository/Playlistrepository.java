package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhub.Entity.Playlist;

public interface Playlistrepository extends JpaRepository<Playlist, Integer>{
}
