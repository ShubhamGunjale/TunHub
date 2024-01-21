
package com.tunhub.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhub.Entity.Playlist;
import com.tunhub.repository.Playlistrepository;

@Service
public class PlaylistserviceImplementation implements Playlistservice {
	@Autowired
Playlistrepository repo;
	@Override
	public void addPlaylist(Playlist playlist) {
		repo.save(playlist);
		
	}
	@Override
	public List<Playlist> fetchAllPlaylists() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
