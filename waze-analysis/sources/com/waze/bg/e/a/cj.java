package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum cj implements com.google.v.eg {
    VEHICLE_TYPE_UNSPECIFIED(0),
    UNKNOWN(1),
    PRIVATE(2),
    TAXI(3),
    MOTORCYCLE(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f16650g;

    cj(int i2) {
        this.f16650g = i2;
    }

    public static cj a(int i2) {
        if (i2 == 0) {
            return VEHICLE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return UNKNOWN;
        }
        if (i2 == 2) {
            return PRIVATE;
        }
        if (i2 == 3) {
            return TAXI;
        }
        if (i2 != 4) {
            return null;
        }
        return MOTORCYCLE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16650g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16650g);
    }
}
