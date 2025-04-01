package prepare.keras;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KerasApplicationTests {
	@Autowired
	EntityManager em;

	@Autowired
	JPAQueryFactory

	@Test
	void contextLoads() {
	}


	@Test
	void jpql(){
		String username="kim";
		String query="select m from Member m"+
				"where m.username = :username";
		List<Member>list=em.createQuery(query,Member.class)
				.getResultList();
	}

	@Test
	public void querydsl(){
		String username="kim";
		List<Member>result=queryFactory
				.
	}


}
