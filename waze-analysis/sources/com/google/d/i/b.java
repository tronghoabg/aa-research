package com.google.d.i;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b implements eg {
    UNKNOWN(0),
    ON(1),
    OFF(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f7919e;

    b(int i2) {
        this.f7919e = i2;
    }

    public static b a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return ON;
        }
        if (i2 != 2) {
            return null;
        }
        return OFF;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f7919e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7919e);
    }
}
