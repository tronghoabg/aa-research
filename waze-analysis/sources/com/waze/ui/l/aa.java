package com.waze.ui.l;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa implements ad, y, m {

    /* renamed from: a, reason: collision with root package name */
    private final String f42464a;

    /* renamed from: b, reason: collision with root package name */
    private final w f42465b;

    /* renamed from: c, reason: collision with root package name */
    private final n f42466c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42467d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f42468e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f42469f;

    public aa(String str, w wVar, n nVar, boolean z, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(aVar, "onMapTap");
        h.g.b.x.f(aVar2, "onBackPressed");
        this.f42464a = str;
        this.f42465b = wVar;
        this.f42466c = nVar;
        this.f42467d = z;
        this.f42468e = aVar;
        this.f42469f = aVar2;
    }

    @Override // com.waze.ui.l.m
    public final h.g.a.a a() {
        return this.f42469f;
    }

    public final n b() {
        return this.f42466c;
    }

    public final w c() {
        return this.f42465b;
    }

    @Override // com.waze.ui.l.y
    public final h.g.a.a d() {
        return this.f42468e;
    }

    @Override // com.waze.ui.l.ad
    public final boolean e() {
        return this.f42467d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return h.g.b.x.n(this.f42464a, aaVar.f42464a) && h.g.b.x.n(this.f42465b, aaVar.f42465b) && h.g.b.x.n(this.f42466c, aaVar.f42466c) && this.f42467d == aaVar.f42467d && h.g.b.x.n(this.f42468e, aaVar.f42468e) && h.g.b.x.n(this.f42469f, aaVar.f42469f);
    }

    public final String f() {
        return this.f42464a;
    }

    public final int hashCode() {
        int iHashCode = this.f42464a.hashCode() * 31;
        w wVar = this.f42465b;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        n nVar = this.f42466c;
        return ((((((iHashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31) + a.a.a(this.f42467d)) * 31) + this.f42468e.hashCode()) * 31) + this.f42469f.hashCode();
    }

    public final String toString() {
        return "MiniFull(title=" + this.f42464a + ", icon=" + this.f42465b + ", closeBehavior=" + this.f42466c + ", visible=" + this.f42467d + ", onMapTap=" + this.f42468e + ", onBackPressed=" + this.f42469f + ")";
    }
}
