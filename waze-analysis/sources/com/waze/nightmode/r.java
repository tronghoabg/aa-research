package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32490a;

    r(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        r rVar = new r((h.c.e) obj3);
        rVar.f32490a = (NightModeDaylightTime) obj;
        return rVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((NightModeDaylightTime) this.f32490a).isDaytime(System.currentTimeMillis()));
    }
}
