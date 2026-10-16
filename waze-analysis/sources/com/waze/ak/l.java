package com.waze.ak;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum l implements eg {
    DISTANCE_UNIT_UNSPECIFIED(0),
    METER(1),
    FOOT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f14112e;

    l(int i2) {
        this.f14112e = i2;
    }

    public static l a(int i2) {
        if (i2 == 0) {
            return DISTANCE_UNIT_UNSPECIFIED;
        }
        if (i2 == 1) {
            return METER;
        }
        if (i2 != 2) {
            return null;
        }
        return FOOT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f14112e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14112e);
    }
}
