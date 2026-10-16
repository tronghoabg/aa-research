package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bz {

    /* renamed from: a, reason: collision with root package name */
    public final int f18206a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18207b;

    public /* synthetic */ bz(byte[] bArr) {
        this.f18206a = R.raw.splash_final_default_height_312;
        this.f18207b = 1.18f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        int i2 = bzVar.f18206a;
        float f2 = bzVar.f18207b;
        return Float.compare(1.18f, 1.18f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.18f) + 1661928757;
    }

    public final String toString() {
        return "DynamicSplashLottie(animationFile=2131820587, scale=1.18)";
    }

    public bz() {
        this(null);
    }
}
