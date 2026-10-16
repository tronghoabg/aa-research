package com.waze.car_lib.j;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private boolean f20291a = true;

    public final boolean a() {
        return this.f20291a && ConfigValues.CONFIG_VALUE_NAVIGATION_TOLL_MESSAGE_NUMBER_OF_TIMES_SHOWN.b().longValue() < ConfigValues.CONFIG_VALUE_NAVIGATION_TOLL_MESSAGE_MAX_SHOW_TIMES.b().longValue();
    }

    public final void b() {
        this.f20291a = false;
    }
}
