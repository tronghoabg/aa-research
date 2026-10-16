package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bi implements eg {
    DEFAULT_SYMBOL_VISIBILITY_UNKNOWN(0),
    EXPORT_ALL(1),
    EXPORT_TOP_LEVEL(2),
    LOCAL_ALL(3),
    STRICT(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f12745g;

    bi(int i2) {
        this.f12745g = i2;
    }

    public static bi a(int i2) {
        if (i2 == 0) {
            return DEFAULT_SYMBOL_VISIBILITY_UNKNOWN;
        }
        if (i2 == 1) {
            return EXPORT_ALL;
        }
        if (i2 == 2) {
            return EXPORT_TOP_LEVEL;
        }
        if (i2 == 3) {
            return LOCAL_ALL;
        }
        if (i2 != 4) {
            return null;
        }
        return STRICT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12745g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12745g);
    }
}
