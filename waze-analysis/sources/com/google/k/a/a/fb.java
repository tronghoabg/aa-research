package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum fb implements com.google.v.eg {
    UNKNOWN_BORDER_PATTERN(1),
    NO_BORDER_PATTERN(2),
    SOLID(3),
    DASHED(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f11793f;

    fb(int i2) {
        this.f11793f = i2;
    }

    public static fb a(int i2) {
        if (i2 == 1) {
            return UNKNOWN_BORDER_PATTERN;
        }
        if (i2 == 2) {
            return NO_BORDER_PATTERN;
        }
        if (i2 == 3) {
            return SOLID;
        }
        if (i2 != 4) {
            return null;
        }
        return DASHED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11793f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11793f);
    }
}
