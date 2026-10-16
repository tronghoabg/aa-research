package com.waze.modules.navigation;

import com.waze.trip_overview.bu;
import com.waze.trip_overview.bv;
import com.waze.trip_overview.bx;
import com.waze.trip_overview.by;
import com.waze.trip_overview.bz;
import com.waze.trip_overview.ca;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ba extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30362a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f30363b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f30364c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f30365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(bk bkVar, ao aoVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30365d = i2;
        this.f30363b = bkVar;
        this.f30364c = aoVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f30365d != 0) {
            return new ba((d) this.f30364c, (bo) this.f30363b, eVar, 1);
        }
        return new ba((bk) this.f30363b, (ao) this.f30364c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f30365d != 0 ? ((ba) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ba) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f30365d == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f30362a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            bk bkVar = (bk) this.f30363b;
            this.f30362a = 1;
            Object objK = bk.k(bkVar, new az(bkVar, (ao) this.f30364c, null), this);
            return objK == aVar ? aVar : objK;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f30362a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj2 = this.f30364c;
            bv bvVarB = ((bn) this.f30363b).b();
            int i2 = kotlinx.coroutines.av.f51370a;
            this.f30362a = 1;
            obj = ((com.waze.shared_infra.coordinators.o) obj2).x(new bu(bvVarB, new com.waze.app_nav.a.v(bvVarB, kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c()))), new com.waze.perf.p(11), this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        com.waze.settings.tree.a.d dVar = (com.waze.settings.tree.a.d) obj;
        if (dVar instanceof com.waze.shared_infra.coordinators.d) {
            ca caVar = (ca) ((com.waze.shared_infra.coordinators.d) dVar).f();
            if (h.g.b.x.n(caVar, bx.f41142a)) {
                ((d) this.f30364c).a().o();
            } else if (h.g.b.x.n(caVar, by.f41143a)) {
                Object obj3 = this.f30364c;
                bn bnVar = (bn) this.f30363b;
                ((d) obj3).a().p(bnVar.a(), bnVar.c());
            } else {
                if (!(caVar instanceof bz)) {
                    throw new h.i();
                }
                ((d) this.f30364c).a().q();
            }
        } else {
            if (!(dVar instanceof com.waze.shared_infra.coordinators.e)) {
                throw new h.i();
            }
            ((com.waze.shared_infra.coordinators.o) this.f30364c).D(al.f30303c);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(d dVar, bo boVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30365d = i2;
        this.f30364c = dVar;
        this.f30363b = boVar;
    }
}
