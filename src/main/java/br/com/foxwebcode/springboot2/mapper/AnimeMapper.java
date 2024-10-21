package br.com.foxwebcode.springboot2.mapper;

import br.com.foxwebcode.springboot2.domain.Anime;
import br.com.foxwebcode.springboot2.requests.AnimePostRequestBody;
import br.com.foxwebcode.springboot2.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);

}

