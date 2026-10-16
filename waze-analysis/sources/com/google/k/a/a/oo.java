package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum oo implements com.google.v.eg {
    UNIT_UNKNOWN(0),
    METRIC_TON(1),
    LONG_TON(2),
    SHORT_TON(3),
    POUND(4),
    KILOGRAM(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f12200h;

    oo(int i2) {
        this.f12200h = i2;
    }

    public static oo a(int i2) {
        if (i2 == 0) {
            return UNIT_UNKNOWN;
        }
        if (i2 == 1) {
            return METRIC_TON;
        }
        if (i2 == 2) {
            return LONG_TON;
        }
        if (i2 == 3) {
            return SHORT_TON;
        }
        if (i2 == 4) {
            return POUND;
        }
        if (i2 != 5) {
            return null;
        }
        return KILOGRAM;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12200h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12200h);
    }
}
