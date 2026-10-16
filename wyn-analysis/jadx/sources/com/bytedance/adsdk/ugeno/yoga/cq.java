package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum cq {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int moa;

    cq(int i5) {
        this.moa = i5;
    }

    public int uef() {
        return this.moa;
    }

    public static cq uef(int i5) {
        if (i5 == 0) {
            return STATIC;
        }
        if (i5 == 1) {
            return RELATIVE;
        }
        if (i5 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i5)));
    }

    public static cq uef(String str) {
        str.getClass();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
