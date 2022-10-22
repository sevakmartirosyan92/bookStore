package am.itspace.bookstore.repository;

import am.itspace.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findTop20ByOrderByDesc();
}
