package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum og implements com.google.v.eg {
    UNKNOWN(0),
    ANY(1),
    CAR(2),
    MOTORCYCLE(3),
    TRUCK(4),
    BUS(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f12191h;

    og(int i2) {
        this.f12191h = i2;
    }

    public static og a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return ANY;
        }
        if (i2 == 2) {
            return CAR;
        }
        if (i2 == 3) {
            return MOTORCYCLE;
        }
        if (i2 == 4) {
            return TRUCK;
        }
        if (i2 != 5) {
            return null;
        }
        return BUS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12191h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12191h);
    }
}
