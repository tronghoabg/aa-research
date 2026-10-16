package com.waze.app_nav.hub.c;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15306a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ long f15307b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f15308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(p pVar, h.c.e eVar) {
        super(2, eVar);
        this.f15308c = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        j jVar = new j(this.f15308c, eVar);
        jVar.f15307b = ((Number) obj).longValue();
        return jVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create(Long.valueOf(((Number) obj).longValue()), (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f15306a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            long j2 = this.f15307b;
            p pVar = this.f15308c;
            pVar.f15324b.a("handling presenters, insertionId=" + j2);
            this.f15306a = 1;
            if (p.d(pVar, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
