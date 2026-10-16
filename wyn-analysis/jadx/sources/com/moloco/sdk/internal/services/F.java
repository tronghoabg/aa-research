package com.moloco.sdk.internal.services;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f29382a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29383b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29384c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29386e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29387f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29388g;

    /* renamed from: h, reason: collision with root package name */
    public final float f29389h;

    /* renamed from: i, reason: collision with root package name */
    public final long f29390i;

    /* renamed from: j, reason: collision with root package name */
    public final String f29391j;
    public final String k;

    public F(String str, String str2, String str3, boolean z2, int i5, String str4, String str5, float f10, long j8, String str6, String str7) {
        String osVersion = Build.VERSION.RELEASE;
        AbstractC3340k.e(osVersion, "osVersion");
        this.f29382a = str;
        this.f29383b = str2;
        this.f29384c = str3;
        this.f29385d = z2;
        this.f29386e = i5;
        this.f29387f = str4;
        this.f29388g = str5;
        this.f29389h = f10;
        this.f29390i = j8;
        this.f29391j = str6;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (!this.f29382a.equals(f10.f29382a) || !this.f29383b.equals(f10.f29383b) || !this.f29384c.equals(f10.f29384c) || this.f29385d != f10.f29385d) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return AbstractC3340k.a(str, str) && this.f29386e == f10.f29386e && this.f29387f.equals(f10.f29387f) && this.f29388g.equals(f10.f29388g) && Float.compare(this.f29389h, f10.f29389h) == 0 && this.f29390i == f10.f29390i && this.f29391j.equals(f10.f29391j) && this.k.equals(f10.k);
    }

    public final int hashCode() {
        int iC = AbstractC0213f.c(this.f29389h, N0.a.c(N0.a.c((N0.a.c((((N0.a.c(N0.a.c(this.f29382a.hashCode() * 31, 31, this.f29383b), 31, this.f29384c) + (this.f29385d ? 1231 : 1237)) * 31) - 861391249) * 31, 31, Build.VERSION.RELEASE) + this.f29386e) * 31, 31, this.f29387f), 31, this.f29388g), 31);
        long j8 = this.f29390i;
        return this.k.hashCode() + N0.a.c((iC + ((int) (j8 ^ (j8 >>> 32)))) * 31, 31, this.f29391j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfo(manufacturer=");
        sb2.append(this.f29382a);
        sb2.append(", model=");
        sb2.append(this.f29383b);
        sb2.append(", hwVersion=");
        sb2.append(this.f29384c);
        sb2.append(", isTablet=");
        sb2.append(this.f29385d);
        sb2.append(", os=android, osVersion=");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", apiLevel=");
        sb2.append(this.f29386e);
        sb2.append(", language=");
        sb2.append(this.f29387f);
        sb2.append(", mobileCarrier=");
        sb2.append(this.f29388g);
        sb2.append(", screenDensity=");
        sb2.append(this.f29389h);
        sb2.append(", dbtMs=");
        sb2.append(this.f29390i);
        sb2.append(", hardware=");
        sb2.append(this.f29391j);
        sb2.append(", brand=");
        return AbstractC0279p0.n(sb2, this.k, ')');
    }
}
