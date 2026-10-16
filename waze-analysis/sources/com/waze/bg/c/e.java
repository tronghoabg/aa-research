package com.waze.bg.c;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum e implements eg {
    UNKNOWN_ROUTINE_TYPE(0),
    ML(1),
    MANUAL(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16590e;

    e(int i2) {
        this.f16590e = i2;
    }

    public static e a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ROUTINE_TYPE;
        }
        if (i2 == 1) {
            return ML;
        }
        if (i2 != 2) {
            return null;
        }
        return MANUAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16590e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16590e);
    }
}
