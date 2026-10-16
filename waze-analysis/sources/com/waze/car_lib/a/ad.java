package com.waze.car_lib.a;

import com.waze.navigate.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18816a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18817b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f18818c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ae f18819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(ae aeVar, h.c.e eVar) {
        super(4, eVar);
        this.f18819d = aeVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ad adVar = new ad(this.f18819d, (h.c.e) obj4);
        adVar.f18816a = (ab) obj;
        adVar.f18817b = (com.waze.shared_infra.h.c) obj2;
        adVar.f18818c = (ei) obj3;
        return adVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        x xVar;
        int iOrdinal;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ab abVar = (ab) this.f18816a;
        com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) this.f18817b;
        ei eiVar = (ei) this.f18818c;
        com.waze.ads.a.f fVarA = abVar.a();
        if (abVar.d() || fVarA == null) {
            return aa.f18807a;
        }
        String strL = fVarA.l();
        if (strL == null) {
            strL = "";
        }
        String str = strL;
        String strI = fVarA.i();
        com.waze.ui.ac.g gVar = strI != null ? new com.waze.ui.ac.g(strI) : null;
        com.waze.ads.a.e eVarA = fVarA.a();
        if (eVarA == null || (iOrdinal = eVarA.ordinal()) == 0) {
            xVar = null;
        } else if (iOrdinal == 1) {
            xVar = x.f18857a;
        } else if (iOrdinal == 2) {
            xVar = y.f18858a;
        } else if (iOrdinal == 3) {
            xVar = v.f18855a;
        } else {
            if (iOrdinal != 4) {
                throw new h.i();
            }
            xVar = w.f18856a;
        }
        Float fC = fVarA.c();
        if (fC == null || fC.floatValue() == 0.0f) {
            fC = null;
        }
        return new z(str, gVar, xVar, fC, abVar.c(), fVarA.d(), fVarA.b(), cVar != null, eiVar == ei.f31311b);
    }
}
