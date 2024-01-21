package com.tunhub.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Playlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
@ManyToMany
List<Song>songs;
public Playlist() {
	super();
}
public Playlist(int id, String name, List<Song> songs) {
	super();
	this.id = id;
	this.name = name;
	this.songs = songs;
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
 * @return the songs
 */
public List<Song> getSongs() {
	return songs;
}
/**
 * @param songs the songs to set
 */
public void setSongs(List<Song> songs) {
	this.songs = songs;
}
@Override
public String toString() {
	return "Playlist [id=" + id + ", name=" + name + ", songs=" + songs + "]";
}


}
