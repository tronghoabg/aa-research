package com.waze.copilot.a;

import com.waze.copilot.presentation.CopilotSelectionResponse;
import com.waze.copilot.presentation.CopilotTypeResponse;
import com.waze.copilot.presentation.UpdateCoPilotSelectionRequest;
import e.a.d.jm;
import java.util.List;
import l.a.ajm;
import l.a.ajn;
import l.a.ajo;
import l.a.ajp;
import l.a.ajq;
import l.a.ajr;
import l.a.ajs;
import l.a.ajt;
import l.a.aju;
import l.a.ajv;
import l.a.lq;
import l.a.oz;
import l.a.pa;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f22850a;

    public p(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f22850a = axVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(boolean r5, com.waze.copilot.a.n r6, boolean r7, boolean r8, boolean r9, java.lang.String r10) {
        /*
            r4 = this;
            l.a.lo r0 = l.a.lq.newBuilder()
            com.waze.cf.d.c r0 = e.a.d.jm.p(r0)
            l.a.ow r1 = l.a.oy.newBuilder()
            java.lang.String r2 = "builder"
            h.g.b.x.f(r1, r2)
            r2 = 0
            if (r10 == 0) goto L1f
            java.lang.Long r10 = h.n.o.h(r10)
            if (r10 == 0) goto L1f
            long r2 = r10.longValue()
        L1f:
            r1.a(r2)
            r1.e(r5)
            if (r6 != 0) goto L28
            goto L35
        L28:
            com.waze.copilot.a.m r5 = com.waze.copilot.a.m.f22843a
            com.waze.copilot.presentation.CopilotTypeResponse r5 = com.waze.copilot.presentation.CopilotTypeResponse.CAR
            int r5 = r6.ordinal()
            if (r5 == 0) goto L3b
            r6 = 1
            if (r5 == r6) goto L38
        L35:
            l.a.ox r5 = l.a.ox.FAILURE_REASON_UNSPECIFIED
            goto L3d
        L38:
            l.a.ox r5 = l.a.ox.SELECTION_ERROR
            goto L3d
        L3b:
            l.a.ox r5 = l.a.ox.DOWNLOAD_ERROR
        L3d:
            com.waze.stats.ax r4 = r4.f22850a
            java.lang.String r6 = "value"
            h.g.b.x.f(r5, r6)
            r1.c(r5)
            r1.b(r8)
            r1.d(r9)
            r1.f(r7)
            com.google.v.du r5 = r1.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r5, r6)
            l.a.oy r5 = (l.a.oy) r5
            r0.d(r5)
            l.a.lq r5 = r0.c()
            com.waze.sharedui.utils.o.k(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.p.h(boolean, com.waze.copilot.a.n, boolean, boolean, boolean, java.lang.String):void");
    }

    @Override // com.waze.copilot.a.o
    public final void a(aa aaVar, String str) {
        h.m mVarB;
        h.m mVarA;
        h.m mVarC;
        h.g.b.x.f(aaVar, "results");
        com.waze.copilot.data.a.g gVarC = aaVar.c();
        com.waze.copilot.data.o oVarA = aaVar.a();
        h.m mVarC2 = gVarC.c();
        boolean z = mVarC2 != null && h.m.e(mVarC2.b()) && (mVarC = oVarA.c()) != null && h.m.e(mVarC.b());
        h.m mVarA2 = gVarC.a();
        boolean z2 = mVarA2 != null && h.m.e(mVarA2.b()) && (mVarA = oVarA.a()) != null && h.m.e(mVarA.b());
        h.m mVarB2 = gVarC.b();
        h(true, null, z, z2, mVarB2 != null && h.m.e(mVarB2.b()) && (mVarB = oVarA.b()) != null && h.m.e(mVarB.b()), str);
    }

    @Override // com.waze.copilot.a.o
    public final void b(UpdateCoPilotSelectionRequest updateCoPilotSelectionRequest) {
        Long l2;
        String str;
        String str2;
        List<CopilotSelectionResponse> actions;
        String campaignId;
        String str3 = null;
        lH = null;
        Long lH = null;
        if (updateCoPilotSelectionRequest == null || (actions = updateCoPilotSelectionRequest.getActions()) == null) {
            l2 = null;
            str = null;
            str2 = null;
        } else {
            String str4 = null;
            str = null;
            str2 = null;
            for (CopilotSelectionResponse copilotSelectionResponse : actions) {
                CopilotTypeResponse copilotTypeResponseComponent1 = copilotSelectionResponse.component1();
                String strComponent2 = copilotSelectionResponse.component2();
                n nVar = n.f22847a;
                m mVar = m.f22843a;
                CopilotTypeResponse copilotTypeResponse = CopilotTypeResponse.CAR;
                int iOrdinal = copilotTypeResponseComponent1.ordinal();
                if (iOrdinal == 0) {
                    str4 = strComponent2;
                } else if (iOrdinal == 1) {
                    str = strComponent2;
                } else {
                    if (iOrdinal != 2) {
                        throw new h.i();
                    }
                    str2 = strComponent2;
                }
            }
            CopilotSelectionResponse copilotSelectionResponse2 = (CopilotSelectionResponse) h.a.i.R(actions);
            if (copilotSelectionResponse2 != null && (campaignId = copilotSelectionResponse2.getCampaignId()) != null) {
                lH = h.n.o.h(campaignId);
            }
            l2 = lH;
            str3 = str4;
        }
        l lVar = new l(str3, str, str2, l2);
        String strB = lVar.b();
        String strC = lVar.c();
        String strD = lVar.d();
        Long lA = lVar.a();
        com.waze.cf.d.c cVarP = jm.p(lq.newBuilder());
        oz ozVarNewBuilder = pa.newBuilder();
        h.g.b.x.f(ozVarNewBuilder, "builder");
        if (strB != null) {
            h.g.b.x.f(strB, "value");
            ozVarNewBuilder.b(strB);
        }
        if (strC != null) {
            h.g.b.x.f(strC, "value");
            ozVarNewBuilder.c(strC);
        }
        if (strD != null) {
            h.g.b.x.f(strD, "value");
            ozVarNewBuilder.d(strD);
        }
        if (lA != null) {
            ozVarNewBuilder.a(lA.longValue());
        }
        com.waze.stats.ax axVar = this.f22850a;
        pa paVarBuild = ozVarNewBuilder.build();
        h.g.b.x.e(paVarBuild, "build(...)");
        cVarP.e(paVarBuild);
        com.waze.sharedui.utils.o.k(axVar, cVarP.c());
    }

    @Override // com.waze.copilot.a.o
    public final void c() {
        com.waze.cf.d.c cVarP = jm.p(lq.newBuilder());
        ajn ajnVarNewBuilder = ajo.newBuilder();
        h.g.b.x.f(ajnVarNewBuilder, "builder");
        ajm ajmVar = ajm.OK;
        h.g.b.x.f(ajmVar, "value");
        ajnVarNewBuilder.a(ajmVar);
        ajo ajoVarBuild = ajnVarNewBuilder.build();
        h.g.b.x.e(ajoVarBuild, "build(...)");
        cVarP.f(ajoVarBuild);
        com.waze.sharedui.utils.o.k(this.f22850a, cVarP.c());
    }

    @Override // com.waze.copilot.a.o
    public final void d() {
        com.waze.cf.d.c cVarP = jm.p(lq.newBuilder());
        ajp ajpVarNewBuilder = ajq.newBuilder();
        h.g.b.x.f(ajpVarNewBuilder, "builder");
        ajq ajqVarBuild = ajpVarNewBuilder.build();
        h.g.b.x.e(ajqVarBuild, "build(...)");
        cVarP.g(ajqVarBuild);
        com.waze.sharedui.utils.o.k(this.f22850a, cVarP.c());
    }

    @Override // com.waze.copilot.a.o
    public final void e(m mVar) {
        ajr ajrVar;
        h.g.b.x.f(mVar, "clickType");
        com.waze.cf.d.c cVarP = jm.p(lq.newBuilder());
        ajs ajsVarNewBuilder = ajt.newBuilder();
        h.g.b.x.f(ajsVarNewBuilder, "builder");
        n nVar = n.f22847a;
        m mVar2 = m.f22843a;
        CopilotTypeResponse copilotTypeResponse = CopilotTypeResponse.CAR;
        int iOrdinal = mVar.ordinal();
        if (iOrdinal == 0) {
            ajrVar = ajr.BACK;
        } else if (iOrdinal == 1) {
            ajrVar = ajr.SHARE;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            ajrVar = ajr.CLOSE;
        }
        com.waze.stats.ax axVar = this.f22850a;
        h.g.b.x.f(ajrVar, "value");
        ajsVarNewBuilder.a(ajrVar);
        ajt ajtVarBuild = ajsVarNewBuilder.build();
        h.g.b.x.e(ajtVarBuild, "build(...)");
        cVarP.h(ajtVarBuild);
        com.waze.sharedui.utils.o.k(axVar, cVarP.c());
    }

    @Override // com.waze.copilot.a.o
    public final void f(boolean z, boolean z2, boolean z3) {
        com.waze.cf.d.c cVarP = jm.p(lq.newBuilder());
        aju ajuVarNewBuilder = ajv.newBuilder();
        h.g.b.x.f(ajuVarNewBuilder, "builder");
        ajuVarNewBuilder.c(z);
        ajuVarNewBuilder.b(z2);
        ajuVarNewBuilder.a(z3);
        ajv ajvVarBuild = ajuVarNewBuilder.build();
        h.g.b.x.e(ajvVarBuild, "build(...)");
        cVarP.i(ajvVarBuild);
        com.waze.sharedui.utils.o.k(this.f22850a, cVarP.c());
    }

    @Override // com.waze.copilot.a.o
    public final void g(n nVar, String str) {
        h.g.b.x.f(nVar, "failReason");
        h(false, nVar, false, false, false, str);
    }
}
