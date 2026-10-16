package com.moloco.sdk.acm;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f28455a;

    /* renamed from: b, reason: collision with root package name */
    public String f28456b;

    /* renamed from: c, reason: collision with root package name */
    public long f28457c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f28458d;

    public n(String appId, String postAnalyticsUrl, long j8, Map map) {
        AbstractC3340k.e(appId, "appId");
        AbstractC3340k.e(postAnalyticsUrl, "postAnalyticsUrl");
        this.f28455a = appId;
        this.f28456b = postAnalyticsUrl;
        this.f28457c = j8;
        this.f28458d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC3340k.a(this.f28455a, nVar.f28455a) && AbstractC3340k.a(this.f28456b, nVar.f28456b) && this.f28457c == nVar.f28457c && this.f28458d.equals(nVar.f28458d);
    }

    public final int hashCode() {
        int iC = N0.a.c(this.f28455a.hashCode() * 31, 31, this.f28456b);
        long j8 = this.f28457c;
        return this.f28458d.hashCode() + ((iC + ((int) (j8 ^ (j8 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ACMConfig(appId=" + this.f28455a + ", postAnalyticsUrl=" + this.f28456b + ", requestPeriodSeconds=" + this.f28457c + ", clientOptions=" + this.f28458d + ')';
    }
}
