package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dq extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f23577a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f23578b;

    dq(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        dq dqVar = new dq((h.c.e) obj3);
        dqVar.f23577a = (com.waze.z.a.b.n) obj;
        dqVar.f23578b = zBooleanValue;
        return dqVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((com.waze.z.a.b.n) this.f23577a, Boolean.valueOf(this.f23578b));
    }
}
