package kotlinx.coroutines.b;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class ai {
    public static final k A(k kVar, h.g.a.l lVar) {
        return z.c(kVar, lVar);
    }

    public static final k B(k kVar, h.g.a.p pVar) {
        return bl.j(kVar, pVar);
    }

    public static final k C() {
        return j.f51689a;
    }

    public static final k D(k kVar) {
        return new aj(kVar, 3);
    }

    public static final k E(h.g.a.p pVar) {
        return new b(pVar);
    }

    public static final k F(k kVar, k kVar2, h.g.a.q qVar) {
        return bl.a(kVar, kVar2, qVar);
    }

    public static final k G(Object obj) {
        return bl.r(obj);
    }

    public static final k H(k kVar, h.c.j jVar) {
        if (jVar.get(kotlinx.coroutines.br.f51766a) != null) {
            Objects.toString(jVar);
            throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(jVar)));
        }
        if (h.g.b.x.n(jVar, h.c.k.f48060a)) {
            return kVar;
        }
        return kVar instanceof kotlinx.coroutines.b.a.y ? h.g.b.x.r((kotlinx.coroutines.b.a.y) kVar, jVar, null, 6) : new kotlinx.coroutines.b.a.h(kVar, jVar, null, 12);
    }

    public static final k I(k... kVarArr) {
        int i2 = at.f51526a;
        return new kotlinx.coroutines.b.a.o(h.a.c.L(kVarArr), h.c.k.f48060a, -2, kotlinx.coroutines.a.a.f51271a);
    }

    public static final k J(k kVar, h.g.a.q qVar) {
        return new ad(kVar, qVar, 1);
    }

    public static final k K(k kVar, h.g.a.p pVar) {
        return new ad(kVar, pVar, 6);
    }

    public static final k L(k kVar, h.g.a.p pVar) {
        return new ad(pVar, kVar, 0);
    }

    public static final k M(kotlinx.coroutines.a.af afVar) {
        return new e(afVar, false);
    }

    public static final k N(k kVar, long j2) {
        return bl.m(kVar, j2);
    }

    public static final k O(k kVar, long j2) {
        return bl.m(kVar, kotlinx.coroutines.aj.o(j2));
    }

    public static final k P(k kVar, Object obj, h.g.a.q qVar) {
        return new bk(obj, kVar, qVar, 1);
    }

    public static final k Q(k kVar, h.g.a.p pVar) {
        return new ad(kVar, pVar, 5);
    }

    public static final k R(k kVar, h.g.a.q qVar) {
        return at.a(kVar, qVar);
    }

    public static final bq S(bm bmVar) {
        return new bo(bmVar, null);
    }

    public static final bq T(bq bqVar, h.g.a.p pVar) {
        return new cp(bqVar, pVar);
    }

    public static final ch U(bn bnVar) {
        return new bp(bnVar, null);
    }

    public static final ch V(k kVar, kotlinx.coroutines.af afVar, bz bzVar, Object obj) {
        return bl.c(kVar, afVar, bzVar, obj);
    }

    public static /* synthetic */ k W(k kVar, int i2) {
        kotlinx.coroutines.a.a aVar = kotlinx.coroutines.a.a.f51271a;
        if (i2 < 0) {
            aVar = kotlinx.coroutines.a.a.f51272b;
        }
        return kVar instanceof kotlinx.coroutines.b.a.y ? h.g.b.x.r((kotlinx.coroutines.b.a.y) kVar, null, aVar, 1) : new kotlinx.coroutines.b.a.h(kVar, null, aVar, 2);
    }

    public static final k X(k kVar) {
        return new aj(kVar, 0);
    }

    public static final k Z(k kVar) {
        return new aj(kVar, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.coroutines.b.k r4, kotlinx.coroutines.b.l r5, h.c.e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.b.af
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.b.af r0 = (kotlinx.coroutines.b.af) r0
            int r1 = r0.f51480b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51480b = r1
            goto L18
        L13:
            kotlinx.coroutines.b.af r0 = new kotlinx.coroutines.b.af
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f51479a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51480b
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            h.g.b.aq r4 = r0.f51481c
            r5 = r4
            h.g.b.aq r5 = (h.g.b.aq) r5
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L50
        L2c:
            r5 = move-exception
            goto L55
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            e.b.c.b(r6)
            h.g.b.aq r6 = new h.g.b.aq
            r6.<init>()
            kotlinx.coroutines.b.al r2 = new kotlinx.coroutines.b.al     // Catch: java.lang.Throwable -> L52
            r2.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2     // Catch: java.lang.Throwable -> L52
            r0.f51481c = r6     // Catch: java.lang.Throwable -> L52
            r0.f51480b = r3     // Catch: java.lang.Throwable -> L52
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L52
            if (r4 != r1) goto L50
            return r1
        L50:
            r4 = 0
            return r4
        L52:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L55:
            java.lang.Object r4 = r4.f48105a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = ac(r5, r4)
            if (r6 != 0) goto L91
            h.c.j r6 = r0.getContext()
            kotlinx.coroutines.ac r0 = kotlinx.coroutines.br.f51766a
            h.c.i r0 = (h.c.i) r0
            h.c.h r6 = r6.get(r0)
            kotlinx.coroutines.br r6 = (kotlinx.coroutines.br) r6
            if (r6 == 0) goto L82
            boolean r0 = r6.u()
            if (r0 != 0) goto L76
            goto L82
        L76:
            java.util.concurrent.CancellationException r6 = r6.n()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            boolean r6 = ac(r5, r6)
            if (r6 != 0) goto L91
        L82:
            if (r4 != 0) goto L85
            return r5
        L85:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L8d
            e.a.h.ad.c(r4, r5)
            throw r4
        L8d:
            e.a.h.ad.c(r5, r4)
            throw r5
        L91:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.ai.a(kotlinx.coroutines.b.k, kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }

    public static final bq aa(k kVar, kotlinx.coroutines.af afVar, bz bzVar) {
        return bl.b(kVar, afVar, bzVar, 1);
    }

    private static final boolean ac(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i2 = kotlinx.coroutines.c.d.f51787a;
        if (!kotlinx.coroutines.c.d.a() && kotlinx.coroutines.ai.c()) {
            th2 = kotlinx.coroutines.e.aj.c(th2);
        }
        if (!kotlinx.coroutines.c.d.a() && kotlinx.coroutines.ai.c()) {
            th = kotlinx.coroutines.e.aj.c(th);
        }
        return h.g.b.x.n(th2, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object b(kotlinx.coroutines.b.l r4, h.g.a.q r5, java.lang.Throwable r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.b.aa
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.b.aa r0 = (kotlinx.coroutines.b.aa) r0
            int r1 = r0.f51462c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51462c = r1
            goto L18
        L13:
            kotlinx.coroutines.b.aa r0 = new kotlinx.coroutines.b.aa
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f51461b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51462c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f51460a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L44
        L2c:
            r4 = move-exception
            goto L47
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            e.b.c.b(r7)
            r0.f51460a = r6     // Catch: java.lang.Throwable -> L2c
            r0.f51462c = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L44
            return r1
        L44:
            h.ab r4 = h.ab.f48028a
            return r4
        L47:
            if (r6 == 0) goto L4e
            if (r6 == r4) goto L4e
            e.a.h.ad.c(r4, r6)
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.ai.b(kotlinx.coroutines.b.l, h.g.a.q, java.lang.Throwable, h.c.e):java.lang.Object");
    }

    public static final void c(l lVar) throws Throwable {
        if (lVar instanceof cq) {
            throw ((cq) lVar).f51674a;
        }
    }

    public static final Object d(k kVar, h.c.e eVar) {
        return bl.n(kVar, eVar);
    }

    public static final Object e(k kVar, h.g.a.p pVar, h.c.e eVar) {
        return bl.o(kVar, pVar, eVar);
    }

    public static final Object f(l lVar, kotlinx.coroutines.a.af afVar, h.c.e eVar) {
        return bl.q(lVar, afVar, eVar);
    }

    public static final Object g(l lVar, k kVar, h.c.e eVar) throws Throwable {
        c(lVar);
        Object objCollect = kVar.collect(lVar, eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public static final Object h(k kVar, h.c.e eVar) {
        return bl.d(kVar, eVar);
    }

    public static final Object i(k kVar, h.g.a.p pVar, h.c.e eVar) {
        return bl.e(kVar, pVar, eVar);
    }

    public static final Object j(k kVar, h.c.e eVar) {
        return bl.f(kVar, eVar);
    }

    public static final Object k(k kVar, h.g.a.p pVar, h.c.e eVar) {
        return bl.g(kVar, pVar, eVar);
    }

    public static final Object l(k kVar, h.c.e eVar) {
        return bl.h(kVar, eVar);
    }

    public static final kotlinx.coroutines.br m(k kVar, kotlinx.coroutines.af afVar) {
        return kotlinx.coroutines.aj.z(afVar, null, null, new n(kVar, null), 3);
    }

    public static final k n(h.g.a.p pVar) {
        return new d(pVar, h.c.k.f48060a, -2, kotlinx.coroutines.a.a.f51271a);
    }

    public static final k o(k kVar, h.g.a.q qVar) {
        return new ad(kVar, qVar, 2);
    }

    public static final k p(h.g.a.p pVar) {
        return new f(pVar, h.c.k.f48060a, -2, kotlinx.coroutines.a.a.f51271a);
    }

    public static final k q(k kVar, k kVar2, h.g.a.q qVar) {
        return bl.a(kVar, kVar2, qVar);
    }

    public static final k r(k kVar, k kVar2, k kVar3, h.g.a.r rVar) {
        return new ad(new k[]{kVar, kVar2, kVar3}, rVar, 7);
    }

    public static final k s(k kVar, k kVar2, k kVar3, k kVar4, h.g.a.s sVar) {
        return new ad(new k[]{kVar, kVar2, kVar3, kVar4}, sVar, 8);
    }

    public static final k t(k kVar, k kVar2, k kVar3, k kVar4, k kVar5, h.g.a.t tVar) {
        return new ad(new k[]{kVar, kVar2, kVar3, kVar4, kVar5}, tVar, 9);
    }

    public static final k u(k kVar) {
        return W(kVar, -1);
    }

    public static final k v(kotlinx.coroutines.a.af afVar) {
        return new e(afVar, true);
    }

    public static final k w(k kVar, long j2) {
        return bl.k(kVar, j2);
    }

    public static final k x(k kVar, h.g.a.l lVar) {
        return bl.l(kVar, lVar);
    }

    public static final k y(k kVar) {
        return z.a(kVar);
    }

    public static final k z(k kVar, h.g.a.p pVar) {
        return z.b(kVar, pVar);
    }
}
