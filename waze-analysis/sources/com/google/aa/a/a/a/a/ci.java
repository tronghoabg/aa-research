package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ci implements eg {
    MACHINE_CLASS_UNKNOWN(0),
    TEAMFOOD(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f3744d;

    ci(int i2) {
        this.f3744d = i2;
    }

    public static ci a(int i2) {
        if (i2 == 0) {
            return MACHINE_CLASS_UNKNOWN;
        }
        if (i2 != 1) {
            return null;
        }
        return TEAMFOOD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3744d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3744d);
    }
}
