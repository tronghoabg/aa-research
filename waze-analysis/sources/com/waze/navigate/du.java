package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class du extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31262a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NavigationInfoNativeManager f31263b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f31264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    du(NavigationInfoNativeManager navigationInfoNativeManager, h.c.e eVar) {
        super(2, eVar);
        this.f31263b = navigationInfoNativeManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        du duVar = new du(this.f31263b, eVar);
        duVar.f31264c = obj;
        return duVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((du) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f31262a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f31264c;
            dt dtVar = new dt(adVar);
            com.waze.copilot.data.b.k.g(adVar, false);
            NavigationInfoNativeManager navigationInfoNativeManager = this.f31263b;
            navigationInfoNativeManager.addNavigationUpdateListener(dtVar);
            this.f31262a = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new com.waze.car_lib.i.b.d(navigationInfoNativeManager, dtVar, 2), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
