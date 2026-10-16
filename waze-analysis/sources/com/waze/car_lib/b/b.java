package com.waze.car_lib.b;

import androidx.car.app.CarContext;
import androidx.car.app.model.AlertCallback;
import androidx.car.app.notification.CarNotificationManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements AlertCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f19007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f19008b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f19009c;

    b(f fVar, r rVar, CarContext carContext) {
        this.f19007a = fVar;
        this.f19008b = rVar;
        this.f19009c = carContext;
    }

    @Override // androidx.car.app.model.AlertCallback
    public final void onCancel(int i2) {
        r rVar = this.f19008b;
        f fVar = this.f19007a;
        fVar.f19087b.a("alert is canceled alertId=" + rVar.c() + ", reason=" + i2);
        if (i2 == 3) {
            CarContext carContext = this.f19009c;
            h hVar = fVar.f19088c;
            CarNotificationManager carNotificationManagerFrom = CarNotificationManager.from(carContext);
            h.g.b.x.e(carNotificationManagerFrom, "from(...)");
            hVar.a(rVar, carContext, carNotificationManagerFrom);
        }
    }

    @Override // androidx.car.app.model.AlertCallback
    public final void onDismiss() {
    }
}
