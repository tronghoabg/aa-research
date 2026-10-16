package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ns implements com.google.v.eg {
    UNKNOWN(0),
    BLOCKED(16),
    NOT_TRUSTED(32),
    YP_FEEDS(40),
    TRUSTED(48),
    SUPER_TRUSTED(64);


    /* renamed from: h, reason: collision with root package name */
    private final int f12161h;

    ns(int i2) {
        this.f12161h = i2;
    }

    public static ns a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 16) {
            return BLOCKED;
        }
        if (i2 == 32) {
            return NOT_TRUSTED;
        }
        if (i2 == 40) {
            return YP_FEEDS;
        }
        if (i2 == 48) {
            return TRUSTED;
        }
        if (i2 != 64) {
            return null;
        }
        return SUPER_TRUSTED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12161h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12161h);
    }
}
