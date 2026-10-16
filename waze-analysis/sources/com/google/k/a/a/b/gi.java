package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gi implements com.google.v.eg {
    TIME_APPLICABILITY_UNSPECIFIED(0),
    TIME_APPLICABILITY_UNKNOWN(1),
    LOCAL_INDICATOR(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11397e;

    gi(int i2) {
        this.f11397e = i2;
    }

    public static gi a(int i2) {
        if (i2 == 0) {
            return TIME_APPLICABILITY_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TIME_APPLICABILITY_UNKNOWN;
        }
        if (i2 != 2) {
            return null;
        }
        return LOCAL_INDICATOR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11397e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11397e);
    }
}
