package com.waze.uid.state_impl.username_login;

import com.waze.uid.UidModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("UidActivityStartState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        if (eVar != null) {
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                com.waze.uid.b.m mVar = this.f44485c;
                mVar.l(((UidModel) mVar.b()).getRequestCode());
                k();
                return;
            } else if (iOrdinal == 1) {
                this.f44485c.w(new com.waze.uid.b.e(0, null));
                j();
                return;
            }
        }
        com.waze.shared_infra.i.h.k("UidEventsController", "LoginContainer: null direction");
    }
}
