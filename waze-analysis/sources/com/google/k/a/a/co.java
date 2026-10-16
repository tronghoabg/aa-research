package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum co implements com.google.v.eg {
    UNIT_UNKNOWN(0),
    METERS(1),
    FEET(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11757e;

    co(int i2) {
        this.f11757e = i2;
    }

    public static co a(int i2) {
        if (i2 == 0) {
            return UNIT_UNKNOWN;
        }
        if (i2 == 1) {
            return METERS;
        }
        if (i2 != 2) {
            return null;
        }
        return FEET;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11757e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11757e);
    }
}
