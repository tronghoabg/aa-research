package com.waze.car_lib.login;

import androidx.car.app.CarContext;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class i {
    public /* synthetic */ i(byte[] bArr) {
    }

    public static CarIcon c(CarContext carContext, int i2) {
        x.f(carContext, "carContext");
        return new CarIcon.Builder(IconCompat.createWithResource(carContext, i2)).build();
    }

    private i() {
        throw null;
    }
}
