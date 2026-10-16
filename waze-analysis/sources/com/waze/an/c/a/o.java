package com.waze.an.c.a;

import com.waze.an.c.ai;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14712a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f14713b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f14714c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f14715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, h.c.e eVar) {
        super(4, eVar);
        this.f14715d = pVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        o oVar = new o(this.f14715d, (h.c.e) obj4);
        oVar.f14712a = (com.waze.an.a.n) obj;
        oVar.f14713b = zBooleanValue;
        oVar.f14714c = zBooleanValue2;
        return oVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.an.a.n nVar = (com.waze.an.a.n) this.f14712a;
        boolean z = this.f14713b;
        boolean z2 = this.f14714c;
        p pVar = this.f14715d;
        ai aiVarP = pVar.p(nVar, pVar.f14721f, z, z2);
        pVar.f14721f = aiVarP;
        return aiVarP;
    }
}
