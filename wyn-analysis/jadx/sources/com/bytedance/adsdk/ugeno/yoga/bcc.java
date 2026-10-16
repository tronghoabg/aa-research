package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum bcc {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int moa;

    bcc(int i5) {
        this.moa = i5;
    }

    public static bcc uef(int i5) {
        if (i5 == 0) {
            return UNDEFINED;
        }
        if (i5 == 1) {
            return EXACTLY;
        }
        if (i5 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i5)));
    }
}
