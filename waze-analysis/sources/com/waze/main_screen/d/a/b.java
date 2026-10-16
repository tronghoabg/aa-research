package com.waze.main_screen.d.a;

import com.waze.config.ConfigValues;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final k f26306a;

    public b() {
        ch chVarL = ConfigValues.CONFIG_VALUE_MAP_ICONS_SHOW_ON_SCREEN_ON_TAP.l();
        x.e(chVarL, "getStateFlow(...)");
        ch chVarL2 = ConfigValues.CONFIG_VALUE_MAP_ICONS_SHOW_COMPASS.l();
        x.e(chVarL2, "getStateFlow(...)");
        this.f26306a = ai.q(chVarL, chVarL2, new a(null));
    }

    public final k a() {
        return this.f26306a;
    }
}
