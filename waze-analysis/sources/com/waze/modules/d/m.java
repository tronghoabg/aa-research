package com.waze.modules.d;

import com.waze.mg;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f30232a = h.g.b(h.h.f48130a, new l(this));

    public final void a() {
        com.waze.authentication.a.a aVar = new com.waze.authentication.a.a(((com.waze.be.b) this.f30232a.getValue()).a(mg.f29780a.a()), new com.waze.shared_infra.q.f(), new com.waze.car_lib.l());
        n.f30233a.g("Will send stat with bad credentials from tech code on the next boot");
        aj.z(aj.f(), null, null, new k(aVar, null), 3);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
