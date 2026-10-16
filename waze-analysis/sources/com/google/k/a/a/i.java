package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum i implements com.google.v.eg {
    UNKNOWN(0),
    HD_L4(1),
    HD_L2(2),
    ADAS(3),
    AUTO_DRIVING_EXPERIENCE(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11978g;

    i(int i2) {
        this.f11978g = i2;
    }

    public static i a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return HD_L4;
        }
        if (i2 == 2) {
            return HD_L2;
        }
        if (i2 == 3) {
            return ADAS;
        }
        if (i2 != 4) {
            return null;
        }
        return AUTO_DRIVING_EXPERIENCE;
    }

    public static com.google.v.ei b() {
        return h.f11872a;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11978g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11978g);
    }
}
