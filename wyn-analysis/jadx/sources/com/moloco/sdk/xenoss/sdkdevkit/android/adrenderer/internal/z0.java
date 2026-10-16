package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32367a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32368b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32369c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32370d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32371e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f32372f;

    /* renamed from: g, reason: collision with root package name */
    public final C0 f32373g;

    /* renamed from: h, reason: collision with root package name */
    public final A0 f32374h;

    /* renamed from: i, reason: collision with root package name */
    public final E0 f32375i;

    public z0(String str, String str2, String str3, String str4, String str5, Integer num, C0 c02, A0 a02, E0 e02) {
        this.f32367a = str;
        this.f32368b = str2;
        this.f32369c = str3;
        this.f32370d = str4;
        this.f32371e = str5;
        this.f32372f = num;
        this.f32373g = c02;
        this.f32374h = a02;
        this.f32375i = e02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return AbstractC3340k.a(this.f32367a, z0Var.f32367a) && AbstractC3340k.a(this.f32368b, z0Var.f32368b) && AbstractC3340k.a(this.f32369c, z0Var.f32369c) && AbstractC3340k.a(this.f32370d, z0Var.f32370d) && AbstractC3340k.a(this.f32371e, z0Var.f32371e) && AbstractC3340k.a(this.f32372f, z0Var.f32372f) && AbstractC3340k.a(this.f32373g, z0Var.f32373g) && AbstractC3340k.a(this.f32374h, z0Var.f32374h) && AbstractC3340k.a(this.f32375i, z0Var.f32375i);
    }

    public final int hashCode() {
        String str = this.f32367a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f32368b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f32369c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f32370d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f32371e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f32372f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        C0 c02 = this.f32373g;
        int iHashCode7 = (iHashCode6 + (c02 == null ? 0 : c02.hashCode())) * 31;
        A0 a02 = this.f32374h;
        int iHashCode8 = (iHashCode7 + (a02 == null ? 0 : a02.hashCode())) * 31;
        E0 e02 = this.f32375i;
        return iHashCode8 + (e02 != null ? e02.hashCode() : 0);
    }

    public final String toString() {
        return "DEC(appName=" + this.f32367a + ", ctaUrl=" + this.f32368b + ", ctaTrackingUrl=" + this.f32369c + ", impressionTrackingUrl=" + this.f32370d + ", skipToDECTrackingUrl=" + this.f32371e + ", appNameFontSize=" + this.f32372f + ", decCta=" + this.f32373g + ", decAppIcon=" + this.f32374h + ", decRating=" + this.f32375i + ')';
    }
}
