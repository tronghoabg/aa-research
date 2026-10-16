package com.waze.c.e.a;

import com.waze.c.d.ai;
import com.waze.c.d.aj;
import com.waze.map.b.dk;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f18440a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(t tVar, h.c.e eVar) {
        super(2, eVar);
        this.f18440a = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f18440a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((dk) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f18440a.f18476g.a(ai.f18297h, aj.f18302a);
        return ab.f48028a;
    }
}
