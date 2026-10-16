package com.waze.main_screen.c.f;

import com.waze.main_screen.bottom_bars.scrollable_eta.q;
import com.waze.sound.bs;
import h.g.b.x;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final bs f26232a;

    /* renamed from: b, reason: collision with root package name */
    private final j f26233b;

    /* renamed from: c, reason: collision with root package name */
    private final q f26234c;

    public h(bs bsVar, j jVar, q qVar) {
        x.f(bsVar, "guidanceModeRepository");
        x.f(jVar, "soundSettingsConfiguration");
        x.f(qVar, "etaStatsSender");
        this.f26232a = bsVar;
        this.f26233b = jVar;
        this.f26234c = qVar;
    }

    public final k c() {
        return new g(this.f26233b.a(), this);
    }
}
