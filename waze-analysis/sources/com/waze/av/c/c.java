package com.waze.av.c;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16022a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16023b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16024c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16025d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16026e;

    public c(String str, String str2, String str3, String str4, String str5) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "label");
        x.f(str3, "priceFormat");
        x.f(str4, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f16022a = str;
        this.f16023b = str2;
        this.f16024c = str3;
        this.f16025d = str4;
        this.f16026e = str5;
    }

    public final String a() {
        return this.f16026e;
    }

    public final String b() {
        return this.f16022a;
    }

    public final String c() {
        return this.f16023b;
    }

    public final String d() {
        return this.f16024c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f16022a, cVar.f16022a) && x.n(this.f16023b, cVar.f16023b) && x.n(this.f16024c, cVar.f16024c) && x.n(this.f16025d, cVar.f16025d) && x.n(this.f16026e, cVar.f16026e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f16022a.hashCode() * 31) + this.f16023b.hashCode()) * 31) + this.f16024c.hashCode()) * 31) + this.f16025d.hashCode();
        String str = this.f16026e;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CategoryProduct(id=" + this.f16022a + ", label=" + this.f16023b + ", priceFormat=" + this.f16024c + ", type=" + this.f16025d + ", icon=" + this.f16026e + ")";
    }
}
