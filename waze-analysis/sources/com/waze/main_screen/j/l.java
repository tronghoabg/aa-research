package com.waze.main_screen.j;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f26488a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, h.c.e eVar) {
        super(2, eVar);
        this.f26488a = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f26488a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        m mVar = this.f26488a;
        aj.z(mVar.f26492d, null, null, new k(mVar, null), 3);
        return ab.f48028a;
    }
}
