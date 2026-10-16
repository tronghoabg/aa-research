package com.waze.an.a.a;

import com.waze.AlerterController$Alerter$Type;
import com.waze.R;
import com.waze.insights_infra.InsightsInfraNativeManager;
import java.util.List;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad implements g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.v f14339a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.a.ao f14340b;

    /* renamed from: c, reason: collision with root package name */
    private final List f14341c;

    /* renamed from: d, reason: collision with root package name */
    private final InsightsInfraNativeManager f14342d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.an.e.j f14343e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14344f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14345g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.l f14346h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.an.a.n f14347i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.an.a.s f14348j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.an.a.x f14349k;

    /* renamed from: l, reason: collision with root package name */
    private final bn f14350l;
    private final ch m;
    private boolean n;

    public ad(com.waze.an.a.n nVar, com.waze.an.a.v vVar, com.waze.an.a.ao aoVar, List list, InsightsInfraNativeManager insightsInfraNativeManager, com.waze.an.e.j jVar, com.waze.shared_infra.o.a aVar, String str, h.g.a.l lVar) {
        h.g.b.x.f(nVar, "initialState");
        h.g.b.x.f(vVar, "segmentId");
        h.g.b.x.f(aoVar, "segmentType");
        h.g.b.x.f(list, "sourceAlertInfos");
        h.g.b.x.f(insightsInfraNativeManager, "nativeManager");
        h.g.b.x.f(jVar, "segmentInsightStatsReporter");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(str, "impressionId");
        h.g.b.x.f(lVar, "onDismissedByUser");
        this.f14339a = vVar;
        this.f14340b = aoVar;
        this.f14341c = list;
        this.f14342d = insightsInfraNativeManager;
        this.f14343e = jVar;
        this.f14344f = aVar;
        this.f14345g = str;
        this.f14346h = lVar;
        this.f14347i = nVar;
        this.f14348j = bd.a(vVar);
        this.f14349k = aoVar.a();
        bn bnVarB = ck.b(n(nVar));
        this.f14350l = bnVarB;
        this.m = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    private final com.waze.j n(com.waze.an.a.n nVar) {
        com.waze.sharedui.utils.c cVar = new com.waze.sharedui.utils.c(nVar.a(), true);
        String strA = cVar.a();
        com.waze.shared_infra.o.a aVar = this.f14344f;
        String str = strA + " " + cVar.c(aVar);
        com.waze.an.a.ao aoVar = this.f14340b;
        return new com.waze.j(this.f14348j.b(), aVar.c(R.string.INSIGHTS_SEGMENT_TEMPLATE_APPROACHING_TRAFFIC_PS_PS, aVar.c(aoVar.c(), new Object[0]), str), null, null, Integer.valueOf(aoVar.b()), null, true, false, 0, false, true, false, null, AlerterController$Alerter$Type.PERMANENT_HAZARD, -1L, "", false, "", false, true, false, false, null, null, false, true, 0, null, null, false, -268173312);
    }

    @Override // com.waze.an.a.b
    public final Integer a() {
        return Integer.valueOf(this.f14347i.a());
    }

    @Override // com.waze.an.a.b
    public final ch b() {
        return this.m;
    }

    @Override // com.waze.an.a.b
    public final void c(com.waze.alerters.a.a aVar) {
        h.g.b.x.f(aVar, "action");
        com.waze.alerters.a.a aVar2 = com.waze.alerters.a.a.f14132a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 6 || iOrdinal == 3 || iOrdinal == 4) {
            this.f14346h.invoke(this.f14348j);
        }
        k();
    }

    @Override // com.waze.an.a.b
    public final void d(com.waze.f fVar) {
        h.g.b.x.f(fVar, "rejectedAlertReason");
    }

    @Override // com.waze.an.a.a.g
    public final com.waze.an.a.v e() {
        return this.f14339a;
    }

    @Override // com.waze.an.a.a.g
    public final String f() {
        return this.f14345g;
    }

    @Override // com.waze.an.a.a.g
    public final List g() {
        return this.f14341c;
    }

    public final void h(com.waze.an.a.n nVar) {
        bn bnVar;
        Object objD;
        h.g.b.x.f(nVar, "newState");
        this.f14347i = nVar;
        do {
            bnVar = this.f14350l;
            objD = bnVar.d();
        } while (!bnVar.f(objD, n(nVar)));
    }

    public final boolean i() {
        return this.n;
    }

    @Override // com.waze.an.a.r
    public final com.waze.an.a.x j() {
        return this.f14349k;
    }

    @Override // com.waze.an.a.r
    public final void k() {
        this.f14342d.onSegmentApproachEnd(this.f14339a);
    }

    @Override // com.waze.an.a.r
    public final void l() {
        this.n = true;
        InsightsInfraNativeManager insightsInfraNativeManager = this.f14342d;
        com.waze.an.a.v vVar = this.f14339a;
        insightsInfraNativeManager.onSegmentFirstPresentation(vVar, true, true);
        String str = this.f14345g;
        this.f14343e.a(vVar, this.f14347i, false, this.f14341c, false, str);
    }

    @Override // com.waze.an.a.r
    public final /* synthetic */ com.waze.location.q m() {
        return this.f14348j;
    }
}
