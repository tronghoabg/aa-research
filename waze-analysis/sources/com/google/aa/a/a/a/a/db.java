package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum db implements eg {
    UNKNOWN_USAGE_TYPE(0),
    USAGE_TYPE_PHENOTYPE(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f3767d;

    db(int i2) {
        this.f3767d = i2;
    }

    public static db a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_USAGE_TYPE;
        }
        if (i2 != 1) {
            return null;
        }
        return USAGE_TYPE_PHENOTYPE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3767d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3767d);
    }
}
