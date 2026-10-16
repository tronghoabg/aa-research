package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum jh implements com.google.v.eg {
    PROPERTY_VALUE_STATUS_UNSPECIFIED(0),
    HAS_NO_VALUE(2),
    HAS_UNKNOWN_VALUE(4);


    /* renamed from: e, reason: collision with root package name */
    private final int f11993e;

    jh(int i2) {
        this.f11993e = i2;
    }

    public static jh a(int i2) {
        if (i2 == 0) {
            return PROPERTY_VALUE_STATUS_UNSPECIFIED;
        }
        if (i2 == 2) {
            return HAS_NO_VALUE;
        }
        if (i2 != 4) {
            return null;
        }
        return HAS_UNKNOWN_VALUE;
    }

    public static com.google.v.ei b() {
        return ha.m;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11993e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11993e);
    }
}
