package com.waze.main_screen.r.a;

import com.waze.kd;
import com.waze.ui.a.l;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    private final kd f27416a;

    /* renamed from: b, reason: collision with root package name */
    private final af f27417b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f27418c;

    public g(kd kdVar) {
        x.f(kdVar, "popupController");
        this.f27416a = kdVar;
        af afVarP = l.p(this, "NotificationMessageStateHolder");
        this.f27417b = afVarP;
        f fVar = new f(kdVar.b());
        int i2 = bz.f51630a;
        this.f27418c = ai.V(fVar, afVarP, by.b(), null);
    }

    @Override // com.waze.main_screen.r.a.c
    public final ch a() {
        return this.f27418c;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f27417b, null);
    }
}
