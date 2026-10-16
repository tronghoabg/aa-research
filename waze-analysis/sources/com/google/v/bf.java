package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bf implements eg {
    PROTO_LIMITS_UNKNOWN(0),
    LEGACY_NO_EXPLICIT_LIMITS(1),
    PROTO_LIMITS2026(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12727e;

    bf(int i2) {
        this.f12727e = i2;
    }

    public static bf a(int i2) {
        if (i2 == 0) {
            return PROTO_LIMITS_UNKNOWN;
        }
        if (i2 == 1) {
            return LEGACY_NO_EXPLICIT_LIMITS;
        }
        if (i2 != 2) {
            return null;
        }
        return PROTO_LIMITS2026;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12727e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12727e);
    }
}
