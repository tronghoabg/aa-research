package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum ij implements com.google.v.eg {
    SEVERITY_UNSPECIFIED(0),
    LIGHT(1),
    MODERATE(2),
    HEAVY(3),
    STAND_STILL(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f16729g;

    ij(int i2) {
        this.f16729g = i2;
    }

    public static ij a(int i2) {
        if (i2 == 0) {
            return SEVERITY_UNSPECIFIED;
        }
        if (i2 == 1) {
            return LIGHT;
        }
        if (i2 == 2) {
            return MODERATE;
        }
        if (i2 == 3) {
            return HEAVY;
        }
        if (i2 != 4) {
            return null;
        }
        return STAND_STILL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16729g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16729g);
    }
}
