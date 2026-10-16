package com.waze.br.c;

import com.waze.stats.ax;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import l.a.ayc;
import l.a.aye;
import l.a.ayf;
import l.a.ayg;
import l.a.azv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements o {

    /* renamed from: a, reason: collision with root package name */
    private final ax f17409a;

    /* renamed from: b, reason: collision with root package name */
    private final af f17410b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f17411c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.br.b.w f17412d;

    public t(com.waze.br.b.w wVar, ax axVar) {
        h.g.b.x.f(wVar, "searchMateController");
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f17412d = wVar;
        this.f17409a = axVar;
        af afVarP = com.waze.ui.a.l.p(this, null);
        this.f17410b = afVarP;
        s sVar = new s(wVar.g(), this);
        int i2 = bz.f51630a;
        this.f17411c = ai.V(sVar, afVarP, by.c(), i((com.waze.br.b.q) wVar.g().d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n i(com.waze.br.b.q qVar) {
        com.waze.br.b.o oVarA = qVar.a();
        if (oVarA == null) {
            return i.f17396a;
        }
        if (h.g.b.x.n(oVarA, com.waze.br.b.m.f17338a)) {
            return j.f17397a;
        }
        if (oVarA instanceof com.waze.br.b.k) {
            return new k(((com.waze.br.b.k) oVarA).a());
        }
        if (oVarA instanceof com.waze.br.b.l) {
            return new l(((com.waze.br.b.l) oVarA).a());
        }
        if (h.g.b.x.n(oVarA, com.waze.br.b.n.f17339a)) {
            return m.f17400a;
        }
        if (oVarA instanceof com.waze.br.b.g) {
            return new f(((com.waze.br.b.g) oVarA).a());
        }
        if (oVarA instanceof com.waze.br.b.i) {
            return new g(((com.waze.br.b.i) oVarA).a());
        }
        if (h.g.b.x.n(oVarA, com.waze.br.b.h.f17333a) || h.g.b.x.n(oVarA, com.waze.br.b.j.f17335a)) {
            return h.f17395a;
        }
        throw new h.i();
    }

    @Override // com.waze.br.c.o
    public final ch a() {
        return this.f17411c;
    }

    @Override // com.waze.br.c.o
    public final void b() {
        com.waze.z.a.e.c cVarC = com.waze.bs.a.c((n) this.f17411c.d());
        com.waze.z.a.e.c cVar = com.waze.z.a.e.c.f46025a;
        switch (cVarC.ordinal()) {
            case 0:
            case 6:
                this.f17412d.i();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.f17412d.h();
                return;
            default:
                throw new h.i();
        }
    }

    @Override // com.waze.br.c.o
    public final void c() {
        this.f17412d.h();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f17410b, null);
    }

    @Override // com.waze.br.c.o
    public final void d() {
        com.waze.shared_infra.coordinators.c cVarL = h.g.l(azv.newBuilder());
        e.a.f.a.e eVarJ = h.g.j(aye.newBuilder());
        eVarJ.y(ayc.SETTINGS);
        cVarL.ax(eVarJ.x());
        com.waze.sharedui.utils.o.D(this.f17409a, cVarL.ak());
    }

    @Override // com.waze.br.c.o
    public final void e() {
        com.waze.shared_infra.coordinators.c cVarL = h.g.l(azv.newBuilder());
        e.a.f.a.e eVarJ = h.g.j(aye.newBuilder());
        eVarJ.y(ayc.CLOSE);
        cVarL.ax(eVarJ.x());
        com.waze.sharedui.utils.o.D(this.f17409a, cVarL.ak());
    }

    @Override // com.waze.br.c.o
    public final void f() {
        com.waze.shared_infra.coordinators.c cVarL = h.g.l(azv.newBuilder());
        ayf ayfVarNewBuilder = ayg.newBuilder();
        h.g.b.x.f(ayfVarNewBuilder, "builder");
        ayg aygVarBuild = ayfVarNewBuilder.build();
        h.g.b.x.e(aygVarBuild, "build(...)");
        cVarL.ay(aygVarBuild);
        com.waze.sharedui.utils.o.D(this.f17409a, cVarL.ak());
    }

    @Override // com.waze.br.c.o
    public final void g() {
        com.waze.br.b.o oVarA = ((com.waze.br.b.q) this.f17412d.g().d()).a();
        if (oVarA instanceof com.waze.br.b.g) {
            ((com.waze.br.b.g) oVarA).a().b().a(true);
        }
    }
}
