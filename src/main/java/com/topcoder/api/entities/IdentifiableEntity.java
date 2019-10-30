/**
 * Copyright (c) 2019 TopCoder, Inc. All rights reserved.
 */
package com.topcoder.api.entities;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The base class for all entities with UUID primary key.
 * 
 * @author TCSCODER
 * @version 1.0
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IdentifiableEntity {
  /**
   * The entity id.
   */
  @Id
  private String id;
}
