package com.waze.car_lib.b;

import androidx.car.app.CarContext;
import androidx.car.app.notification.CarNotificationManager;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f19094a;

    public h(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f19094a = configManager;
    }

    public final void a(r rVar, CarContext carContext, CarNotificationManager carNotificationManager) {
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(carNotificationManager, "notificationManager");
        if (this.f19094a.getConfigValueBool(ConfigValues.CONFIG_VALUE_CAR_LIB_ALERTS_USING_NOTIFICATION)) {
            if (rVar == null) {
                carNotificationManager.cancelAll();
                return;
            }
            carNotificationManager.notify(rVar.a(), com.waze.i.a.d(carContext, "Waze Alerters", rVar.h(), rVar.g(), null, rVar.e(), false, 0, DisplayStrings.DS_TAP_TO_VERIFY));
        }
    }
}
