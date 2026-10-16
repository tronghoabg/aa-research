package com.waze.o.b.b;

import com.waze.o.c.b.s;
import com.waze.reports_v2.b.ab;
import com.waze.reports_v2.b.ap;
import com.waze.reports_v2.b.aq;
import com.waze.t.b.as;
import com.waze.t.b.bo;
import com.waze.t.b.bt;
import com.waze.t.b.bu;
import h.g.b.x;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32749a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.o.c.c.d f32750b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.m.a f32751c;

    /* renamed from: d, reason: collision with root package name */
    private final m f32752d;

    /* renamed from: e, reason: collision with root package name */
    private final aq f32753e;

    /* renamed from: f, reason: collision with root package name */
    private final af f32754f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.t.b.h f32755g;

    /* renamed from: h, reason: collision with root package name */
    private br f32756h;

    /* renamed from: i, reason: collision with root package name */
    private br f32757i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f32758j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f32759k;

    public k(h.c.j jVar, com.waze.shared_infra.i.e eVar, com.waze.o.c.c.d dVar, com.waze.shared_infra.m.a aVar, m mVar, aq aqVar) {
        x.f(jVar, "coroutineContext");
        x.f(eVar, "logger");
        x.f(dVar, "controllerStarter");
        x.f(aVar, "mediaVolumeRepository");
        x.f(mVar, "reportLocationSnapper");
        x.f(aqVar, "reportPointsProvider");
        this.f32749a = eVar;
        this.f32750b = dVar;
        this.f32751c = aVar;
        this.f32752d = mVar;
        this.f32753e = aqVar;
        this.f32754f = aj.e(jVar.plus(aj.Q()));
        this.f32756h = h.g.b.o.i();
        bn bnVarB = ck.b(bu.f40761a);
        this.f32758j = bnVarB;
        this.f32759k = ai.U(bnVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object b(com.waze.o.b.b.k r4, com.waze.t.b.h r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.o.b.b.g
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.o.b.b.g r0 = (com.waze.o.b.b.g) r0
            int r1 = r0.f32742c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32742c = r1
            goto L18
        L13:
            com.waze.o.b.b.g r0 = new com.waze.o.b.b.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f32740a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32742c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.ch r5 = r5.b()
            kotlinx.coroutines.b.k r5 = com.waze.t.b.bz.e(r5)
            com.waze.o.b.b.h r6 = new com.waze.o.b.b.h
            r6.<init>(r4)
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            r0.f32742c = r3
            java.lang.Object r5 = r5.collect(r6, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r4.j()
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.o.b.b.k.b(com.waze.o.b.b.k, com.waze.t.b.h, h.c.e):java.lang.Object");
    }

    private final void h() {
        br brVar = this.f32757i;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f32757i = aj.z(this.f32754f, null, null, new i(this, null), 3);
    }

    private final void i() {
        bn bnVar;
        Object objD;
        Object objD2;
        this.f32749a.a("startControllerAndObserve");
        do {
            bnVar = this.f32758j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bu.f40761a));
        as asVarA = this.f32750b.a(this.f32751c, new com.waze.car_lib.o.a(5));
        if (asVarA instanceof com.waze.t.b.d) {
            do {
                objD2 = bnVar.d();
            } while (!bnVar.f(objD2, new bo(((com.waze.t.b.d) asVarA).a().a())));
        } else {
            if (!(asVarA instanceof com.waze.t.b.f)) {
                throw new h.i();
            }
            com.waze.t.b.h hVarA = ((com.waze.t.b.f) asVarA).a();
            this.f32755g = hVarA;
            this.f32756h.s(null);
            this.f32756h = aj.z(this.f32754f, null, null, new j(this, hVarA, null), 3);
            h();
        }
    }

    private final void j() {
        Object objD;
        this.f32749a.a("stopConversation");
        com.waze.t.b.h hVar = this.f32755g;
        if (hVar != null) {
            List listA = hVar.a().a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (obj instanceof s) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.waze.bl.c.b.k kVarA = com.waze.bl.b.c.b.a(((s) it.next()).a());
                if (kVarA != null) {
                    arrayList2.add(kVarA);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((com.waze.bl.c.b.k) obj2).c()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it2 = arrayList3.iterator();
            int iA = 0;
            while (it2.hasNext()) {
                iA += ((com.waze.bl.c.b.k) it2.next()).a();
            }
            if (iA > 0) {
                this.f32753e.b(new ap(iA, ab.f34010b));
            }
        }
        com.waze.t.b.h hVar2 = this.f32755g;
        if (hVar2 != null) {
            hVar2.close();
        }
        this.f32755g = null;
        this.f32756h.s(null);
        br brVar = this.f32757i;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f32757i = null;
        bn bnVar = this.f32758j;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, bt.f40760a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32749a.a("close");
        j();
        aj.h(this.f32754f, null);
    }

    public final ch d() {
        return this.f32759k;
    }

    public final void e() {
        this.f32749a.a("endConversation");
        j();
    }

    public final void f() {
        this.f32749a.a("interrupt");
        com.waze.t.b.h hVar = this.f32755g;
        if (hVar != null) {
            hVar.c();
        } else {
            i();
        }
    }

    public final void g() {
        this.f32749a.a("startNewConversation");
        com.waze.t.b.h hVar = this.f32755g;
        if (hVar == null) {
            i();
        } else {
            h();
            hVar.d();
        }
    }
}
