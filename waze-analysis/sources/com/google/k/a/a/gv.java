package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gv implements com.google.v.eg {
    SERVICE_ALL(0),
    SERVICE_GENERAL_DRIVER(1),
    SERVICE_RIDESHARE(2),
    SERVICE_TAXI(3),
    SERVICE_COMMERCIAL(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11863g;

    gv(int i2) {
        this.f11863g = i2;
    }

    public static gv a(int i2) {
        if (i2 == 0) {
            return SERVICE_ALL;
        }
        if (i2 == 1) {
            return SERVICE_GENERAL_DRIVER;
        }
        if (i2 == 2) {
            return SERVICE_RIDESHARE;
        }
        if (i2 == 3) {
            return SERVICE_TAXI;
        }
        if (i2 != 4) {
            return null;
        }
        return SERVICE_COMMERCIAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11863g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11863g);
    }
}
