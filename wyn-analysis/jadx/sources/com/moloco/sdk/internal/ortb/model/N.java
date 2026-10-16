package com.moloco.sdk.internal.ortb.model;

import A7.AbstractC0279p0;
import com.moloco.sdk.internal.ortb.model.C1902p;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class N {

    @NotNull
    public static final C1902p.b Companion = new C1902p.b();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f28729a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28730b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f28731c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f28732d;

    /* renamed from: e, reason: collision with root package name */
    public final L f28733e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28734f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28735g;

    public /* synthetic */ N(int i5, Integer num, String str, Integer num2, Integer num3, L l10, String str2, String str3) {
        if ((i5 & 1) == 0) {
            this.f28729a = null;
        } else {
            this.f28729a = num;
        }
        if ((i5 & 2) == 0) {
            this.f28730b = null;
        } else {
            this.f28730b = str;
        }
        if ((i5 & 4) == 0) {
            this.f28731c = null;
        } else {
            this.f28731c = num2;
        }
        if ((i5 & 8) == 0) {
            this.f28732d = null;
        } else {
            this.f28732d = num3;
        }
        if ((i5 & 16) == 0) {
            this.f28733e = null;
        } else {
            this.f28733e = l10;
        }
        if ((i5 & 32) == 0) {
            this.f28734f = null;
        } else {
            this.f28734f = str2;
        }
        if ((i5 & 64) == 0) {
            this.f28735g = null;
        } else {
            this.f28735g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return AbstractC3340k.a(this.f28729a, n10.f28729a) && AbstractC3340k.a(this.f28730b, n10.f28730b) && AbstractC3340k.a(this.f28731c, n10.f28731c) && AbstractC3340k.a(this.f28732d, n10.f28732d) && AbstractC3340k.a(this.f28733e, n10.f28733e) && AbstractC3340k.a(this.f28734f, n10.f28734f) && AbstractC3340k.a(this.f28735g, n10.f28735g);
    }

    public final int hashCode() {
        Integer num = this.f28729a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f28730b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f28731c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f28732d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        L l10 = this.f28733e;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.f28734f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28735g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DECCtaSerializable(verticalSpacing=");
        sb2.append(this.f28729a);
        sb2.append(", ctaText=");
        sb2.append(this.f28730b);
        sb2.append(", buttonWidth=");
        sb2.append(this.f28731c);
        sb2.append(", fontSize=");
        sb2.append(this.f28732d);
        sb2.append(", border=");
        sb2.append(this.f28733e);
        sb2.append(", foregroundColor=");
        sb2.append(this.f28734f);
        sb2.append(", backgroundColor=");
        return AbstractC0279p0.n(sb2, this.f28735g, ')');
    }
}
