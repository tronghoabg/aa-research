package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ic implements com.google.v.eg {
    PRIORITY_UNKNOWN(0),
    PRIORITY_NON_TRAFFIC(16),
    PRIORITY_TERMINAL(32),
    PRIORITY_LOCAL(48),
    PRIORITY_MINOR_ARTERIAL(64),
    PRIORITY_MAJOR_ARTERIAL(80),
    PRIORITY_SECONDARY_ROAD(96),
    PRIORITY_PRIMARY_HIGHWAY(112),
    PRIORITY_LIMITED_ACCESS(128),
    PRIORITY_CONTROLLED_ACCESS(144);


    /* renamed from: l, reason: collision with root package name */
    private final int f11561l;

    ic(int i2) {
        this.f11561l = i2;
    }

    public static ic a(int i2) {
        if (i2 == 0) {
            return PRIORITY_UNKNOWN;
        }
        if (i2 == 16) {
            return PRIORITY_NON_TRAFFIC;
        }
        if (i2 == 32) {
            return PRIORITY_TERMINAL;
        }
        if (i2 == 48) {
            return PRIORITY_LOCAL;
        }
        if (i2 == 64) {
            return PRIORITY_MINOR_ARTERIAL;
        }
        if (i2 == 80) {
            return PRIORITY_MAJOR_ARTERIAL;
        }
        if (i2 == 96) {
            return PRIORITY_SECONDARY_ROAD;
        }
        if (i2 == 112) {
            return PRIORITY_PRIMARY_HIGHWAY;
        }
        if (i2 == 128) {
            return PRIORITY_LIMITED_ACCESS;
        }
        if (i2 != 144) {
            return null;
        }
        return PRIORITY_CONTROLLED_ACCESS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11561l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11561l);
    }
}
