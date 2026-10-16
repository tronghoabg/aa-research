package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f30315a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30316b;

    /* renamed from: c, reason: collision with root package name */
    public final double f30317c;

    public p(int i5, boolean z2, double d3) {
        this.f30315a = i5;
        this.f30316b = z2;
        this.f30317c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f30315a == pVar.f30315a && this.f30316b == pVar.f30316b && Double.compare(this.f30317c, pVar.f30317c) == 0;
    }

    public final int hashCode() {
        int i5 = ((this.f30315a * 31) + (this.f30316b ? 1231 : 1237)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f30317c);
        return ((i5 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + 209715200;
    }

    public final String toString() {
        return "MediaConfig(chunkSize=" + this.f30315a + ", isStreamingEnabled=" + this.f30316b + ", minStreamingPlayableDurationOnTimeoutSecs=" + this.f30317c + ", mediaCacheDiskCleanUpLimit=209715200)";
    }
}
