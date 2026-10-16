package com.waze.uid.state_impl.g;

import com.waze.uid.UidModel;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("OpenUidActivityState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.l(((UidModel) mVar.b()).getRequestCode());
        k();
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }
}
