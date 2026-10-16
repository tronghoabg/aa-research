package com.waze.jni.protos;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface RouteSegmentOrBuilder extends fj {
    NavigationInstruction getInstruction();

    int getLengthMeters();

    boolean hasInstruction();

    boolean hasLengthMeters();
}
