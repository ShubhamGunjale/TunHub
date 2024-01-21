package com.tunhub.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
String artist;
String genre;
String link;
@ManyToMany
List<Playlist>playlists;
public Song() {
	super();
}
public Song(int id, String name, String artist, String genre, String link, List<Playlist> playlists) {
	super();
	this.id = id;
	this.name = name;
	this.artist = artist;
	this.genre = genre;
	this.link = link;
	this.playlists = playlists;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the artist
 */
public String getArtist() {
	return artist;
}
/**
 * @param artist the artist to set
 */
public void setArtist(String artist) {
	this.artist = artist;
}
/**
 * @return the genre
 */
public String getGenre() {
	return genre;
}
/**
 * @param genre the genre to set
 */
public void setGenre(String genre) {
	this.genre = genre;
}
/**
 * @return the link
 */
public String getLink() {
	return link;
}
/**
 * @param link the link to set
 */
public void setLink(String link) {
	this.link = link;
}
/**
 * @return the playlists
 */
public List<Playlist> getPlaylists() {
	return playlists;
}
/**
 * @param playlists the playlists to set
 */
public void setPlaylists(List<Playlist> playlists) {
	this.playlists = playlists;
}
@Override
public String toString() {
	return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", genre=" + genre + ", link=" + link
			+ ", playlists="+playlists  + "]";
}

}
