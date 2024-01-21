package com.tunhub.server;

import java.util.List;

import com.tunhub.Entity.Playlist;

public interface Playlistservice {

	 public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

}
