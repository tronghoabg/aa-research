package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum lr implements com.google.v.eg {
    UNIT_UNKNOWN(0),
    MILES_PER_HOUR(1),
    KILOMETERS_PER_HOUR(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12102e;

    lr(int i2) {
        this.f12102e = i2;
    }

    public static lr a(int i2) {
        if (i2 == 0) {
            return UNIT_UNKNOWN;
        }
        if (i2 == 1) {
            return MILES_PER_HOUR;
        }
        if (i2 != 2) {
            return null;
        }
        return KILOMETERS_PER_HOUR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12102e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12102e);
    }
}
