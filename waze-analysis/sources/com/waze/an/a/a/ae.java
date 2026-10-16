package com.waze.an.a.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.insights_infra.InsightsInfraNativeManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ae implements com.waze.an.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.v f14351a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14352b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.an.a.x f14353c;

    /* renamed from: d, reason: collision with root package name */
    private final InsightsInfraNativeManager f14354d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.an.e.j f14355e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14356f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14357g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14358h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f14359i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14360j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14361k;

    /* renamed from: l, reason: collision with root package name */
    private final bn f14362l;
    private final ch m;

    public ae(com.waze.an.a.v vVar, List list, com.waze.an.a.x xVar, com.waze.an.a.n nVar, InsightsInfraNativeManager insightsInfraNativeManager, com.waze.an.e.j jVar, boolean z, String str, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(vVar, TtmlNode.ATTR_ID);
        h.g.b.x.f(list, "sourceAlertInfos");
        h.g.b.x.f(xVar, "priority");
        h.g.b.x.f(nVar, "initialState");
        h.g.b.x.f(insightsInfraNativeManager, "nativeManager");
        h.g.b.x.f(jVar, "segmentInsightStatsReporter");
        h.g.b.x.f(str, "impressionId");
        h.g.b.x.f(eVar, "logger");
        this.f14351a = vVar;
        this.f14352b = list;
        this.f14353c = xVar;
        this.f14354d = insightsInfraNativeManager;
        this.f14355e = jVar;
        this.f14356f = z;
        this.f14357g = str;
        this.f14358h = eVar;
        List list2 = list;
        boolean z2 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((com.waze.an.a.m) it.next()).e()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f14359i = z2;
        this.f14360j = !z2;
        bn bnVarB = ck.b(nVar);
        this.f14362l = bnVarB;
        this.m = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    @Override // com.waze.an.a.p
    public final com.waze.an.a.v a() {
        return this.f14351a;
    }

    @Override // com.waze.an.a.p
    public final ch b() {
        return this.m;
    }

    @Override // com.waze.an.a.p
    public final void c() {
        if (this.f14360j) {
            if (this.f14361k) {
                com.waze.shared_infra.i.e eVar = this.f14358h;
                com.waze.an.a.v vVar = this.f14351a;
                Objects.toString(vVar);
                eVar.e("disableAtStartMode id:".concat(vVar.toString()));
                this.f14361k = false;
                this.f14355e.a(vVar, (com.waze.an.a.n) this.f14362l.d(), false, this.f14352b, false, this.f14357g);
                return;
            }
            return;
        }
        this.f14358h.g("inside segment " + this.f14351a + ", disableAtStartMode called when atStart is not allowed: wasApproaching:" + this.f14356f + " && familiar:" + this.f14359i);
    }

    @Override // com.waze.an.a.p
    public final void d() {
        if (this.f14360j) {
            if (this.f14361k) {
                return;
            }
            com.waze.shared_infra.i.e eVar = this.f14358h;
            com.waze.an.a.v vVar = this.f14351a;
            Objects.toString(vVar);
            eVar.e("enableAtStartMode id:".concat(vVar.toString()));
            this.f14361k = true;
            return;
        }
        this.f14358h.g("inside segment " + this.f14351a + ", enableAtStartMode called when atStart is not allowed: wasApproaching:" + this.f14356f + " && familiar:" + this.f14359i);
    }

    @Override // com.waze.an.a.p
    public final boolean e() {
        return this.f14360j;
    }

    public final void f(com.waze.an.a.n nVar) {
        h.g.b.x.f(nVar, "newState");
        this.f14362l.e(nVar);
    }

    @Override // com.waze.an.a.r
    public final com.waze.an.a.x j() {
        return this.f14353c;
    }

    @Override // com.waze.an.a.r
    public final void k() {
        com.waze.an.a.v vVar = this.f14351a;
        Objects.toString(vVar);
        this.f14358h.a("onEnd ".concat(vVar.toString()));
        this.f14355e.a(vVar, (com.waze.an.a.n) this.f14362l.d(), true, this.f14352b, this.f14361k, this.f14357g);
    }

    @Override // com.waze.an.a.r
    public final void l() {
        boolean z = this.f14361k;
        bn bnVar = this.f14362l;
        Object objD = bnVar.d();
        StringBuilder sb = new StringBuilder("onStart id:");
        com.waze.an.a.v vVar = this.f14351a;
        sb.append(vVar);
        sb.append(", atStartModeEnabled?");
        sb.append(z);
        sb.append(", wasApproaching?");
        boolean z2 = this.f14356f;
        sb.append(z2);
        sb.append(", familiar?");
        sb.append(this.f14359i);
        sb.append(", state:");
        sb.append(objD);
        this.f14358h.e(sb.toString());
        this.f14355e.a(vVar, (com.waze.an.a.n) bnVar.d(), false, this.f14352b, this.f14361k, this.f14357g);
        this.f14354d.onSegmentFirstPresentation(vVar, this.f14361k, !z2);
    }

    @Override // com.waze.an.a.r
    public final /* synthetic */ com.waze.location.q m() {
        return this.f14351a;
    }
}
