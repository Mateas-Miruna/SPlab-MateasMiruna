package ro.uvt.info.splabmm1.difexample.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splabmm1.model.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}
