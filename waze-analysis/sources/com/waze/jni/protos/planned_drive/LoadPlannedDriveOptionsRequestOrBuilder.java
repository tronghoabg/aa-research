package com.waze.jni.protos.planned_drive;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface LoadPlannedDriveOptionsRequestOrBuilder extends fj {
    int getDaysFromNow();

    VenueData getDestination();

    Position.IntPosition getOrigin();

    boolean hasDestination();

    boolean hasOrigin();
}
