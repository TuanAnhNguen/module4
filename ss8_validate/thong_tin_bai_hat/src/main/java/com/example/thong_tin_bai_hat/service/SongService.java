package com.example.thong_tin_bai_hat.service;

import com.example.thong_tin_bai_hat.model.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService implements ISongService {
    private final List<Song> songList = new ArrayList<>();

    @Override
    public void save(Song song) {
        songList.add(song);
    }

    @Override
    public void update(int index, Song song) {
        songList.set(index, song);
    }

    @Override
    public List<Song> findAll() {
        return songList;
    }

    @Override
    public Song findById(int index) {
        return songList.get(index);
    }
}
