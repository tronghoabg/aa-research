package com.moloco.sdk.internal.services.bidtoken.providers;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f29504a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29505b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29506c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29507d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29508e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29509f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29510g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29511h;

    public o(String sessionId, long j8, long j10, int i5, int i10, int i11, int i12, int i13) {
        AbstractC3340k.e(sessionId, "sessionId");
        this.f29504a = sessionId;
        this.f29505b = j8;
        this.f29506c = j10;
        this.f29507d = i5;
        this.f29508e = i10;
        this.f29509f = i11;
        this.f29510g = i12;
        this.f29511h = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC3340k.a(this.f29504a, oVar.f29504a) && this.f29505b == oVar.f29505b && this.f29506c == oVar.f29506c && this.f29507d == oVar.f29507d && this.f29508e == oVar.f29508e && this.f29509f == oVar.f29509f && this.f29510g == oVar.f29510g && this.f29511h == oVar.f29511h;
    }

    public final int hashCode() {
        int iHashCode = this.f29504a.hashCode() * 31;
        long j8 = this.f29505b;
        int i5 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f29506c;
        return ((((((((((i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f29507d) * 31) + this.f29508e) * 31) + this.f29509f) * 31) + this.f29510g) * 31) + this.f29511h;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IlrdSignal(sessionId=");
        sb2.append(this.f29504a);
        sb2.append(", sessionStartTs=");
        sb2.append(this.f29505b);
        sb2.append(", lastImpressionTs=");
        sb2.append(this.f29506c);
        sb2.append(", bannerImpressionCount=");
        sb2.append(this.f29507d);
        sb2.append(", mrecImpressionCount=");
        sb2.append(this.f29508e);
        sb2.append(", nativeImpressionCount=");
        sb2.append(this.f29509f);
        sb2.append(", interstitialImpressionCount=");
        sb2.append(this.f29510g);
        sb2.append(", rewardedImpressionCount=");
        return M6.r(sb2, this.f29511h, ')');
    }
}
