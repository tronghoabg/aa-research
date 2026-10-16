package com.waze.car_lib.r;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.dg f21223a;

    public cm(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21223a = new com.waze.car_lib.p.dg(aVar.c(R.string.AAOS_REQUEST_PERMISSION_SCREEN_TITLE, new Object[0]), aVar.c(R.string.AAOS_PERMISSION_DENIED_SCREEN_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_PERMISSION_DENIED_SCREEN_SETTINGS_BUTTON, new Object[0]), true), null, 32);
    }

    public final com.waze.car_lib.p.dg a() {
        return this.f21223a;
    }
}
