package com.wadpam.guja;

import com.google.common.collect.ImmutableMap;
import com.wadpam.guja.api.SemanticVersionCheckPredicate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SemanticVersionCheckPredicateTest {

  private SemanticVersionCheckPredicate predicate;

  @Before
  public void setUp() throws Exception {

    predicate = new SemanticVersionCheckPredicate(ImmutableMap.<String, String>builder()
        .put("ios", "1.0.0")
        .put("android", ">=1.5")
        .build());

  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testIsVersionSupported() throws Exception {

    assertTrue(predicate.isVersionSupported("ios", "1.0.0"));
    assertFalse(predicate.isVersionSupported("ios", "0.9.0"));
    assertFalse(predicate.isVersionSupported("ios", "1.0.3"));

    assertTrue(predicate.isVersionSupported("android", "1.5.1"));
    assertFalse(predicate.isVersionSupported("android", "1.4.0"));

  }

}