package com.moloco.sdk.acm;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f28444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28445b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f28446c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28447d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f28448e;

    public j(String appId, String postAnalyticsUrl, Context context, long j8, Map map) {
        AbstractC3340k.e(appId, "appId");
        AbstractC3340k.e(postAnalyticsUrl, "postAnalyticsUrl");
        AbstractC3340k.e(context, "context");
        this.f28444a = appId;
        this.f28445b = postAnalyticsUrl;
        this.f28446c = context;
        this.f28447d = j8;
        this.f28448e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC3340k.a(this.f28444a, jVar.f28444a) && AbstractC3340k.a(this.f28445b, jVar.f28445b) && AbstractC3340k.a(this.f28446c, jVar.f28446c) && this.f28447d == jVar.f28447d && this.f28448e.equals(jVar.f28448e);
    }

    public final int hashCode() {
        int iHashCode = (this.f28446c.hashCode() + N0.a.c(this.f28444a.hashCode() * 31, 31, this.f28445b)) * 31;
        long j8 = this.f28447d;
        return this.f28448e.hashCode() + ((iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31);
    }

    public final String toString() {
        return "InitConfig(appId=" + this.f28444a + ", postAnalyticsUrl=" + this.f28445b + ", context=" + this.f28446c + ", requestPeriodSeconds=" + this.f28447d + ", clientOptions=" + this.f28448e + ')';
    }
}
