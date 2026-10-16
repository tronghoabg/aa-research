package com.waze.av.d;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f16072a;

    /* renamed from: b, reason: collision with root package name */
    private final float f16073b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16074c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16075d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16076e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16077f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f16078g;

    public i(String str, float f2, String str2, String str3, String str4, String str5, Long l2) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "label");
        x.f(str3, "priceFormat");
        this.f16072a = str;
        this.f16073b = f2;
        this.f16074c = str2;
        this.f16075d = str3;
        this.f16076e = str4;
        this.f16077f = str5;
        this.f16078g = l2;
    }

    public final float a() {
        return this.f16073b;
    }

    public final Long b() {
        return this.f16078g;
    }

    public final String c() {
        return this.f16072a;
    }

    public final String d() {
        return this.f16074c;
    }

    public final String e() {
        return this.f16075d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return x.n(this.f16072a, iVar.f16072a) && Float.compare(this.f16073b, iVar.f16073b) == 0 && x.n(this.f16074c, iVar.f16074c) && x.n(this.f16075d, iVar.f16075d) && x.n(this.f16076e, iVar.f16076e) && x.n(this.f16077f, iVar.f16077f) && x.n(this.f16078g, iVar.f16078g);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f16072a.hashCode() * 31) + Float.floatToIntBits(this.f16073b)) * 31) + this.f16074c.hashCode()) * 31) + this.f16075d.hashCode();
        String str = this.f16076e;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16077f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f16078g;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "LocalizedVenueProduct(id=" + this.f16072a + ", price=" + this.f16073b + ", label=" + this.f16074c + ", priceFormat=" + this.f16075d + ", icon=" + this.f16076e + ", updatedBy=" + this.f16077f + ", lastUpdated=" + this.f16078g + ")";
    }
}
