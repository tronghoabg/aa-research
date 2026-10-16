package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RoutingRequestParamsOrBuilder extends fj {
    Position.IntPosition getDestination();

    Position.IntPosition getOrigin();

    boolean hasDestination();

    boolean hasOrigin();
}
