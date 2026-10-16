package com.fasterxml.jackson.core.util;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface JacksonFeature {
    boolean enabledByDefault();

    boolean enabledIn(int i2);

    int getMask();
}
