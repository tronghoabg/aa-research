package com.waze.car_lib.j;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20277a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f20278b;

    u(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        u uVar = new u((h.c.e) obj3);
        uVar.f20277a = (s) obj;
        uVar.f20278b = zBooleanValue;
        return uVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((s) this.f20277a, Boolean.valueOf(this.f20278b));
    }
}
