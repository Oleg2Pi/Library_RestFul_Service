package by.polikarpov.backend.repository;

import by.polikarpov.backend.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
