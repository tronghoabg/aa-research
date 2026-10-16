package com.waze.bi;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16815a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f16816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(g gVar, h.c.e eVar) {
        super(2, eVar);
        this.f16816b = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f16816b, eVar);
        hVar.f16815a = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((f) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        f fVar = (f) this.f16815a;
        boolean zC = fVar.c();
        g gVar = this.f16816b;
        if (zC) {
            gVar.d(fVar.b().name(), fVar.a());
        } else {
            gVar.b(fVar.b().name());
        }
        return ab.f48028a;
    }
}
