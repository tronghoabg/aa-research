package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.EventOnRoute;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface EventOnRouteOrBuilder extends fj {
    long getAlertId();

    EventOnRoute.AlertSubType getAlertSubType();

    int getAlertSubTypeValue();

    EventOnRoute.AlertType getAlertType();

    int getAlertTypeValue();

    int getDuration();

    PolylineGeometry getGeometry();

    boolean getIsMajorEvent();

    boolean getIsPartialLaneClosure();

    long getJamId();

    Position.IntPosition getLocation();

    @Deprecated
    Position.IntPosition getPosEnd();

    @Deprecated
    Position.IntPosition getPosStart();

    double getRatioOnRoadEnd();

    double getRatioOnRoadStart();

    int getRoadInfoSeverity();

    boolean hasAlertId();

    boolean hasDuration();

    boolean hasGeometry();

    boolean hasIsMajorEvent();

    boolean hasIsPartialLaneClosure();

    boolean hasJamId();

    boolean hasLocation();

    @Deprecated
    boolean hasPosEnd();

    @Deprecated
    boolean hasPosStart();

    boolean hasRatioOnRoadEnd();

    boolean hasRatioOnRoadStart();

    boolean hasRoadInfoSeverity();
}
