package com.waze.an.c;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f14825a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.a.c f14826b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f14827c;

    /* renamed from: d, reason: collision with root package name */
    private final ad f14828d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.design_components.b.d f14829e;

    public y(String str, com.waze.an.a.c cVar, h.g.a.a aVar, ad adVar, com.waze.design_components.b.d dVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(cVar, "buttonType");
        h.g.b.x.f(aVar, "onPerform");
        this.f14825a = str;
        this.f14826b = cVar;
        this.f14827c = aVar;
        this.f14828d = adVar;
        this.f14829e = dVar;
    }

    public final com.waze.design_components.b.d a() {
        return this.f14829e;
    }

    public final com.waze.an.a.c b() {
        return this.f14826b;
    }

    public final ad c() {
        return this.f14828d;
    }

    public final String d() {
        return this.f14825a;
    }

    public final h.g.a.a e() {
        return this.f14827c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f14825a, yVar.f14825a) && h.g.b.x.n(this.f14826b, yVar.f14826b) && h.g.b.x.n(this.f14827c, yVar.f14827c) && h.g.b.x.n(this.f14828d, yVar.f14828d) && this.f14829e == yVar.f14829e;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14825a.hashCode() * 31) + this.f14826b.hashCode()) * 31) + this.f14827c.hashCode();
        ad adVar = this.f14828d;
        int iHashCode2 = ((iHashCode * 31) + (adVar == null ? 0 : adVar.hashCode())) * 31;
        com.waze.design_components.b.d dVar = this.f14829e;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActionData(title=" + this.f14825a + ", buttonType=" + this.f14826b + ", onPerform=" + this.f14827c + ", timer=" + this.f14828d + ", icon=" + this.f14829e + ")";
    }
}
