package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum nk implements com.google.v.eg {
    TRAVEL_MODE_UNSPECIFIED(0),
    TRAVEL_MODE_MOTOR_VEHICLE(1),
    TRAVEL_MODE_BICYCLE(2),
    TRAVEL_MODE_PEDESTRIAN(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f12133g;

    nk(int i2) {
        this.f12133g = i2;
    }

    public static nk a(int i2) {
        if (i2 == 0) {
            return TRAVEL_MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TRAVEL_MODE_MOTOR_VEHICLE;
        }
        if (i2 == 2) {
            return TRAVEL_MODE_BICYCLE;
        }
        if (i2 != 3) {
            return null;
        }
        return TRAVEL_MODE_PEDESTRIAN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f12133g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12133g);
    }
}
