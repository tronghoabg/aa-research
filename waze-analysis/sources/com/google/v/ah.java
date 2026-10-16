package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ah implements eg {
    REPEATED_TYPE_UNKNOWN(0),
    LEGACY(1),
    PROXY(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12650e;

    ah(int i2) {
        this.f12650e = i2;
    }

    public static ah a(int i2) {
        if (i2 == 0) {
            return REPEATED_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return LEGACY;
        }
        if (i2 != 2) {
            return null;
        }
        return PROXY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12650e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12650e);
    }
}
