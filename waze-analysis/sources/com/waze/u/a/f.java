package com.waze.u.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum f implements eg {
    SAMPLE_RATE_UNSPECIFIED(0),
    SAMPLE_RATE_16K(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f41624d;

    f(int i2) {
        this.f41624d = i2;
    }

    public static f a(int i2) {
        if (i2 == 0) {
            return SAMPLE_RATE_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return SAMPLE_RATE_16K;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f41624d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f41624d);
    }
}
