package dwarf4j.framework.orm.generic;

public enum DriverDialeto {

  H2("org.h2.Driver", "org.hibernate.dialect.H2Dialect"),
  DERBY_EMBEDDED("org.apache.derby.jdbc.EmbeddedDriver", "org.hibernate.dialect.DerbyDialect")
  ;

  private String driver, dialeto;
  private DriverDialeto(String driver, String dialeto) {
    this.driver = driver;
    this.dialeto = dialeto;
  }
  public String driver() { return this.driver; };
  public String dialeto() { return this.dialeto; };

}