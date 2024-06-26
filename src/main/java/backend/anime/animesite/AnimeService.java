package backend.anime.animesite;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepo animeRepo;
    public List<Anime> allAnime() {
        return animeRepo.findAll();
    }
    public Optional<Anime> singleAnime (String dbi){
        return animeRepo.findAnimeByDbi(dbi);
    }
}
