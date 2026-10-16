package com.waze.uid.state_impl.email;

import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends com.waze.uid.e.f implements com.waze.uid.b.h {
    l(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("ShowExistingAccountState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(bm.f44290k, eVar)));
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        if (!(sVar instanceof a)) {
            super.o(sVar);
        } else {
            ((UidModel) this.f44485c.b()).getInstallParameters().didChooseExistingAccount = true;
            k();
        }
    }
}
