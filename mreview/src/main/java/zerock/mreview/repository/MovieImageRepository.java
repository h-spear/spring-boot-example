package zerock.mreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerock.mreview.entity.MovieImage;

public interface MovieImageRepository extends JpaRepository<MovieImage, Long> {
}
