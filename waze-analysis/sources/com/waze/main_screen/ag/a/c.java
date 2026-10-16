package com.waze.main_screen.ag.a;

import com.waze.config.ConfigValues;
import com.waze.sound.em;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25813a;

    public c() {
        ch chVarL = ConfigValues.CONFIG_VALUE_MAP_ICONS_SHOW_ZOOM_BUTTON.l();
        x.e(chVarL, "getStateFlow(...)");
        this.f25813a = chVarL;
    }

    public static final boolean c() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_SOUND_MUTE_DURING_CALLS.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch a() {
        return this.f25813a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.sound.em, java.lang.Object] */
    public final boolean b() {
        return this.f25813a.getVoiceInfraStatSendingEnabled();
    }

    public c(em emVar) {
        x.f(emVar, "soundConfig");
        this.f25813a = emVar;
    }
}
