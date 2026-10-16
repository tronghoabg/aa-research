package com.waze.main_screen.ab.a;

import com.waze.kj;
import com.waze.sdk.ae;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kj f25634a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f25635b;

    e(kj kjVar, m mVar) {
        this.f25634a = kjVar;
        this.f25635b = mVar;
    }

    public final void a() {
        this.f25635b.a(null);
    }

    public final void b(boolean z) {
        this.f25634a.x(z);
    }

    public final void c() {
        ae aeVarH;
        kj kjVar = this.f25634a;
        ae aeVarH2 = kjVar.h();
        if (aeVarH2 == null || !aeVarH2.isShown() || (aeVarH = kjVar.h()) == null) {
            return;
        }
        aeVarH.N(false);
    }

    public final void d() {
        f.g(this.f25634a, 1);
    }

    public final void e(com.waze.view.popups.m mVar) {
        x.f(mVar, "popup");
        this.f25635b.a(null);
    }

    public final void f(int i2) {
        f.g(this.f25634a, i2);
    }

    public final void g() {
        this.f25635b.a(null);
    }

    public final void h(int i2) {
        f.f(this.f25634a, 0, 1, i2);
    }

    e(m mVar, kj kjVar) {
        this.f25635b = mVar;
        this.f25634a = kjVar;
    }
}
