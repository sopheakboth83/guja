package com.wadpam.guja.oauth2.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.nio.ByteBuffer;

import javax.persistence.Basic;
import javax.persistence.Id;

import net.sf.mardao.core.ColumnField;
import net.sf.mardao.core.CreatedBy;
import net.sf.mardao.core.CreatedDate;
import net.sf.mardao.core.Parent;
import net.sf.mardao.core.UpdatedBy;
import net.sf.mardao.core.UpdatedDate;
import net.sf.mardao.dao.Mapper;
import net.sf.mardao.dao.Supplier;
import net.sf.mardao.domain.AbstractEntityBuilder;
import com.wadpam.guja.oauth2.domain.DConnection;

/**
 * The DConnection domain-object specific mapping methods go here.
 *
 * Generated on 2015-03-16T20:40:39.325+0100.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class DConnectionMapper
  implements Mapper<DConnection, Long> {

  private final Supplier supplier;

  public enum Field {
    ID("id"),
    ACCESSTOKEN("accessToken"),
    APPARG0("appArg0"),
    CREATEDBY("createdBy"),
    CREATEDDATE("createdDate"),
    DISPLAYNAME("displayName"),
    EXPIRETIME("expireTime"),
    IMAGEURL("imageUrl"),
    PROFILEURL("profileUrl"),
    PROVIDERID("providerId"),
    PROVIDERUSERID("providerUserId"),
    REFRESHTOKEN("refreshToken"),
    SECRET("secret"),
    UPDATEDBY("updatedBy"),
    UPDATEDDATE("updatedDate"),
    USERID("userId"),
    USERROLES("userRoles");

    private final String fieldName;

    Field(String fieldName) {
      this.fieldName = fieldName;
    }

    public String getFieldName() {
      return fieldName;
    }
  }

  private static final Map<String, ColumnField> BASIC_FIELDS = new TreeMap<String, ColumnField>();
  private static final Map<Class, ColumnField> SPECIAL_FIELDS = new HashMap<Class, ColumnField>();
  private static final Map<String, ColumnField> ALL_FIELDS = new TreeMap<String, ColumnField>();

  static {
    SPECIAL_FIELDS.put(Id.class,
        new ColumnField(Field.ID.getFieldName(), Long.class, Id.class));
    BASIC_FIELDS.put(Field.ACCESSTOKEN.getFieldName(),
        new ColumnField(Field.ACCESSTOKEN.getFieldName(), String.class, Basic.class));
    BASIC_FIELDS.put(Field.APPARG0.getFieldName(),
        new ColumnField(Field.APPARG0.getFieldName(), String.class, Basic.class));
    SPECIAL_FIELDS.put(CreatedBy.class,
        new ColumnField(Field.CREATEDBY.getFieldName(), String.class, CreatedBy.class));
    SPECIAL_FIELDS.put(CreatedDate.class,
        new ColumnField(Field.CREATEDDATE.getFieldName(), Date.class, CreatedDate.class));
    BASIC_FIELDS.put(Field.DISPLAYNAME.getFieldName(),
        new ColumnField(Field.DISPLAYNAME.getFieldName(), String.class, Basic.class));
    BASIC_FIELDS.put(Field.EXPIRETIME.getFieldName(),
        new ColumnField(Field.EXPIRETIME.getFieldName(), Date.class, Basic.class));
    BASIC_FIELDS.put(Field.IMAGEURL.getFieldName(),
        new ColumnField(Field.IMAGEURL.getFieldName(), String.class, Basic.class));
    BASIC_FIELDS.put(Field.PROFILEURL.getFieldName(),
        new ColumnField(Field.PROFILEURL.getFieldName(), String.class, Basic.class));
    BASIC_FIELDS.put(Field.PROVIDERID.getFieldName(),
        new ColumnField(Field.PROVIDERID.getFieldName(), String.class, Basic.class));
    BASIC_FIELDS.put(Field.PROVIDERUSERID.getFieldName(),
        new ColumnField(Field.PROVIDERUSERID.getFieldName(), String.class, Basic.class));
    BASIC_FIELDS.put(Field.REFRESHTOKEN.getFieldName(),
        new ColumnField(Field.REFRESHTOKEN.getFieldName(), String.class, Basic.class));
    BASIC_FIELDS.put(Field.SECRET.getFieldName(),
        new ColumnField(Field.SECRET.getFieldName(), String.class, Basic.class));
    SPECIAL_FIELDS.put(UpdatedBy.class,
        new ColumnField(Field.UPDATEDBY.getFieldName(), String.class, UpdatedBy.class));
    SPECIAL_FIELDS.put(UpdatedDate.class,
        new ColumnField(Field.UPDATEDDATE.getFieldName(), Date.class, UpdatedDate.class));
    BASIC_FIELDS.put(Field.USERID.getFieldName(),
        new ColumnField(Field.USERID.getFieldName(), Long.class, Basic.class));
    BASIC_FIELDS.put(Field.USERROLES.getFieldName(),
        new ColumnField(Field.USERROLES.getFieldName(), String.class, Basic.class));

    ALL_FIELDS.putAll(BASIC_FIELDS);
    for (ColumnField sf : SPECIAL_FIELDS.values()) {
        ALL_FIELDS.put(sf.getColumnName(), sf);
    }
  }

  @Override
  public Map<String, ColumnField> getBasicFields() {
    return BASIC_FIELDS;
  }

  @Override
  public Map<Class, ColumnField> getSpecialFields() {
    return SPECIAL_FIELDS;
  }

  public DConnectionMapper(Supplier supplier) {
    this.supplier = supplier;
  }

  @Override
  public Long fromKey(Object key) {
    return supplier.toLongKey(key);
  }

  @Override
  public DConnection fromReadValue(Object value) {
    return fromReadValue(value, supplier);
  }

  @Override
  public <RV> DConnection fromReadValue(RV value, Supplier<Object, RV, ?, ?> specificSupplier) {
    DConnection entity = (DConnection) specificSupplier.createEntity(this, value);
    if (null != entity) {
      return entity;
    }

    entity = new DConnection();

    // set primary key:
    final Object key = specificSupplier.getKey(value, Field.ID.getFieldName());
    entity.setId(specificSupplier.toLongKey(key));

    // set all fields:
    entity.setAccessToken(specificSupplier.getString(value, Field.ACCESSTOKEN.getFieldName()));
    entity.setAppArg0(specificSupplier.getString(value, Field.APPARG0.getFieldName()));
    entity.setCreatedBy(specificSupplier.getString(value, Field.CREATEDBY.getFieldName()));
    entity.setCreatedDate(specificSupplier.getDate(value, Field.CREATEDDATE.getFieldName()));
    entity.setDisplayName(specificSupplier.getString(value, Field.DISPLAYNAME.getFieldName()));
    entity.setExpireTime(specificSupplier.getDate(value, Field.EXPIRETIME.getFieldName()));
    entity.setImageUrl(specificSupplier.getString(value, Field.IMAGEURL.getFieldName()));
    entity.setProfileUrl(specificSupplier.getString(value, Field.PROFILEURL.getFieldName()));
    entity.setProviderId(specificSupplier.getString(value, Field.PROVIDERID.getFieldName()));
    entity.setProviderUserId(specificSupplier.getString(value, Field.PROVIDERUSERID.getFieldName()));
    entity.setRefreshToken(specificSupplier.getString(value, Field.REFRESHTOKEN.getFieldName()));
    entity.setSecret(specificSupplier.getString(value, Field.SECRET.getFieldName()));
    entity.setUpdatedBy(specificSupplier.getString(value, Field.UPDATEDBY.getFieldName()));
    entity.setUpdatedDate(specificSupplier.getDate(value, Field.UPDATEDDATE.getFieldName()));
    entity.setUserId(specificSupplier.getLong(value, Field.USERID.getFieldName()));
    entity.setUserRoles(specificSupplier.getString(value, Field.USERROLES.getFieldName()));
    return entity;
  }

    public Field getCreatedByField() {
    return Field.CREATEDBY;
    }

  @Override
  public String getCreatedByColumnName() {
    return Field.CREATEDBY.getFieldName();
  }

    public Field getCreatedDateField() {
    return Field.CREATEDDATE;
    }

  @Override
  public String getCreatedDateColumnName() {
    return Field.CREATEDDATE.getFieldName();
  }

  public Field getPrimaryKeyField() {
    return Field.ID;
  }

  @Override
  public String getPrimaryKeyColumnName() {
    return Field.ID.getFieldName();
  }

  @Override
  public String getParentKeyColumnName() {
    return null;
  }

  @Override
  public String getUpdatedByColumnName() {
    return Field.UPDATEDBY.getFieldName();
  }

  @Override
  public String getUpdatedDateColumnName() {
    return Field.UPDATEDDATE.getFieldName();
  }

  @Override
  public Long getId(DConnection entity) {
    return entity != null ? entity.getId() : null;
  }

  @Override
  public Object getParentKey(DConnection entity) {
    return null;
  }

  @Override
  public void setParentKey(DConnection entity, Object parentKey) {
    // this entity has no parent
  }

  @Override
  public void setPrimaryKey(Object writeValue, Object primaryKey) {
    supplier.setLong(writeValue, Field.ID.getFieldName(), supplier.toLongKey(primaryKey));
  }

  @Override
  public void updateEntityPostWrite(DConnection entity, Object key, Object value) {
    entity.setId(supplier.toLongKey(key));
    entity.setCreatedBy(supplier.getWriteString(value, Field.CREATEDBY.getFieldName()));
    entity.setCreatedDate(supplier.getWriteDate(value, Field.CREATEDDATE.getFieldName()));
    entity.setUpdatedBy(supplier.getWriteString(value, Field.UPDATEDBY.getFieldName()));
    entity.setUpdatedDate(supplier.getWriteDate(value, Field.UPDATEDDATE.getFieldName()));
}

@Override
  public String getKind() {
    return DConnection.class.getSimpleName();
  }

  @Override
  public Object toKey(Object parentKey, Long id) {
    return supplier.toKey(parentKey, getKind(), id);
  }

  @Override
  public Object toWriteValue(DConnection entity) {
    final Long id = getId(entity);
    final Object parentKey = getParentKey(entity);
    final Object value = supplier.createWriteValue(this, parentKey, id, entity);
    // some suppliers cannot set the keys in above method
    supplier.setPrimaryKey(value, this, Field.ID.getFieldName(), toKey(parentKey, id), entity);

    // set all fields:
    supplier.setString(value, Field.ACCESSTOKEN.getFieldName(), entity.getAccessToken());
    supplier.setString(value, Field.APPARG0.getFieldName(), entity.getAppArg0());
    supplier.setString(value, Field.CREATEDBY.getFieldName(), entity.getCreatedBy());
    supplier.setDate(value, Field.CREATEDDATE.getFieldName(), entity.getCreatedDate());
    supplier.setString(value, Field.DISPLAYNAME.getFieldName(), entity.getDisplayName());
    supplier.setDate(value, Field.EXPIRETIME.getFieldName(), entity.getExpireTime());
    supplier.setString(value, Field.IMAGEURL.getFieldName(), entity.getImageUrl());
    supplier.setString(value, Field.PROFILEURL.getFieldName(), entity.getProfileUrl());
    supplier.setString(value, Field.PROVIDERID.getFieldName(), entity.getProviderId());
    supplier.setString(value, Field.PROVIDERUSERID.getFieldName(), entity.getProviderUserId());
    supplier.setString(value, Field.REFRESHTOKEN.getFieldName(), entity.getRefreshToken());
    supplier.setString(value, Field.SECRET.getFieldName(), entity.getSecret());
    supplier.setString(value, Field.UPDATEDBY.getFieldName(), entity.getUpdatedBy());
    supplier.setDate(value, Field.UPDATEDDATE.getFieldName(), entity.getUpdatedDate());
    supplier.setLong(value, Field.USERID.getFieldName(), entity.getUserId());
    supplier.setString(value, Field.USERROLES.getFieldName(), entity.getUserRoles());
    return value;
  }

//  @Override
  public String getWriteSQL(Serializable id, Object writeValue, Collection arguments) {
    final StringBuilder sql = new StringBuilder("UPDATE ")
        .append(getKind())
        .append(" SET ");

    boolean first = true;
    for (Field f : Field.values()) {
        if (!getPrimaryKeyField().equals(f) &&
            !getCreatedByField().equals(f) &&
            !getCreatedDateField().equals(f)) {
           if (first) {
                first = false;
           }
           else {
                sql.append(", ");
           }
           sql.append(f.getFieldName())
            .append("=?");
           if (null != arguments && null != writeValue) {
            Object arg = supplier.getWriteObject(writeValue, f.getFieldName());
            arguments.add(arg);
           }
        }
    }

    sql.append(" WHERE ")
        .append(getPrimaryKeyColumnName())
        .append("=?");
    if (null != arguments) {
        arguments.add(id);
    }
    return sql.toString();
  }


  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder extends AbstractEntityBuilder<DConnection> {

    protected Builder() {
      super(new DConnection());
    }

    public Builder id(Long id) {
      entity.setId(id);
      return this;
    }

    public Builder accessToken(String accessToken) {
      entity.setAccessToken(accessToken);
      return this;
    }

    public Builder appArg0(String appArg0) {
      entity.setAppArg0(appArg0);
      return this;
    }

    public Builder createdBy(String createdBy) {
      entity.setCreatedBy(createdBy);
      return this;
    }

    public Builder createdDate(Date createdDate) {
      entity.setCreatedDate(createdDate);
      return this;
    }

    public Builder displayName(String displayName) {
      entity.setDisplayName(displayName);
      return this;
    }

    public Builder expireTime(Date expireTime) {
      entity.setExpireTime(expireTime);
      return this;
    }

    public Builder imageUrl(String imageUrl) {
      entity.setImageUrl(imageUrl);
      return this;
    }

    public Builder profileUrl(String profileUrl) {
      entity.setProfileUrl(profileUrl);
      return this;
    }

    public Builder providerId(String providerId) {
      entity.setProviderId(providerId);
      return this;
    }

    public Builder providerUserId(String providerUserId) {
      entity.setProviderUserId(providerUserId);
      return this;
    }

    public Builder refreshToken(String refreshToken) {
      entity.setRefreshToken(refreshToken);
      return this;
    }

    public Builder secret(String secret) {
      entity.setSecret(secret);
      return this;
    }

    public Builder updatedBy(String updatedBy) {
      entity.setUpdatedBy(updatedBy);
      return this;
    }

    public Builder updatedDate(Date updatedDate) {
      entity.setUpdatedDate(updatedDate);
      return this;
    }

    public Builder userId(Long userId) {
      entity.setUserId(userId);
      return this;
    }

    public Builder userRoles(String userRoles) {
      entity.setUserRoles(userRoles);
      return this;
    }

  }
}
