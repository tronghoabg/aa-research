package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bo implements com.google.v.eg {
    BLOCKED_LANE_UNSPECIFIED(0),
    BLOCKED_LANE_DEFAULT(1),
    BLOCKED_LANE_LEFT(2),
    BLOCKED_LANE_CENTER(3),
    BLOCKED_LANE_RIGHT(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f16411g;

    bo(int i2) {
        this.f16411g = i2;
    }

    public static com.google.v.ei a() {
        return o.f16563i;
    }

    public static bo b(int i2) {
        if (i2 == 0) {
            return BLOCKED_LANE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return BLOCKED_LANE_DEFAULT;
        }
        if (i2 == 2) {
            return BLOCKED_LANE_LEFT;
        }
        if (i2 == 3) {
            return BLOCKED_LANE_CENTER;
        }
        if (i2 != 4) {
            return null;
        }
        return BLOCKED_LANE_RIGHT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16411g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16411g);
    }
}
