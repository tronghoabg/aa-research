package com.waze.jni.protos.map;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.Marker;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MarkerOrBuilder extends fj {
    Marker.Alignment getAlignment();

    int getAlignmentValue();

    ScreenPoint getAnchorOffset();

    Marker.HitBoxInset getHitBoxInset();

    String getId();

    v getIdBytes();

    NativeBitmap getImage();

    Marker.MarkerHideAnimationParams getMarkerHideAnimationParams();

    Marker.MarkerShowAnimationParams getMarkerShowAnimationParams();

    Position.IntPosition getPosition();

    Marker.Priority getPriority();

    int getPriorityValue();

    float getScale();

    ZoomLevelDisplayRange getZoomLevelDisplayRange();

    boolean hasAnchorOffset();

    boolean hasHitBoxInset();

    boolean hasImage();

    boolean hasMarkerHideAnimationParams();

    boolean hasMarkerShowAnimationParams();

    boolean hasPosition();

    boolean hasScale();

    boolean hasZoomLevelDisplayRange();
}
