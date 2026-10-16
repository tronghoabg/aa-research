package com.waze.uid.state_impl.add_id;

import androidx.core.app.NotificationCompat;
import com.waze.uid.FlowContext;
import com.waze.uid.UidModel;
import com.waze.uid.state_impl.util.InstallParameters;
import java.util.Objects;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private br f44592a;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f44593f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdAddHomeAndWorkState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(hVar, "parent");
        h.g.b.x.f(mVar, "controller");
        this.f44593f = h.g.a(new com.waze.ui.r.a.e.c(10));
    }

    private final com.waze.shared_infra.i.e b() {
        return (com.waze.shared_infra.i.e) this.f44593f.getValue();
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        b().a("onEnterState");
        super.f(eVar);
        com.waze.uid.d.p pVar = com.waze.uid.d.q.f44463a;
        pVar.a().c().y();
        this.f44592a = aj.z(pVar.a().d(), null, null, new n(this, null), 3);
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        com.waze.shared_infra.i.e eVarB = b();
        Objects.toString(eVar);
        eVarB.a("shouldEnterState(dir:".concat(String.valueOf(eVar)));
        if (eVar != com.waze.uid.e.e.f44481a) {
            return false;
        }
        com.waze.uid.b.m mVar = this.f44485c;
        return com.waze.uid.b.m.t().a().j() && ((UidModel) mVar.b()).getInstallParameters().community != InstallParameters.Community.EMAIL && ((UidModel) mVar.b()).getFlowContext() == FlowContext.WAZE_ONBOARDING;
    }

    @Override // com.waze.uid.e.f
    public final boolean j() {
        br brVar = this.f44592a;
        if (brVar != null) {
            brVar.s(null);
        }
        return super.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.waze.uid.e.f
    public final boolean k() {
        br brVar = this.f44592a;
        if (brVar != null) {
            brVar.s(null);
        }
        return super.k();
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof com.waze.uid.b.p) {
            com.waze.uid.d.q.f44463a.a().c().x(com.waze.uid.stats.n.f44772d);
            k();
            return;
        }
        if (sVar instanceof com.waze.uid.b.c) {
            com.waze.uid.d.q.f44463a.a().c().x(com.waze.uid.stats.n.f44771c);
            k();
            return;
        }
        if (sVar instanceof l) {
            com.waze.uid.d.p pVar = com.waze.uid.d.q.f44463a;
            pVar.a().c().x(com.waze.uid.stats.n.f44769a);
            l lVar = (l) sVar;
            lVar.a().startActivity(pVar.a().f44471i.a(lVar.a()));
            return;
        }
        if (!(sVar instanceof y)) {
            super.o(sVar);
            return;
        }
        com.waze.uid.d.p pVar2 = com.waze.uid.d.q.f44463a;
        pVar2.a().c().x(com.waze.uid.stats.n.f44770b);
        y yVar = (y) sVar;
        yVar.a().startActivity(pVar2.a().f44471i.b(yVar.a()));
    }
}
