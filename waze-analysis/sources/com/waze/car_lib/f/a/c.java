package com.waze.car_lib.f.a;

import androidx.car.app.CarContext;
import androidx.core.app.NotificationCompat;
import com.waze.car_lib.bm;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.screens.cf;
import com.waze.car_lib.screens.cz;
import com.waze.map.b.n;
import com.waze.shared_infra.coordinators.s;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends bm {

    /* renamed from: d, reason: collision with root package name */
    private final f f19335d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.r.a.c f19336e;

    /* renamed from: f, reason: collision with root package name */
    private final n f19337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, com.waze.car_lib.r.a.c cVar, n nVar) {
        super((byte[]) null);
        x.f(fVar, "controller");
        x.f(cVar, "viewModelFactory");
        x.f(nVar, "mainMapController");
        this.f19335d = fVar;
        this.f19336e = cVar;
        this.f19337f = nVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ s b() {
        return this.f19335d;
    }

    public final f f() {
        return this.f19335d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        dh dhVar = (dh) obj;
        x.f(dhVar, NotificationCompat.CATEGORY_EVENT);
        if (x.n(dhVar, h.f19343a)) {
            return;
        }
        if (dhVar instanceof i) {
            aj.z(A(), null, null, new a(this, dhVar, null), 3);
            return;
        }
        if (x.n(dhVar, g.f19342a)) {
            D(ab.f48028a);
            return;
        }
        if (x.n(dhVar, k.f19346a)) {
            J(new cz(a()), true);
            return;
        }
        if (!x.n(dhVar, j.f19345a)) {
            throw new h.i();
        }
        c cVar = this;
        CarContext carContextA = a();
        f fVar = this.f19335d;
        cVar.J(new cf(carContextA, new b(fVar, 0), new b(fVar, 1, null), null), true);
    }

    public final com.waze.car_lib.r.a.c i() {
        return this.f19336e;
    }
}
