package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f41836a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f41837b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f41838c;

    ak(h.g.a.l lVar, y yVar, h.g.a.l lVar2) {
        this.f41836a = lVar;
        this.f41837b = yVar;
        this.f41838c = lVar2;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        com.waze.z.a.ad adVar = (com.waze.z.a.ad) obj;
        h.g.b.x.f(adVar, "swipeAction");
        if (h.g.b.x.n(adVar, aq.f41857a)) {
            this.f41836a.invoke(new k(this.f41837b));
        } else if (h.g.b.x.n(adVar, ar.f41861a)) {
            this.f41836a.invoke(new m(this.f41837b));
        } else if (h.g.b.x.n(adVar, as.f41865a)) {
            this.f41838c.invoke(this.f41837b);
        }
        return h.ab.f48028a;
    }
}
