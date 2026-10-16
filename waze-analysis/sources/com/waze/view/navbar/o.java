package com.waze.view.navbar;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int f45101a = com.waze.utils.o.e(com.waze.utils.f.HANDLER);

    /* renamed from: b, reason: collision with root package name */
    private static final int f45102b = com.waze.utils.o.e(com.waze.utils.f.HANDLER);

    /* renamed from: c, reason: collision with root package name */
    private static final int f45103c = com.waze.utils.o.e(com.waze.utils.f.HANDLER);

    /* renamed from: d, reason: collision with root package name */
    private static o f45104d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ifs.a.f f45105e = new com.waze.ifs.a.f();

    private o() {
    }

    public static o d() {
        o oVar = f45104d;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o();
        f45104d = oVar2;
        return oVar2;
    }

    public final void e() {
        this.f45105e.d(f45102b, Bundle.EMPTY);
    }

    final void f(n nVar) {
        com.waze.ifs.a.f fVar = this.f45105e;
        fVar.b(f45101a, nVar);
        fVar.b(f45102b, nVar);
        fVar.b(f45103c, nVar);
    }

    public final void g() {
        this.f45105e.d(f45101a, Bundle.EMPTY);
    }

    final void h(n nVar) {
        com.waze.ifs.a.f fVar = this.f45105e;
        fVar.c(f45101a, nVar);
        fVar.c(f45102b, nVar);
        fVar.c(f45103c, nVar);
    }
}
