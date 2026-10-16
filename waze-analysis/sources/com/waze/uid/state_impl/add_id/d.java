package com.waze.uid.state_impl.add_id;

import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.uid.e.a {
    d(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("SwitchAccountOrAddIdState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        if (((UidModel) mVar.b()).getInstallParameters().didChooseExistingAccount) {
            a(new e(this.f44486d, this.f44484b, mVar));
        } else {
            a(new c(this.f44486d, this.f44484b, mVar));
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }
}
