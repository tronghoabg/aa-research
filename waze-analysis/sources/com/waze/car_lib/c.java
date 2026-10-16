package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f19213a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f19214b;

    c(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        c cVar = new c((h.c.e) obj3);
        cVar.f19213a = zBooleanValue;
        cVar.f19214b = zBooleanValue2;
        return cVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f19213a;
        boolean z2 = this.f19214b;
        boolean z3 = false;
        if (z && z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
