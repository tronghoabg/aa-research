package com.waze.google_assistant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ab {
    SDK_STATE_CHANGED(b()),
    SHOW_DIRECTIONS(b()),
    SHOW_ROUTE_OVERVIEW(b()),
    SHOW_ALTERNATE_ROUTES(b()),
    RECENTER_MAP(b()),
    SHOW_MAP(b()),
    OPEN_USER_AGREEMENT(b()),
    ON_USER_AGREEMENT_DECLINED(b()),
    NAVIGATION_GUIDANCE_CHANGED(b());


    /* renamed from: k, reason: collision with root package name */
    private final int f24082k;

    ab(int i2) {
        this.f24082k = i2;
    }

    private static int b() {
        return com.waze.utils.o.e(com.waze.utils.f.HANDLER);
    }

    public final int a() {
        return this.f24082k;
    }
}
