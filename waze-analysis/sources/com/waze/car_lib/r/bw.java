package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bw extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f21095a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f21096b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f21097c;

    bw(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        bw bwVar = new bw((h.c.e) obj4);
        bwVar.f21095a = zBooleanValue;
        bwVar.f21096b = zBooleanValue2;
        bwVar.f21097c = (com.waze.navigate.ec) obj3;
        return bwVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f21095a;
        boolean z2 = this.f21096b;
        return new h.p(Boolean.valueOf(z), Boolean.valueOf(z2), (com.waze.navigate.ec) this.f21097c);
    }
}
