package com.waze.main_screen.x;

import com.waze.an.b.g;
import com.waze.main_screen.k.a.p;
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
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private final g f27866a;

    /* renamed from: b, reason: collision with root package name */
    private final af f27867b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f27868c;

    public e(g gVar) {
        x.f(gVar, "insightPolicy");
        this.f27866a = gVar;
        af afVarP = l.p(this, null);
        this.f27867b = afVarP;
        d dVar = new d(ai.z(gVar.a(), new p(8)));
        int i2 = bz.f51630a;
        this.f27868c = ai.V(dVar, afVarP, by.b(), false);
    }

    @Override // com.waze.main_screen.x.a
    public final ch a() {
        return this.f27868c;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f27867b, null);
    }
}
