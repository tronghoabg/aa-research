package com.waze.bg.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum h implements eg {
    VALIDATION_UNSPECIFIED(0),
    VALIDATION_THUMBS_DOWN(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f16310d;

    h(int i2) {
        this.f16310d = i2;
    }

    public static h a(int i2) {
        if (i2 == 0) {
            return VALIDATION_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return VALIDATION_THUMBS_DOWN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16310d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16310d);
    }
}
