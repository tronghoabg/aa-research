package com.waze.main_screen.j;

import com.waze.app_nav.w;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements i {

    /* renamed from: a, reason: collision with root package name */
    private final h f26489a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26490b;

    /* renamed from: c, reason: collision with root package name */
    private final w f26491c;

    /* renamed from: d, reason: collision with root package name */
    private final af f26492d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f26493e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f26494f;

    public m(h hVar, com.waze.shared_infra.i.e eVar, w wVar) {
        x.f(hVar, "googleAssistantActionsProvider");
        x.f(eVar, "logger");
        x.f(wVar, "wazeMainScreenFlowController");
        this.f26489a = hVar;
        this.f26490b = eVar;
        this.f26491c = wVar;
        af afVarP = com.waze.ui.a.l.p(this, null);
        this.f26492d = afVarP;
        bn bnVarB = ck.b(null);
        this.f26493e = bnVarB;
        kotlinx.coroutines.b.k kVarL = ai.L(bnVarB, new l(this, null));
        int i2 = bz.f51630a;
        this.f26494f = ai.V(kVarL, afVarP, by.b(), null);
    }

    @Override // com.waze.main_screen.j.i
    public final ch a() {
        return this.f26494f;
    }

    @Override // com.waze.main_screen.j.i
    public final void b(g gVar) {
        x.f(gVar, "action");
        Objects.toString(gVar);
        this.f26490b.a("Action handled: ".concat(gVar.toString()));
        this.f26493e.e(null);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26490b.a("Closed  " + System.identityHashCode(this));
        aj.h(this.f26492d, null);
    }
}
