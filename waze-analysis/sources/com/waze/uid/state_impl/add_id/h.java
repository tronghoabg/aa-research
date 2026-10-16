package com.waze.uid.state_impl.add_id;

import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bc;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44584a;

    h(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.shared_infra.o.a aVar) {
        super("WarnChooseAccountDialogState", bVar, hVar, mVar);
        this.f44584a = aVar;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.stats.s sVarC = com.waze.uid.d.q.b().c();
        com.waze.uid.b.m mVar = this.f44485c;
        sVarC.o(((UidModel) mVar.b()).getFlowContext().getOnboardingContext());
        com.waze.uid.b.i iVarB = mVar.a().b(null);
        bm bmVar = bm.f44291l;
        bc bcVar = bc.f44252h;
        h.g.b.x.f(bmVar, "viewType");
        mVar.k(iVarB.e(new bb(bmVar, bcVar, null, eVar == com.waze.uid.e.e.f44482b)));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        boolean z = sVar instanceof com.waze.uid.b.f;
        if (!z && !(sVar instanceof com.waze.uid.b.g)) {
            super.o(sVar);
            return;
        }
        com.waze.uid.b.m mVar = this.f44485c;
        bb bbVarQ = mVar.q();
        if (bbVarQ instanceof bb) {
            mVar.k(mVar.a().e(bbVarQ.a(null)));
        } else {
            com.waze.shared_infra.i.h.k("UidEventsController", "unexpected UI state");
        }
        if (sVar instanceof com.waze.uid.b.g) {
            com.waze.uid.d.q.b().c().n(((UidModel) mVar.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.i.f44750a);
            mVar.w(new g(this, com.waze.uid.d.n.f44459b));
        } else if (z) {
            com.waze.uid.d.q.b().c().n(((UidModel) mVar.b()).getFlowContext().getOnboardingContext(), com.waze.uid.stats.i.f44751b);
        }
        k();
    }
}
