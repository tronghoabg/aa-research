package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bq implements eg {
    BUILD_CHANNEL_UNKNOWN(0),
    BUILD_CHANNEL_ENG(1),
    BUILD_CHANNEL_BETA(2),
    BUILD_CHANNEL_PROD(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f3681f;

    bq(int i2) {
        this.f3681f = i2;
    }

    public static bq a(int i2) {
        if (i2 == 0) {
            return BUILD_CHANNEL_UNKNOWN;
        }
        if (i2 == 1) {
            return BUILD_CHANNEL_ENG;
        }
        if (i2 == 2) {
            return BUILD_CHANNEL_BETA;
        }
        if (i2 != 3) {
            return null;
        }
        return BUILD_CHANNEL_PROD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3681f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3681f);
    }
}
