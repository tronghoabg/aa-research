package com.waze.network.h;

import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f32392a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f32393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f32392a = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f32392a, eVar);
        dVar.f32393b = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        af afVar = (af) this.f32393b;
        for (int i2 = 0; i2 <= 0; i2++) {
            e eVar = this.f32392a;
            ai.m(ai.K(ai.M(eVar.f32395b), new c(eVar, null)), afVar);
        }
        return ab.f48028a;
    }
}
