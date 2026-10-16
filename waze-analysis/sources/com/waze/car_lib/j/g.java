package com.waze.car_lib.j;

import androidx.car.app.CarContext;
import androidx.car.app.notification.CarNotificationManager;
import com.waze.c.e.an;
import com.waze.car_lib.r.ck;
import com.waze.navigate.en;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final ck f20214a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ac f20215b;

    /* renamed from: c, reason: collision with root package name */
    private final en f20216c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20217d;

    public g(ck ckVar, com.waze.ac acVar, en enVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(ckVar, "navigationViewModel");
        h.g.b.x.f(acVar, "backgroundStateProvider");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(aVar, "stringProvider");
        this.f20214a = ckVar;
        this.f20215b = acVar;
        this.f20216c = enVar;
        this.f20217d = aVar;
    }

    public final void e(kotlinx.coroutines.af afVar, CarContext carContext, CarNotificationManager carNotificationManager) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(carNotificationManager, "notificationManager");
        com.waze.car_lib.m.c.d(carNotificationManager, "Waze Navigation Instructions", 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new f(this, afVar, carContext, carNotificationManager, null), 3).bY(new an(carNotificationManager, 20));
    }
}
