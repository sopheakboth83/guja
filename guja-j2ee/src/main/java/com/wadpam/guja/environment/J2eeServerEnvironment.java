package com.wadpam.guja.environment;

/**
 * Created by sopheakboth83 on 3/15/15.
 */
public class J2eeServerEnvironment implements ServerEnvironment {

    private final String jdbcDialect;

    public J2eeServerEnvironment(String jdbcDialect) {
        this.jdbcDialect = jdbcDialect;
    }

    @Override
    public boolean isDevEnvironment() {
        return true;
    }

    @Override
    public String getDbDialect() {
        return jdbcDialect;
    }
}
