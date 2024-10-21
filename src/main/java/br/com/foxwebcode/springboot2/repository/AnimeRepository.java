package br.com.foxwebcode.springboot2.repository;

import br.com.foxwebcode.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
