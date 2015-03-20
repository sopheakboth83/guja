package com.wadpam.guja.persist;

import com.google.inject.Inject;
import com.wadpam.guja.environment.ServerEnvironment;
import net.sf.mardao.dao.*;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

/**
 * Created by sopheakboth83 on 3/15/15.
 */
public class GuicedJdbcSupplier extends JdbcSupplier {

    private ServerEnvironment environment;

    @Inject
    public GuicedJdbcSupplier(DataSource dataSource, DataFieldMaxValueIncrementer incrementer,
                              ServerEnvironment serverEnvironment) {
        super(dataSource, incrementer, JdbcDialect.valueOf(serverEnvironment.getDbDialect()));
        this.environment = serverEnvironment;
    }

    @Override
    public Object readValue(Connection tx, Mapper mapper, JdbcKey key) throws IOException {
        try {
            return super.readValue(tx, mapper, key);
        }
        catch (BadSqlGrammarException onMissingTable) {
            if (environment.isDevEnvironment()) {
                // create Table
                super.createTable(mapper);

                // retry invocation
                return super.readValue(tx, mapper, key);
            }
            else {
                throw onMissingTable;
            }
        }
    }

    @Override
    public JdbcKey writeValue(Connection tx, Mapper mapper, JdbcKey key, JdbcWriteValue value) throws IOException {
        try {
            return super.writeValue(tx, mapper, key, value);
        }
        catch (BadSqlGrammarException onMissingTable) {
            if (environment.isDevEnvironment()) {
                // create Table
                super.createTable(mapper);

                // retry invocation
                return super.writeValue(tx, mapper, key, value);
            }
            else {
                throw onMissingTable;
            }
        }
    }

    @Override
    public JdbcKey insertValue(Connection tx, Mapper mapper, JdbcKey key, JdbcWriteValue value) throws IOException {
        try {
            return super.insertValue(tx, mapper, key, value);
        }
        catch (InvalidDataAccessApiUsageException onMissingTable) {
            if (environment.isDevEnvironment()) {
                // create Table
                super.createTable(mapper);

                // retry invocation
                return super.insertValue(tx, mapper, key, value);
            }
            else {
                throw onMissingTable;
            }
        }
    }
}
