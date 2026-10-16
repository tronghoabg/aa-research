package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum fb implements com.google.v.eg {
    LANE_SIDE_UNDEFINED(0),
    WHOLE_SEGMENT(1),
    LEFT_LANE(2),
    MIDDLE_LANE(3),
    RIGHT_LANE(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f16705g;

    fb(int i2) {
        this.f16705g = i2;
    }

    public static fb a(int i2) {
        if (i2 == 0) {
            return LANE_SIDE_UNDEFINED;
        }
        if (i2 == 1) {
            return WHOLE_SEGMENT;
        }
        if (i2 == 2) {
            return LEFT_LANE;
        }
        if (i2 == 3) {
            return MIDDLE_LANE;
        }
        if (i2 != 4) {
            return null;
        }
        return RIGHT_LANE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16705g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16705g);
    }
}
