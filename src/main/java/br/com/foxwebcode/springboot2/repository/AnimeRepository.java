package br.com.foxwebcode.springboot2.repository;

import br.com.foxwebcode.springboot2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
