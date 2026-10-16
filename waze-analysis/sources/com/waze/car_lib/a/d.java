package com.waze.car_lib.a;

import androidx.core.app.NotificationCompat;
import com.waze.car_lib.bm;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends bm {

    /* renamed from: d, reason: collision with root package name */
    private final e f18831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super((byte[]) null);
        h.g.b.x.f(eVar, "controller");
        this.f18831d = eVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f18831d;
    }

    public final e f() {
        return this.f18831d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.car_lib.b bVar = (com.waze.car_lib.b) obj;
        h.g.b.x.f(bVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(bVar, k.f18838a)) {
            return;
        }
        if (bVar instanceof i) {
            J(new t(((i) bVar).e(), a(), this.f18831d), true);
            return;
        }
        if (h.g.b.x.n(bVar, j.f18837a)) {
            J(new b(a()), true);
            return;
        }
        if (h.g.b.x.n(bVar, f.f18832a)) {
            D(m.f18840a);
            return;
        }
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            D(new n(gVar.e(), gVar.f()));
        } else {
            if (!h.g.b.x.n(bVar, h.f18835a)) {
                throw new h.i();
            }
            aj.z(A(), null, null, new c(this, null), 3);
        }
    }
}
