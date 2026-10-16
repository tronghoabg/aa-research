package com.waze.main_screen.s;

import com.waze.navigate.cg;
import com.waze.ui.a.l;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    private final af f27429a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f27430b;

    public g(cg cgVar) {
        x.f(cgVar, "etaNavResultDataProvider");
        af afVarP = l.p(this, "ViaBarSh");
        this.f27429a = afVarP;
        k kVarD = ai.D(new f(cgVar.M()));
        int i2 = bz.f51630a;
        this.f27430b = ai.V(kVarD, afVarP, by.c(), null);
    }

    @Override // com.waze.main_screen.s.c
    public final ch a() {
        return this.f27430b;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f27429a, bo.g("Closed", null));
    }
}
