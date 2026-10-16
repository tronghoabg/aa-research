package com.waze.closure.c;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22458a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f22459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f22459b = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f22459b, eVar);
        cVar.f22458a = obj;
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((d) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        i.e(this.f22459b, (d) this.f22458a);
        return ab.f48028a;
    }
}
