package com.waze.car_lib.q;

import androidx.car.app.CarContext;
import androidx.car.app.hardware.CarHardwareManager;
import androidx.car.app.hardware.common.OnCarDataAvailableListener;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.hardware.info.ExteriorDimensions;
import androidx.car.app.hardware.info.Model;
import androidx.core.content.ContextCompat;
import com.waze.NativeManager;
import com.waze.car_lib.r.bq;
import h.g.b.x;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20856a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.g.c f20857b;

    /* renamed from: c, reason: collision with root package name */
    private final CompletableDeferred f20858c;

    /* renamed from: d, reason: collision with root package name */
    private final CompletableDeferred f20859d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f20860e;

    /* renamed from: f, reason: collision with root package name */
    private final CompletableDeferred f20861f;

    public g(com.waze.shared_infra.i.e eVar, com.waze.car_lib.g.c cVar) {
        x.f(eVar, "logger");
        x.f(cVar, "lcvConfig");
        this.f20856a = eVar;
        this.f20857b = cVar;
        this.f20858c = bo.j();
        this.f20859d = bo.j();
        this.f20860e = ck.b(false);
        this.f20861f = bo.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object c(com.waze.car_lib.q.g r7, java.util.List r8, h.c.e r9) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.q.g.c(com.waze.car_lib.q.g, java.util.List, h.c.e):java.lang.Object");
    }

    static final void e(g gVar, EnergyProfile energyProfile) {
        List<Integer> value = energyProfile.getFuelTypes().getValue();
        boolean z = false;
        if (value != null) {
            List<Integer> list = value;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = true;
            } else {
                for (Integer num : list) {
                    if (num == null || num.intValue() != 10) {
                        break;
                    }
                }
                z = true;
            }
        }
        gVar.f20860e.e(Boolean.valueOf(z));
    }

    static final void f(g gVar, ExteriorDimensions exteriorDimensions) {
        e eVar;
        Integer[] value = exteriorDimensions.getExteriorDimensions().getValue();
        Integer num = value != null ? (Integer) h.a.c.O(value, 0) : null;
        if (num == null || value.length == 0) {
            eVar = e.f20849a;
        } else {
            long jIntValue = num.intValue();
            com.waze.car_lib.g.c cVar = gVar.f20857b;
            eVar = jIntValue > cVar.b() ? d.f20848a : ((long) num.intValue()) >= cVar.a() ? c.f20847a : e.f20849a;
        }
        gVar.f20861f.a(eVar);
    }

    static final void g(g gVar, Model model) {
        String value = model.getManufacturer().getValue();
        if (value == null) {
            value = "";
        }
        gVar.f20858c.a(value);
        String value2 = model.getName().getValue();
        gVar.f20859d.a(value2 != null ? value2 : "");
    }

    static final void h(g gVar, String str, Exception exc) {
        gVar.f20856a.g(str + ": " + exc);
    }

    private final void j(final String str, final Exception exc) {
        NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.car_lib.q.b
            @Override // java.lang.Runnable
            public final void run() {
                g.h(this.f20844a, str, exc);
            }
        });
    }

    public final Object a(h.c.e eVar) {
        return this.f20861f.c(eVar);
    }

    public final Object b(List list, h.c.e eVar) {
        return c(this, list, eVar);
    }

    public final ch d() {
        return this.f20860e;
    }

    public final void i(CarContext carContext) {
        x.f(carContext, "carContext");
        CarHardwareManager carHardwareManager = (CarHardwareManager) carContext.getCarService(CarHardwareManager.class);
        Executor mainExecutor = ContextCompat.getMainExecutor(carContext);
        x.c(carHardwareManager);
        x.c(mainExecutor);
        try {
            final int i2 = 2;
            carHardwareManager.getCarInfo().fetchEnergyProfile(mainExecutor, new OnCarDataAvailableListener(this) { // from class: com.waze.car_lib.q.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g f20842a;

                {
                    this.f20842a = this;
                }

                @Override // androidx.car.app.hardware.common.OnCarDataAvailableListener
                public final void onCarDataAvailable(Object obj) {
                    int i3 = i2;
                    if (i3 == 0) {
                        g.g(this.f20842a, (Model) obj);
                    } else if (i3 != 1) {
                        g.e(this.f20842a, (EnergyProfile) obj);
                    } else {
                        g.f(this.f20842a, (ExteriorDimensions) obj);
                    }
                }
            });
        } catch (Exception e2) {
            j("Couldn't fetch car's energy profile", e2);
        }
        try {
            final int i3 = 0;
            carHardwareManager.getCarInfo().fetchModel(mainExecutor, new OnCarDataAvailableListener(this) { // from class: com.waze.car_lib.q.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g f20842a;

                {
                    this.f20842a = this;
                }

                @Override // androidx.car.app.hardware.common.OnCarDataAvailableListener
                public final void onCarDataAvailable(Object obj) {
                    int i32 = i3;
                    if (i32 == 0) {
                        g.g(this.f20842a, (Model) obj);
                    } else if (i32 != 1) {
                        g.e(this.f20842a, (EnergyProfile) obj);
                    } else {
                        g.f(this.f20842a, (ExteriorDimensions) obj);
                    }
                }
            });
        } catch (Exception e3) {
            j("Couldn't fetch car's model", e3);
            this.f20858c.a("");
            this.f20859d.a("");
        }
        if (!bq.i(carContext)) {
            this.f20856a.a("Did not fetch exterior dimensions - CAL level is lower than 7");
            return;
        }
        try {
            final int i4 = 1;
            carHardwareManager.getCarInfo().fetchExteriorDimensions(mainExecutor, new OnCarDataAvailableListener(this) { // from class: com.waze.car_lib.q.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g f20842a;

                {
                    this.f20842a = this;
                }

                @Override // androidx.car.app.hardware.common.OnCarDataAvailableListener
                public final void onCarDataAvailable(Object obj) {
                    int i32 = i4;
                    if (i32 == 0) {
                        g.g(this.f20842a, (Model) obj);
                    } else if (i32 != 1) {
                        g.e(this.f20842a, (EnergyProfile) obj);
                    } else {
                        g.f(this.f20842a, (ExteriorDimensions) obj);
                    }
                }
            });
        } catch (Exception e4) {
            j("Couldn't fetch car's exterior dimensions", e4);
            this.f20861f.a(e.f20849a);
        }
    }
}
