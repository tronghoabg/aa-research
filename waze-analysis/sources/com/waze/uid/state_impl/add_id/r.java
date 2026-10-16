package com.waze.uid.state_impl.add_id;

import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.uid.e.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdCloseActivityState", bVar, hVar, mVar);
        h.g.b.x.f(mVar, "controller");
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        h.g.b.x.f(eVar, "dir");
        super.f(eVar);
        this.f44485c.w(new com.waze.uid.b.e(-1, new Intent()));
        k();
    }
}
