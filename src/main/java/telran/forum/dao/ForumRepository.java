package telran.forum.dao;

import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;

import telran.forum.model.Post;

public interface ForumRepository extends MongoRepository<Post, String> {
	Stream<Post> findByAuthor(String author);
}
