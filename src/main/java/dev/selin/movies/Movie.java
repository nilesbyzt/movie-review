package dev.selin.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //comes from lombok and takes care of all the getter setters
@AllArgsConstructor //from lombok
@NoArgsConstructor //from lombok constructor
public class Movie {
    @Id //for unique id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops; //for front-end background
    @DocumentReference //only the id reviews, manual reference relationship
    private List<Review> reviewIds;


}
