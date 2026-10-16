package com.moloco.sdk.internal.services.bidtoken;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f29451a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29452b;

    /* renamed from: c, reason: collision with root package name */
    public final g f29453c;

    public m(String str, String str2, g gVar) {
        this.f29451a = str;
        this.f29452b = str2;
        this.f29453c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC3340k.a(this.f29451a, mVar.f29451a) && AbstractC3340k.a(this.f29452b, mVar.f29452b) && AbstractC3340k.a(this.f29453c, mVar.f29453c);
    }

    public final int hashCode() {
        return this.f29453c.hashCode() + N0.a.c(this.f29451a.hashCode() * 31, 31, this.f29452b);
    }

    public final String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.f29451a + ", publicKey=" + this.f29452b + ", bidTokenConfig=" + this.f29453c + ')';
    }
}
