package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.map.EventsOnRoute;
import i.b.l.rf;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface EventsOnRouteOrBuilder extends fj {
    rf getEvent(int i2);

    int getEventCount();

    List<rf> getEventList();

    EventsOnRoute.EventOnRouteAnimationParams getEventOnRouteAnimationParams();

    boolean getIsSelected();

    boolean hasEventOnRouteAnimationParams();
}
