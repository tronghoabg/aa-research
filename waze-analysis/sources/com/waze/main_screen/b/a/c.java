package com.waze.main_screen.b.a;

import com.waze.config.ConfigValues;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ch f25870a;

    public c() {
        ch chVarL = ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_SDK_ON.l();
        x.e(chVarL, "getStateFlow(...)");
        this.f25870a = chVarL;
    }

    public final ch a() {
        return this.f25870a;
    }
}
