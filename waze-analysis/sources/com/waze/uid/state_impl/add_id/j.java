package com.waze.uid.state_impl.add_id;

import com.waze.uid.UidModel;
import com.waze.uid.c.bb;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends com.waze.uid.e.a {

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44585f;

    public j(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.shared_infra.o.a aVar) {
        super("AddCheckExistingState", bVar, hVar, mVar);
        this.f44585f = aVar;
    }

    static /* bridge */ /* synthetic */ void u(com.waze.uid.b.m mVar, Boolean bool) {
        if (mVar.q() instanceof bb) {
            mVar.k(mVar.a().b(com.waze.uid.b.n.a(bool.booleanValue())));
        } else {
            com.waze.shared_infra.i.h.k("UidEventsController", "unexpected UI state");
        }
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.sharedui.api.t.f38827b.d(((UidModel) this.f44485c.b()).getAuthParameters(), new b(this, i(), 1));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        com.waze.uid.b.m mVar = this.f44485c;
        return (((UidModel) mVar.b()).getInstallParameters().community == null || eVar != com.waze.uid.e.e.f44481a || ((UidModel) mVar.b()).getEmailParameters().getEmailAuthSkipped()) ? false : true;
    }
}
