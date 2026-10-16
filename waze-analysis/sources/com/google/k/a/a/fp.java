package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum fp implements com.google.v.eg {
    UNKNOWN_DASH_PATTERN(1),
    SOLID(2),
    DASHED(3),
    DOTTED(4),
    DOTTED_DASHED(5);


    /* renamed from: g, reason: collision with root package name */
    private final int f11824g;

    fp(int i2) {
        this.f11824g = i2;
    }

    public static fp a(int i2) {
        if (i2 == 1) {
            return UNKNOWN_DASH_PATTERN;
        }
        if (i2 == 2) {
            return SOLID;
        }
        if (i2 == 3) {
            return DASHED;
        }
        if (i2 == 4) {
            return DOTTED;
        }
        if (i2 != 5) {
            return null;
        }
        return DOTTED_DASHED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11824g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11824g);
    }
}
