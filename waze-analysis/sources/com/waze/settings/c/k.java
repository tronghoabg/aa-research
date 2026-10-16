package com.waze.settings.c;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f36945a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f36945a = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f36945a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((com.waze.ev.m) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        l lVar = this.f36945a;
        lVar.B(n.a(lVar.f36946a, lVar.f36947b, lVar.f36948c));
        return ab.f48028a;
    }
}
