package net.qrab.mycat;

import static net.qrab.mycat.Hiberjunk.dburl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Common {

  private static final Configuration  config         = new Configuration();
  private static final SessionFactory sessionFactory;

  static {
      config.setProperty("hibernate.connection.url", dburl);
      config.addPackage("net.qrab.mycat");
      config.addAnnotatedClass(Person.class);
      config.configure();
      sessionFactory = config.buildSessionFactory();
  }

  public static Session getSession() throws HibernateException {
    return sessionFactory.openSession();
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  public static void shutdown() {
    getSessionFactory().close();
  }

  public static void createTables() {
    new SchemaExport(config).create(true, true);
  }

}
