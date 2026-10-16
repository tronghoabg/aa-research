package com.fasterxml.jackson.core.util;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class InternalJacksonUtil {
    public static int addOverflowSafe(int i2, int i3) {
        int i4 = i2 + i3;
        if (i4 < 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }
}
