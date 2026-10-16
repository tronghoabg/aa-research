package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum fc implements com.google.v.eg {
    NAVIGATE_LANE_TYPE_UNDEFINED(0),
    HOV(1),
    HOT(2),
    EXPRESS(3),
    BUS(4),
    FAST(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f16713h;

    fc(int i2) {
        this.f16713h = i2;
    }

    public static fc a(int i2) {
        if (i2 == 0) {
            return NAVIGATE_LANE_TYPE_UNDEFINED;
        }
        if (i2 == 1) {
            return HOV;
        }
        if (i2 == 2) {
            return HOT;
        }
        if (i2 == 3) {
            return EXPRESS;
        }
        if (i2 == 4) {
            return BUS;
        }
        if (i2 != 5) {
            return null;
        }
        return FAST;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16713h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16713h);
    }
}
