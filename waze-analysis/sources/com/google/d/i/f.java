package com.google.d.i;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum f implements eg {
    UNSPECIFIED(0),
    EXTRA_SMALL(1),
    SMALL(2),
    MEDIUM(3),
    LARGE(4),
    EXTRA_LARGE(5),
    EXTRA_EXTRA_LARGE(6),
    EXTRA_EXTRA_EXTRA_LARGE(7),
    ACCESSIBILITY_MEDIUM(8),
    ACCESSIBILITY_LARGE(9),
    ACCESSIBILITY_EXTRA_LARGE(10),
    ACCESSIBILITY_EXTRA_EXTRA_LARGE(11),
    ACCESSIBILITY_EXTRA_EXTRA_EXTRA_LARGE(12);

    private final int o;

    f(int i2) {
        this.o = i2;
    }

    public static f a(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return EXTRA_SMALL;
            case 2:
                return SMALL;
            case 3:
                return MEDIUM;
            case 4:
                return LARGE;
            case 5:
                return EXTRA_LARGE;
            case 6:
                return EXTRA_EXTRA_LARGE;
            case 7:
                return EXTRA_EXTRA_EXTRA_LARGE;
            case 8:
                return ACCESSIBILITY_MEDIUM;
            case 9:
                return ACCESSIBILITY_LARGE;
            case 10:
                return ACCESSIBILITY_EXTRA_LARGE;
            case 11:
                return ACCESSIBILITY_EXTRA_EXTRA_LARGE;
            case 12:
                return ACCESSIBILITY_EXTRA_EXTRA_EXTRA_LARGE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
