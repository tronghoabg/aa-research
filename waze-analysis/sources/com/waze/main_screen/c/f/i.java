package com.waze.main_screen.c.f;

import com.waze.main_screen.bottom_bars.scrollable_eta.q;
import com.waze.sound.bs;
import com.waze.ui.a.l;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f26235a;

    /* renamed from: b, reason: collision with root package name */
    private final af f26236b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f26237c;

    public i(bs bsVar, q qVar) {
        x.f(bsVar, "guidanceModeRepository");
        x.f(qVar, "etaStatsSender");
        this.f26235a = qVar;
        this.f26236b = l.p(this, null);
        this.f26237c = bsVar.b();
    }

    public final ch a() {
        return this.f26237c;
    }

    public final void b() {
        this.f26235a.b(com.waze.main_screen.bottom_bars.scrollable_eta.l.q);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f26236b, null);
    }
}
