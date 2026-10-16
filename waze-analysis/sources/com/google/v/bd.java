package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bd implements eg {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12717e;

    bd(int i2) {
        this.f12717e = i2;
    }

    public static bd a(int i2) {
        if (i2 == 0) {
            return JSON_FORMAT_UNKNOWN;
        }
        if (i2 == 1) {
            return ALLOW;
        }
        if (i2 != 2) {
            return null;
        }
        return LEGACY_BEST_EFFORT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12717e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12717e);
    }
}
