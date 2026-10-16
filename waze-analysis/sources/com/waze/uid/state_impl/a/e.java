package com.waze.uid.state_impl.a;

import androidx.core.app.NotificationCompat;
import com.waze.b.o;
import com.waze.b.y;
import com.waze.cb.j;
import com.waze.sharedui.e.g;
import com.waze.tide.s;
import com.waze.uid.UidModel;
import com.waze.uid.b.i;
import com.waze.uid.b.m;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import com.waze.uid.e.h;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final y f44567a;

    /* renamed from: f, reason: collision with root package name */
    private final o f44568f;

    /* renamed from: g, reason: collision with root package name */
    private final g f44569g;

    /* renamed from: h, reason: collision with root package name */
    private final j f44570h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f44571i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.waze.uid.e.b bVar, h hVar, m mVar, y yVar, o oVar, g gVar, j jVar) {
        super("RequestUserAgeState", bVar, hVar, mVar);
        x.f(bVar, "trace");
        x.f(mVar, "controller");
        x.f(yVar, "aadcAgeRestrictionRepository");
        x.f(oVar, "ageRestrictionApi");
        x.f(gVar, "locationService");
        x.f(jVar, "u16BlockScreenController");
        this.f44567a = yVar;
        this.f44568f = oVar;
        this.f44569g = gVar;
        this.f44570h = jVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("RequestUserAgeState");
        x.e(eVarD, "create(...)");
        this.f44571i = eVarD;
    }

    public final com.waze.shared_infra.i.e c() {
        return this.f44571i;
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        this.f44485c.k(new i(new bb(bm.f44282c, eVar), 6));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return (((com.waze.b.e) this.f44567a.a().d()) instanceof com.waze.b.b) && !((UidModel) this.f44485c.b()).getInstallParameters().isExistingUser() && eVar == com.waze.uid.e.e.f44481a;
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(s sVar) {
        x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof a) {
            aj.z(aj.f(), null, null, new d(this, ((a) sVar).a(), null), 3);
        }
    }
}
