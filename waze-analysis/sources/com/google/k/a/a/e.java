package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum e implements com.google.v.eg {
    SPEED_LIMIT_TRUST_LEVEL_UNKNOWN(0),
    LOW_QUALITY(1),
    HIGH_QUALITY(2),
    EXACT(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f11779f;

    e(int i2) {
        this.f11779f = i2;
    }

    public static e a(int i2) {
        if (i2 == 0) {
            return SPEED_LIMIT_TRUST_LEVEL_UNKNOWN;
        }
        if (i2 == 1) {
            return LOW_QUALITY;
        }
        if (i2 == 2) {
            return HIGH_QUALITY;
        }
        if (i2 != 3) {
            return null;
        }
        return EXACT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11779f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11779f);
    }
}
