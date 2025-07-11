package com.example.thong_tin_bai_hat.service;

import com.example.thong_tin_bai_hat.model.Song;

import java.util.List;

public interface ISongService {
    void save(Song song);

    void update(int index, Song song);

    List<Song> findAll();

    Song findById(int index);
}
