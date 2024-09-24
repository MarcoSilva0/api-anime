package br.com.foxwebcode.springboot2.controller;

import br.com.foxwebcode.springboot2.domain.Anime;
import br.com.foxwebcode.springboot2.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    @Autowired
    private DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list() {
        return  List.of(new Anime("Naruto"), new Anime("DBZ"));
    }
}
