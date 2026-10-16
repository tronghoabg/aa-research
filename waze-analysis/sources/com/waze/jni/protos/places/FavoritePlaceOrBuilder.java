package com.waze.jni.protos.places;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface FavoritePlaceOrBuilder extends fj {
    long getAccessTimeSec();

    int getId();

    int getModifiedTime();

    String getName();

    v getNameBytes();

    int getRank();

    long getServerId();

    FavoritePlaceType getType();

    int getTypeValue();

    long getWaypointAccessTimeSec();
}
