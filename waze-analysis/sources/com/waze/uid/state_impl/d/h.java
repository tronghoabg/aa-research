package com.waze.uid.state_impl.d;

import com.waze.sharedui.api.t;
import com.waze.uid.b.m;
import com.waze.uid.d.q;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f44632a;

    static {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("RestoreLoginState");
        x.e(eVarD, "create(...)");
        f44632a = eVarD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, m mVar) {
        super("RestoreLoginState", bVar, hVar, mVar);
        x.f(bVar, "trace");
    }

    public static final /* synthetic */ void c(h hVar, String str, String str2) {
        boolean zI = q.f44463a.a().a().i();
        m.t().c().c(zI);
        if (!zI) {
            hVar.k();
            return;
        }
        f44632a.a("trying restored username and password");
        t.f38827b.b(str, str2, new f(com.waze.uid.e.f.i(), hVar, str, str2));
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        aj.z(q.f44463a.a().d(), null, null, new g(this, null), 3);
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return a.a.h(eVar);
    }
}
