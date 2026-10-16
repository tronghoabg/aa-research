package com.waze.jni.protos.navigate;

import com.google.v.ec;
import com.google.v.fj;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RouteWaypointOrBuilder extends fj {
    Position.IntPosition getCoordinate();

    ec getDistanceToWaypointMeters();

    int getId();

    ec getSecondsToWaypoint();

    boolean hasCoordinate();

    boolean hasDistanceToWaypointMeters();

    boolean hasSecondsToWaypoint();
}
