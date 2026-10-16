package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class dg extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f28750a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28751b;

    dg(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        dg dgVar = new dg((h.c.e) obj3);
        dgVar.f28750a = zBooleanValue;
        dgVar.f28751b = (dd) obj2;
        return dgVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new dc((dd) this.f28751b, this.f28750a);
    }
}
