package com.waze.w;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f45423a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45424b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45425c;

    /* renamed from: d, reason: collision with root package name */
    private final String f45426d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.j.n f45427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.waze.av.a.p pVar, String str, String str2, String str3, com.waze.j.n nVar) {
        super(null);
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(str, "subtitle");
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str3, TtmlNode.ATTR_ID);
        this.f45423a = pVar;
        this.f45424b = str;
        this.f45425c = str2;
        this.f45426d = str3;
        this.f45427e = nVar;
    }

    @Override // com.waze.w.i
    public final com.waze.j.n a() {
        return this.f45427e;
    }

    @Override // com.waze.w.i
    public final com.waze.av.a.p b() {
        return this.f45423a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.g.b.x.n(this.f45423a, fVar.f45423a) && h.g.b.x.n(this.f45424b, fVar.f45424b) && h.g.b.x.n(this.f45425c, fVar.f45425c) && h.g.b.x.n(this.f45426d, fVar.f45426d) && h.g.b.x.n(this.f45427e, fVar.f45427e);
    }

    @Override // com.waze.w.i
    public final String f() {
        return this.f45426d;
    }

    @Override // com.waze.w.i
    public final String g() {
        return this.f45424b;
    }

    @Override // com.waze.w.i
    public final String h() {
        return this.f45425c;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f45423a.hashCode() * 31) + this.f45424b.hashCode()) * 31) + this.f45425c.hashCode()) * 31) + this.f45426d.hashCode();
        com.waze.j.n nVar = this.f45427e;
        return (iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "Contact(wazeAddress=" + this.f45423a + ", subtitle=" + this.f45424b + ", title=" + this.f45425c + ", id=" + this.f45426d + ", serverProvidedDistance=" + this.f45427e + ")";
    }
}
