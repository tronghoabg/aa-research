package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.map.ExtendedRouteData;
import i.b.l.sl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface ExtendedRouteDataOrBuilder extends fj {
    AnimationParams getAnimationParams();

    RouteOption getOptions();

    sl getRouteProto();

    ExtendedRouteData.RouteStyle getStyle();

    boolean hasAnimationParams();

    boolean hasOptions();

    boolean hasRouteProto();

    boolean hasStyle();
}
