package com.waze.uid.state_impl.b;

import android.content.Context;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CredentialManager;
import com.google.android.gms.f.v;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import com.waze.uid.state_impl.util.InstallParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("GoogleSignOutState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        Context contextA = com.waze.sharedui.h.k().a();
        if (contextA == null) {
            k();
        } else {
            CredentialManager.Companion.create(contextA).clearCredentialStateAsync(new ClearCredentialStateRequest(null, 1, null), null, new v(12), new o(this));
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        if (eVar != com.waze.uid.e.e.f44481a) {
            return false;
        }
        com.waze.uid.b.m mVar = this.f44485c;
        return ((UidModel) mVar.b()).getFlowType() == FlowType.EDIT_ID && x.n(((UidModel) mVar.b()).getAuthParameters().getCommunity(), InstallParameters.Community.EMAIL.apiName);
    }
}
