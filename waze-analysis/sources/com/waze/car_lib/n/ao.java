package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class ao implements kotlinx.coroutines.b.l, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f20371a;

    ao(ar arVar) {
        this.f20371a = arVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        ar.n(this.f20371a, (String) obj);
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
        return new h.g.b.a(2, this.f20371a, ar.class, "autoComplete", "autoComplete(Ljava/lang/String;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
