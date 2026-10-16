package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bh implements eg {
    UTF8_VALIDATION_UNKNOWN(0),
    UNVERIFIED(1),
    VERIFY(2),
    NONE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12738f;

    bh(int i2) {
        this.f12738f = i2;
    }

    public static bh a(int i2) {
        if (i2 == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i2 == 1) {
            return UNVERIFIED;
        }
        if (i2 == 2) {
            return VERIFY;
        }
        if (i2 != 3) {
            return null;
        }
        return NONE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12738f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12738f);
    }
}
