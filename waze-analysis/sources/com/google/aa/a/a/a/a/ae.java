package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ae implements eg {
    CLIENT_UNKNOWN(0),
    PHENOTYPE(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f3633d;

    ae(int i2) {
        this.f3633d = i2;
    }

    public static ae a(int i2) {
        if (i2 == 0) {
            return CLIENT_UNKNOWN;
        }
        if (i2 != 1) {
            return null;
        }
        return PHENOTYPE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3633d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3633d);
    }
}
