package com.waze.uid.state_impl.add_id;

import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdCloseState", bVar, hVar, mVar);
        h.g.b.x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        super.f(eVar);
        com.waze.uid.d.p pVar = com.waze.uid.d.q.f44463a;
        pVar.a().f44465c.b();
        com.waze.uid.b.m mVar = this.f44485c;
        if (((UidModel) mVar.b()).getAddIdParameters().shouldExitApp) {
            mVar.i();
            pVar.a().f44467e.j();
        } else {
            mVar.g();
            k();
        }
    }
}
