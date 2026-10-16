package com.waze.car_lib.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.car_lib.f.hm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ct {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21230a;

    /* renamed from: b, reason: collision with root package name */
    private final MutableLiveData f21231b;

    public ct(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21230a = aVar;
        this.f21231b = new MutableLiveData(new com.waze.car_lib.p.dk(aVar.c(R.string.PRIVACY_SETTINGS_ACTIVITY_RECENT_DESTINATIONS_TITLE, new Object[0])));
    }

    public final LiveData a(kotlinx.coroutines.af afVar, hm hmVar, com.waze.car_lib.screens.core.l lVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(hmVar, "coordinatorController");
        h.g.b.x.f(lVar, "screenThrottleCallback");
        kotlinx.coroutines.aj.z(afVar, null, null, new bi(hmVar, this, lVar, (h.c.e) null, 2), 3);
        return this.f21231b;
    }
}
