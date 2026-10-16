package com.google.m.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum c implements eg {
    UNSPECIFIED(0),
    FROM_NUMBER_WITH_PLUS_SIGN(1),
    FROM_NUMBER_WITH_IDD(5),
    FROM_NUMBER_WITHOUT_PLUS_SIGN(10),
    FROM_DEFAULT_COUNTRY(20);


    /* renamed from: g, reason: collision with root package name */
    private final int f12474g;

    c(int i2) {
        this.f12474g = i2;
    }

    public static c a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return FROM_NUMBER_WITH_PLUS_SIGN;
        }
        if (i2 == 5) {
            return FROM_NUMBER_WITH_IDD;
        }
        if (i2 == 10) {
            return FROM_NUMBER_WITHOUT_PLUS_SIGN;
        }
        if (i2 != 20) {
            return null;
        }
        return FROM_DEFAULT_COUNTRY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12474g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12474g);
    }
}
