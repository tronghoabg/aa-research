package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ia implements com.google.v.eg {
    PEDESTRIAN_FACILITY_UNKNOWN(1),
    PEDESTRIAN_FACILITY_NONE(2),
    PEDESTRIAN_FACILITY_PRESENT(3),
    PEDESTRIAN_FACILITY_SIDEWALK(49),
    PEDESTRIAN_FACILITY_WIDE_SHOULDER(50);


    /* renamed from: g, reason: collision with root package name */
    private final int f11544g;

    ia(int i2) {
        this.f11544g = i2;
    }

    public static ia a(int i2) {
        if (i2 == 1) {
            return PEDESTRIAN_FACILITY_UNKNOWN;
        }
        if (i2 == 2) {
            return PEDESTRIAN_FACILITY_NONE;
        }
        if (i2 == 3) {
            return PEDESTRIAN_FACILITY_PRESENT;
        }
        if (i2 == 49) {
            return PEDESTRIAN_FACILITY_SIDEWALK;
        }
        if (i2 != 50) {
            return null;
        }
        return PEDESTRIAN_FACILITY_WIDE_SHOULDER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11544g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11544g);
    }
}
