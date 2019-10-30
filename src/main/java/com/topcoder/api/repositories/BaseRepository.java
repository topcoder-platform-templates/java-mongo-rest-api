/**
 * Copyright (c) 2019 TopCoder, Inc. All rights reserved.
 */
package com.topcoder.api.repositories;

import com.topcoder.api.entities.IdentifiableEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * The base repository for all repositories in the application.
 * 
 * @param <T> the entity type
 * 
 * @author TCSCODER
 * @version 1.0
 */
@NoRepositoryBean
public interface BaseRepository<T extends IdentifiableEntity> extends MongoRepository<T, String> {
}
