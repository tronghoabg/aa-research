package com.waze.ui.m;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f43032a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43033b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43034c;

    public s(String str, String str2, String str3) {
        h.g.b.x.f(str, "label");
        h.g.b.x.f(str2, "price");
        h.g.b.x.f(str3, TtmlNode.ATTR_ID);
        this.f43032a = str;
        this.f43033b = str2;
        this.f43034c = str3;
    }

    public final String a() {
        return this.f43032a;
    }

    public final String b() {
        return this.f43033b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return h.g.b.x.n(this.f43032a, sVar.f43032a) && h.g.b.x.n(this.f43033b, sVar.f43033b) && h.g.b.x.n(this.f43034c, sVar.f43034c);
    }

    public final int hashCode() {
        return (((this.f43032a.hashCode() * 31) + this.f43033b.hashCode()) * 31) + this.f43034c.hashCode();
    }

    public final String toString() {
        return "GasPriceModel(label=" + this.f43032a + ", price=" + this.f43033b + ", id=" + this.f43034c + ")";
    }
}
