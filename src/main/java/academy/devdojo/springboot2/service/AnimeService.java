package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
//    future: private final AnimeRepository animeRepository
    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Shingeki no Kyojin"), new Anime(2L, "captain tsubasa"));
    }
}
