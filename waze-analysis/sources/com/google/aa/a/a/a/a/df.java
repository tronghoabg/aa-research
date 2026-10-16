package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum df implements eg {
    NO_RESTRICTION(0),
    SIDEWINDER_DEVICE(1),
    LATCHSKY_DEVICE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f3772e;

    df(int i2) {
        this.f3772e = i2;
    }

    public static df a(int i2) {
        if (i2 == 0) {
            return NO_RESTRICTION;
        }
        if (i2 == 1) {
            return SIDEWINDER_DEVICE;
        }
        if (i2 != 2) {
            return null;
        }
        return LATCHSKY_DEVICE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3772e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3772e);
    }
}
