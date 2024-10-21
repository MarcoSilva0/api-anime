package br.com.foxwebcode.springboot2.service;

import br.com.foxwebcode.springboot2.domain.Anime;
import br.com.foxwebcode.springboot2.mapper.AnimeMapper;
import br.com.foxwebcode.springboot2.repository.AnimeRepository;
import br.com.foxwebcode.springboot2.requests.AnimePostRequestBody;
import br.com.foxwebcode.springboot2.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {
    private final AnimeRepository animeRepository;
    private final AnimeMapper animeMapper;

    public List<Anime> listAll() {
        return animeRepository.findAll();
    }

    public Anime findByIdOrThrowBadRequestException(Long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }

    public Anime save(AnimePostRequestBody animePostRequestBody) {

        return animeRepository.save(animeMapper.toAnime(animePostRequestBody));
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());

        Anime anime = animeMapper.toAnime(animePutRequestBody);
        anime.setId(savedAnime.getId());

        animeRepository.save(anime);

    }
}
