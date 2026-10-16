package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dk extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39783a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39784b;

    dk(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        dk dkVar = new dk((h.c.e) obj4);
        dkVar.f39783a = (Integer) obj;
        dkVar.f39784b = (Integer) obj2;
        return dkVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((Integer) this.f39783a, (Integer) this.f39784b);
    }
}
