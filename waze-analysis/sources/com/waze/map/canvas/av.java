package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class av extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28562a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f28563b;

    av(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        av avVar = new av((h.c.e) obj3);
        avVar.f28562a = (com.waze.map.b.ag) obj;
        avVar.f28563b = zBooleanValue;
        return avVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return this.f28563b ? com.waze.map.b.ag.f27996a : (com.waze.map.b.ag) this.f28562a;
    }
}
