package com.waze.car_lib.login;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f20309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f20310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(m mVar, h.c.e eVar) {
        super(2, eVar);
        this.f20310b = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        k kVar = new k(this.f20310b, eVar);
        kVar.f20309a = ((Boolean) obj).booleanValue();
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
        if (this.f20309a) {
            this.f20310b.g();
        }
        return ab.f48028a;
    }
}
