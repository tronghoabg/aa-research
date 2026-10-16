package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bv implements eg {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12772e;

    bv(int i2) {
        this.f12772e = i2;
    }

    public static bv a(int i2) {
        if (i2 == 0) {
            return RETENTION_UNKNOWN;
        }
        if (i2 == 1) {
            return RETENTION_RUNTIME;
        }
        if (i2 != 2) {
            return null;
        }
        return RETENTION_SOURCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12772e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12772e);
    }
}
