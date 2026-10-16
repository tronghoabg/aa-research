package com.waze.main_screen.k.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.c.k f26504a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.c.a.p f26505b;

    public a(com.waze.an.c.k kVar, com.waze.an.c.a.p pVar) {
        this.f26504a = kVar;
        this.f26505b = pVar;
    }

    public final com.waze.an.c.k a() {
        return this.f26504a;
    }

    public final com.waze.an.c.k b() {
        return this.f26504a;
    }

    public final com.waze.an.c.a.p c() {
        return this.f26505b;
    }

    public final com.waze.an.c.a.p d() {
        return this.f26505b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f26504a, aVar.f26504a) && x.n(this.f26505b, aVar.f26505b);
    }

    public final int hashCode() {
        com.waze.an.c.k kVar = this.f26504a;
        int iHashCode = kVar == null ? 0 : kVar.hashCode();
        com.waze.an.c.a.p pVar = this.f26505b;
        return (iHashCode * 31) + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "SelectedStateHolders(insightStateHolder=" + this.f26504a + ", segmentInsightStateHolder=" + this.f26505b + ")";
    }
}
