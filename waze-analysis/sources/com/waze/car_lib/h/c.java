package com.waze.car_lib.h;

import androidx.car.app.CarContext;
import androidx.car.app.hardware.CarHardwareManager;
import androidx.car.app.hardware.common.CarValue;
import androidx.car.app.hardware.info.Compass;
import androidx.core.content.ContextCompat;
import com.waze.car_lib.f.gh;
import com.waze.config.ConfigValues;
import com.waze.location.bm;
import com.waze.location.o;
import h.ab;
import h.g.b.x;
import h.m;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19810a;

    /* renamed from: b, reason: collision with root package name */
    private final o f19811b;

    /* renamed from: c, reason: collision with root package name */
    private final bm f19812c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f19813d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19814e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19815f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19816g;

    /* renamed from: h, reason: collision with root package name */
    private long f19817h;

    public c(com.waze.shared_infra.i.e eVar, o oVar, gh ghVar, bm bmVar, com.waze.shared_infra.q.e eVar2) {
        x.f(eVar, "logger");
        x.f(oVar, "locationSensorListener");
        x.f(ghVar, "config");
        x.f(bmVar, "userPositionStatsSender");
        x.f(eVar2, "wazeClock");
        this.f19810a = eVar;
        this.f19811b = oVar;
        this.f19812c = bmVar;
        this.f19813d = eVar2;
    }

    public static /* synthetic */ void b(c cVar, Compass compass) {
        CarValue<List<Float>> orientations = compass.getOrientations();
        x.e(orientations, "getOrientations(...)");
        com.waze.shared_infra.q.e eVar = cVar.f19813d;
        if (eVar.a() - cVar.f19817h < 1000) {
            return;
        }
        cVar.f19817h = eVar.a();
        List<Float> value = orientations.getValue();
        Float f2 = value != null ? (Float) h.a.i.R(value) : null;
        if (f2 != null) {
            f2.floatValue();
            if (!x.l(f2, 0.0f)) {
                cVar.f19815f = true;
            }
            if (cVar.f19815f) {
                if (!cVar.f19816g) {
                    cVar.f19816g = true;
                    cVar.f19812c.a(f2.floatValue());
                }
                Boolean boolB = ConfigValues.CONFIG_VALUE_HEADING_USE_CAR_COMPASS.b();
                x.e(boolB, "getValue(...)");
                if (boolB.booleanValue()) {
                    cVar.f19811b.setCarCompass((int) f2.floatValue());
                }
            }
        }
    }

    @Override // com.waze.car_lib.h.a
    public final void a(CarContext carContext) {
        Object objA;
        x.f(carContext, "carContext");
        Boolean boolB = ConfigValues.CONFIG_VALUE_CAR_LIB_LISTEN_TO_CAR_COMPASS.b();
        x.e(boolB, "getValue(...)");
        if (boolB.booleanValue() && !this.f19814e) {
            try {
                ((CarHardwareManager) carContext.getCarService(CarHardwareManager.class)).getCarSensors().addCompassListener(1, ContextCompat.getMainExecutor(carContext), new d(this, 1));
                this.f19814e = true;
                this.f19810a.g("Listening on AAP car compass events");
                objA = ab.f48028a;
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            Throwable thC = m.c(objA);
            if (thC != null) {
                com.waze.settings.tree.c.f.f(this.f19810a, "Exception caught when adding AapCarCompassListener:", thC);
            }
        }
    }
}
