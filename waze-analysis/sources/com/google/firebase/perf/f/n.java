package com.google.firebase.perf.f;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum n implements eg {
    EFFECTIVE_CONNECTION_TYPE_UNKNOWN(0),
    EFFECTIVE_CONNECTION_TYPE_SLOW_2G(1),
    EFFECTIVE_CONNECTION_TYPE_2G(2),
    EFFECTIVE_CONNECTION_TYPE_3G(3),
    EFFECTIVE_CONNECTION_TYPE_4G(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f10469g;

    n(int i2) {
        this.f10469g = i2;
    }

    public static n a(int i2) {
        if (i2 == 0) {
            return EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
        }
        if (i2 == 2) {
            return EFFECTIVE_CONNECTION_TYPE_2G;
        }
        if (i2 == 3) {
            return EFFECTIVE_CONNECTION_TYPE_3G;
        }
        if (i2 != 4) {
            return null;
        }
        return EFFECTIVE_CONNECTION_TYPE_4G;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f10469g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10469g);
    }
}
