package dev.selin.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//data access layer for our api and talks to the database and gets the data
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //I don't want to show the id of the movie but I can use imdb id so there
    Optional<Movie> findMovieByImdbId(String imdbId);

}
