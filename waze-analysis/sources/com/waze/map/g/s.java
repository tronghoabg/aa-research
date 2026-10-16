package com.waze.map.g;

import com.waze.map.ai;
import com.waze.map.b.am;
import com.waze.map.b.bg;
import com.waze.map.b.cl;
import com.waze.map.b.cn;
import com.waze.map.b.co;
import com.waze.map.b.cq;
import com.waze.map.b.ct;
import com.waze.map.b.ed;
import com.waze.map.canvas.bj;
import com.waze.map.canvas.bk;
import com.waze.map.canvas.br;
import com.waze.navigate.fr;
import java.io.Closeable;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s implements Closeable, br {

    /* renamed from: a, reason: collision with root package name */
    private final ed f29092a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.isolated.l f29093b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f29094c;

    /* renamed from: d, reason: collision with root package name */
    private final h f29095d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f29096e;

    /* renamed from: f, reason: collision with root package name */
    private final f f29097f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29098g;

    /* renamed from: h, reason: collision with root package name */
    private final h.c.j f29099h;

    /* renamed from: i, reason: collision with root package name */
    private final x f29100i;

    /* renamed from: j, reason: collision with root package name */
    private final fr f29101j;

    /* renamed from: k, reason: collision with root package name */
    private bg f29102k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f29103l;
    private final bn m;
    private final af n;
    private final w o;

    public s(ed edVar, com.waze.map.isolated.l lVar, com.waze.shared_infra.q.e eVar, h hVar, ai aiVar, kotlinx.coroutines.b.k kVar, t tVar, f fVar, com.waze.shared_infra.i.e eVar2, h.c.j jVar, x xVar, fr frVar) {
        h.g.b.x.f(edVar, "mapController");
        h.g.b.x.f(lVar, "mapControllersStack");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(hVar, "navigationAreaGetter");
        h.g.b.x.f(aiVar, "mapLineResolver");
        h.g.b.x.f(kVar, "userLocationPositionBottomOffsetPx");
        h.g.b.x.f(tVar, "northLockHelperFactory");
        h.g.b.x.f(fVar, "config");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(xVar, "automaticRecenterHelper");
        h.g.b.x.f(frVar, "rerouteDetector");
        this.f29092a = edVar;
        this.f29093b = lVar;
        this.f29094c = eVar;
        this.f29095d = hVar;
        this.f29096e = kVar;
        this.f29097f = fVar;
        this.f29098g = eVar2;
        this.f29099h = jVar;
        this.f29100i = xVar;
        this.f29101j = frVar;
        this.f29103l = lVar.b();
        this.m = ck.b(null);
        af afVarE = aj.e(jVar);
        this.n = afVarE;
        w wVar = new w(((Boolean) fVar.b().d()).booleanValue());
        this.o = wVar;
        aj.z(afVarE, null, null, new c(this, (h.c.e) null, 1, (byte[]) null), 3);
        aj.z(afVarE, null, null, new c(this, null, 0), 3);
        aj.z(afVarE, null, null, new j(xVar.d(edVar), this, (h.c.e) null, 1, (byte[]) null), 3);
        bg bgVar = new bg(null, new cn(y(fVar), wVar.h()), wVar.b(), false, 1);
        edVar.a(bgVar);
        this.f29102k = bgVar;
        aj.z(afVarE, null, null, new c(this, (h.c.e) null, 2, (char[]) null), 3);
    }

    static final bg a(bk bkVar, s sVar, boolean z, bg bgVar) {
        h.g.b.x.f(bgVar, "it");
        return new bg(null, new cq(bkVar.b(), null, bkVar.a(), bkVar.c(), bkVar.d(), 2), sVar.o.a(), z, 1);
    }

    static final bg b(com.waze.shared_infra.h.a aVar, s sVar, boolean z, bg bgVar) {
        h.g.b.x.f(bgVar, "it");
        return new bg(null, new co(aVar.h(), ct.f28166b, 1.4f), sVar.o.a(), z, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object j(com.waze.map.g.s r5, boolean r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.map.g.r
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.g.r r0 = (com.waze.map.g.r) r0
            int r1 = r0.f29091d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29091d = r1
            goto L18
        L13:
            com.waze.map.g.r r0 = new com.waze.map.g.r
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f29089b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29091d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r6 = r0.f29088a
            e.b.c.b(r7)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            e.b.c.b(r7)
            com.waze.shared_infra.i.e r7 = r5.f29098g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "showOverview(animated:"
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r4 = ") called"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            com.waze.map.g.h r7 = r5.f29095d
            r0.f29088a = r6
            r0.f29091d = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            com.waze.shared_infra.h.a r7 = (com.waze.shared_infra.h.a) r7
            com.waze.map.g.a r0 = new com.waze.map.g.a
            r0.<init>(r7, r5, r6, r3)
            r5.v(r0)
            kotlinx.coroutines.b.bn r5 = r5.m
            com.waze.map.canvas.bj r6 = com.waze.map.canvas.bj.f28599a
            r5.e(r6)
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.g.s.j(com.waze.map.g.s, boolean, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void n(s sVar, bk bkVar, boolean z) {
        sVar.f29098g.a("centerOnPosition(" + bkVar + ") called");
        sVar.v(new a(bkVar, sVar, z, 0));
        sVar.m.e(bj.f28603e);
    }

    static final bg s(s sVar, com.waze.destination_cell.b.e eVar, boolean z, bg bgVar) {
        h.g.b.x.f(bgVar, "it");
        return new bg(null, new cn(y(sVar.f29097f), eVar), sVar.o.a(), z, 1);
    }

    public static final /* synthetic */ void t(s sVar, boolean z, com.waze.destination_cell.b.e eVar) {
        sVar.f29098g.a("centerOnMe(animated:" + z + ") called");
        sVar.v(new a(sVar, eVar, z, 2));
        sVar.m.e(bj.f28601c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(h.g.a.l lVar) {
        bg bgVar = (bg) lVar.invoke(this.f29102k);
        if (bgVar != null) {
            this.f29102k = bgVar;
            this.f29092a.a(bgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(String str) {
        return h.g.b.x.n(str, "yes") || h.g.b.x.n(str, "speed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.z.a.e.b y(f fVar) {
        return x((String) fVar.a().d()) ? com.waze.map.b.ck.f28150a : cl.f28151a;
    }

    @Override // com.waze.map.canvas.br
    public final kotlinx.coroutines.b.k C() {
        return new o(this.f29092a.w(), 2);
    }

    @Override // com.waze.map.canvas.br
    public final kotlinx.coroutines.b.k D() {
        return new o(this.f29092a.u(), 3);
    }

    @Override // com.waze.map.canvas.br
    public final ch J() {
        return this.m;
    }

    @Override // com.waze.map.canvas.br
    public final void N(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
    }

    @Override // com.waze.map.canvas.br
    public final void O(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        aj.z(this.n, null, null, new j(kVar, this, (h.c.e) null, 0), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void P(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        this.f29098g.a("consumeDarkOverlayRequests() called");
        aj.z(this.n, null, null, new j(kVar, this, (h.c.e) null, 2, (char[]) null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void Q(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        aj.z(this.n, null, null, new j(kVar, this, (h.c.e) null, 3, (short[]) null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void R(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        c cVar = new c(this, (h.c.e) null, 3, (short[]) null);
        af afVar = this.n;
        aj.z(afVar, null, null, cVar, 3);
        aj.z(afVar, null, null, new c(this, (h.c.e) null, 4, (int[]) null), 3);
        aj.z(afVar, null, null, new j(kVar, this, (h.c.e) null, 4, (int[]) null), 3);
        aj.z(afVar, null, null, new c(this, (h.c.e) null, 5, (boolean[]) null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void S(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        this.f29098g.a("consumeStateRequests() called");
        aj.z(this.n, null, null, new j(kVar, this, (h.c.e) null, 5, (boolean[]) null), 3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.n, null);
    }

    public final ch m() {
        return this.f29103l;
    }

    @Override // com.waze.map.canvas.br
    public final com.waze.shared_infra.s.d w(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "onEvent");
        j jVar = new j(this, lVar, (h.c.e) null, 10, (int[]) null);
        af afVar = this.n;
        aj.z(afVar, null, null, jVar, 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 11, (boolean[]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 12, (float[]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 13, (byte[][]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 14, (char[][]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 15, (short[][]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 16, (int[][]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 17, (boolean[][]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 18, (float[][]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 6), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 7, (byte[]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 8, (char[]) null), 3);
        aj.z(afVar, null, null, new j(this, lVar, (h.c.e) null, 9, (short[]) null), 3);
        return new am(afVar, 2);
    }
}
