package com.waze.main_screen.j.a;

import com.waze.config.ConfigValues;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ch f26467a;

    public b() {
        ch chVarL = ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_MIC_ON_MAP.l();
        x.e(chVarL, "getStateFlow(...)");
        this.f26467a = chVarL;
    }

    public final ch a() {
        return this.f26467a;
    }
}
