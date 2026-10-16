package com.waze.car_lib.screens;

import com.waze.car_lib.f.fp;
import com.waze.car_lib.f.fs;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class y implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.n f22043a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22044b;

    y(com.waze.car_lib.screens.core.n nVar, int i2) {
        this.f22044b = i2;
        this.f22043a = nVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f22044b;
        if (i2 == 0) {
            ac.c((ac) this.f22043a, (com.waze.car_lib.p.p) obj);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            v.g((v) this.f22043a, (com.waze.car_lib.p.n) obj);
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            ((cy) this.f22043a).i((com.waze.car_lib.p.cw) obj);
            return h.ab.f48028a;
        }
        com.waze.o.ad adVar = (com.waze.o.ad) obj;
        if (h.g.b.x.n(adVar, com.waze.car_lib.r.c.c.a.f21142a)) {
            ((be) this.f22043a).f21874a.H(fp.f19589a);
        } else {
            if (!(adVar instanceof com.waze.car_lib.r.c.c.b)) {
                throw new h.i();
            }
            ((be) this.f22043a).f21874a.H(new fs(((com.waze.car_lib.r.c.c.b) adVar).a()));
        }
        return h.ab.f48028a;
    }
}
