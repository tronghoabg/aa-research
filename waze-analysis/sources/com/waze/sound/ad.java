package com.waze.sound;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f39406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f39407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.h.b.e f39408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ah ahVar, ab abVar, com.waze.h.b.e eVar, h.c.e eVar2) {
        super(3, eVar2);
        this.f39406a = ahVar;
        this.f39407b = abVar;
        this.f39408c = eVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new ad(this.f39406a, this.f39407b, this.f39408c, (h.c.e) obj3).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.shared_infra.i.e eVar = this.f39406a.f39418a;
        aa aaVarB = this.f39407b.b();
        Objects.toString(aaVarB);
        eVar.a("close recorder ".concat(String.valueOf(aaVarB)));
        this.f39408c.close();
        return h.ab.f48028a;
    }
}
