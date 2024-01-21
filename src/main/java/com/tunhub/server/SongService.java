package com.tunhub.server;

import java.util.List;

import com.tunhub.Entity.Song;

public interface SongService {
	


	public void addSong(Song song);

	public List<Song> fetchAllSongs();

	public boolean exitSong(String name );
	 public void updateSong(Song song);

}
