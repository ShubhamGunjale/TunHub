package com.tunhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tunhub.Entity.Song;
import com.tunhub.server.SongService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class SongController {
	@Autowired
	SongService service;
	
	@PostMapping("/addSong")
	public String addSong(@ModelAttribute Song song) {
		boolean songlist=service.exitSong(song.getName());
		
		if(songlist==false) {
			service.addSong(song);
			System.out.println("Song added succesfully");
		}
		else {
			System.err.println("Song already exits");
		}
		
		
		return "adminHome";
	}
	@GetMapping("/viewsongs")
	public String ViewSongs(Model model) {
		List<Song>songlist=service.fetchAllSongs();
		model.addAttribute("songs",songlist);
		return "displySongs";}
	
	
	
		@GetMapping("/playSongs")
		public String playsongs(Model model) {
			boolean premiumUser=true;
			if (premiumUser=false) {
			List<Song>songlist=service.fetchAllSongs();
			model.addAttribute("songs",songlist);
			return "displySongs";
		}	
			else {
			return "makePayment";
		}
	

}}
