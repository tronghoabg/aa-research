package com.google.z.b.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum aa implements eg {
    UNKNOWN(0),
    VERTICAL(1),
    HORIZONTAL(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f13472e;

    aa(int i2) {
        this.f13472e = i2;
    }

    public static aa a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return VERTICAL;
        }
        if (i2 != 2) {
            return null;
        }
        return HORIZONTAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13472e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13472e);
    }
}
