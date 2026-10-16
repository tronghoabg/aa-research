package com.waze.o;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum p implements eg {
    MODE_UNSPECIFIED(0),
    ON(1),
    OFF(2),
    ALERTS_ONLY(3),
    BRIEF_ON(4),
    BRIEF_OFF(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f32918h;

    p(int i2) {
        this.f32918h = i2;
    }

    public static p a(int i2) {
        if (i2 == 0) {
            return MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ON;
        }
        if (i2 == 2) {
            return OFF;
        }
        if (i2 == 3) {
            return ALERTS_ONLY;
        }
        if (i2 == 4) {
            return BRIEF_ON;
        }
        if (i2 != 5) {
            return null;
        }
        return BRIEF_OFF;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f32918h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32918h);
    }
}
