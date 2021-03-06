/*
 * Copyright (c) 2017-2019 AxonIQ B.V. and/or licensed to AxonIQ B.V.
 * under one or more contributor license agreements.
 *
 *  Licensed under the AxonIQ Open Source License Agreement v1.0;
 *  you may not use this file except in compliance with the license.
 *
 */

package io.axoniq.axonserver.component.processor.warning;

import io.axoniq.axonserver.grpc.control.EventProcessorInfo;
import org.junit.*;

import java.util.List;

import static io.axoniq.axonserver.grpc.control.EventProcessorInfo.EventTrackerInfo.newBuilder;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * Created by Sara Pellegrini on 23/03/2018.
 * sara.pellegrini@gmail.com
 */
public class DuplicatedTrackersTest {

    @Test
    public void testActive() {
        List<EventProcessorInfo.EventTrackerInfo> eventTrackerInfoList = asList(newBuilder().setSegmentId(1).build(),
                                                                                newBuilder().setSegmentId(1).build());
        Warning warning = new DuplicatedTrackers(eventTrackerInfoList);
        assertTrue(warning.active());
    }


    @Test
    public void testNotActive() {
        List<EventProcessorInfo.EventTrackerInfo> eventTrackerInfoList = asList(newBuilder().setSegmentId(2).build(),
                                                                                newBuilder().setSegmentId(3).build());
        Warning warning = new DuplicatedTrackers(eventTrackerInfoList);
        assertFalse(warning.active());
    }
}