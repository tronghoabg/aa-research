package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.RouteSegment;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface OfflineNavigationRouteProtoOrBuilder extends fj {
    boolean getIsReroute();

    String getRouteUUID();

    v getRouteUUIDBytes();

    RouteSegment getSegments(int i2);

    int getSegmentsCount();

    List<RouteSegment> getSegmentsList();
}
