package com.wadpam.guja.oauth2.dao;

import com.google.inject.Inject;
import com.wadpam.guja.exceptions.InternalServerErrorRestException;
import com.wadpam.guja.oauth2.domain.DOAuth2User;
import com.wadpam.guja.oauth2.providers.Oauth2UserProvider;
import net.sf.mardao.dao.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Implementation of Business Methods related to entity DOAuth2User.
 * This (empty) class is generated by mardao, but edited by developers.
 * It is not overwritten by the generator once it exists.
 * <p/>
 * Generated on 2014-12-02T22:54:58.210+0100.
 *
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class DOAuth2UserDaoBean extends GeneratedDOAuth2UserDaoImpl implements Oauth2UserProvider {

  private static final Logger LOGGER = LoggerFactory.getLogger(GeneratedDOAuth2UserDaoImpl.class);

  @Inject
  public DOAuth2UserDaoBean(Supplier supplier) {
    super(supplier);
  }

  @Override
  public DOAuth2User getUserById(Long id) {
    try {
      return get(id);
    } catch (IOException e) {
      LOGGER.error("Failed to read user from datastore {} ", e);
      throw new InternalServerErrorRestException("Failed to read user from datastore");
    }
  }

  @Override
  public DOAuth2User createUser() {
    return new DOAuth2User();
  }

  @Override
  public DOAuth2User putUser(DOAuth2User user) {
    try {
      put(user);
      return user;
    } catch (IOException e) {
      LOGGER.error("Failed to write user to datastore {} ", e);
      throw new InternalServerErrorRestException("Failed to write user to datastore");
    }
  }

}