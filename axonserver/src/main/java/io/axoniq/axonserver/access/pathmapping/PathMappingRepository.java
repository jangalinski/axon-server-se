/*
 * Copyright (c) 2017-2019 AxonIQ B.V. and/or licensed to AxonIQ B.V.
 * under one or more contributor license agreements.
 *
 *  Licensed under the AxonIQ Open Source License Agreement v1.0;
 *  you may not use this file except in compliance with the license.
 *
 */

package io.axoniq.axonserver.access.pathmapping;

import io.axoniq.axonserver.access.jpa.PathMapping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JpaRepostory to access {@link PathMapping} entities.
 *
 * @author Marc Gathier
 */
public interface PathMappingRepository extends JpaRepository<PathMapping, String> {
}
