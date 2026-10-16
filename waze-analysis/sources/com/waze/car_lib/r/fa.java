package com.waze.car_lib.r;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21618a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.p.dg f21619b;

    public fa(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21618a = aVar;
        this.f21619b = new com.waze.car_lib.p.dg(aVar.c(R.string.AAOS_TOLL_SCREEN_TITLE, new Object[0]), aVar.c(R.string.AAOS_TOLL_SCREEN_MESSAGE, new Object[0]), null, true, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_TOLL_SCREEN_BUTTON, new Object[0]), true), null, 4);
    }

    public final com.waze.car_lib.p.dg a() {
        return this.f21619b;
    }
}
