package net.qrab.mycat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.hibernate.Session;

public class Hiberjunk {

  static final String dburl = "jdbc:derby:db1.poo";

  static JFrame theFrame = new JFrame("myCat");
  static JPanel content;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //javax.swing.SwingUtilities.invokeLater(new Runnable() {
    //   @Override
    //   public void run() {
    //      content = new Daily();
    //      theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //      theFrame.setContentPane(content);
    //      theFrame.pack();
    //      theFrame.setVisible(true);
    //   }
    //});
    createDB(dburl);
    Common.createTables();
    writePerson(new Person(5,"Charles McSplotch"));
    writePerson(new Person(1,"Winnefred Pooington"));
    writePerson(new Person(2,"Albert Sniff"));
    writePerson(new Person(3,"Ingrid Splut"));
    writePerson(new Person(4,"Jameson Pooworth"));
    shutdownDB();

  }

  public static void createDB(String url) {
    try {
      Connection c = DriverManager.getConnection(url+";create=true");
      c.close();
    } catch (SQLException ex) {
      Logger.getLogger(Hiberjunk.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public static void shutdownDB() {
    try {
      Connection c = DriverManager.getConnection("jdbc:derby:;shutdown=true");
      c.close();
    } catch (SQLException ex) {
      Logger.getLogger(Hiberjunk.class.getName()).log(Level.SEVERE, null, ex);
    }
  }


  public static void writePerson(Person p) {
    Session session = Common.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(p);
    session.getTransaction().commit();
  }

  // http://stackoverflow.com/questions/22200773/hibernate-cfg-xml-modification-on-runtime
}
