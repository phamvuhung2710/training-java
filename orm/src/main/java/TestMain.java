import orm.training.dao.JobDaoImpl;
import orm.training.entity.Jobs;

public class TestMain {
	public static void main(String[] args) throws Exception {
		JobDaoImpl jobDao = new JobDaoImpl();
		Jobs job = new Jobs("J01", "Java Dev 01", 1000, 2000);
		jobDao.save(job);
	}
}
