package com.waze.uid.state_impl.b;

import com.waze.uid.state_impl.email.ac;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.uid.e.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("EmailAuthState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        d dVar = this;
        g(new ac(bVar, dVar, mVar), new com.waze.uid.state_impl.email.c(bVar, dVar, mVar));
    }
}
