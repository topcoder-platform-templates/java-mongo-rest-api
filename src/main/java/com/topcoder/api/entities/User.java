/**
 * Copyright (c) 2019 TopCoder, Inc. All rights reserved.
 */
package com.topcoder.api.entities;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The user entity, it is mapped to "users" document in MongoDB
 * It extends IdentifiableEntity and additionally defines the 'handle' field and provides a getter and a setter for it.
 * 
 * @author TCSCODER
 * @version 1.0
 */
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Document("users")
public class User extends IdentifiableEntity {
  /**
   * The user handle.
   */
  @NotNull
  private String handle;
}