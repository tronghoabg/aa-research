package com.waze.ui.m;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad extends ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f42774a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42775b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42776c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42777d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.l f42778e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f42779f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f42780g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.a f42781h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(com.waze.ui.ac.n nVar, String str, boolean z, boolean z2, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        super(null);
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str, "favoriteName");
        h.g.b.x.f(lVar, "onDone");
        h.g.b.x.f(aVar, "onCancelled");
        h.g.b.x.f(aVar2, "setHome");
        h.g.b.x.f(aVar3, "setWork");
        this.f42774a = nVar;
        this.f42775b = str;
        this.f42776c = z;
        this.f42777d = z2;
        this.f42778e = lVar;
        this.f42779f = aVar;
        this.f42780g = aVar2;
        this.f42781h = aVar3;
    }

    public final com.waze.ui.ac.n a() {
        return this.f42774a;
    }

    public final String b() {
        return this.f42775b;
    }

    public final h.g.a.a c() {
        return this.f42779f;
    }

    public final h.g.a.a d() {
        return this.f42780g;
    }

    public final h.g.a.a e() {
        return this.f42781h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return h.g.b.x.n(this.f42774a, adVar.f42774a) && h.g.b.x.n(this.f42775b, adVar.f42775b) && this.f42776c == adVar.f42776c && this.f42777d == adVar.f42777d && h.g.b.x.n(this.f42778e, adVar.f42778e) && h.g.b.x.n(this.f42779f, adVar.f42779f) && h.g.b.x.n(this.f42780g, adVar.f42780g) && h.g.b.x.n(this.f42781h, adVar.f42781h);
    }

    public final h.g.a.l f() {
        return this.f42778e;
    }

    public final boolean g() {
        return this.f42776c;
    }

    public final boolean h() {
        return this.f42777d;
    }

    public final int hashCode() {
        int iHashCode = (this.f42774a.hashCode() * 31) + this.f42775b.hashCode();
        h.g.a.l lVar = this.f42778e;
        return (((((((((((iHashCode * 31) + a.a.a(this.f42776c)) * 31) + a.a.a(this.f42777d)) * 31) + lVar.hashCode()) * 31) + this.f42779f.hashCode()) * 31) + this.f42780g.hashCode()) * 31) + this.f42781h.hashCode();
    }

    public final String toString() {
        return "NameFavoriteDialog(title=" + this.f42774a + ", favoriteName=" + this.f42775b + ", displayHome=" + this.f42776c + ", displayWork=" + this.f42777d + ", onDone=" + this.f42778e + ", onCancelled=" + this.f42779f + ", setHome=" + this.f42780g + ", setWork=" + this.f42781h + ")";
    }
}
