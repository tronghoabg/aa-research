package com.waze.map.opengl;

import com.waze.config.ConfigValues;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29562a;

    public t(byte[] bArr) {
        ch chVarL = ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEEDOMETER.l();
        h.g.b.x.e(chVarL, "getStateFlow(...)");
        this.f29562a = chVarL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.f, java.lang.Object] */
    public final boolean a() {
        return ((Boolean) this.f29562a.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch b() {
        return this.f29562a;
    }

    public t() {
        this.f29562a = h.g.a(new com.waze.main_screen.ac.k(6));
    }
}
