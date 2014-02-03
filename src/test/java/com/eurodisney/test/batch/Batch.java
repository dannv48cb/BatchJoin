package com.eurodisney.test.batch;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eurodisney.test.repository.DisneyGenerator;
import com.eurodisney.test.repository.DisneyRepository;
import com.eurodisney.test.repository.DisneyRepositoryIT;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
public class Batch {
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory
			.getLogger(DisneyRepositoryIT.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	private DisneyRepository disneyRepository;

	@Inject
	private DisneyGenerator disneyGenerator;
	
	@Inject
	private SessionFactory sessionFactory;

	@Inject
	private JobLauncher jobLauncher;

	@Inject
	private Job testJob;

	@Test
	public void run() {
		try {
			JobExecution execution = jobLauncher.run(testJob, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());
			System.out.println("Exit Status : "	+ execution.getAllFailureExceptions());
			
//			Session session = sessionFactory.openSession();
//			Query query = session.createQuery("from Department d inner join d.idDisney");
//			List list = query.list();
//			System.out.println(list.toString());
			
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
}
