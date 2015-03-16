package com.wadpam.guja.config;

/*
 * #%L
 * guja-base
 * %%
 * Copyright (C) 2014 Wadpam
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.wadpam.guja.admintask.AdminTaskQueue;
import com.wadpam.guja.admintask.J2eeAdminTaskQueue;
import com.wadpam.guja.cache.CacheBuilder;
import com.wadpam.guja.cache.CacheBuilderProvider;
import com.wadpam.guja.cache.GuavaCacheBuilderProvider;
import com.wadpam.guja.environment.J2eeServerEnvironment;
import com.wadpam.guja.environment.ServerEnvironment;
import net.sf.mardao.dao.JdbcDialect;


/**
 * Configure Guice module.
 *
 * @author sopheakboth83
 */
public class GujaJ2eeModule extends AbstractModule {

    private final String jdbcDialect;

    public GujaJ2eeModule(String jdbcDialect) {
        this.jdbcDialect = jdbcDialect;
    }

    @Provides
    public ServerEnvironment createServerEnvironment() {
        return new J2eeServerEnvironment(jdbcDialect);
    }

    @Override
  protected void configure() {

    bind(CacheBuilderProvider.class).to(GuavaCacheBuilderProvider.class);
    bind(CacheBuilder.class).toProvider(GuavaCacheBuilderProvider.class);

//    bind(ServerEnvironment.class).to(J2eeServerEnvironment.class);

//    bind(GAEBlobResource.class);

    bind(AdminTaskQueue.class).to(J2eeAdminTaskQueue.class);

  }

}
