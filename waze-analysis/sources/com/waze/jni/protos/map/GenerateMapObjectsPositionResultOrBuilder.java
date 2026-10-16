package com.waze.jni.protos.map;

import com.google.v.fj;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface GenerateMapObjectsPositionResultOrBuilder extends fj {
    boolean containsResult(long j2);

    int getResultCount();

    Map<Long, RouteEtaLabelPositionAndAlignment> getResultMap();

    RouteEtaLabelPositionAndAlignment getResultOrDefault(long j2, RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment);

    RouteEtaLabelPositionAndAlignment getResultOrThrow(long j2);
}
