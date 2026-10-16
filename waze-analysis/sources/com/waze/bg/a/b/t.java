package com.waze.bg.a.b;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum t implements eg {
    UNKNOWN_ROLE(0),
    USER(1),
    MODEL(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16365e;

    t(int i2) {
        this.f16365e = i2;
    }

    public static t a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ROLE;
        }
        if (i2 == 1) {
            return USER;
        }
        if (i2 != 2) {
            return null;
        }
        return MODEL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16365e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16365e);
    }
}
