package com.waze.an.a.a;

import com.waze.asks.WazeAsksNativeManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bm implements com.waze.an.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final WazeAsksNativeManager f14459a;

    /* renamed from: b, reason: collision with root package name */
    private final y f14460b;

    /* renamed from: c, reason: collision with root package name */
    private final ac f14461c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14462d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f14463e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f14464f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14465g;

    public bm(WazeAsksNativeManager wazeAsksNativeManager, y yVar, ac acVar, h.c.j jVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(wazeAsksNativeManager, "nativeManager");
        h.g.b.x.f(yVar, "insightFeedbackConverter");
        h.g.b.x.f(acVar, "multiAskConverter");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(eVar, "logger");
        this.f14459a = wazeAsksNativeManager;
        this.f14460b = yVar;
        this.f14461c = acVar;
        this.f14462d = eVar;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(jVar.plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("WazeAsksInsightSource")));
        this.f14463e = afVarE;
        bn bnVarB = ck.b(h.a.i.h());
        this.f14464f = bnVarB;
        this.f14465g = kotlinx.coroutines.b.ai.U(bnVarB);
        kotlinx.coroutines.aj.z(afVarE, null, null, new bl(this, (h.c.e) null, 0), 3);
    }

    public static final /* synthetic */ void e(bm bmVar, com.waze.an.a.l lVar) {
        bn bnVar;
        Object objD;
        com.waze.an.a.u uVarM = lVar.m();
        Objects.toString(uVarM);
        bmVar.f14462d.a("adding insight id=".concat(String.valueOf(uVarM)));
        do {
            bnVar = bmVar.f14464f;
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.i.ag((List) objD, lVar)));
    }

    public static final /* synthetic */ void f(bm bmVar, com.waze.an.a.u uVar) {
        bn bnVar;
        Object objD;
        ArrayList arrayList;
        Objects.toString(uVar);
        bmVar.f14462d.a("removing insight id=".concat(String.valueOf(uVar)));
        do {
            bnVar = bmVar.f14464f;
            objD = bnVar.d();
            arrayList = new ArrayList();
            for (Object obj : (List) objD) {
                if (!h.g.b.x.n(((com.waze.an.a.l) obj).m(), uVar)) {
                    arrayList.add(obj);
                }
            }
        } while (!bnVar.f(objD, arrayList));
    }

    @Override // com.waze.an.a.ad
    public final kotlinx.coroutines.b.k a() {
        return this.f14465g;
    }

    @Override // com.waze.an.a.ad
    public final void close() {
        kotlinx.coroutines.aj.h(this.f14463e, null);
    }
}
