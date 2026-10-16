package com.waze.car_lib.r.a;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f20901a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f20902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(p pVar, h.c.e eVar) {
        super(2, eVar);
        this.f20902b = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        k kVar = new k(this.f20902b, eVar);
        kVar.f20901a = ((Boolean) obj).booleanValue();
        return kVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((k) create(bool, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        p.i(this.f20902b, this.f20901a);
        return ab.f48028a;
    }
}
