package com.waze.an.b;

import com.waze.an.a.r;
import h.ab;
import h.g.a.p;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14652a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f14653b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f14654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(aq aqVar, o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f14653b = aqVar;
        this.f14654c = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        m mVar = new m(this.f14653b, this.f14654c, eVar);
        mVar.f14652a = obj;
        return mVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((f) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        f fVar = (f) this.f14652a;
        this.f14653b.f48105a = fVar;
        o oVar = this.f14654c;
        com.waze.shared_infra.i.e eVar = oVar.f14658c;
        r rVarB = fVar.b();
        String strK = rVarB != null ? oVar.k(rVarB) : null;
        com.waze.an.a.p pVarA = fVar.a();
        eVar.a("New selected Insights: (" + strK + "," + (pVarA != null ? oVar.k(pVarA) : null) + ")");
        return ab.f48028a;
    }
}
