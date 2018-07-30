package mx.edu.uacm.primerproyectohbm.test.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import mx.edu.uacm.primerproyectohbm.HibernateJpaOneToOneUniApplication;
import mx.edu.uacm.primerproyectohbm.domain.Phone;
import mx.edu.uacm.primerproyectohbm.domain.PhoneDetails;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= HibernateJpaOneToOneUniApplication.class)
public class PhoneTest {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Test
	@Transactional
	//@Rollback(false)
	public void testPersistirPhone() {
		Phone phone = new Phone("489348593");
		entityManager.persist(phone);
		
		PhoneDetails details = new PhoneDetails("Telcel", "movil");
		phone.setDetails(details);
		entityManager.persist(details);
		
		
		//Phone 2
		Phone phone2 = new Phone("54353634");
		entityManager.persist(phone2);
		
		PhoneDetails details2 = new PhoneDetails("Movistar", "movil");
		phone.setDetails(details2);
		entityManager.persist(details);

		
	}
}
