package com.google.android.gms.o;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f5750a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f5751b;

    b(c cVar, t tVar) {
        this.f5750a = tVar;
        Objects.requireNonNull(cVar);
        this.f5751b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f5750a;
        boolean zI = tVar.i();
        c cVar = this.f5751b;
        if (zI) {
            cVar.f5754c.v();
            return;
        }
        try {
            this.f5751b.f5754c.t(cVar.f5753b.a(tVar));
        } catch (r e2) {
            boolean z = e2.getCause() instanceof Exception;
            c cVar2 = this.f5751b;
            if (z) {
                cVar2.f5754c.s((Exception) e2.getCause());
            } else {
                cVar2.f5754c.s(e2);
            }
        } catch (Exception e3) {
            this.f5751b.f5754c.s(e3);
        }
    }
}
