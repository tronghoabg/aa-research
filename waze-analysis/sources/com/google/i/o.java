package com.google.i;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum o implements eg {
    HAS_UNKNOWN_VALUE(1),
    HAS_NO_VALUE(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f11068d;

    o(int i2) {
        this.f11068d = i2;
    }

    public static o a(int i2) {
        if (i2 == 1) {
            return HAS_UNKNOWN_VALUE;
        }
        if (i2 != 2) {
            return null;
        }
        return HAS_NO_VALUE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11068d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11068d);
    }
}
