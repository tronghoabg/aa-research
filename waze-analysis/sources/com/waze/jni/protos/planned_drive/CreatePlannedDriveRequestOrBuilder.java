package com.waze.jni.protos.planned_drive;

import com.google.v.fj;
import com.waze.jni.protos.VenueData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface CreatePlannedDriveRequestOrBuilder extends fj {
    VenueData getDestination();

    VenueData getOrigin();

    long getStartTimeSec();

    boolean hasDestination();

    boolean hasOrigin();
}
