package com.waze.car_lib.i.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20032a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20033b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f20034c;

    v(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        v vVar = new v((h.c.e) obj4);
        vVar.f20032a = (com.waze.bk.a.a) obj;
        vVar.f20033b = (com.waze.map.canvas.m) obj2;
        vVar.f20034c = zBooleanValue;
        return vVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.bk.a.a aVar2 = (com.waze.bk.a.a) this.f20032a;
        com.waze.map.canvas.m mVar = (com.waze.map.canvas.m) this.f20033b;
        boolean z = false;
        if (this.f20034c && aVar2.c()) {
            z = true;
        }
        boolean zD = aVar2.d();
        if (true != aVar2.b()) {
            mVar = null;
        }
        return new com.waze.bk.a.c(z, zD, mVar);
    }
}
