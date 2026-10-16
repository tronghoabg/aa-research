package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f21691a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CarContext f21692b;

    q(u uVar, CarContext carContext) {
        this.f21691a = uVar;
        this.f21692b = carContext;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.alerters.a.k kVar = (com.waze.alerters.a.k) obj;
        u uVar = this.f21691a;
        com.waze.shared_infra.i.e eVar2 = uVar.f21708c;
        Objects.toString(kVar);
        eVar2.a("ConversationalReportingUiState recieved ".concat(String.valueOf(kVar)));
        if (!(kVar instanceof com.waze.car_lib.b.bj)) {
            if (kVar instanceof com.waze.car_lib.b.bl) {
                u.k(uVar, this.f21692b);
            } else if (kVar instanceof com.waze.car_lib.b.bm) {
                u.j(uVar, ((com.waze.car_lib.b.bm) kVar).f(), this.f21692b);
            } else if (kVar instanceof com.waze.car_lib.b.bh) {
                Object objC = u.c(uVar, this.f21692b, eVar);
                if (objC == h.c.a.a.f48038a) {
                    return objC;
                }
            } else if (!(kVar instanceof com.waze.car_lib.b.bf) && !(kVar instanceof com.waze.car_lib.b.bg) && !(kVar instanceof com.waze.car_lib.b.bk) && !(kVar instanceof com.waze.car_lib.b.bi)) {
                throw new h.i();
            }
            return h.ab.f48028a;
        }
        Object objE = u.e(uVar, (com.waze.car_lib.b.bj) kVar, this.f21692b, eVar);
        if (objE == h.c.a.a.f48038a) {
            return objE;
        }
        return h.ab.f48028a;
    }
}
