package com.moloco.sdk.internal.services.events;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29609a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29610b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29611c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29612d;

    public g(String str, String str2, boolean z2, boolean z10) {
        this.f29609a = z2;
        this.f29610b = z10;
        this.f29611c = str;
        this.f29612d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f29609a == gVar.f29609a && this.f29610b == gVar.f29610b && AbstractC3340k.a(this.f29611c, gVar.f29611c) && AbstractC3340k.a(this.f29612d, gVar.f29612d);
    }

    public final int hashCode() {
        return this.f29612d.hashCode() + N0.a.c((((this.f29609a ? 1231 : 1237) * 31) + (this.f29610b ? 1231 : 1237)) * 31, 31, this.f29611c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserEventConfig(eventReportingEnabled=");
        sb2.append(this.f29609a);
        sb2.append(", userTrackingEnabled=");
        sb2.append(this.f29610b);
        sb2.append(", appForegroundUrl=");
        sb2.append(this.f29611c);
        sb2.append(", appBackgroundUrl=");
        return AbstractC0279p0.n(sb2, this.f29612d, ')');
    }
}
