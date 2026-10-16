package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bt implements com.google.v.eg {
    HAZARD_UNSPECIFIED(0),
    HAZARD_DEFAULT(1),
    HAZARD_CONSTRUCTION(2),
    HAZARD_VEHICLE_STOPPED(3),
    HAZARD_OBJECT_ON_ROAD(4),
    HAZARD_POTHOLE(5),
    HAZARD_BROKEN_TRAFFIC_LIGHT(6),
    HAZARD_OIL(7),
    HAZARD_ANIMALS(8),
    HAZARD_MISSING_SIGN(9),
    HAZARD_ROAD_KILL(10),
    HAZARD_SHOULDER(11),
    HAZARD_SHOULDER_VEHICLE_STOPPED(12),
    HAZARD_EMERGENCY_VEHICLE(13);

    private final int p;

    bt(int i2) {
        this.p = i2;
    }

    public static com.google.v.ei a() {
        return o.n;
    }

    public static bt b(int i2) {
        switch (i2) {
            case 0:
                return HAZARD_UNSPECIFIED;
            case 1:
                return HAZARD_DEFAULT;
            case 2:
                return HAZARD_CONSTRUCTION;
            case 3:
                return HAZARD_VEHICLE_STOPPED;
            case 4:
                return HAZARD_OBJECT_ON_ROAD;
            case 5:
                return HAZARD_POTHOLE;
            case 6:
                return HAZARD_BROKEN_TRAFFIC_LIGHT;
            case 7:
                return HAZARD_OIL;
            case 8:
                return HAZARD_ANIMALS;
            case 9:
                return HAZARD_MISSING_SIGN;
            case 10:
                return HAZARD_ROAD_KILL;
            case 11:
                return HAZARD_SHOULDER;
            case 12:
                return HAZARD_SHOULDER_VEHICLE_STOPPED;
            case 13:
                return HAZARD_EMERGENCY_VEHICLE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
