package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum cb implements com.google.v.eg {
    CAMERA_TYPE_UNSPECIFIED(0),
    SPEED_CAMERA(1),
    RED_LIGHT_CAMERA(2),
    DUMMY_CAMERA(3),
    SEATBELT_CAMERA(4),
    MOBILE_PHONE_CAMERA(5),
    STOP_CAMERA(6),
    NOISE_CAMERA(7),
    DISTANCE_CAMERA(8),
    CARPOOL_LANE_CAMERA(9),
    BUS_LANE_CAMERA(10),
    HOV_LANE_CAMERA(11);

    private final int n;

    cb(int i2) {
        this.n = i2;
    }

    public static cb a(int i2) {
        switch (i2) {
            case 0:
                return CAMERA_TYPE_UNSPECIFIED;
            case 1:
                return SPEED_CAMERA;
            case 2:
                return RED_LIGHT_CAMERA;
            case 3:
                return DUMMY_CAMERA;
            case 4:
                return SEATBELT_CAMERA;
            case 5:
                return MOBILE_PHONE_CAMERA;
            case 6:
                return STOP_CAMERA;
            case 7:
                return NOISE_CAMERA;
            case 8:
                return DISTANCE_CAMERA;
            case 9:
                return CARPOOL_LANE_CAMERA;
            case 10:
                return BUS_LANE_CAMERA;
            case 11:
                return HOV_LANE_CAMERA;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
