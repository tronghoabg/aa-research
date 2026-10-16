package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.map.AnimationParams;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface AnimationParamsOrBuilder extends fj {
    long getAnimationDurationMs();

    long getAnimationStartTimeMs();

    AnimationParams.CurveType getCurveType();

    int getCurveTypeValue();
}
