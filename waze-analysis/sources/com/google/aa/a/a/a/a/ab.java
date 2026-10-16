package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ab implements eg {
    CLIENT_UNKNOWN(0),
    PHENOTYPE(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f3629d;

    ab(int i2) {
        this.f3629d = i2;
    }

    public static ab a(int i2) {
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
        return this.f3629d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3629d);
    }
}
