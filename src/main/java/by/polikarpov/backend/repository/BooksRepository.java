package by.polikarpov.backend.repository;

import by.polikarpov.backend.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
