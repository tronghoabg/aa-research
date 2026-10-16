package com.waze.car_lib.b;

import androidx.car.app.CarContext;
import androidx.car.app.CarToast;
import com.waze.ka;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class am implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CarContext f18971a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18972b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18973c;

    am(Object obj, CarContext carContext, int i2) {
        this.f18973c = i2;
        this.f18972b = obj;
        this.f18971a = carContext;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f18973c;
        if (i2 == 0) {
            Object obj2 = this.f18972b;
            ap apVar = (ap) obj2;
            ap.N(apVar, this.f18971a, (com.waze.car_lib.r.bq) obj);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            ((bo) this.f18972b).f19040a.K();
            CarToast.makeText(this.f18971a, (String) obj, 1).show();
            return h.ab.f48028a;
        }
        ka kaVar = (ka) obj;
        ap apVar2 = (ap) this.f18972b;
        com.waze.shared_infra.i.e eVar2 = apVar2.f18981a;
        Objects.toString(kaVar);
        eVar2.a("popup collected: ".concat(String.valueOf(kaVar)));
        if (kaVar == null) {
            apVar2.v.c(null);
        } else {
            ap.I(apVar2, kaVar, this.f18971a);
        }
        return h.ab.f48028a;
    }
}
