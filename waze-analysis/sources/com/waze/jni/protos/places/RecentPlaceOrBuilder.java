package com.waze.jni.protos.places;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RecentPlaceOrBuilder extends fj {
    long getAccessTimeSec();

    int getId();

    String getImageId();

    v getImageIdBytes();

    String getName();

    v getNameBytes();

    boolean getShouldConfirmLocationUpdate();

    RecentPlaceType getType();

    int getTypeValue();

    long getWaypointAccessTimeSec();
}
