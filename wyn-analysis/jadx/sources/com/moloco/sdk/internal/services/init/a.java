package com.moloco.sdk.internal.services.init;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f29626a;

    public a(String appKey) {
        AbstractC3340k.e(appKey, "appKey");
        this.f29626a = appKey;
    }

    public final String a() {
        return wg.b.c(new StringBuilder(), this.f29626a, "___v1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && AbstractC3340k.a(this.f29626a, ((a) obj).f29626a);
    }

    public final int hashCode() {
        return this.f29626a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("CacheKey(appKey="), this.f29626a, ')');
    }
}
