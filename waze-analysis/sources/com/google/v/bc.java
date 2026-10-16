package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bc implements eg {
    FIELD_PRESENCE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    LEGACY_REQUIRED(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f12712f;

    bc(int i2) {
        this.f12712f = i2;
    }

    public static bc a(int i2) {
        if (i2 == 0) {
            return FIELD_PRESENCE_UNKNOWN;
        }
        if (i2 == 1) {
            return EXPLICIT;
        }
        if (i2 == 2) {
            return IMPLICIT;
        }
        if (i2 != 3) {
            return null;
        }
        return LEGACY_REQUIRED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12712f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12712f);
    }
}
