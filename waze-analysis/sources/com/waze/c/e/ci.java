package com.waze.c.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    private final bz f18650a;

    /* renamed from: b, reason: collision with root package name */
    private final by f18651b;

    /* renamed from: c, reason: collision with root package name */
    private final cf f18652c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.c.d.am f18653d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f18654e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f18655f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f18656g;

    public ci(bz bzVar, by byVar, cf cfVar, com.waze.c.d.am amVar, bn bnVar) {
        h.g.b.x.f(bzVar, "onAltRouteSelected");
        h.g.b.x.f(byVar, "goAlternateRouteClicked");
        h.g.b.x.f(cfVar, "resumeAlternateRouteClicked");
        h.g.b.x.f(amVar, "alternateRoutesStatsSender");
        h.g.b.x.f(bnVar, "alternativeRouteCardTransformer");
        this.f18650a = bzVar;
        this.f18651b = byVar;
        this.f18652c = cfVar;
        this.f18653d = amVar;
        this.f18654e = bnVar;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new com.waze.ui.b.bd(h.a.i.h(), 0, new com.waze.c.c.a(7)));
        this.f18655f = bnVarB;
        this.f18656g = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    public static /* synthetic */ h.ab a(ci ciVar, com.waze.c.d.t tVar, int i2, int i3) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        com.waze.ui.b.bd bdVar;
        com.waze.c.d.m mVar = (com.waze.c.d.m) tVar.f().get(i2);
        com.waze.c.d.m mVarL = com.waze.a.af.l(tVar);
        com.waze.shared_infra.h.c cVarE = tVar.e();
        do {
            bnVar = ciVar.f18655f;
            objD = bnVar.d();
            bdVar = (com.waze.ui.b.bd) objD;
        } while (!bnVar.f(objD, com.waze.ui.b.bd.d(bdVar.f42046a, i2, bdVar.f42048c)));
        ciVar.f18653d.b(mVar, mVarL, cVarE != null, com.waze.c.d.ai.f18290a, com.waze.c.d.aj.f18303b, Integer.valueOf(i3));
        ciVar.f18650a.a(mVar);
        return h.ab.f48028a;
    }

    public static /* synthetic */ void c(com.waze.c.d.m mVar, ci ciVar, boolean z, com.waze.c.d.m mVar2, int i2) {
        if ((mVar instanceof com.waze.c.d.j) && !((com.waze.c.d.j) mVar).d()) {
            ciVar.f(mVar, z, i2);
            return;
        }
        com.waze.c.d.l lVar = (com.waze.c.d.l) mVar;
        ciVar.f18651b.a(lVar);
        ciVar.f18653d.b(lVar, mVar2, z, h.g.b.x.n(mVar2, lVar) ? com.waze.c.d.ai.f18295f : com.waze.c.d.ai.f18294e, com.waze.c.d.aj.f18303b, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(com.waze.c.d.m mVar, boolean z, int i2) {
        this.f18652c.a();
        this.f18653d.b(mVar, mVar, z, com.waze.c.d.ai.f18295f, com.waze.c.d.aj.f18303b, Integer.valueOf(i2));
    }

    public final kotlinx.coroutines.b.ch b() {
        return this.f18656g;
    }

    public final void e(com.waze.c.d.t tVar) {
        Object objD;
        ArrayList arrayList;
        com.waze.ui.b.bc bcVarA;
        h.g.b.x.f(tVar, "state");
        Iterator it = tVar.f().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (h.g.b.x.n((com.waze.c.d.m) it.next(), tVar.a())) {
                break;
            } else {
                i2++;
            }
        }
        kotlinx.coroutines.b.bn bnVar = this.f18655f;
        do {
            objD = bnVar.d();
            com.waze.shared_infra.h.c cVarE = tVar.e();
            final com.waze.c.d.m mVarL = com.waze.a.af.l(tVar);
            List<com.waze.c.d.m> listF = tVar.f();
            arrayList = new ArrayList(h.a.i.q(listF, 10));
            for (final com.waze.c.d.m mVar : listF) {
                final boolean z = cVarE != null;
                if (mVar instanceof com.waze.c.d.i) {
                    bcVarA = this.f18654e.a(mVar, z, new cb() { // from class: com.waze.c.e.cg
                        @Override // com.waze.c.e.cb
                        public final void a(int i3) {
                            this.f18643a.f(mVar, z, i3);
                        }
                    });
                } else {
                    if (!(mVar instanceof com.waze.c.d.l)) {
                        throw new h.i();
                    }
                    bcVarA = this.f18654e.a(mVar, z, new cb() { // from class: com.waze.c.e.ch
                        @Override // com.waze.c.e.cb
                        public final void a(int i3) {
                            ci.c(mVar, this, z, mVarL, i3);
                        }
                    });
                }
                arrayList.add(bcVarA);
            }
        } while (!bnVar.f(objD, com.waze.ui.b.bd.d(arrayList, i2, new bo(this, tVar, 2))));
    }
}
