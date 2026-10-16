package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum d implements com.google.v.eg {
    TRAVEL_MODE_MOTOR_VEHICLE(1),
    TRAVEL_MODE_AUTO(17),
    TRAVEL_MODE_TWO_WHEELER(18),
    TRAVEL_MODE_BICYCLE(2),
    TRAVEL_MODE_PEDESTRIAN(3),
    TRAVEL_MODE_PUBLIC_TRANSIT(4);


    /* renamed from: h, reason: collision with root package name */
    private final int f11234h;

    d(int i2) {
        this.f11234h = i2;
    }

    public static d a(int i2) {
        if (i2 == 1) {
            return TRAVEL_MODE_MOTOR_VEHICLE;
        }
        if (i2 == 2) {
            return TRAVEL_MODE_BICYCLE;
        }
        if (i2 == 3) {
            return TRAVEL_MODE_PEDESTRIAN;
        }
        if (i2 == 4) {
            return TRAVEL_MODE_PUBLIC_TRANSIT;
        }
        if (i2 == 17) {
            return TRAVEL_MODE_AUTO;
        }
        if (i2 != 18) {
            return null;
        }
        return TRAVEL_MODE_TWO_WHEELER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11234h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11234h);
    }
}
