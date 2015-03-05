package EJB;



import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;

    public class SessionFactory{

        private static SessionFactory sessionFactory=null;
        private QueryRunner queryRunner;
        private SessionFactory() {
            init();
        }

        //initialize ipo database
        private void init() {
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/e_commerce?useUnicode=true&characterEncoding=UTF8");

            dataSource.setUsername("root");
            dataSource.setPassword("");
            //java.sql.Connection conn = dataSource.getConnection();
            this.queryRunner=new QueryRunner(dataSource);
        }

        /*this function will return one instance of SessingFactory object
         * using singleton design pattern
         * and access to this object will restrict using this function*/
        public static SessionFactory getInstance() {
            if(sessionFactory==null){
                    sessionFactory=new SessionFactory();
            }
            return sessionFactory;
        }

        public QueryRunner getQueryRunner() {
            return queryRunner;
        }


    }
