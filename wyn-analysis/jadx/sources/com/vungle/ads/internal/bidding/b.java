package com.vungle.ads.internal.bidding;

import A7.AbstractC0279p0;
import com.iab.omid.library.vungle.internal.l;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f32925a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32926b;

    public b(String bidToken, String errorMessage) {
        AbstractC3340k.e(bidToken, "bidToken");
        AbstractC3340k.e(errorMessage, "errorMessage");
        this.f32925a = bidToken;
        this.f32926b = errorMessage;
    }

    public final String a() {
        return this.f32925a;
    }

    public final String b() {
        return this.f32926b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC3340k.a(this.f32925a, bVar.f32925a) && AbstractC3340k.a(this.f32926b, bVar.f32926b);
    }

    public final int hashCode() {
        return this.f32926b.hashCode() + (this.f32925a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = l.a("BiddingTokenInfo(bidToken=");
        sbA.append(this.f32925a);
        sbA.append(", errorMessage=");
        return AbstractC0279p0.n(sbA, this.f32926b, ')');
    }
}
