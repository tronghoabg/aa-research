package com.waze.ak;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum a implements eg {
    ANNOUNCEMENT_TIMING_UNSPECIFIED(0),
    START_AT_DISTANCE(1),
    FINISH_BY_DISTANCE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f14085e;

    a(int i2) {
        this.f14085e = i2;
    }

    public static a a(int i2) {
        if (i2 == 0) {
            return ANNOUNCEMENT_TIMING_UNSPECIFIED;
        }
        if (i2 == 1) {
            return START_AT_DISTANCE;
        }
        if (i2 != 2) {
            return null;
        }
        return FINISH_BY_DISTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f14085e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14085e);
    }
}
