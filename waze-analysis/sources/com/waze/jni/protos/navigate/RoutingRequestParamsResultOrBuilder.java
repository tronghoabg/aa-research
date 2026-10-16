package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.navigate.DriveTo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RoutingRequestParamsResultOrBuilder extends fj {
    DriveTo.DangerZoneType getDestinationDangerZoneType();

    int getDestinationDangerZoneTypeValue();

    DriveTo.DangerZoneType getOriginDangerZoneType();

    int getOriginDangerZoneTypeValue();

    boolean getTempAvoidFerries();

    boolean getTempAvoidPrimaries();

    boolean getTempAvoidTollRoads();

    String getTempAvoidTrails();

    v getTempAvoidTrailsBytes();

    String getTempVehicleType();

    v getTempVehicleTypeBytes();

    boolean hasDestinationDangerZoneType();

    boolean hasOriginDangerZoneType();

    boolean hasTempAvoidFerries();

    boolean hasTempAvoidPrimaries();

    boolean hasTempAvoidTollRoads();

    boolean hasTempAvoidTrails();

    boolean hasTempVehicleType();
}
