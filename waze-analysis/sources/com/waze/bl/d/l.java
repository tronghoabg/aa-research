package com.waze.bl.d;

import android.app.Application;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import com.waze.bl.b.c.r;
import com.waze.reports_v2.b.at;
import com.waze.t.b.as;
import com.waze.t.b.bo;
import com.waze.t.b.bu;
import com.waze.t.b.bw;
import com.waze.t.c.n;
import com.waze.ui.f.s;
import com.waze.ui.f.t;
import com.waze.ui.f.u;
import com.waze.ui.f.v;
import com.waze.ui.w.b.aq;
import com.waze.ui.w.b.ar;
import com.waze.ui.w.b.bj;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final Application f17096a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17097b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bl.c.c.d f17098c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.m.a f17099d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.bl.c.d.a f17100e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bl.c.c.c f17101f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.bl.c.c.g f17102g;

    /* renamed from: h, reason: collision with root package name */
    private final af f17103h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.t.b.h f17104i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f17105j;

    /* renamed from: k, reason: collision with root package name */
    private final b f17106k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f17107l;
    private final bm m;
    private final bq n;

    public /* synthetic */ l(Application application, com.waze.shared_infra.i.e eVar, com.waze.bl.c.c.d dVar, com.waze.shared_infra.m.a aVar, com.waze.bl.c.d.a aVar2, com.waze.bl.c.c.c cVar, com.waze.bl.c.c.g gVar) {
        this.f17096a = application;
        this.f17097b = eVar;
        this.f17098c = dVar;
        this.f17099d = aVar;
        this.f17100e = aVar2;
        this.f17101f = cVar;
        this.f17102g = gVar;
        af afVarP = com.waze.ui.a.l.p(this, null);
        this.f17103h = afVarP;
        bn bnVarB = ck.b(bu.f40761a);
        this.f17105j = bnVarB;
        b bVarK = k((bw) bnVarB.d(), com.waze.bl.c.c.e.f17027a);
        this.f17106k = bVarK;
        kotlinx.coroutines.b.k kVarK = ai.K(ai.y(ai.P(bnVarB, bVarK, new j(this, null))), new k(this, null));
        int i2 = bz.f51630a;
        this.f17107l = ai.V(kVarK, afVarP, by.b(), bVarK);
        bm bmVarE = kotlinx.coroutines.b.bu.e(0, 0, null, 7);
        this.m = bmVarE;
        this.n = ai.S(bmVarE);
        eVar.a("init this:" + System.identityHashCode(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.bl.d.l r4, com.waze.t.b.h r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.bl.d.f
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.bl.d.f r0 = (com.waze.bl.d.f) r0
            int r1 = r0.f17083d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17083d = r1
            goto L18
        L13:
            com.waze.bl.d.f r0 = new com.waze.bl.d.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17081b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f17083d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f17080a
            com.waze.t.b.h r5 = (com.waze.t.b.h) r5
            e.b.c.b(r6)
            goto L4f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r6)
            kotlinx.coroutines.b.ch r6 = r5.b()
            kotlinx.coroutines.b.k r6 = com.waze.t.b.bz.d(r6)
            com.waze.bl.d.g r2 = new com.waze.bl.d.g
            r2.<init>(r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f17080a = r5
            r0.f17083d = r3
            java.lang.Object r6 = r6.collect(r2, r0)
            if (r6 == r1) goto Lea
        L4f:
            com.waze.t.b.ar r5 = r5.a()
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r5 = r5.iterator()
        L64:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r5.next()
            com.waze.bl.c.b.j r0 = (com.waze.bl.c.b.j) r0
            com.waze.bl.c.b.k r0 = com.waze.bl.b.c.b.a(r0)
            if (r0 == 0) goto L64
            r6.add(r0)
            goto L64
        L7a:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r6 = r6.iterator()
        L89:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.waze.bl.c.b.k r1 = (com.waze.bl.c.b.k) r1
            boolean r1 = r1.c()
            if (r1 == 0) goto L89
            r5.add(r0)
            goto L89
        La0:
            java.util.List r5 = (java.util.List) r5
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lb0
            com.waze.bl.d.e r5 = com.waze.bl.d.e.f17079a
            com.waze.bl.d.a.d r5 = (com.waze.bl.d.a.d) r5
            r4.l(r5)
            goto Le7
        Lb0:
            java.lang.Object r6 = h.a.i.T(r5)
            com.waze.bl.c.b.k r6 = (com.waze.bl.c.b.k) r6
            com.waze.reports_v2.b.at r0 = r6.b()
            com.waze.bl.c.d.a r1 = r4.f17100e
            com.waze.reports_v2.b.at r6 = r6.b()
            com.waze.ui.w.b.bj r6 = r1.a(r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        Lcb:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Ldd
            java.lang.Object r2 = r5.next()
            com.waze.bl.c.b.k r2 = (com.waze.bl.c.b.k) r2
            int r2 = r2.a()
            int r1 = r1 + r2
            goto Lcb
        Ldd:
            com.waze.bl.d.d r5 = new com.waze.bl.d.d
            r5.<init>(r0, r6, r1)
            com.waze.bl.d.a.d r5 = (com.waze.bl.d.a.d) r5
            r4.l(r5)
        Le7:
            h.ab r4 = h.ab.f48028a
            return r4
        Lea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bl.d.l.c(com.waze.bl.d.l, com.waze.t.b.h, h.c.e):java.lang.Object");
    }

    private final void j() {
        Object objD;
        if (ActivityCompat.checkSelfPermission(this.f17096a, "android.permission.RECORD_AUDIO") != 0) {
            this.f17097b.b("Error initializing controller: No RECORD_AUDIO permission.");
            close();
            l(c.f17075a);
            return;
        }
        as asVarA = this.f17098c.a(this.f17099d, new com.waze.car_lib.o.a(5));
        if (asVarA instanceof com.waze.t.b.d) {
            bn bnVar = this.f17105j;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, new bo(((com.waze.t.b.d) asVarA).a().a())));
            return;
        }
        if (!(asVarA instanceof com.waze.t.b.f)) {
            throw new h.i();
        }
        this.f17104i = ((com.waze.t.b.f) asVarA).a();
        this.f17097b.a("StartResult.Success this:" + System.identityHashCode(this) + ", controller: " + System.identityHashCode(this.f17104i));
        af afVar = this.f17103h;
        aj.z(afVar, null, null, new h(this, asVarA, (h.c.e) null, 0), 3);
        aj.z(afVar, null, null, new i(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b k(bw bwVar, r rVar) {
        aq aqVar;
        at atVarB;
        com.waze.bl.c.b.j jVarB = r.b(bwVar);
        if (jVarB != null) {
            rVar = com.waze.bl.d.a.d.d(jVarB);
        }
        com.waze.bl.c.b.j jVarB2 = r.b(bwVar);
        bj bjVarA = null;
        if (jVarB2 != null && r.c(jVarB2)) {
            if (jVarB2 instanceof com.waze.bl.c.b.g) {
                atVarB = ((com.waze.bl.c.b.g) jVarB2).b();
            } else if (jVarB2 instanceof com.waze.bl.c.b.i) {
                atVarB = ((com.waze.bl.c.b.i) jVarB2).a().b();
            } else if (jVarB2 instanceof com.waze.bl.c.b.h) {
                atVarB = ((com.waze.bl.c.b.h) jVarB2).b();
            } else if (!(jVarB2 instanceof com.waze.bl.c.b.f)) {
                throw new h.i();
            }
            bjVarA = this.f17100e.a(atVarB);
        }
        com.waze.ui.f.aj ajVar = bjVarA != null ? new com.waze.ui.f.aj(bjVarA) : n.a(bwVar);
        if (x.n(rVar, com.waze.bl.c.c.e.f17027a)) {
            aqVar = aq.f43603b;
        } else {
            if (!(rVar instanceof com.waze.bl.c.c.f)) {
                throw new h.i();
            }
            aqVar = aq.f43602a;
        }
        return new b(new ar(ajVar, aqVar, this.f17101f.k()), rVar);
    }

    private final void l(com.waze.bl.d.a.d dVar) {
        Objects.toString(dVar);
        this.f17097b.a("sendCommandToUi : ".concat(dVar.toString()));
        aj.z(this.f17103h, null, null, new h(this, dVar, (h.c.e) null, 1), 3);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17097b.a("close this:" + System.identityHashCode(this) + ", controller: " + this.f17104i + ")");
        aj.h(this.f17103h, null);
        com.waze.t.b.h hVar = this.f17104i;
        if (hVar != null) {
            hVar.close();
        }
        this.f17104i = null;
    }

    public final bq f() {
        return this.n;
    }

    public final ch g() {
        return this.f17107l;
    }

    public final void h(v vVar) {
        x.f(vVar, NotificationCompat.CATEGORY_EVENT);
        Objects.toString(vVar);
        this.f17097b.a("handleEvent: ".concat(vVar.toString()));
        if (x.n(vVar, u.f42313a)) {
            j();
            return;
        }
        if (!x.n(vVar, t.f42312a)) {
            if (!x.n(vVar, s.f42311a)) {
                throw new h.i();
            }
            close();
        } else {
            com.waze.t.b.h hVar = this.f17104i;
            if (hVar != null) {
                hVar.c();
            } else {
                j();
            }
        }
    }
}
