package com.waze.uid.state_impl.c;

import com.waze.uid.b.m;
import com.waze.uid.d.q;
import com.waze.uid.e.f;
import com.waze.uid.e.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends f {
    b(com.waze.uid.e.b bVar, h hVar, m mVar) {
        super("StateExitApp", bVar, hVar, mVar);
    }

    public static /* synthetic */ void a(b bVar, boolean z) {
        if (z) {
            bVar.f44485c.o(new com.waze.uid.b.a());
        } else {
            bVar.k();
        }
    }

    @Override // com.waze.uid.e.f
    public final boolean d() {
        return true;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        q.b().f44467e.u(new a(this));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return eVar == com.waze.uid.e.e.f44482b;
    }
}
