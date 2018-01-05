package database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Bean that creates the database table
 */
public class DatabaseBean {

    private static final Logger LOG = LoggerFactory.getLogger(DatabaseBean.class);
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void create() throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);

        String sql1 = "create table votes (\n"
                + "  idmesa integer,\n"
                + "  codimesa varchar(15),\n"
                + "  mesatancada varchar(15),\n"
                + "  comarca varchar(15),\n"
                + "  vnuls integer,\n"
                + "  vblancs integer,\n"
                + "  verc integer,\n"
                + "  vjxc integer,\n"
                + "  vcup integer,\n"
                + "  vpsc integer,\n"
                + "  vcs integer,\n"
                + "  vppc integer,\n"
                + "  vcom integer,\n"
                + "  vpacma integer,\n"
                + "  vdialeg integer,\n"
                + "  vpumjust integer,\n"
                + "  vrecortes integer,\n"
                + "  vfamilia integer,\n"
                + "  vdn integer,\n"
                + "  vpfiv integer,\n"
                + "  vconver integer,\n"
                + "  vunidos integer,\n"
                + "  vcilus integer,\n"
                + "  cens integer,\n"
                + "  acta varchar(255),\n"
                + "  hihavots integer,\n"
                + "  hihaacta integer,\n"
                + "  origen varchar(15),\n"
                + "  datetime datetime,\n"
                + "  user varchar(15),\n"
                + ")";

        String sql2 = "create table meses (\n"
                + "  idmesa integer,\n"
                + "  codimesa varchar(15),\n"
                + "  codprov integer,\n"
                + "  codilocal varchar(25),\n"
                + "  municipi varchar(25),\n"
                + "  comarca varchar(25),\n"
                + "  g35 varchar(25),\n"
                + "  codimunicipi integer,\n"
                + "  districte integer,\n"
                + "  seccio varchar(5),\n"
                + "  subseccio varchar(5),\n"
                + "  mesa varchar(5),\n"
                + "  lletrainici varchar(1),\n"
                + "  lletrafi varchar(1),\n"
                + "  codilocalorigen varchar(25),\n"
                + "  codilocal2 varchar(25),\n"
                + "  localelectoraladreca varchar(255),\n"
                + "  localelectoral varchar(255),\n"
                + "  adreca varchar(255),\n"
                + "  idmesamesescola integer,\n"
                + ")";

        LOG.info("Creating tables ...");

        try {
            jdbc.execute("drop table votes");
            jdbc.execute("drop table meses");
        } catch (Throwable e) {
            // ignore
        }

        jdbc.execute(sql1);
        jdbc.execute(sql2);

        LOG.info("... created tables");
    }

    public void destroy() throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);

        try {
            jdbc.execute("drop votes");
            jdbc.execute("drop meses");
        } catch (Throwable e) {
            // ignore
        }
    }
}
