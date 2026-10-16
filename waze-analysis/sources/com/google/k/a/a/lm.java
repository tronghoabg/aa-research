package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum lm implements com.google.v.eg {
    SPEED_LIMIT_SOURCE_TYPE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    IMPLICIT_FROM_SIGN(33);


    /* renamed from: f, reason: collision with root package name */
    private final int f12082f;

    lm(int i2) {
        this.f12082f = i2;
    }

    public static lm a(int i2) {
        if (i2 == 0) {
            return SPEED_LIMIT_SOURCE_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return EXPLICIT;
        }
        if (i2 == 2) {
            return IMPLICIT;
        }
        if (i2 != 33) {
            return null;
        }
        return IMPLICIT_FROM_SIGN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12082f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12082f);
    }
}
