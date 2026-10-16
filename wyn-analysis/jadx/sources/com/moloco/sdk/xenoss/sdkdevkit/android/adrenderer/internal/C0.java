package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f29902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29903b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f29904c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f29905d;

    /* renamed from: e, reason: collision with root package name */
    public final B0 f29906e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29907f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29908g;

    public C0(Integer num, String str, Integer num2, Integer num3, B0 b02, String str2, String str3) {
        this.f29902a = num;
        this.f29903b = str;
        this.f29904c = num2;
        this.f29905d = num3;
        this.f29906e = b02;
        this.f29907f = str2;
        this.f29908g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return AbstractC3340k.a(this.f29902a, c02.f29902a) && AbstractC3340k.a(this.f29903b, c02.f29903b) && AbstractC3340k.a(this.f29904c, c02.f29904c) && AbstractC3340k.a(this.f29905d, c02.f29905d) && AbstractC3340k.a(this.f29906e, c02.f29906e) && AbstractC3340k.a(this.f29907f, c02.f29907f) && AbstractC3340k.a(this.f29908g, c02.f29908g);
    }

    public final int hashCode() {
        Integer num = this.f29902a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f29903b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f29904c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f29905d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        B0 b02 = this.f29906e;
        int iHashCode5 = (iHashCode4 + (b02 == null ? 0 : b02.hashCode())) * 31;
        String str2 = this.f29907f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29908g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DECCta(verticalSpacing=");
        sb2.append(this.f29902a);
        sb2.append(", ctaText=");
        sb2.append(this.f29903b);
        sb2.append(", buttonWidth=");
        sb2.append(this.f29904c);
        sb2.append(", fontSize=");
        sb2.append(this.f29905d);
        sb2.append(", border=");
        sb2.append(this.f29906e);
        sb2.append(", foregroundColor=");
        sb2.append(this.f29907f);
        sb2.append(", backgroundColor=");
        return AbstractC0279p0.n(sb2, this.f29908g, ')');
    }
}
