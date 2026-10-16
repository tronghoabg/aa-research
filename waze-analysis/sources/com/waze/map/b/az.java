package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class az extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28040a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28041b;

    az(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        az azVar = new az((h.c.e) obj3);
        azVar.f28040a = (ag) obj;
        azVar.f28041b = (com.waze.map.canvas.bl) obj2;
        return azVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ag agVar = (ag) this.f28040a;
        com.waze.map.canvas.bl blVar = (com.waze.map.canvas.bl) this.f28041b;
        return new ah(agVar, blVar.a(), blVar.b());
    }
}
