package com.waze.perf;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33058a;

    l(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        l lVar = new l(eVar);
        lVar.f33058a = obj;
        return lVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((com.waze.sharedui.e.c) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.sharedui.e.c cVar = (com.waze.sharedui.e.c) this.f33058a;
        boolean z = false;
        if (!cVar.f().g() && cVar.h() == com.waze.sharedui.e.d.f38878b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
