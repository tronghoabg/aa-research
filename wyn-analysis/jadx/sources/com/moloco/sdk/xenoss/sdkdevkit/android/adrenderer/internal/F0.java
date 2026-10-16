package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f29933a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f29934b;

    /* renamed from: c, reason: collision with root package name */
    public final A0 f29935c;

    /* renamed from: d, reason: collision with root package name */
    public final E0 f29936d;

    public F0(Integer num, C0 c02, A0 a02, E0 e02) {
        this.f29933a = num;
        this.f29934b = c02;
        this.f29935c = a02;
        this.f29936d = e02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return AbstractC3340k.a(this.f29933a, f02.f29933a) && AbstractC3340k.a(this.f29934b, f02.f29934b) && AbstractC3340k.a(this.f29935c, f02.f29935c) && AbstractC3340k.a(this.f29936d, f02.f29936d);
    }

    public final int hashCode() {
        Integer num = this.f29933a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C0 c02 = this.f29934b;
        int iHashCode2 = (iHashCode + (c02 == null ? 0 : c02.hashCode())) * 31;
        A0 a02 = this.f29935c;
        int iHashCode3 = (iHashCode2 + (a02 == null ? 0 : a02.hashCode())) * 31;
        E0 e02 = this.f29936d;
        return iHashCode3 + (e02 != null ? e02.hashCode() : 0);
    }

    public final String toString() {
        return "DECRenderingData(appNameFontSize=" + this.f29933a + ", decCTA=" + this.f29934b + ", decAppIcon=" + this.f29935c + ", decRating=" + this.f29936d + ')';
    }
}
