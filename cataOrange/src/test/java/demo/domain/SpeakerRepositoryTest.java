package demo.domain;

import demo.RunApplication;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RunApplication.class)
public class SpeakerRepositoryTest {

	@Autowired
	private SpeakerRepository repository;

	@Test
	public void testFindByTwitter() throws Exception {
		Speaker dave = repository.save(new Speaker("Marwen", "Saidi", "Marwen_Saidi"));
		assertThat(repository.findByTwitter("Marwen_Saidi").getId(), is(dave.getId()));
	}
}