package com.waze.jni.protos.canvas;

import com.google.v.fj;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.RelativeViewPort;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface BoundsAndViewportOrBuilder extends fj {
    RelativeViewPort getViewport();

    Position.IntPosition getViewportCornersPolygon(int i2);

    int getViewportCornersPolygonCount();

    List<Position.IntPosition> getViewportCornersPolygonList();

    boolean hasViewport();
}
