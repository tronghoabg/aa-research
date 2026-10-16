package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39403a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39404b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f39405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ah ahVar, h.c.e eVar) {
        super(3, eVar);
        this.f39405c = ahVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ac acVar = new ac(this.f39405c, (h.c.e) obj3);
        acVar.f39403a = (com.waze.cf) obj;
        acVar.f39404b = (com.waze.h.b.a) obj2;
        return acVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.cf cfVar = (com.waze.cf) this.f39403a;
        com.waze.h.b.a aVar2 = (com.waze.h.b.a) this.f39404b;
        ah ahVar = this.f39405c;
        ahVar.f39418a.a("recordingSourceFlow: connectionState=" + cfVar + ", carRecorderFactory=" + aVar2);
        return (aVar2 == null || !com.waze.cs.g(cfVar)) ? new ab(aa.f39398a, ahVar.f39420c) : new ab(aa.f39399b, aVar2);
    }
}
