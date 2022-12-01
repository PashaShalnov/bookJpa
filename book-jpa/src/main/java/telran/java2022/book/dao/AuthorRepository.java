package telran.java2022.book.dao;

import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.book.model.Author;

public interface AuthorRepository extends CrudRepository<Author, String> {

//	Stream<Author> findByBookIsbn(String isbn);
	
//	void deleteByIsbn(String isbn);
}
