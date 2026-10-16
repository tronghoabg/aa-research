package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum dz {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int moa;

    dz(int i5) {
        this.moa = i5;
    }

    public int uef() {
        return this.moa;
    }

    public static dz uef(int i5) {
        if (i5 == 0) {
            return NO_WRAP;
        }
        if (i5 == 1) {
            return WRAP;
        }
        if (i5 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i5)));
    }

    public static dz uef(String str) {
        str.getClass();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
