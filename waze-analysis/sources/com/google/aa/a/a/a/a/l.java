package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum l implements eg {
    MANUFACTURER_UNKNOWN(0),
    MANUFACTURER_INTEL(1),
    MANUFACTURER_AMD(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f3806e;

    l(int i2) {
        this.f3806e = i2;
    }

    public static l a(int i2) {
        if (i2 == 0) {
            return MANUFACTURER_UNKNOWN;
        }
        if (i2 == 1) {
            return MANUFACTURER_INTEL;
        }
        if (i2 != 2) {
            return null;
        }
        return MANUFACTURER_AMD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3806e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3806e);
    }
}
