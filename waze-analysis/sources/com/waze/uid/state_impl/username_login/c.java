package com.waze.uid.state_impl.username_login;

import androidx.core.app.NotificationCompat;
import com.waze.sharedui.api.AuthParameters;
import com.waze.tide.s;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bc;
import com.waze.uid.c.bm;
import com.waze.uid.state_impl.util.InstallParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.api.d f44703a;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar, com.waze.sharedui.api.d dVar) {
        super("AccountNotFoundState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        x.f(dVar, "authParametersRepository");
        this.f44703a = dVar;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        if (com.waze.uid.d.q.f44463a.a().a().d()) {
            com.waze.uid.b.m mVar = this.f44485c;
            bb bbVarQ = mVar.q();
            if (!(bbVarQ instanceof bb)) {
                bbVarQ = null;
            }
            if (bbVarQ != null) {
                mVar.k(mVar.a().e(bbVarQ.a(bc.f44256l)));
                this.f44704f = true;
                return;
            }
            com.waze.shared_infra.i.h.k("UidEventsController", "unexpected UI state");
        }
        com.waze.uid.b.m mVar2 = this.f44485c;
        mVar2.k(mVar2.a().e(new bb(bm.q, eVar)));
    }

    @Override // com.waze.uid.e.f
    public final boolean j() {
        ((UidModel) this.f44485c.b()).setAuthParameters(AuthParameters.empty);
        return super.j();
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof com.waze.uid.b.c) {
            j();
            return;
        }
        if (!(sVar instanceof com.waze.uid.b.f)) {
            super.o(sVar);
            return;
        }
        if (!this.f44704f) {
            j();
            return;
        }
        com.waze.uid.b.m mVar = this.f44485c;
        ((UidModel) mVar.b()).getInstallParameters().result = InstallParameters.Result.GUEST;
        this.f44703a.c(AuthParameters.copy$default(((UidModel) mVar.b()).getAuthParameters(), null, null, null, true, 7, null));
        ((UidModel) mVar.b()).getEmailParameters().setContinuedAsGuest(true);
        com.waze.uid.d.q.f44463a.a().f44467e.n(new b(this));
    }
}
