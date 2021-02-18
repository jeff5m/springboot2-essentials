package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

// @RestController already implements @ResponseBody, which tells that the object returned is automatically serialized into JSON and passed
// back into HttpResponse object
// @RequestMapping("anime") define this class as a request-handling class for path /anime
// localhost:8080/anime
@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor // generates a constructor with all final fields
public class AnimeController {
    private final DateUtil dateUtil;

    // localhost:8080/anime/list
    @GetMapping(path = "list")
    public List<Anime> list() {
//        log.info print something passed in the application log
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Shingeki no Kyojin"), new Anime("captain tsubasa"));
    }
}

