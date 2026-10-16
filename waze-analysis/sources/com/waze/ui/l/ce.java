package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ce extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ float f42669a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f42670b;

    ce(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj).floatValue();
        ce ceVar = new ce((h.c.e) obj3);
        ceVar.f42669a = fFloatValue;
        ceVar.f42670b = (aj) obj2;
        return ceVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        float f2 = this.f42669a;
        return new h.k(new Float(f2), (aj) this.f42670b);
    }
}
