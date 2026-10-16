package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2092j {

    /* renamed from: a, reason: collision with root package name */
    public final String f31485a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f31486b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31487c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31488d;

    /* renamed from: e, reason: collision with root package name */
    public final m f31489e;

    public C2092j(String str, Integer num, String str2, String str3, m child) {
        AbstractC3340k.e(child, "child");
        this.f31485a = str;
        this.f31486b = num;
        this.f31487c = str2;
        this.f31488d = str3;
        this.f31489e = child;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2092j)) {
            return false;
        }
        C2092j c2092j = (C2092j) obj;
        return AbstractC3340k.a(this.f31485a, c2092j.f31485a) && AbstractC3340k.a(this.f31486b, c2092j.f31486b) && AbstractC3340k.a(this.f31487c, c2092j.f31487c) && AbstractC3340k.a(this.f31488d, c2092j.f31488d) && AbstractC3340k.a(this.f31489e, c2092j.f31489e);
    }

    public final int hashCode() {
        String str = this.f31485a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f31486b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f31487c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31488d;
        return this.f31489e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Creative(id=" + this.f31485a + ", sequence=" + this.f31486b + ", adId=" + this.f31487c + ", apiFramework=" + this.f31488d + ", child=" + this.f31489e + ')';
    }
}
