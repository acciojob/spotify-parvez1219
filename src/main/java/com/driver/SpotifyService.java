package com.driver;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class SpotifyService {

    //Auto-wire will not work in this case, no need to change this and add autowire

    SpotifyRepository spotifyRepository = new SpotifyRepository();

    public User createUser(String name, String mobile){
        return SpotifyRepository.createUser(name,mobile);
    }

    public Artist createArtist(String name) {
        return SpotifyRepository.createArtist(name);
    }

    public Album createAlbum(String title, String artistName) {
        return SpotifyRepository.createAlbum(title,artistName);
    }

    public Song createSong(String title, String albumName, int length) throws Exception {
        return SpotifyRepository.createSong(title,albumName,length);
    }

    public Playlist createPlaylistOnLength(String mobile, String title, int length) throws Exception {
        return SpotifyRepository.createPlaylistOnLength(mobile,title,length);
    }

    public Playlist createPlaylistOnName(String mobile, String title, List<String> songTitles) throws Exception {
        return SpotifyRepository.createPlaylistOnName(mobile,title,songTitles);
    }

    public Playlist findPlaylist(String mobile, String playlistTitle) throws Exception {
        return SpotifyRepository.findPlaylist(mobile,playlistTitle);
    }

    public Song likeSong(String mobile, String songTitle) throws Exception {
        return SpotifyRepository.likeSong(mobile,songTitle);
    }

    public String mostPopularArtist() {
        return SpotifyRepository.mostPopularArtist();
    }

    public String mostPopularSong() {
        return spotifyRepository.mostPopularSong();
    }
}
