package com.waze.q;

import androidx.media3.exoplayer.offline.DownloadService;
import com.waze.install.u;
import com.waze.install.x;
import com.waze.shared_infra.r.y;
import h.g.b.ar;
import h.g.b.m;
import i.b.a.o;
import i.b.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements com.waze.al.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f33463a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.b.d f33464b;

    /* renamed from: c, reason: collision with root package name */
    private final x f33465c;

    /* renamed from: d, reason: collision with root package name */
    private final y f33466d;

    /* renamed from: e, reason: collision with root package name */
    private final af f33467e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f33468f;

    public e(a aVar, com.waze.shared_infra.o.a aVar2, com.waze.sharedui.b.d dVar, x xVar, y yVar, com.waze.shared_infra.i.e eVar, h.c.j jVar) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(aVar2, "stringProvider");
        h.g.b.x.f(dVar, "reporter");
        h.g.b.x.f(xVar, DownloadService.KEY_REQUIREMENTS);
        h.g.b.x.f(yVar, "userState");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f33463a = aVar;
        this.f33464b = dVar;
        this.f33465c = xVar;
        this.f33466d = yVar;
        af afVarE = aj.e(jVar.plus(aj.Q()));
        this.f33467e = afVarE;
        ch chVarC = aVar.c();
        ch chVarB = aVar.b();
        kotlinx.coroutines.b.k kVarG = com.waze.shared_infra.h.b.g(yVar);
        int i2 = ar.f48106a;
        kotlinx.coroutines.b.k kVarS = ai.s(chVarC, chVarB, kVarG, xVar.d(new m(u.class)), new d(eVar, aVar2, null));
        int i3 = bz.f51630a;
        this.f33468f = ai.V(kVarS, afVarE, by.c(), null);
    }

    @Override // com.waze.al.a.a
    public final ch a() {
        return this.f33468f;
    }

    @Override // com.waze.al.a.a
    public final void b(List list) {
        h.g.b.x.f(list, "stringResIds");
        this.f33464b.reportAuditEvent(new com.waze.sharedui.b.a(p.WAZE_ACCEPTED_PRIVACY_BUMP, i.b.a.m.POP_UP, o.ENABLED, "", list));
        this.f33463a.d();
    }
}
