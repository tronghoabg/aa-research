package com.waze.jni.protos.places;

import com.google.v.ec;
import com.google.v.fj;
import com.google.v.o;
import com.google.v.v;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface PlaceOrBuilder extends fj {
    Address getAddress();

    long getCreatedTimeSec();

    ec getDbId();

    String getInternalId();

    v getInternalIdBytes();

    o getIsResidential();

    String getName();

    v getNameBytes();

    Position.IntPosition getPosition();

    String getRoutingContext();

    v getRoutingContextBytes();

    long getUpdatedTimeSec();

    String getVenueContext();

    v getVenueContextBytes();

    String getVenueId();

    v getVenueIdBytes();

    boolean hasAddress();

    boolean hasDbId();

    boolean hasIsResidential();

    boolean hasPosition();
}
