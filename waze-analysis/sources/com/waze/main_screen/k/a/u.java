package com.waze.main_screen.k.a;

import com.waze.an.c.x;
import h.g.b.aq;
import h.g.b.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bl;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.b.g f26567a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26568b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.an.c.a.g f26569c;

    /* renamed from: d, reason: collision with root package name */
    private final x f26570d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.an.e.a f26571e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26572f;

    /* renamed from: g, reason: collision with root package name */
    private final af f26573g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f26574h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f26575i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f26576j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f26577k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26578l;

    public u(com.waze.an.b.g gVar, com.waze.shared_infra.i.e eVar, com.waze.an.c.a.g gVar2, x xVar, com.waze.an.e.a aVar, boolean z) {
        h.g.b.x.f(gVar, "insightPolicy");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(gVar2, "stateHolderFactory");
        h.g.b.x.f(xVar, "insightStateMapper");
        h.g.b.x.f(aVar, "insightStatsReporter");
        this.f26567a = gVar;
        this.f26568b = eVar;
        this.f26569c = gVar2;
        this.f26570d = xVar;
        this.f26571e = aVar;
        this.f26572f = z;
        af afVarP = com.waze.ui.a.l.p(this, null);
        this.f26573g = afVarP;
        int i2 = 1;
        this.f26574h = ck.b(true);
        aq aqVar = new aq();
        aqVar.f48105a = new a(null, null);
        k kVar = new k(gVar.a(), aqVar, this);
        int i3 = bz.f51630a;
        bq bqVarB = bl.b(kVar, afVarP, by.b(), 0);
        this.f26575i = bqVarB;
        ch chVarV = ai.V(ai.R(bqVarB, new h(null, this)), afVarP, by.b(), h.a.i.h());
        this.f26576j = chVarV;
        g gVar3 = new g(chVarV, 0);
        bz bzVarB = by.b();
        Iterable iterable = (Iterable) chVarV.d();
        ArrayList arrayList = new ArrayList(h.a.i.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.an.c.w) it.next()).b());
        }
        this.f26577k = ai.V(gVar3, this.f26573g, bzVarB, new b(arrayList, true, true));
        this.f26578l = true;
        aj.z(this.f26573g, null, null, new r(this, null, 1, null), 3);
        aj.z(this.f26573g, null, null, new r(this, null, 0), 3);
        ai.m(ai.K(this.f26575i, new l(this, null)), this.f26573g);
        aq aqVar2 = new aq();
        aqVar2.f48105a = h.a.i.h();
        ai.m(ai.K(ai.z(this.f26576j, new p(i2)), new s(this, aqVar2, null)), this.f26573g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
    
        if (kotlinx.coroutines.aj.p(r0) != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.main_screen.k.a.u r10, com.waze.an.c.af r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.k.a.u.e(com.waze.main_screen.k.a.u, com.waze.an.c.af, h.c.e):java.lang.Object");
    }

    static final boolean m(List list, List list2) {
        h.g.b.x.f(list, "oldResults");
        h.g.b.x.f(list2, "newResults");
        List list3 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(o((com.waze.an.c.w) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        List list4 = list2;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList3.add(o((com.waze.an.c.w) it2.next()));
        }
        return h.g.b.x.n(h.a.i.au(arrayList2), h.a.i.au(arrayList3));
    }

    private static final t o(com.waze.an.c.w wVar) {
        com.waze.location.q qVarH = wVar.a().h();
        Class<?> cls = wVar.b().getClass();
        int i2 = ar.f48106a;
        return new t(qVarH, new h.g.b.m(cls), wVar.b().e());
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26568b.a("Closed");
        aj.h(this.f26573g, null);
    }

    public final kotlinx.coroutines.b.k g(com.waze.an.c.j jVar) {
        h.g.b.x.f(jVar, "insightFTEStateHolder");
        return ai.q(jVar.c(), this.f26574h, new m(this, jVar, null));
    }

    public final ch h() {
        return this.f26577k;
    }

    public final void i(boolean z) {
        this.f26574h.e(Boolean.valueOf(z));
    }

    public final void j(boolean z) {
        if (this.f26578l != z) {
            this.f26578l = z;
            this.f26568b.g("state holder callbacks state changed callbacksEnabled=" + z);
        }
    }

    public final boolean k() {
        return this.f26578l;
    }

    public final boolean l() {
        return this.f26572f;
    }

    public final kotlinx.coroutines.b.k n(com.waze.an.c.af afVar, com.waze.an.c.a.p pVar) {
        ch chVarF;
        ch chVarB;
        return ai.r((afVar == null || (chVarB = afVar.b()) == null) ? ai.G(null) : chVarB, (pVar == null || (chVarF = pVar.f()) == null) ? ai.G(null) : chVarF, this.f26574h, new n(this, pVar, afVar, null));
    }
}
