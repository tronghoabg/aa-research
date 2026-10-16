package com.waze.app_nav.hub;

import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final ag f15348a;

    /* renamed from: b, reason: collision with root package name */
    private m f15349b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f15350c;

    public /* synthetic */ j() {
        int i2 = ag.f15247a;
        this.f15348a = com.waze.c.c.e.j();
        this.f15349b = m.f15353a;
        this.f15350c = ck.b(false);
    }

    public abstract e b();

    public abstract String c();

    public final m d() {
        return this.f15349b;
    }

    public final ag e() {
        return this.f15348a;
    }

    public boolean equals(Object obj) {
        j jVar = obj instanceof j ? (j) obj : null;
        return h.g.b.x.n(jVar != null ? jVar.f15348a : null, this.f15348a);
    }

    public final bn f() {
        return this.f15350c;
    }

    public final void g(m mVar) {
        h.g.b.x.f(mVar, "<set-?>");
        this.f15349b = mVar;
    }

    public int hashCode() {
        return this.f15348a.hashCode();
    }

    public String toString() {
        return "WazeActivityEntry(entryId=" + this.f15348a + ", name=" + c() + ")";
    }
}
