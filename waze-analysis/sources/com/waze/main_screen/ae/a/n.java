package com.waze.main_screen.ae.a;

import com.waze.sdk.bd;
import com.waze.sdk.bi;
import com.waze.sdk.bk;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    private final bd f25743a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f25744b;

    /* renamed from: c, reason: collision with root package name */
    private final o f25745c;

    /* renamed from: d, reason: collision with root package name */
    private final af f25746d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f25747e;

    public n(bd bdVar, ab abVar, o oVar) {
        x.f(bdVar, "sdkManager");
        x.f(abVar, "ioDispatcher");
        x.f(oVar, "statsSender");
        this.f25743a = bdVar;
        this.f25744b = abVar;
        this.f25745c = oVar;
        af afVarP = com.waze.ui.a.l.p(this, "TransportSdkButtonStateHolder");
        this.f25746d = afVarP;
        kotlinx.coroutines.b.k kVarF = bi.f();
        x.e(kVarF, "getButtonStateFlow(...)");
        k kVar = new k(kVarF, this);
        bn bnVar = bdVar.f35311b;
        x.e(bnVar, "tooltipFlow");
        kotlinx.coroutines.b.k kVarF2 = ai.F(kVar, bnVar, new m(null));
        int i2 = bz.f51630a;
        this.f25747e = ai.V(kVarF2, afVarP, by.b(), new b(new bk(null), null));
    }

    @Override // com.waze.main_screen.ae.a.d
    public final ch a() {
        return this.f25747e;
    }

    @Override // com.waze.main_screen.ae.a.d
    public final void b() {
        this.f25745c.a(((b) this.f25747e.d()).b().c());
        bd.Q();
    }

    @Override // com.waze.main_screen.ae.a.d
    public final void c() {
        this.f25743a.w();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f25746d, null);
    }

    public final ab d() {
        return this.f25744b;
    }
}
