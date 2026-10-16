package com.waze.car_lib.j;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ah extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f20184a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f20185b;

    ah(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ah ahVar = new ah((h.c.e) obj3);
        ahVar.f20184a = zBooleanValue;
        ahVar.f20185b = zBooleanValue2;
        return ahVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k(Boolean.valueOf(this.f20184a), Boolean.valueOf(this.f20185b));
    }
}
