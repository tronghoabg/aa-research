package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18406a;

    z(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        z zVar = new z(eVar);
        zVar.f18406a = obj;
        return zVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((com.waze.shared_infra.h.c) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((com.waze.shared_infra.h.c) this.f18406a) == null);
    }
}
