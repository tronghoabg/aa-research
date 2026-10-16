package com.moloco.sdk.internal.services.bidtoken;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29436a;

    public g(boolean z2) {
        this.f29436a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f29436a == ((g) obj).f29436a;
    }

    public final int hashCode() {
        return this.f29436a ? 1231 : 1237;
    }

    public final String toString() {
        return AbstractC0279p0.p(new StringBuilder("BidTokenConfig(dbtEnabled="), this.f29436a, ')');
    }
}
