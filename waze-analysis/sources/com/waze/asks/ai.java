package com.waze.asks;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f15498a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f15499b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f15500c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ i f15501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(aj ajVar, h.g.a.l lVar, String str, i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f15498a = ajVar;
        this.f15499b = lVar;
        this.f15500c = str;
        this.f15501d = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ai(this.f15498a, this.f15499b, this.f15500c, this.f15501d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        com.waze.ap.a.a.aj ajVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        aj ajVar2 = this.f15498a;
        ajVar2.f15503b.a("requesting getQuestionByTrigger");
        String str = this.f15500c;
        i iVar = this.f15501d;
        try {
            com.waze.ap.b.n nVar = ajVar2.f15502a;
            com.waze.ap.b.i iVarNewBuilder = com.waze.ap.b.j.newBuilder();
            com.waze.ap.a.a.ak akVarNewBuilder = com.waze.ap.a.a.am.newBuilder();
            com.waze.ap.a.a.ae aeVarNewBuilder = com.waze.ap.a.a.af.newBuilder();
            aeVarNewBuilder.a(str);
            int iOrdinal = iVar.ordinal();
            if (iOrdinal == 0) {
                ajVar = com.waze.ap.a.a.aj.QUESTIONABLE_INSIGHT_TYPE_HAZARD_DEFAULT;
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                ajVar = com.waze.ap.a.a.aj.QUESTIONABLE_INSIGHT_TYPE_HAZARD_CONSTRUCTION;
            }
            aeVarNewBuilder.b(ajVar);
            akVarNewBuilder.a(aeVarNewBuilder.build());
            iVarNewBuilder.a(akVarNewBuilder.build());
            objA = (com.waze.ap.b.l) e.a.h.s.c(nVar.getChannel(), com.waze.ap.b.o.d(), nVar.getCallOptions(), iVarNewBuilder.build());
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        aj ajVar3 = this.f15498a;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            com.waze.shared_infra.i.e eVar = ajVar3.f15503b;
            Objects.toString(thC);
            eVar.b("getQuestionByTrigger: failed to get question: ".concat(thC.toString()));
        }
        if (h.m.e(objA)) {
            ajVar3.f15503b.a("getQuestionByTrigger: successfully got question");
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        this.f15499b.invoke((com.waze.ap.b.l) objA);
        return h.ab.f48028a;
    }
}
