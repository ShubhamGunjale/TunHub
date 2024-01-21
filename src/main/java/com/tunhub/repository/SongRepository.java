package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tunhub.Entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {

	public Song findByName(String name );

}
