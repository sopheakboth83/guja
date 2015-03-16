package com.wadpam.guja.persist;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.wadpam.guja.dao.DaoBuilderFactory;
import com.wadpam.guja.dao.Mardao3BuilderFactory;
import net.sf.mardao.dao.JdbcDialect;
import net.sf.mardao.dao.Supplier;

/**
 * Configure Guice and Mardao to user GAE datastore supplier.
 *
 * @author sopheakboth83
 */
public class Mardao3JdbcModule extends AbstractModule {

    private final JdbcDialect jdbcDialect;

    public Mardao3JdbcModule(JdbcDialect jdbcDialect) {
        this.jdbcDialect = jdbcDialect;
    }

    @Provides
    public JdbcDialect getJdbcDialect() {
        return this.jdbcDialect;
    }

    @Override
  protected void configure() {

//    bind(UnitOfWork.class).to(MardaoDatastoreUnitOfWork.class);
//    bind(PersistService.class).to(MardaoDatastorePersistService.class);

    bind(DaoBuilderFactory.class).to(Mardao3BuilderFactory.class);
    bind(Supplier.class).to(GuicedJdbcSupplier.class);

  }

}
