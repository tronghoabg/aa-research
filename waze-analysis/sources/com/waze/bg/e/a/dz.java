package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum dz implements com.google.v.eg {
    TRAFFIC_STATUS_UNSPECIFIED(0),
    HEAVIER_TRAFFIC_THAN_USUAL(1),
    HEAVIER_TRAFFIC_ON_BEST_ROUTE(2),
    LIGHTER_TRAFFIC_THAN_USUAL(3),
    USUAL_TRAFFIC(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f16682g;

    dz(int i2) {
        this.f16682g = i2;
    }

    public static dz a(int i2) {
        if (i2 == 0) {
            return TRAFFIC_STATUS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return HEAVIER_TRAFFIC_THAN_USUAL;
        }
        if (i2 == 2) {
            return HEAVIER_TRAFFIC_ON_BEST_ROUTE;
        }
        if (i2 == 3) {
            return LIGHTER_TRAFFIC_THAN_USUAL;
        }
        if (i2 != 4) {
            return null;
        }
        return USUAL_TRAFFIC;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16682g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16682g);
    }
}
