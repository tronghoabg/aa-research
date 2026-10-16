package com.waze.uid.state_impl.d;

import com.waze.uid.UidModel;
import com.waze.uid.b.m;
import com.waze.uid.d.q;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends com.waze.uid.e.f {
    public a(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, m mVar) {
        super("CheckDefaultResultState", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        ((UidModel) this.f44485c.b()).getInstallParameters().result = q.b().f44467e.f();
        k();
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }
}
