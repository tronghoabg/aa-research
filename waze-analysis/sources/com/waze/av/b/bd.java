package com.waze.av.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class bd implements kotlinx.coroutines.b.l, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ be f15932a;

    bd(be beVar) {
        this.f15932a = beVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        this.f15932a.f15938f.a("allPlaces: ".concat(h.a.i.aM((List) obj, "\n", null, null, 0, new com.waze.main_screen.ag.a(19), 30)));
        h.ab abVar = h.ab.f48028a;
        h.c.a.a aVar = h.c.a.a.f48038a;
        return abVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kotlinx.coroutines.b.l) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new h.g.b.a(2, this.f15932a, be.class, "logChanges", "logChanges(Ljava/util/List;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
