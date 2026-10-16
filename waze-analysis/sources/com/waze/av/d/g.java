package com.waze.av.d;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f16066a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16067b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16068c;

    public g(String str, String str2, String str3) {
        x.f(str, "label");
        x.f(str2, "price");
        x.f(str3, TtmlNode.ATTR_ID);
        this.f16066a = str;
        this.f16067b = str2;
        this.f16068c = str3;
    }

    public final String a() {
        return this.f16068c;
    }

    public final String b() {
        return this.f16066a;
    }

    public final String c() {
        return this.f16067b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return x.n(this.f16066a, gVar.f16066a) && x.n(this.f16067b, gVar.f16067b) && x.n(this.f16068c, gVar.f16068c);
    }

    public final int hashCode() {
        return (((this.f16066a.hashCode() * 31) + this.f16067b.hashCode()) * 31) + this.f16068c.hashCode();
    }

    public final String toString() {
        return "FormattedGasPrice(label=" + this.f16066a + ", price=" + this.f16067b + ", id=" + this.f16068c + ")";
    }
}
