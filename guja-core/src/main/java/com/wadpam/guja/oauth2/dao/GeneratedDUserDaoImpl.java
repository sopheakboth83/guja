package com.wadpam.guja.oauth2.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.filter.Filter;
import net.sf.mardao.core.geo.DLocation;
import net.sf.mardao.dao.AbstractDao;
import net.sf.mardao.dao.Supplier;
import com.wadpam.guja.oauth2.domain.DUser;
import net.sf.mardao.core.Cached;
import net.sf.mardao.core.CacheConfig;
import java.io.IOException;
import javax.cache.annotation.CacheResult;
import javax.cache.annotation.CachePut;
import javax.cache.annotation.CacheRemove;
import javax.cache.annotation.CacheKey;
import javax.cache.annotation.CacheValue;


/**
 * The DUser domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2015-03-16T20:40:39.325+0100.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDUserDaoImpl
  extends AbstractDao<DUser, java.lang.Long> {

  public GeneratedDUserDaoImpl(Supplier<Object, Object, Object, Object> supplier) {
    super(new DUserMapper(supplier), supplier);
  }

// ----------------------- Caching -------------------------------------

  // Cache crud methods
  @CacheResult
  @Override
  public DUser get(@CacheKey Object parentKey, @CacheKey java.lang.Long id) throws IOException {
    return super.get(parentKey, id);
  }

  @CachePut
  @Override
  public java.lang.Long put(@CacheKey Object parentKey, @CacheKey java.lang.Long id, @CacheValue DUser entity) throws IOException {
    return super.put(parentKey, id, entity);
  }

  @CacheRemove
  @Override
  public void delete(@CacheKey Object parentKey, @CacheKey java.lang.Long id) throws IOException {
    super.delete(parentKey, id);
  }


// ----------------------- field finders -------------------------------
  /**
   * query-by method for field address1
   * @param address1 the specified attribute
   * @return an Iterable of DUsers for the specified address1
   */
  public Iterable<DUser> queryByAddress1(java.lang.String address1) {
    return queryByField(null, DUserMapper.Field.ADDRESS1.getFieldName(), address1);
  }

  /**
   * query-page-by method for field address1
   * @param address1 the specified attribute
   * @return a CursorPage of DUsers for the specified address1
   */
  public CursorPage<DUser> queryPageByAddress1(java.lang.String address1,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.ADDRESS1.getFieldName(), address1,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field address2
   * @param address2 the specified attribute
   * @return an Iterable of DUsers for the specified address2
   */
  public Iterable<DUser> queryByAddress2(java.lang.String address2) {
    return queryByField(null, DUserMapper.Field.ADDRESS2.getFieldName(), address2);
  }

  /**
   * query-page-by method for field address2
   * @param address2 the specified attribute
   * @return a CursorPage of DUsers for the specified address2
   */
  public CursorPage<DUser> queryPageByAddress2(java.lang.String address2,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.ADDRESS2.getFieldName(), address2,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field birthInfo
   * @param birthInfo the specified attribute
   * @return an Iterable of DUsers for the specified birthInfo
   */
  public Iterable<DUser> queryByBirthInfo(java.lang.String birthInfo) {
    return queryByField(null, DUserMapper.Field.BIRTHINFO.getFieldName(), birthInfo);
  }

  /**
   * query-page-by method for field birthInfo
   * @param birthInfo the specified attribute
   * @return a CursorPage of DUsers for the specified birthInfo
   */
  public CursorPage<DUser> queryPageByBirthInfo(java.lang.String birthInfo,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.BIRTHINFO.getFieldName(), birthInfo,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field city
   * @param city the specified attribute
   * @return an Iterable of DUsers for the specified city
   */
  public Iterable<DUser> queryByCity(java.lang.String city) {
    return queryByField(null, DUserMapper.Field.CITY.getFieldName(), city);
  }

  /**
   * query-page-by method for field city
   * @param city the specified attribute
   * @return a CursorPage of DUsers for the specified city
   */
  public CursorPage<DUser> queryPageByCity(java.lang.String city,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.CITY.getFieldName(), city,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field country
   * @param country the specified attribute
   * @return an Iterable of DUsers for the specified country
   */
  public Iterable<DUser> queryByCountry(java.lang.String country) {
    return queryByField(null, DUserMapper.Field.COUNTRY.getFieldName(), country);
  }

  /**
   * query-page-by method for field country
   * @param country the specified attribute
   * @return a CursorPage of DUsers for the specified country
   */
  public CursorPage<DUser> queryPageByCountry(java.lang.String country,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.COUNTRY.getFieldName(), country,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field createdBy
   * @param createdBy the specified attribute
   * @return an Iterable of DUsers for the specified createdBy
   */
  public Iterable<DUser> queryByCreatedBy(java.lang.String createdBy) {
    return queryByField(null, DUserMapper.Field.CREATEDBY.getFieldName(), createdBy);
  }

  /**
   * query-page-by method for field createdBy
   * @param createdBy the specified attribute
   * @return a CursorPage of DUsers for the specified createdBy
   */
  public CursorPage<DUser> queryPageByCreatedBy(java.lang.String createdBy,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.CREATEDBY.getFieldName(), createdBy,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field createdDate
   * @param createdDate the specified attribute
   * @return an Iterable of DUsers for the specified createdDate
   */
  public Iterable<DUser> queryByCreatedDate(java.util.Date createdDate) {
    return queryByField(null, DUserMapper.Field.CREATEDDATE.getFieldName(), createdDate);
  }

  /**
   * query-page-by method for field createdDate
   * @param createdDate the specified attribute
   * @return a CursorPage of DUsers for the specified createdDate
   */
  public CursorPage<DUser> queryPageByCreatedDate(java.util.Date createdDate,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.CREATEDDATE.getFieldName(), createdDate,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field displayName
   * @param displayName the specified attribute
   * @return an Iterable of DUsers for the specified displayName
   */
  public Iterable<DUser> queryByDisplayName(java.lang.String displayName) {
    return queryByField(null, DUserMapper.Field.DISPLAYNAME.getFieldName(), displayName);
  }

  /**
   * query-page-by method for field displayName
   * @param displayName the specified attribute
   * @return a CursorPage of DUsers for the specified displayName
   */
  public CursorPage<DUser> queryPageByDisplayName(java.lang.String displayName,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.DISPLAYNAME.getFieldName(), displayName,
      requestedPageSize, cursorString);
  }

  /**
   * find-by method for unique field email
   * @param email the unique attribute
   * @return the unique DUser for the specified email
   */
  public DUser findByEmail(java.lang.String email) {
    return queryUniqueByField(null, DUserMapper.Field.EMAIL.getFieldName(), email);
  }

  /**
   * query-by method for field firstName
   * @param firstName the specified attribute
   * @return an Iterable of DUsers for the specified firstName
   */
  public Iterable<DUser> queryByFirstName(java.lang.String firstName) {
    return queryByField(null, DUserMapper.Field.FIRSTNAME.getFieldName(), firstName);
  }

  /**
   * query-page-by method for field firstName
   * @param firstName the specified attribute
   * @return a CursorPage of DUsers for the specified firstName
   */
  public CursorPage<DUser> queryPageByFirstName(java.lang.String firstName,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.FIRSTNAME.getFieldName(), firstName,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field friends
   * @param friends the specified attribute
   * @return an Iterable of DUsers for the specified friends
   */
  public Iterable<DUser> queryByFriends(java.lang.Object friends) {
    return queryByField(null, DUserMapper.Field.FRIENDS.getFieldName(), friends);
  }

  /**
   * query-page-by method for field friends
   * @param friends the specified attribute
   * @return a CursorPage of DUsers for the specified friends
   */
  public CursorPage<DUser> queryPageByFriends(java.lang.Object friends,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.FRIENDS.getFieldName(), friends,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field lastName
   * @param lastName the specified attribute
   * @return an Iterable of DUsers for the specified lastName
   */
  public Iterable<DUser> queryByLastName(java.lang.String lastName) {
    return queryByField(null, DUserMapper.Field.LASTNAME.getFieldName(), lastName);
  }

  /**
   * query-page-by method for field lastName
   * @param lastName the specified attribute
   * @return a CursorPage of DUsers for the specified lastName
   */
  public CursorPage<DUser> queryPageByLastName(java.lang.String lastName,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.LASTNAME.getFieldName(), lastName,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field password
   * @param password the specified attribute
   * @return an Iterable of DUsers for the specified password
   */
  public Iterable<DUser> queryByPassword(java.lang.String password) {
    return queryByField(null, DUserMapper.Field.PASSWORD.getFieldName(), password);
  }

  /**
   * query-page-by method for field password
   * @param password the specified attribute
   * @return a CursorPage of DUsers for the specified password
   */
  public CursorPage<DUser> queryPageByPassword(java.lang.String password,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.PASSWORD.getFieldName(), password,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field phoneNumber1
   * @param phoneNumber1 the specified attribute
   * @return an Iterable of DUsers for the specified phoneNumber1
   */
  public Iterable<DUser> queryByPhoneNumber1(java.lang.String phoneNumber1) {
    return queryByField(null, DUserMapper.Field.PHONENUMBER1.getFieldName(), phoneNumber1);
  }

  /**
   * query-page-by method for field phoneNumber1
   * @param phoneNumber1 the specified attribute
   * @return a CursorPage of DUsers for the specified phoneNumber1
   */
  public CursorPage<DUser> queryPageByPhoneNumber1(java.lang.String phoneNumber1,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.PHONENUMBER1.getFieldName(), phoneNumber1,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field phoneNumber2
   * @param phoneNumber2 the specified attribute
   * @return an Iterable of DUsers for the specified phoneNumber2
   */
  public Iterable<DUser> queryByPhoneNumber2(java.lang.String phoneNumber2) {
    return queryByField(null, DUserMapper.Field.PHONENUMBER2.getFieldName(), phoneNumber2);
  }

  /**
   * query-page-by method for field phoneNumber2
   * @param phoneNumber2 the specified attribute
   * @return a CursorPage of DUsers for the specified phoneNumber2
   */
  public CursorPage<DUser> queryPageByPhoneNumber2(java.lang.String phoneNumber2,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.PHONENUMBER2.getFieldName(), phoneNumber2,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field profileLink
   * @param profileLink the specified attribute
   * @return an Iterable of DUsers for the specified profileLink
   */
  public Iterable<DUser> queryByProfileLink(java.lang.String profileLink) {
    return queryByField(null, DUserMapper.Field.PROFILELINK.getFieldName(), profileLink);
  }

  /**
   * query-page-by method for field profileLink
   * @param profileLink the specified attribute
   * @return a CursorPage of DUsers for the specified profileLink
   */
  public CursorPage<DUser> queryPageByProfileLink(java.lang.String profileLink,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.PROFILELINK.getFieldName(), profileLink,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field roles
   * @param roles the specified attribute
   * @return an Iterable of DUsers for the specified roles
   */
  public Iterable<DUser> queryByRoles(java.lang.Object roles) {
    return queryByField(null, DUserMapper.Field.ROLES.getFieldName(), roles);
  }

  /**
   * query-page-by method for field roles
   * @param roles the specified attribute
   * @return a CursorPage of DUsers for the specified roles
   */
  public CursorPage<DUser> queryPageByRoles(java.lang.Object roles,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.ROLES.getFieldName(), roles,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field state
   * @param state the specified attribute
   * @return an Iterable of DUsers for the specified state
   */
  public Iterable<DUser> queryByState(java.lang.Integer state) {
    return queryByField(null, DUserMapper.Field.STATE.getFieldName(), state);
  }

  /**
   * query-page-by method for field state
   * @param state the specified attribute
   * @return a CursorPage of DUsers for the specified state
   */
  public CursorPage<DUser> queryPageByState(java.lang.Integer state,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.STATE.getFieldName(), state,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field thumbnailUrl
   * @param thumbnailUrl the specified attribute
   * @return an Iterable of DUsers for the specified thumbnailUrl
   */
  public Iterable<DUser> queryByThumbnailUrl(java.lang.String thumbnailUrl) {
    return queryByField(null, DUserMapper.Field.THUMBNAILURL.getFieldName(), thumbnailUrl);
  }

  /**
   * query-page-by method for field thumbnailUrl
   * @param thumbnailUrl the specified attribute
   * @return a CursorPage of DUsers for the specified thumbnailUrl
   */
  public CursorPage<DUser> queryPageByThumbnailUrl(java.lang.String thumbnailUrl,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.THUMBNAILURL.getFieldName(), thumbnailUrl,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field updatedBy
   * @param updatedBy the specified attribute
   * @return an Iterable of DUsers for the specified updatedBy
   */
  public Iterable<DUser> queryByUpdatedBy(java.lang.String updatedBy) {
    return queryByField(null, DUserMapper.Field.UPDATEDBY.getFieldName(), updatedBy);
  }

  /**
   * query-page-by method for field updatedBy
   * @param updatedBy the specified attribute
   * @return a CursorPage of DUsers for the specified updatedBy
   */
  public CursorPage<DUser> queryPageByUpdatedBy(java.lang.String updatedBy,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.UPDATEDBY.getFieldName(), updatedBy,
      requestedPageSize, cursorString);
  }

  /**
   * query-by method for field updatedDate
   * @param updatedDate the specified attribute
   * @return an Iterable of DUsers for the specified updatedDate
   */
  public Iterable<DUser> queryByUpdatedDate(java.util.Date updatedDate) {
    return queryByField(null, DUserMapper.Field.UPDATEDDATE.getFieldName(), updatedDate);
  }

  /**
   * query-page-by method for field updatedDate
   * @param updatedDate the specified attribute
   * @return a CursorPage of DUsers for the specified updatedDate
   */
  public CursorPage<DUser> queryPageByUpdatedDate(java.util.Date updatedDate,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.UPDATEDDATE.getFieldName(), updatedDate,
      requestedPageSize, cursorString);
  }

  /**
   * find-by method for unique field username
   * @param username the unique attribute
   * @return the unique DUser for the specified username
   */
  public DUser findByUsername(java.lang.String username) {
    return queryUniqueByField(null, DUserMapper.Field.USERNAME.getFieldName(), username);
  }

  /**
   * query-by method for field zipCode
   * @param zipCode the specified attribute
   * @return an Iterable of DUsers for the specified zipCode
   */
  public Iterable<DUser> queryByZipCode(java.lang.String zipCode) {
    return queryByField(null, DUserMapper.Field.ZIPCODE.getFieldName(), zipCode);
  }

  /**
   * query-page-by method for field zipCode
   * @param zipCode the specified attribute
   * @return a CursorPage of DUsers for the specified zipCode
   */
  public CursorPage<DUser> queryPageByZipCode(java.lang.String zipCode,
      int requestedPageSize, String cursorString) {
    return queryPageByField(null, DUserMapper.Field.ZIPCODE.getFieldName(), zipCode,
      requestedPageSize, cursorString);
  }


// ----------------------- DUser builder -------------------------------

  public static DUserMapper.Builder newBuilder() {
    return DUserMapper.newBuilder();
  }

}
