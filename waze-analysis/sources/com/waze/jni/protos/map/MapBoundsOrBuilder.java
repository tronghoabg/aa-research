package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.map.MapBounds;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MapBoundsOrBuilder extends fj {
    boolean getAnimated();

    MapBounds.ContinuouslyTrackUserLocation getContinuouslyTrackUserLocation();

    MapBounds.MapFitArea getFitArea();

    MapBounds.MapFitContent getFitContent();

    MapBounds.MapFitCoordinate getFitCoordinate();

    MapBounds.MapBoundsFitCase getMapBoundsFitCase();

    NorthLockBehavior getNorthLock();

    int getNorthLockValue();

    RelativeViewPort getViewPort();

    boolean hasContinuouslyTrackUserLocation();

    boolean hasFitArea();

    boolean hasFitContent();

    boolean hasFitCoordinate();

    boolean hasNorthLock();

    boolean hasViewPort();
}
