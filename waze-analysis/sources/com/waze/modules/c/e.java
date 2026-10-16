package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e extends com.waze.ae.e {

    /* renamed from: a, reason: collision with root package name */
    private final d f30131a;

    /* renamed from: b, reason: collision with root package name */
    private final List f30132b;

    /* renamed from: c, reason: collision with root package name */
    private final List f30133c;

    /* renamed from: d, reason: collision with root package name */
    private final List f30134d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ae.e f30135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, com.waze.ae.e eVar, List list, List list2, List list3) {
        super(null);
        h.g.b.x.f(dVar, "impact");
        h.g.b.x.f(eVar, "impactType");
        h.g.b.x.f(list, "closurePolylines");
        h.g.b.x.f(list2, "closurePins");
        h.g.b.x.f(list3, "turnClosurePins");
        this.f30131a = dVar;
        this.f30135e = eVar;
        this.f30132b = list;
        this.f30133c = list2;
        this.f30134d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f30131a == eVar.f30131a && h.g.b.x.n(this.f30135e, eVar.f30135e) && h.g.b.x.n(this.f30132b, eVar.f30132b) && h.g.b.x.n(this.f30133c, eVar.f30133c) && h.g.b.x.n(this.f30134d, eVar.f30134d);
    }

    @Override // com.waze.ae.e
    public final d f() {
        return this.f30131a;
    }

    @Override // com.waze.ae.e
    public final com.waze.ae.e h() {
        return this.f30135e;
    }

    public final int hashCode() {
        return (((((((this.f30131a.hashCode() * 31) + this.f30135e.hashCode()) * 31) + this.f30132b.hashCode()) * 31) + this.f30133c.hashCode()) * 31) + this.f30134d.hashCode();
    }

    public final List i() {
        return this.f30133c;
    }

    public final List j() {
        return this.f30132b;
    }

    public final List k() {
        return this.f30134d;
    }

    public final String toString() {
        return "Legacy(impact=" + this.f30131a + ", impactType=" + this.f30135e + ", closurePolylines=" + this.f30132b + ", closurePins=" + this.f30133c + ", turnClosurePins=" + this.f30134d + ")";
    }
}
