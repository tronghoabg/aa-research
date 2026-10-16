package com.waze.navigate;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class cw implements com.waze.ab.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31205a;

    public /* synthetic */ cw(int i2) {
        this.f31205a = i2;
    }

    @Override // com.waze.ab.r
    public final void a(boolean z, boolean z2) {
        if (this.f31205a == 0) {
            ConfigValues.CONFIG_VALUE_TRANSPORTATION_NAVIGATION_SETTINGS_POPUP_DONT_SHOW_AGAIN.d(Boolean.valueOf(z2));
        } else if (z2) {
            ConfigValues.CONFIG_VALUE_PARKING_LAST_LOCATION_DONT_SHOW_AGAIN.d(true);
        }
    }
}
