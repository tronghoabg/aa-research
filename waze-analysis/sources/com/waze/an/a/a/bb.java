package com.waze.an.a.a;

import com.waze.AlerterController$Alerter$Type;
import com.waze.insights_infra.InsightsInfraNativeManager;
import com.waze.jni.protos.alerters.AlerterType;
import com.waze.jni.protos.insights_infra.SegmentInsightInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb implements com.waze.an.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.insights_infra.k f14422a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.e.j f14423b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14424c;

    /* renamed from: d, reason: collision with root package name */
    private final InsightsInfraNativeManager f14425d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14426e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f14427f;

    /* renamed from: g, reason: collision with root package name */
    private final bn f14428g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14429h;

    public bb(com.waze.insights_infra.k kVar, com.waze.an.e.j jVar, com.waze.shared_infra.o.a aVar, InsightsInfraNativeManager insightsInfraNativeManager, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(kVar, "segmentInsightUpdatesProvider");
        h.g.b.x.f(jVar, "segmentInsightStatsReporter");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(insightsInfraNativeManager, "nativeManager");
        h.g.b.x.f(eVar, "logger");
        this.f14422a = kVar;
        this.f14423b = jVar;
        this.f14424c = aVar;
        this.f14425d = insightsInfraNativeManager;
        this.f14426e = eVar;
        this.f14427f = new LinkedHashMap();
        bn bnVarB = ck.b(e.c.d.a.p());
        this.f14428g = bnVarB;
        this.f14429h = kotlinx.coroutines.b.ai.E(new ay(kotlinx.coroutines.b.ai.q(kVar.a(), bnVarB, new az(this, null)), null, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.an.a.r b(final com.waze.an.a.a.bb r9, final com.waze.jni.protos.insights_infra.SegmentInsightInfo r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.an.a.a.bb.b(com.waze.an.a.a.bb, com.waze.jni.protos.insights_infra.SegmentInsightInfo):com.waze.an.a.r");
    }

    static final com.waze.an.a.r f(bb bbVar, com.waze.an.a.v vVar, com.waze.an.a.ao aoVar, SegmentInsightInfo segmentInsightInfo, com.waze.an.a.n nVar, com.waze.location.q qVar, com.waze.an.a.r rVar) {
        String string;
        h.g.b.x.f(qVar, "<unused var>");
        if (rVar != null) {
            if (rVar instanceof ad) {
                ((ad) rVar).h(nVar);
                return rVar;
            }
            if (rVar instanceof ae) {
                ((ae) rVar).f(nVar);
            }
            return rVar;
        }
        List<SegmentInsightInfo.AlertInfo> sourceAlertInfosList = segmentInsightInfo.getSourceAlertInfosList();
        h.g.b.x.e(sourceAlertInfosList, "getSourceAlertInfosList(...)");
        List<SegmentInsightInfo.AlertInfo> list = sourceAlertInfosList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (SegmentInsightInfo.AlertInfo alertInfo : list) {
            h.g.b.x.c(alertInfo);
            AlerterType alerterType = alertInfo.getAlerterType();
            h.g.b.x.e(alerterType, "getAlerterType(...)");
            AlerterController$Alerter$Type alerterController$Alerter$TypeA = com.b.b.d.c.a(alerterType);
            int subtype = alertInfo.getSubtype();
            long id = alertInfo.getId();
            boolean familiar = alertInfo.getFamiliar();
            String uuid = alertInfo.getUuid();
            h.g.b.x.e(uuid, "getUuid(...)");
            arrayList.add(new com.waze.an.a.m(alerterController$Alerter$TypeA, subtype, id, familiar, uuid));
        }
        ArrayList arrayList2 = arrayList;
        com.waze.an.a.r rVar2 = (com.waze.an.a.r) bbVar.f14427f.get(bd.a(vVar));
        g gVar = rVar2 instanceof g ? (g) rVar2 : null;
        if (gVar == null || (string = gVar.f()) == null) {
            string = UUID.randomUUID().toString();
            h.g.b.x.e(string, "toString(...)");
        }
        String str = string;
        com.waze.an.a.o oVarB = nVar.b();
        com.waze.an.a.o oVar = com.waze.an.a.o.f14602a;
        SegmentInsightInfo.PositionRelativeToSegment positionRelativeToSegment = SegmentInsightInfo.PositionRelativeToSegment.APPROACHING;
        int iOrdinal = oVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            adVar = rVar2 instanceof ad ? (ad) rVar2 : null;
            return new ae(vVar, arrayList2, aoVar.a(), nVar, bbVar.f14425d, bbVar.f14423b, adVar != null && adVar.i(), str, bbVar.f14426e);
        }
        ArrayList arrayList3 = arrayList2;
        if ((arrayList3 instanceof Collection) && arrayList3.isEmpty()) {
            adVar = new ad(nVar, vVar, aoVar, arrayList2, bbVar.f14425d, bbVar.f14423b, bbVar.f14424c, str, new q(bbVar, 2));
        } else {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                if (((com.waze.an.a.m) it.next()).e()) {
                    break;
                }
            }
            adVar = new ad(nVar, vVar, aoVar, arrayList2, bbVar.f14425d, bbVar.f14423b, bbVar.f14424c, str, new q(bbVar, 2));
        }
        return adVar;
    }

    static final h.ab g(bb bbVar, com.waze.location.q qVar) {
        bn bnVar;
        Object objD;
        h.g.b.x.f(qVar, "insightId");
        Objects.toString(qVar);
        bbVar.f14426e.a("dismissed by user: ".concat(String.valueOf(qVar)));
        do {
            bnVar = bbVar.f14428g;
            objD = bnVar.d();
        } while (!bnVar.f(objD, e.c.d.a.w((Set) objD, qVar)));
        return h.ab.f48028a;
    }

    @Override // com.waze.an.a.ad
    public final kotlinx.coroutines.b.k a() {
        return this.f14429h;
    }

    @Override // com.waze.an.a.ad
    public final void close() {
    }
}
