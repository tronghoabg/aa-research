package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum by implements com.google.v.eg {
    TRAFFIC_UNSPECIFIED(0),
    TRAFFIC_DEFAULT(1),
    TRAFFIC_STANDSTILL(2),
    TRAFFIC_LIGHT(3),
    TRAFFIC_MODERATE(4),
    TRAFFIC_HEAVY(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f16479h;

    by(int i2) {
        this.f16479h = i2;
    }

    public static com.google.v.ei a() {
        return o.s;
    }

    public static by b(int i2) {
        if (i2 == 0) {
            return TRAFFIC_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TRAFFIC_DEFAULT;
        }
        if (i2 == 2) {
            return TRAFFIC_STANDSTILL;
        }
        if (i2 == 3) {
            return TRAFFIC_LIGHT;
        }
        if (i2 == 4) {
            return TRAFFIC_MODERATE;
        }
        if (i2 != 5) {
            return null;
        }
        return TRAFFIC_HEAVY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16479h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16479h);
    }
}
