package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hu implements com.google.v.eg {
    BICYCLE_SAFETY_RECOMMENDED(1),
    BICYCLE_SAFETY_OFFICIALLY_RECOMMENDED(17),
    BICYCLE_SAFETY_NEUTRAL(2),
    BICYCLE_SAFETY_CAUTION(3),
    BICYCLE_SAFETY_OFFICIALLY_CAUTION(49);


    /* renamed from: g, reason: collision with root package name */
    private final int f11503g;

    hu(int i2) {
        this.f11503g = i2;
    }

    public static hu a(int i2) {
        if (i2 == 1) {
            return BICYCLE_SAFETY_RECOMMENDED;
        }
        if (i2 == 2) {
            return BICYCLE_SAFETY_NEUTRAL;
        }
        if (i2 == 3) {
            return BICYCLE_SAFETY_CAUTION;
        }
        if (i2 == 17) {
            return BICYCLE_SAFETY_OFFICIALLY_RECOMMENDED;
        }
        if (i2 != 49) {
            return null;
        }
        return BICYCLE_SAFETY_OFFICIALLY_CAUTION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11503g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11503g);
    }
}
