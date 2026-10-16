package com.waze.car_lib.r.d;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f21322a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f21323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(x xVar, h.c.e eVar) {
        super(2, eVar);
        this.f21322a = xVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        s sVar = new s(this.f21322a, eVar);
        sVar.f21323b = obj;
        return sVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        af afVar = (af) this.f21323b;
        x xVar = this.f21322a;
        xVar.f21344h.f(afVar, ai.F(new r(xVar.f21343g.e(), 1), new r(xVar.v, 0), new n(null)), new com.waze.c.e.a.a(xVar, 10));
        return ab.f48028a;
    }
}
