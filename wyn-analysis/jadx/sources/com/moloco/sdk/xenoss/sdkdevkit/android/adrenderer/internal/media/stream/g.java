package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f30333a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30334b;

    public g(long j8, long j10) {
        this.f30333a = j8;
        this.f30334b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f30333a == gVar.f30333a && this.f30334b == gVar.f30334b;
    }

    public final int hashCode() {
        long j8 = this.f30333a;
        int i5 = ((int) (j8 ^ (j8 >>> 32))) * 31;
        long j10 = this.f30334b;
        return i5 + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Progress(bytesDownloaded=");
        sb2.append(this.f30333a);
        sb2.append(", totalBytes=");
        return AbstractC0213f.e(sb2, this.f30334b, ')');
    }
}
