package com.moloco.sdk.internal.services.bidtoken;

import A7.AbstractC0279p0;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f29437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29439c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29440d;

    public h(String str, String str2, String str3, String str4) {
        String osVersion = Build.VERSION.RELEASE;
        AbstractC3340k.e(osVersion, "osVersion");
        this.f29437a = str;
        this.f29438b = str2;
        this.f29439c = str3;
        this.f29440d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f29437a.equals(hVar.f29437a)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return AbstractC3340k.a(str, str) && this.f29438b.equals(hVar.f29438b) && this.f29439c.equals(hVar.f29439c) && this.f29440d.equals(hVar.f29440d);
    }

    public final int hashCode() {
        return this.f29440d.hashCode() + N0.a.c(N0.a.c(N0.a.c(this.f29437a.hashCode() * 31, 31, Build.VERSION.RELEASE), 31, this.f29438b), 31, this.f29439c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidTokenDeviceRequestInfo(language=");
        sb2.append(this.f29437a);
        sb2.append(", osVersion=");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", make=");
        sb2.append(this.f29438b);
        sb2.append(", model=");
        sb2.append(this.f29439c);
        sb2.append(", hardwareVersion=");
        return AbstractC0279p0.n(sb2, this.f29440d, ')');
    }
}
