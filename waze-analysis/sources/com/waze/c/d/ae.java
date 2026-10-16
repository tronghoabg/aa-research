package com.waze.c.d;

import com.waze.navigate.ci;
import com.waze.navigate.cj;
import com.waze.navigate.ck;
import com.waze.navigate.de;
import com.waze.navigate.ei;
import com.waze.navigate.eo;
import com.waze.navigate.fr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.c.b.a f18270a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.modules.navigation.a f18271b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.modules.c.ar f18272c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.c f18273d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.modules.navigation.ak f18274e;

    /* renamed from: f, reason: collision with root package name */
    private final fr f18275f;

    /* renamed from: g, reason: collision with root package name */
    private final eo f18276g;

    /* renamed from: h, reason: collision with root package name */
    private final cj f18277h;

    /* renamed from: i, reason: collision with root package name */
    private final af f18278i;

    /* renamed from: j, reason: collision with root package name */
    private final am f18279j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18280k;

    /* renamed from: l, reason: collision with root package name */
    private final t f18281l;
    private final bn m;
    private final ch n;
    private com.waze.c.b.j o;

    public /* synthetic */ ae(com.waze.c.b.a aVar, com.waze.modules.navigation.a aVar2, com.waze.modules.c.ar arVar, com.waze.sharedui.e.c cVar, com.waze.modules.navigation.ak akVar, fr frVar, eo eoVar, cj cjVar, af afVar, am amVar, com.waze.shared_infra.i.e eVar) {
        h.o.a aVarZ;
        de deVarC;
        ck ckVarB;
        this.f18270a = aVar;
        this.f18271b = aVar2;
        this.f18272c = arVar;
        this.f18273d = cVar;
        this.f18274e = akVar;
        this.f18275f = frVar;
        this.f18276g = eoVar;
        this.f18277h = cjVar;
        this.f18278i = afVar;
        this.f18279j = amVar;
        this.f18280k = eVar;
        ci ciVar = (ci) cjVar.P().d();
        Long lValueOf = null;
        if (ciVar == null || (ckVarB = ciVar.b()) == null) {
            aVarZ = null;
        } else {
            int iA = ckVarB.a();
            h.o.c cVar2 = h.o.a.f48264a;
            aVarZ = h.o.a.z(h.o.c.i(iA, h.o.d.f48274e));
        }
        ci ciVar2 = (ci) cjVar.P().d();
        if (ciVar2 != null && (deVarC = ciVar2.c()) != null) {
            lValueOf = Long.valueOf(deVarC.b());
        }
        i iVar = new i(arVar, aVarZ != null ? aVarZ.w() : arVar.b(), lValueOf != null ? lValueOf.longValue() : arVar.c());
        t tVar = new t(q.f18383a, h.a.i.d(iVar), new com.waze.modules.navigation.am(cVar), akVar, (com.waze.shared_infra.h.c) eoVar.ak().d(), (ei) eoVar.ah().d(), iVar);
        this.f18281l = tVar;
        bn bnVarB = kotlinx.coroutines.b.ck.b(tVar);
        this.m = bnVarB;
        this.n = kotlinx.coroutines.b.ai.U(bnVarB);
        this.o = com.waze.c.b.g.f18243a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.c.d.ae r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.c.d.u
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.c.d.u r0 = (com.waze.c.d.u) r0
            int r1 = r0.f18394c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18394c = r1
            goto L18
        L13:
            com.waze.c.d.u r0 = new com.waze.c.d.u
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18392a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18394c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            e.b.c.b(r6)
            goto L4d
        L2f:
            e.b.c.b(r6)
            com.waze.navigate.eo r6 = r5.f18276g
            kotlinx.coroutines.b.ch r6 = r6.ah()
            kotlinx.coroutines.b.bq r6 = (kotlinx.coroutines.b.bq) r6
            com.waze.c.d.v r2 = new com.waze.c.d.v
            r4 = 0
            r2.<init>(r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r6 = (kotlinx.coroutines.b.k) r6
            r0.f18394c = r3
            java.lang.Object r5 = kotlinx.coroutines.b.ai.e(r6, r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "SharedFlow never completes, this call should never return."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.d.ae.g(com.waze.c.d.ae, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object h(com.waze.c.d.ae r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.c.d.w
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.c.d.w r0 = (com.waze.c.d.w) r0
            int r1 = r0.f18399c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18399c = r1
            goto L18
        L13:
            com.waze.c.d.w r0 = new com.waze.c.d.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18397a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18399c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            e.b.c.b(r6)
            goto L4b
        L2f:
            e.b.c.b(r6)
            com.waze.navigate.fr r6 = r5.f18275f
            kotlinx.coroutines.b.bq r6 = r6.Y()
            com.waze.c.d.x r2 = new com.waze.c.d.x
            r4 = 0
            r2.<init>(r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r6 = (kotlinx.coroutines.b.k) r6
            r0.f18399c = r3
            java.lang.Object r5 = kotlinx.coroutines.b.ai.e(r6, r2, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "SharedFlow never completes, this call should never return."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.d.ae.h(com.waze.c.d.ae, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object i(com.waze.c.d.ae r12, h.c.e r13) {
        /*
            boolean r0 = r13 instanceof com.waze.c.d.y
            if (r0 == 0) goto L13
            r0 = r13
            com.waze.c.d.y r0 = (com.waze.c.d.y) r0
            int r1 = r0.f18405c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18405c = r1
            goto L18
        L13:
            com.waze.c.d.y r0 = new com.waze.c.d.y
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f18403a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18405c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r13)
            goto L79
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            e.b.c.b(r13)
            com.waze.navigate.eo r13 = r12.f18276g
            kotlinx.coroutines.b.ch r2 = r13.ak()
            java.lang.Object r2 = r2.d()
            if (r2 == 0) goto Lc1
            kotlinx.coroutines.b.bn r2 = r12.m
        L40:
            java.lang.Object r4 = r2.d()
            r5 = r4
            com.waze.c.d.t r5 = (com.waze.c.d.t) r5
            kotlinx.coroutines.b.ch r6 = r13.ak()
            java.lang.Object r6 = r6.d()
            r8 = r6
            com.waze.shared_infra.h.c r8 = (com.waze.shared_infra.h.c) r8
            r10 = 0
            r11 = 111(0x6f, float:1.56E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            com.waze.c.d.t r5 = com.waze.c.d.t.g(r5, r6, r7, r8, r9, r10, r11)
            boolean r4 = r2.f(r4, r5)
            if (r4 == 0) goto L40
            kotlinx.coroutines.b.ch r13 = r13.ak()
            kotlinx.coroutines.b.k r13 = (kotlinx.coroutines.b.k) r13
            com.waze.c.d.z r2 = new com.waze.c.d.z
            r4 = 0
            r2.<init>(r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f18405c = r3
            java.lang.Object r13 = kotlinx.coroutines.b.ai.i(r13, r2, r0)
            if (r13 != r1) goto L79
            return r1
        L79:
            kotlinx.coroutines.b.bn r4 = r12.m
        L7b:
            java.lang.Object r13 = r4.d()
            r5 = r13
            com.waze.c.d.t r5 = (com.waze.c.d.t) r5
            r10 = 0
            r11 = 111(0x6f, float:1.56E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.waze.c.d.t r0 = com.waze.c.d.t.g(r5, r6, r7, r8, r9, r10, r11)
            boolean r13 = r4.f(r13, r0)
            if (r13 == 0) goto L7b
            com.waze.c.b.a r13 = r12.f18270a
            kotlinx.coroutines.b.ch r13 = r13.c()
            java.lang.Object r13 = r13.d()
            com.waze.c.b.j r13 = (com.waze.c.b.j) r13
            boolean r0 = r13 instanceof com.waze.c.b.f
            if (r0 != 0) goto Lbc
            boolean r0 = r13 instanceof com.waze.c.b.i
            if (r0 != 0) goto Lbc
            boolean r0 = r13 instanceof com.waze.c.b.g
            if (r0 == 0) goto Lac
            goto Lbc
        Lac:
            boolean r13 = r13 instanceof com.waze.c.b.h
            if (r13 == 0) goto Lb6
            com.waze.c.d.ah r13 = com.waze.c.d.ah.f18286d
            r12.u(r13)
            goto Lc1
        Lb6:
            h.i r12 = new h.i
            r12.<init>()
            throw r12
        Lbc:
            com.waze.c.d.ah r13 = com.waze.c.d.ah.f18286d
            r12.v(r13)
        Lc1:
            h.ab r12 = h.ab.f48028a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.d.ae.i(com.waze.c.d.ae, h.c.e):java.lang.Object");
    }

    static final h.ab m(ae aeVar, kotlinx.coroutines.am amVar, Throwable th) {
        com.waze.shared_infra.i.e eVar = aeVar.f18280k;
        if (th != null) {
            eVar.c("Start navigation failed", th);
        } else {
            Object objE = amVar.e();
            Objects.toString(objE);
            eVar.a("Start navigation complete with result ".concat(String.valueOf(objE)));
        }
        return h.ab.f48028a;
    }

    static /* synthetic */ Object s(ae aeVar, ah ahVar, h.c.e eVar) {
        return aeVar.t(ahVar, false, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.waze.c.d.ah r12, boolean r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.d.ae.t(com.waze.c.d.ah, boolean, h.c.e):java.lang.Object");
    }

    private final void u(ah ahVar) {
        bn bnVar = this.m;
        this.f18279j.d(((t) bnVar.d()).f(), com.waze.a.af.l((t) bnVar.d()), ((t) bnVar.d()).e() != null, ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(ah ahVar) {
        bn bnVar = this.m;
        this.f18279j.d(h.a.i.d(com.waze.a.af.l((t) bnVar.d())), com.waze.a.af.l((t) bnVar.d()), ((t) bnVar.d()).e() != null, ahVar);
    }

    public final l b(l lVar, boolean z) {
        bn bnVar;
        Object objD;
        t tVarG;
        Object next;
        k kVarD;
        h.g.b.x.f(lVar, "alternativeRoute");
        do {
            bnVar = this.m;
            objD = bnVar.d();
            tVarG = (t) objD;
            Iterator it = tVarG.f().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (h.g.b.x.n(lVar.c().j(), ((m) it.next()).c().j())) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                if (lVar instanceof j) {
                    kVarD = j.e((j) lVar, z);
                } else {
                    if (!(lVar instanceof k)) {
                        throw new h.i();
                    }
                    kVarD = k.d((k) lVar, z);
                }
                List listAq = h.a.i.aq(tVarG.f());
                listAq.set(i2, kVarD);
                tVarG = t.g(tVarG, null, listAq, null, null, h.g.b.x.n(lVar, tVarG.a()) ? kVarD : tVarG.a(), 61);
            }
        } while (!bnVar.f(objD, tVarG));
        this.f18279j.d(tVarG.f(), com.waze.a.af.l(tVarG), tVarG.e() != null, ah.f18288f);
        List listF = tVarG.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof l) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (h.g.b.x.n(((l) next).c().j(), lVar.c().j())) {
                break;
            }
        }
        l lVar2 = (l) next;
        return lVar2 == null ? lVar : lVar2;
    }

    public final Object k(h.c.e eVar) {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.m;
            objD = bnVar.d();
        } while (!bnVar.f(objD, this.f18281l));
        Object objS = s(this, ah.f18287e, eVar);
        return objS == h.c.a.a.f48038a ? objS : h.ab.f48028a;
    }

    public final Object l(boolean z, h.c.e eVar) {
        return kotlinx.coroutines.aj.d(new ad(this, z, null), eVar);
    }

    public final ch o() {
        return this.n;
    }

    public final void q(l lVar) {
        h.g.b.x.f(lVar, "alternativeRoute");
        t tVar = (t) this.m.d();
        l lVar2 = lVar;
        this.f18280k.a("Start navigation on alternative uuid: " + lVar.c().j() + ", hovEnabled:" + lVar.b() + ", activeRoute-UUID:" + com.waze.a.af.m(lVar2).j());
        kotlinx.coroutines.am amVarA = this.f18271b.a(com.waze.a.af.m(lVar2), tVar.h(), tVar.c(), lVar.a());
        amVarA.bY(new a(this, amVarA, 0));
    }

    public final void r(m mVar) {
        m mVar2;
        h.g.b.x.f(mVar, "alternativeRoute");
        while (true) {
            bn bnVar = this.m;
            Object objD = bnVar.d();
            t tVarG = (t) objD;
            if (tVarG.f().contains(mVar)) {
                mVar2 = mVar;
                tVarG = t.g(tVarG, null, null, null, null, mVar2, 63);
            } else {
                mVar2 = mVar;
            }
            if (bnVar.f(objD, tVarG)) {
                return;
            } else {
                mVar = mVar2;
            }
        }
    }
}
