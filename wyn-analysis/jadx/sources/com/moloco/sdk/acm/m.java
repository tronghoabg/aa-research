package com.moloco.sdk.acm;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f28453a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f28454b;

    public m(String str, Long l10) {
        this.f28453a = str;
        this.f28454b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC3340k.a(this.f28453a, mVar.f28453a) && AbstractC3340k.a(this.f28454b, mVar.f28454b);
    }

    public final int hashCode() {
        String str = this.f28453a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f28454b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateConfig(postAnalyticsUrl=" + this.f28453a + ", requestPeriodSeconds=" + this.f28454b + ')';
    }
}
