package com.waze.car_lib.h;

import android.location.Location;
import androidx.car.app.CarContext;
import androidx.car.app.hardware.CarHardwareManager;
import androidx.car.app.hardware.info.CarHardwareLocation;
import androidx.core.content.ContextCompat;
import com.waze.location.bf;
import com.waze.location.y;
import h.ab;
import h.g.b.x;
import h.m;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private final y f19820a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.config.b f19821b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19822c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19823d;

    public e(y yVar, com.waze.config.b bVar, com.waze.shared_infra.i.e eVar) {
        x.f(yVar, "locationEventManager");
        x.f(bVar, "normalUpdateRateConfig");
        x.f(eVar, "logger");
        this.f19820a = yVar;
        this.f19821b = bVar;
        this.f19822c = eVar;
    }

    public static /* synthetic */ void b(e eVar, CarHardwareLocation carHardwareLocation) {
        Location value = carHardwareLocation.getLocation().getValue();
        if (value != null) {
            eVar.f19820a.d(value, bf.f25346d);
        }
    }

    @Override // com.waze.car_lib.h.b
    public final void a(CarContext carContext) {
        Object objA;
        x.f(carContext, "carContext");
        if (this.f19823d) {
            return;
        }
        try {
            ((CarHardwareManager) carContext.getCarService(CarHardwareManager.class)).getCarSensors().addCarHardwareLocationListener(true != this.f19821b.b().booleanValue() ? 3 : 1, ContextCompat.getMainExecutor(carContext), new d(this, 0));
            this.f19823d = true;
            this.f19822c.g("Car location listening started");
            objA = ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = m.c(objA);
        if (thC != null) {
            com.waze.settings.tree.c.f.f(this.f19822c, "Exception caught during addCarHardwareLocationListener:", thC);
        }
    }
}
