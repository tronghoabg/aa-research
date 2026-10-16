package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38193a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38194b;

    ak(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ak akVar = new ak((h.c.e) obj3);
        akVar.f38193a = (Integer) obj;
        akVar.f38194b = (String) obj2;
        return akVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((Integer) this.f38193a, (String) this.f38194b);
    }
}
