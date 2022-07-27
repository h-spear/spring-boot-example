package zerock.mreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerock.mreview.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
