package com.waze.bg.e;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum h implements eg {
    UNSPECIFIED_LEVEL(0),
    LOW_LEVEL(1),
    MID_LEVEL(2),
    HIGH_LEVEL(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f16748f;

    h(int i2) {
        this.f16748f = i2;
    }

    public static h a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED_LEVEL;
        }
        if (i2 == 1) {
            return LOW_LEVEL;
        }
        if (i2 == 2) {
            return MID_LEVEL;
        }
        if (i2 != 3) {
            return null;
        }
        return HIGH_LEVEL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16748f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16748f);
    }
}
