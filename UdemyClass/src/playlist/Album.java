 package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	
	private String name;
	private String artist;
	private SongList songs;
	
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	}
	
	public boolean addSong(String title, double duration) {
		return this.songs.add(new Song(title, duration));
	}
	
//	private Song findSong(String title) {
//		for(Song s : this.songs) {
//			if(s.getTitle().equalsIgnoreCase(title)) {
//				return s;
//			}
//		}
//		return null;
//	}
	
	public boolean addToPlayList(int number, LinkedList<Song> playlist) {
		Song song = this.songs.findSong(number);
		if(song != null) {
			playlist.add(song);
			return true;
		}
		return false;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		Song song = this.songs.findSong(title);
		if(song != null) {
			playlist.add(song);
			return true;
		}
		return false;
	}
	
	private class SongList {
		private ArrayList<Song> songs;

		private SongList() {
			this.songs = new ArrayList<Song>();
		}
		
		private boolean add(Song song) {
			if(this.songs.contains(song)) {
				return false;
			}
			this.songs.add(song);
			return true;
		}
		
		private Song findSong(String title) {
			for(Song s : this.songs) {
				if(s.getTitle().equals(title)) {
					return s;
				}
			}
			return null;
		}
		
		private Song findSong(int trackNumber) {
			int index = trackNumber - 1;
			if(index > 0 && this.songs.size() > index) {
				return this.songs.get(index);
			}
			return null;
		}
	}
}










