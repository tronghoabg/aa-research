package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum j implements eg {
    TIER_UNKNOWN(0),
    UNSUPPORTED(1),
    SILVER(2),
    GOLD(3),
    DIAMOND(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f3801g;

    j(int i2) {
        this.f3801g = i2;
    }

    public static j a(int i2) {
        if (i2 == 0) {
            return TIER_UNKNOWN;
        }
        if (i2 == 1) {
            return UNSUPPORTED;
        }
        if (i2 == 2) {
            return SILVER;
        }
        if (i2 == 3) {
            return GOLD;
        }
        if (i2 != 4) {
            return null;
        }
        return DIAMOND;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3801g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3801g);
    }
}
