package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class lp extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25453a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f25454b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f25455c;

    lp(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        lp lpVar = new lp((h.c.e) obj4);
        lpVar.f25453a = (com.waze.navigate.ei) obj;
        lpVar.f25454b = zBooleanValue;
        lpVar.f25455c = zBooleanValue2;
        return lpVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return (this.f25455c || ((com.waze.navigate.ei) this.f25453a) == com.waze.navigate.ei.f31311b || this.f25454b) ? x.f45518a : w.f45408a;
    }
}
