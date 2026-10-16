package com.waze.uid.state_impl.f;

import androidx.core.app.NotificationCompat;
import com.waze.b.o;
import com.waze.b.u;
import com.waze.shared_infra.i.e;
import com.waze.tide.s;
import com.waze.uid.b.i;
import com.waze.uid.b.m;
import com.waze.uid.b.n;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import com.waze.uid.e.f;
import com.waze.uid.e.h;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public s f44674a;

    /* renamed from: f, reason: collision with root package name */
    private final o f44675f;

    /* renamed from: g, reason: collision with root package name */
    private final u f44676g;

    /* renamed from: h, reason: collision with root package name */
    private final e f44677h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.waze.uid.e.b bVar, h hVar, m mVar, o oVar, u uVar, e eVar) {
        super("RequestU18UserAgeState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        x.f(oVar, "ageRestrictionApi");
        x.f(uVar, "ageRestrictionRepository");
        x.f(eVar, "logger");
        this.f44675f = oVar;
        this.f44676g = uVar;
        this.f44677h = eVar;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        this.f44485c.k(new i(new bb(bm.f44283d, eVar), 6));
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        x.f(sVar, "<set-?>");
        this.f44674a = sVar;
        if (sVar instanceof com.waze.uid.state_impl.a.a) {
            m mVar = this.f44485c;
            mVar.k(mVar.a().b(new n(com.waze.uid.b.o.f44168a)));
            aj.z(m.t().d(), null, null, new c(this, sVar, null), 3);
        } else if (sVar instanceof com.waze.uid.state_impl.a.b) {
            k();
        } else if (sVar instanceof com.waze.uid.state_impl.a.c) {
            k();
        }
    }
}
