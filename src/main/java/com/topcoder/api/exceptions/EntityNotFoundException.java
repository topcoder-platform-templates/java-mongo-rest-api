/*
 * Copyright (C) 2019 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.api.exceptions;

/**
 * This exception indicates that the entity is not found.
 *
 * @author TCSCODER
 * @version 1.0
 */
public class EntityNotFoundException extends ApplicationBaseException {
  /**
   * The serial version UID
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constructor with message parameter.
   *
   * @param message the message
   */
  public EntityNotFoundException(String message) {
    super(message);
  }

  /**
   * Constructor with message and cause parameters.
   *
   * @param message the message
   * @param cause   the cause
   */
  public EntityNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
