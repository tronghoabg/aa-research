package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hk implements com.google.v.eg {
    ENCLOSURE_TYPE_UNSPECIFIED(0),
    BUILDING(1),
    TUBE(2),
    HIGHWAY_CAP(3),
    OVERHEAD_ROAD(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11460g;

    hk(int i2) {
        this.f11460g = i2;
    }

    public static hk a(int i2) {
        if (i2 == 0) {
            return ENCLOSURE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return BUILDING;
        }
        if (i2 == 2) {
            return TUBE;
        }
        if (i2 == 3) {
            return HIGHWAY_CAP;
        }
        if (i2 != 4) {
            return null;
        }
        return OVERHEAD_ROAD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11460g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11460g);
    }
}
