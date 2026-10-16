package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ex implements eg {
    UTF8_VALIDATION_UNKNOWN(0),
    DEFAULT(1),
    VERIFY(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12931e;

    ex(int i2) {
        this.f12931e = i2;
    }

    public static ex a(int i2) {
        if (i2 == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i2 == 1) {
            return DEFAULT;
        }
        if (i2 != 2) {
            return null;
        }
        return VERIFY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12931e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12931e);
    }
}
