package com.waze.uid.state_impl.g;

import com.waze.ui.w.ai;
import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends com.waze.uid.e.f {
    public f(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("SignUpOptionsState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(ai.s(x.f44700b, eVar)));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return eVar == com.waze.uid.e.e.f44481a && ((UidModel) this.f44485c.b()).getInstallParameters().result == null;
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        super.o(sVar);
        if (sVar instanceof s) {
            com.waze.uid.b.m mVar = this.f44485c;
            s sVar2 = (s) sVar;
            ((UidModel) mVar.b()).getInstallParameters().result = sVar2.b();
            ((UidModel) mVar.b()).getInstallParameters().community = sVar2.a();
            k();
        }
    }
}
