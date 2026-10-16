package com.waze.ui.l;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements ad, y, m {

    /* renamed from: a, reason: collision with root package name */
    private final String f42739a;

    /* renamed from: b, reason: collision with root package name */
    private final w f42740b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f42741c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f42742d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f42743e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f42744f;

    public /* synthetic */ z(String str, w wVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, boolean z, int i2) {
        aVar2 = (i2 & 8) != 0 ? new com.waze.ui.a.b(8) : aVar2;
        aVar3 = (i2 & 16) != 0 ? new com.waze.ui.a.b(9) : aVar3;
        aVar = (i2 & 4) != 0 ? null : aVar;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(aVar2, "onMapTap");
        h.g.b.x.f(aVar3, "onBackPressed");
        this.f42739a = str;
        this.f42740b = wVar;
        this.f42741c = aVar;
        this.f42742d = aVar2;
        this.f42743e = aVar3;
        this.f42744f = z;
    }

    @Override // com.waze.ui.l.m
    public final h.g.a.a a() {
        return this.f42743e;
    }

    public final w b() {
        return this.f42740b;
    }

    public final String c() {
        return this.f42739a;
    }

    @Override // com.waze.ui.l.y
    public final h.g.a.a d() {
        return this.f42742d;
    }

    @Override // com.waze.ui.l.ad
    public final boolean e() {
        return this.f42744f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return h.g.b.x.n(this.f42739a, zVar.f42739a) && h.g.b.x.n(this.f42740b, zVar.f42740b) && h.g.b.x.n(this.f42741c, zVar.f42741c) && h.g.b.x.n(this.f42742d, zVar.f42742d) && h.g.b.x.n(this.f42743e, zVar.f42743e) && this.f42744f == zVar.f42744f;
    }

    public final h.g.a.a f() {
        return this.f42741c;
    }

    public final int hashCode() {
        int iHashCode = (this.f42739a.hashCode() * 31) + this.f42740b.hashCode();
        h.g.a.a aVar = this.f42741c;
        return (((((((iHashCode * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f42742d.hashCode()) * 31) + this.f42743e.hashCode()) * 31) + a.a.a(this.f42744f);
    }

    public final String toString() {
        return "Mini(title=" + this.f42739a + ", icon=" + this.f42740b + ", onClick=" + this.f42741c + ", onMapTap=" + this.f42742d + ", onBackPressed=" + this.f42743e + ", visible=" + this.f42744f + ")";
    }
}
