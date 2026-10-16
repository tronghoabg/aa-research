package com.waze.cf.d;

import com.google.v.dm;
import com.google.v.du;
import com.waze.search.bn;
import h.ab;
import h.g.b.w;
import h.g.b.x;
import kotlinx.coroutines.a.s;
import kotlinx.coroutines.a.t;
import l.a.acv;
import l.a.agw;
import l.a.agy;
import l.a.ahi;
import l.a.ahk;
import l.a.ahn;
import l.a.ahr;
import l.a.aht;
import l.a.ahy;
import l.a.air;
import l.a.ait;
import l.a.aiz;
import l.a.aja;
import l.a.ajc;
import l.a.ajf;
import l.a.ajo;
import l.a.ajq;
import l.a.ajt;
import l.a.ajv;
import l.a.ald;
import l.a.alh;
import l.a.alk;
import l.a.alr;
import l.a.alt;
import l.a.aqo;
import l.a.az;
import l.a.bc;
import l.a.be;
import l.a.bfu;
import l.a.bg;
import l.a.hi;
import l.a.hr;
import l.a.ht;
import l.a.hu;
import l.a.hw;
import l.a.lo;
import l.a.lq;
import l.a.oy;
import l.a.pa;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22232a;

    public c(h.g.a.a aVar) {
        x.f(aVar, "isReallyReady");
        this.f22232a = w.c(-1, null, null, 6);
    }

    public final void A(hi hiVar) {
        x.f(hiVar, "value");
        ((ahr) this.f22232a).b(hiVar);
    }

    public final void B(ahi ahiVar) {
        x.f(ahiVar, "value");
        ((ahr) this.f22232a).d(ahiVar);
    }

    public final void C(ahk ahkVar) {
        x.f(ahkVar, "value");
        ((ahr) this.f22232a).e(ahkVar);
    }

    public final void D(ahn ahnVar) {
        x.f(ahnVar, "value");
        ((ahr) this.f22232a).f(ahnVar);
    }

    public final /* synthetic */ agy E() {
        du duVarBuild = ((dm) this.f22232a).build();
        x.e(duVarBuild, "build(...)");
        return (agy) duVarBuild;
    }

    public final void F(az azVar) {
        x.f(azVar, "value");
        ((agw) this.f22232a).d(azVar);
    }

    public final void G(bc bcVar) {
        x.f(bcVar, "value");
        ((agw) this.f22232a).e(bcVar);
    }

    public final void H(be beVar) {
        x.f(beVar, "value");
        ((agw) this.f22232a).f(beVar);
    }

    public final void I(bg bgVar) {
        x.f(bgVar, "value");
        ((agw) this.f22232a).g(bgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.cf.d.a
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.cf.d.a r0 = (com.waze.cf.d.a) r0
            int r1 = r0.f22231c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22231c = r1
            goto L18
        L13:
            com.waze.cf.d.a r0 = new com.waze.cf.d.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22229a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22231c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r5)
            goto L4a
        L2f:
            e.b.c.b(r5)
            java.lang.Object r4 = r4.f22232a
            com.waze.search.bn r4 = (com.waze.search.bn) r4
            kotlinx.coroutines.b.bq r4 = r4.a()
            com.waze.cf.d.b r5 = new com.waze.cf.d.b
            r5.<init>()
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5
            r0.f22231c = r3
            java.lang.Object r4 = r4.collect(r5, r0)
            if (r4 != r1) goto L4a
            return r1
        L4a:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.cf.d.c.a(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.a.o] */
    public final void b() throws Throwable {
        Object objI = this.f22232a.i(ab.f48028a);
        if (objI instanceof s) {
            Throwable thD = t.d(objI);
            if (thD != null) {
                throw thD;
            }
            throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }

    public final /* synthetic */ lq c() {
        du duVarBuild = ((dm) this.f22232a).build();
        x.e(duVarBuild, "build(...)");
        return (lq) duVarBuild;
    }

    public final void d(oy oyVar) {
        x.f(oyVar, "value");
        ((lo) this.f22232a).a(oyVar);
    }

    public final void e(pa paVar) {
        x.f(paVar, "value");
        ((lo) this.f22232a).b(paVar);
    }

    public final void f(ajo ajoVar) {
        x.f(ajoVar, "value");
        ((lo) this.f22232a).c(ajoVar);
    }

    public final void g(ajq ajqVar) {
        x.f(ajqVar, "value");
        ((lo) this.f22232a).d(ajqVar);
    }

    public final void h(ajt ajtVar) {
        x.f(ajtVar, "value");
        ((lo) this.f22232a).e(ajtVar);
    }

    public final void i(ajv ajvVar) {
        x.f(ajvVar, "value");
        ((lo) this.f22232a).f(ajvVar);
    }

    public final /* synthetic */ hw j() {
        du duVarBuild = ((dm) this.f22232a).build();
        x.e(duVarBuild, "build(...)");
        return (hw) duVarBuild;
    }

    public final void k(hr hrVar) {
        x.f(hrVar, "value");
        ((hu) this.f22232a).a(hrVar);
    }

    public final void l(ht htVar) {
        x.f(htVar, "value");
        ((hu) this.f22232a).b(htVar);
    }

    public final /* synthetic */ alt m() {
        du duVarBuild = ((dm) this.f22232a).build();
        x.e(duVarBuild, "build(...)");
        return (alt) duVarBuild;
    }

    public final void n(ald aldVar) {
        x.f(aldVar, "value");
        ((alr) this.f22232a).a(aldVar);
    }

    public final void o(alh alhVar) {
        x.f(alhVar, "value");
        ((alr) this.f22232a).b(alhVar);
    }

    public final void p(alk alkVar) {
        x.f(alkVar, "value");
        ((alr) this.f22232a).c(alkVar);
    }

    public final /* synthetic */ ajc q() {
        du duVarBuild = ((dm) this.f22232a).build();
        x.e(duVarBuild, "build(...)");
        return (ajc) duVarBuild;
    }

    public final void r(acv acvVar) {
        x.f(acvVar, "value");
        ((aja) this.f22232a).a(acvVar);
    }

    public final void s(ahy ahyVar) {
        x.f(ahyVar, "value");
        ((aja) this.f22232a).b(ahyVar);
    }

    public final void t(air airVar) {
        x.f(airVar, "value");
        ((aja) this.f22232a).c(airVar);
    }

    public final void u(ait aitVar) {
        x.f(aitVar, "value");
        ((aja) this.f22232a).d(aitVar);
    }

    public final void v(aiz aizVar) {
        x.f(aizVar, "value");
        ((aja) this.f22232a).e(aizVar);
    }

    public final void w(ajf ajfVar) {
        x.f(ajfVar, "value");
        ((aja) this.f22232a).f(ajfVar);
    }

    public final void x(aqo aqoVar) {
        x.f(aqoVar, "value");
        ((aja) this.f22232a).h(aqoVar);
    }

    public final void y(bfu bfuVar) {
        x.f(bfuVar, "value");
        ((aja) this.f22232a).i(bfuVar);
    }

    public final /* synthetic */ aht z() {
        du duVarBuild = ((dm) this.f22232a).build();
        x.e(duVarBuild, "build(...)");
        return (aht) duVarBuild;
    }

    public c(bn bnVar) {
        x.f(bnVar, "searchQueryBroadcaster");
        this.f22232a = bnVar;
    }

    public /* synthetic */ c(dm dmVar) {
        this.f22232a = dmVar;
    }
}
