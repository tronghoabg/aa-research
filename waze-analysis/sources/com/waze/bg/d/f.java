package com.waze.bg.d;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum f implements eg {
    UNKNOWN_DIRECTION(0),
    BOTH(1),
    FORWARDS(2),
    BACKWARDS(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f16597f;

    f(int i2) {
        this.f16597f = i2;
    }

    public static ei a() {
        return e.f16591a;
    }

    public static f b(int i2) {
        if (i2 == 0) {
            return UNKNOWN_DIRECTION;
        }
        if (i2 == 1) {
            return BOTH;
        }
        if (i2 == 2) {
            return FORWARDS;
        }
        if (i2 != 3) {
            return null;
        }
        return BACKWARDS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16597f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16597f);
    }
}
