package com.waze.ak;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum y implements eg {
    INSTRUCTION_MODE_UNSPECIFIED(0),
    FULL(1),
    BRIEF(2),
    PERSONALIZED(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f14128f;

    y(int i2) {
        this.f14128f = i2;
    }

    public static y a(int i2) {
        if (i2 == 0) {
            return INSTRUCTION_MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return FULL;
        }
        if (i2 == 2) {
            return BRIEF;
        }
        if (i2 != 3) {
            return null;
        }
        return PERSONALIZED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f14128f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14128f);
    }
}
