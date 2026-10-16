package com.waze.jni.protos.map;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.map.ExtendedPolygon;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface ExtendedPolygonOrBuilder extends fj {
    String getLabel();

    v getLabelBytes();

    Polygon getPolygon();

    ExtendedPolygon.Style getStyle();

    int getStyleValue();

    boolean hasLabel();

    boolean hasPolygon();
}
