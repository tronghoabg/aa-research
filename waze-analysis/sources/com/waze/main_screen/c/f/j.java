package com.waze.main_screen.c.f;

import com.waze.config.ConfigValues;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final ch f26238a;

    public j() {
        ch chVarL = ConfigValues.CONFIG_VALUE_BUTTON_PACK_DISPLAY_SOUND_SETTING.l();
        x.e(chVarL, "getStateFlow(...)");
        this.f26238a = chVarL;
    }

    public final ch a() {
        return this.f26238a;
    }
}
