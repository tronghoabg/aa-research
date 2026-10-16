package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hc implements com.google.v.eg {
    UNKNOWN(0),
    TRAVEL_MOTOR_VEHICLE(1),
    TRAVEL_AUTO(17),
    TRAVEL_TWO_WHEELER(18),
    TRAVEL_BICYCLE(2),
    TRAVEL_PEDESTRIAN(3);


    /* renamed from: h, reason: collision with root package name */
    private final int f11441h;

    hc(int i2) {
        this.f11441h = i2;
    }

    public static hc a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return TRAVEL_MOTOR_VEHICLE;
        }
        if (i2 == 2) {
            return TRAVEL_BICYCLE;
        }
        if (i2 == 3) {
            return TRAVEL_PEDESTRIAN;
        }
        if (i2 == 17) {
            return TRAVEL_AUTO;
        }
        if (i2 != 18) {
            return null;
        }
        return TRAVEL_TWO_WHEELER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11441h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11441h);
    }
}
