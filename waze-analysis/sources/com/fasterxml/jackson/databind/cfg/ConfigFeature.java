package com.fasterxml.jackson.databind.cfg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ConfigFeature {
    boolean enabledByDefault();

    boolean enabledIn(int i2);

    int getMask();
}
