package com.waze.uid.state_impl.g;

import com.waze.uid.b.ab;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.waze.uid.e.f {
    public h(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("StateLoginDone", bVar, hVar, mVar);
    }

    public static /* synthetic */ void a(h hVar, Boolean bool) {
        bool.booleanValue();
        hVar.f44485c.w(new com.waze.uid.b.e(-1, null));
        hVar.k();
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        bn bnVar = ab.f44137b;
        com.waze.uid.p pVar = (com.waze.uid.p) bnVar.d();
        bnVar.e(new com.waze.uid.p(pVar.b(), true, pVar.a()));
        com.waze.uid.d.q.b().f44467e.k(new com.waze.uid.b.k() { // from class: com.waze.uid.state_impl.g.g
            @Override // com.waze.uid.b.k
            public final void a(Boolean bool) {
                h.a(this.f44680a, bool);
            }
        });
    }
}
