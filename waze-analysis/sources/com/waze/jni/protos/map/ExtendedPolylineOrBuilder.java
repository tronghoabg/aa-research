package com.waze.jni.protos.map;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.map.ExtendedPolyline;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface ExtendedPolylineOrBuilder extends fj {
    AnimationParams getAnimationParams();

    ExtendedPolyline.CutTrailingBehavior getCutTrailingBehavior();

    int getCutTrailingBehaviorValue();

    Polyline getPolyline();

    ExtendedPolyline.Style getStyle();

    int getStyleValue();

    String getTag();

    v getTagBytes();

    ZoomLevelDisplayRange getZoomLevelDisplayRange();

    boolean hasAnimationParams();

    boolean hasPolyline();

    boolean hasTag();

    boolean hasZoomLevelDisplayRange();
}
