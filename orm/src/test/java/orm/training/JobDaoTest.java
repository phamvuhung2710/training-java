//package orm.training;
//
//import orm.training.dao.JobDaoImpl;
//
//class JobDaoTest {
//    static JobDaoImpl jobDao;
//    
//    @BeforeAll
//    static void setUpBeforeClass() throws Exception {
//        jobDao = new JobDaoImpl();
//    }
//    
//    @Test
//    void testSave1() throws Exception {
//        Jobs job = new Jobs("J01", "Java Dev1", 1000, 2000);
//        assertEquals(true, jobDao.save(job));
//    }
//    @Test
//    void testSave2() throws Exception {
//        Jobs job = new Jobs("J02", "Java Dev2", 1200, 2200);
//        assertEquals(true, jobDao.save(job));
//    }
//    
//}
//
