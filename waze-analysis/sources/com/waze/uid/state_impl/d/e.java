package com.waze.uid.state_impl.d;

import com.waze.b.o;
import com.waze.b.u;
import com.waze.uid.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.uid.e.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, m mVar, u uVar, o oVar) {
        super("AuthContainer", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        x.f(uVar, "ageRestrictionRepository");
        x.f(oVar, "ageRestrictionApi");
        e eVar = this;
        g(new com.waze.uid.state_impl.b.a(bVar, eVar, uVar, oVar, mVar), new com.waze.uid.state_impl.email.m(bVar, eVar, mVar));
    }
}
