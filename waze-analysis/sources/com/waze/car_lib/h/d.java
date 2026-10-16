package com.waze.car_lib.h;

import androidx.car.app.hardware.common.OnCarDataAvailableListener;
import androidx.car.app.hardware.info.CarHardwareLocation;
import androidx.car.app.hardware.info.Compass;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements OnCarDataAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19818a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19819b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f19819b = i2;
        this.f19818a = obj;
    }

    @Override // androidx.car.app.hardware.common.OnCarDataAvailableListener
    public final void onCarDataAvailable(Object obj) {
        if (this.f19819b != 0) {
            c.b((c) this.f19818a, (Compass) obj);
        } else {
            e.b((e) this.f19818a, (CarHardwareLocation) obj);
        }
    }
}
