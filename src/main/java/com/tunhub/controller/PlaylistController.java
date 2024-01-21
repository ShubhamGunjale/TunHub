package com.tunhub.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tunhub.Entity.Playlist;
import com.tunhub.Entity.Song;
import com.tunhub.server.Playlistservice;
import com.tunhub.server.SongService;



@Controller
public class PlaylistController {
	@Autowired
 SongService songService;
	@Autowired
	Playlistservice playlistservice;
	
	@GetMapping("/createPlaylist")
	public String createPlaylist(Model model) {
		
		List<Song>  songList=songService.fetchAllSongs();
		model.addAttribute("songs",songList);
		
		return "createPlaylist";
	}
	@PostMapping("/addPlaylist")
	public String  addPlaylist(@ModelAttribute Playlist playlist) {
		//for updating song table
		playlistservice.addPlaylist(playlist);
		List<Song>SongList=playlist.getSongs();
		for(Song s:SongList) {
			s.getPlaylists().add(playlist);
			songService.updateSong(s);
			}
		return "adminHome";
	}
	
	@GetMapping("/viewPlaylist")
	public String  viewPlaylist(Model model ) {
		List<Playlist>allPlaylists=playlistservice.fetchAllPlaylists();
		model.addAttribute("allPlaylists",allPlaylists);
		return "disPlayPlaylists";
	}
	
}
