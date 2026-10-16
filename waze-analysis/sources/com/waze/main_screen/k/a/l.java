package com.waze.main_screen.k.a;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26537a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f26538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(u uVar, h.c.e eVar) {
        super(2, eVar);
        this.f26538b = uVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        l lVar = new l(this.f26538b, eVar);
        lVar.f26537a = obj;
        return lVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        a aVar2 = (a) this.f26537a;
        com.waze.shared_infra.i.e eVar = this.f26538b.f26568b;
        com.waze.an.c.k kVarB = aVar2.b();
        com.waze.location.q qVarH = kVarB != null ? kVarB.h() : null;
        eVar.a("state updated: point=" + qVarH + ", segment=" + aVar2.d());
        return ab.f48028a;
    }
}
