package com.moloco.sdk.internal.services.bidtoken.providers;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.j f29498a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29499b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29500c;

    public m(com.moloco.sdk.internal.services.j jVar, String str, String str2) {
        this.f29498a = jVar;
        this.f29499b = str;
        this.f29500c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f29498a == mVar.f29498a && AbstractC3340k.a(this.f29499b, mVar.f29499b) && AbstractC3340k.a(this.f29500c, mVar.f29500c);
    }

    public final int hashCode() {
        com.moloco.sdk.internal.services.j jVar = this.f29498a;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        String str = this.f29499b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29500c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceSignalInfo(orientation=");
        sb2.append(this.f29498a);
        sb2.append(", locale=");
        sb2.append(this.f29499b);
        sb2.append(", keyboardLocale=");
        return AbstractC0279p0.n(sb2, this.f29500c, ')');
    }
}
