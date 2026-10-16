package com.waze.car_lib.i;

import androidx.car.app.CarContext;
import androidx.lifecycle.Lifecycle;
import com.waze.NativeManager;
import com.waze.car_lib.aq;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f20163a;

    public f(NativeManager nativeManager) {
        x.f(nativeManager, "nativeManager");
        this.f20163a = nativeManager;
    }

    public final void b(aq aqVar, Lifecycle lifecycle, com.waze.car_lib.i.a.a aVar, af afVar, CarContext carContext) {
        x.f(aqVar, "mapController");
        x.f(lifecycle, "lifecycle");
        x.f(aVar, "surfaceController");
        x.f(afVar, "lifecycleScope");
        x.f(carContext, "carContext");
        lifecycle.addObserver(new e(aqVar, aVar, afVar, carContext, this));
    }
}
