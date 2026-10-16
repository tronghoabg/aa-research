package com.waze.bk;

import android.util.Size;
import android.view.Surface;
import h.g.b.x;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f16879a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.c.j f16880b;

    q(r rVar, h.c.j jVar) {
        this.f16879a = rVar;
        this.f16880b = jVar;
    }

    @Override // com.waze.bk.j
    public final void a(int i2, int i3, int i4) {
        Size size = new Size(i2, i3);
        r rVar = this.f16879a;
        rVar.f16889i = size;
        rVar.l(new o(i2, i3, i4));
    }

    @Override // com.waze.bk.j
    public final void b(Surface surface, int i2, int i3, int i4) {
        x.f(surface, "surface");
        Size size = new Size(i2, i3);
        r rVar = this.f16879a;
        rVar.f16889i = size;
        rVar.l(new m(surface, i2, i3, i4));
    }

    @Override // com.waze.bk.j
    public final void c() {
        r rVar = this.f16879a;
        rVar.f16889i = null;
        rVar.k();
    }

    @Override // com.waze.bk.j
    public final void d() {
    }

    @Override // com.waze.bk.j
    public final void e(Runnable runnable) {
        x.f(runnable, "drawingFinished");
        i iVar = new i(runnable);
        af afVarE = aj.e(this.f16880b);
        r rVar = this.f16879a;
        aj.z(afVarE, null, null, new p(rVar, iVar, null), 3);
        for (boolean zOffer = false; !rVar.f16883c && !zOffer; zOffer = rVar.f16886f.offer(iVar, 0L, TimeUnit.MILLISECONDS)) {
            try {
            } catch (Throwable th) {
                e.b.c.a(th);
                return;
            }
        }
    }
}
