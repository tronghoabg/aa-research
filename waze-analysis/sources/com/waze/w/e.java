package com.waze.w;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f45415a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.j.n f45416b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45417c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.av.a.p f45418d;

    /* renamed from: e, reason: collision with root package name */
    private final String f45419e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ui.ac.i f45420f;

    /* renamed from: g, reason: collision with root package name */
    private final String f45421g;

    /* renamed from: h, reason: collision with root package name */
    private final String f45422h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, com.waze.j.n nVar, String str2, com.waze.av.a.p pVar, String str3, com.waze.ui.ac.i iVar, String str4, String str5) {
        super(null);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(str3, "subtitle");
        h.g.b.x.f(iVar, "image");
        this.f45415a = str;
        this.f45416b = nVar;
        this.f45417c = str2;
        this.f45418d = pVar;
        this.f45419e = str3;
        this.f45420f = iVar;
        this.f45421g = str4;
        this.f45422h = str5;
    }

    @Override // com.waze.w.i
    public final com.waze.j.n a() {
        return this.f45416b;
    }

    @Override // com.waze.w.i
    public final com.waze.av.a.p b() {
        return this.f45418d;
    }

    public final com.waze.ui.ac.i c() {
        return this.f45420f;
    }

    public final String d() {
        return this.f45422h;
    }

    public final String e() {
        return this.f45421g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.g.b.x.n(this.f45415a, eVar.f45415a) && h.g.b.x.n(this.f45416b, eVar.f45416b) && h.g.b.x.n(this.f45417c, eVar.f45417c) && h.g.b.x.n(this.f45418d, eVar.f45418d) && h.g.b.x.n(this.f45419e, eVar.f45419e) && h.g.b.x.n(this.f45420f, eVar.f45420f) && h.g.b.x.n(this.f45421g, eVar.f45421g) && h.g.b.x.n(this.f45422h, eVar.f45422h);
    }

    @Override // com.waze.w.i
    public final String f() {
        return this.f45415a;
    }

    @Override // com.waze.w.i
    public final String g() {
        return this.f45419e;
    }

    @Override // com.waze.w.i
    public final String h() {
        return this.f45417c;
    }

    public final int hashCode() {
        int iHashCode = this.f45415a.hashCode() * 31;
        com.waze.j.n nVar = this.f45416b;
        int iHashCode2 = (((((((((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.f45417c.hashCode()) * 31) + this.f45418d.hashCode()) * 31) + this.f45419e.hashCode()) * 31) + this.f45420f.hashCode()) * 31;
        String str = this.f45421g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f45422h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CategoryItem(id=" + this.f45415a + ", serverProvidedDistance=" + this.f45416b + ", title=" + this.f45417c + ", wazeAddress=" + this.f45418d + ", subtitle=" + this.f45419e + ", image=" + this.f45420f + ", categoryId=" + this.f45421g + ", categoryGroupId=" + this.f45422h + ")";
    }
}
