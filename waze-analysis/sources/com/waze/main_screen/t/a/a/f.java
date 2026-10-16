package com.waze.main_screen.t.a.a;

import com.waze.alerters.a.k;
import com.waze.app_nav.ah;
import com.waze.app_nav.w;
import com.waze.bi.g;
import com.waze.main_screen.i;
import com.waze.main_screen.u;
import com.waze.ui.a.l;
import com.waze.ui.j.j;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.e.a f27442a;

    /* renamed from: b, reason: collision with root package name */
    private final g f27443b;

    /* renamed from: c, reason: collision with root package name */
    private final w f27444c;

    /* renamed from: d, reason: collision with root package name */
    private final i f27445d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27446e;

    /* renamed from: f, reason: collision with root package name */
    private final af f27447f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f27448g;

    public f(com.waze.main_screen.e.a aVar, g gVar, w wVar, i iVar) {
        x.f(aVar, "combineRedDotFlowsUseCase");
        x.f(gVar, "redDotNotification");
        x.f(wVar, "flowController");
        x.f(iVar, "mainMenuStatsSender");
        this.f27442a = aVar;
        this.f27443b = gVar;
        this.f27444c = wVar;
        this.f27445d = iVar;
        af afVarP = l.p(this, null);
        this.f27447f = afVarP;
        e eVar = new e(ai.L(gVar.a(), new b(this, null)));
        int i2 = bz.f51630a;
        this.f27448g = ai.V(eVar, afVarP, by.c(), new com.waze.ui.j.i(((Boolean) gVar.a().d()).booleanValue(), true));
    }

    @Override // com.waze.ui.j.j
    public final ch c() {
        return this.f27448g;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f27447f, null);
    }

    @Override // com.waze.ui.j.j
    public final void d() {
        g gVar = this.f27443b;
        this.f27445d.d(((Boolean) gVar.a().d()).booleanValue());
        gVar.c();
        u uVar = u.f27645a;
        k.c(this.f27444c, u.c().a(), ah.f15182a);
    }

    @Override // com.waze.ui.j.j
    public final void e() {
        if (!this.f27446e) {
            this.f27445d.e(((com.waze.ui.j.i) this.f27448g.d()).b());
        }
        this.f27446e = true;
    }
}
