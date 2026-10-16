package com.waze.jni.protos.main_canvas;

import com.google.v.fj;
import com.waze.jni.protos.Position;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface CenterOnPositionRequestOrBuilder extends fj {
    boolean getAnimated();

    float getOrientationDegrees();

    Position.IntPosition getPosition();

    float getZoom();

    boolean hasOrientationDegrees();

    boolean hasPosition();
}
