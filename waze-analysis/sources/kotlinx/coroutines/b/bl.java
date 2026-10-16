package kotlinx.coroutines.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class bl {
    public static final k a(k kVar, k kVar2, h.g.a.q qVar) {
        return new bk(kVar, kVar2, qVar, 0);
    }

    public static final bq b(k kVar, kotlinx.coroutines.af afVar, bz bzVar, int i2) {
        bx bxVarT = t(kVar, i2);
        int i3 = bxVarT.f51624b;
        kotlinx.coroutines.a.a aVar = bxVarT.f51625c;
        h.c.j jVar = bxVarT.f51626d;
        k kVar2 = bxVarT.f51623a;
        bm bmVarC = bu.c(i2, i3, aVar);
        return new bo(bmVarC, s(afVar, jVar, kVar2, bmVarC, bzVar, bu.f51616a));
    }

    public static final ch c(k kVar, kotlinx.coroutines.af afVar, bz bzVar, Object obj) {
        bx bxVarT = t(kVar, 1);
        h.c.j jVar = bxVarT.f51626d;
        k kVar2 = bxVarT.f51623a;
        bn bnVarB = ck.b(obj);
        return new bp(bnVarB, s(afVar, jVar, kVar2, bnVarB, bzVar, obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(kotlinx.coroutines.b.k r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.b.av
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.b.av r0 = (kotlinx.coroutines.b.av) r0
            int r1 = r0.f51532b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51532b = r1
            goto L18
        L13:
            kotlinx.coroutines.b.av r0 = new kotlinx.coroutines.b.av
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f51531a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51532b
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.b.w r6 = r0.f51534d
            r1 = r6
            kotlinx.coroutines.b.w r1 = (kotlinx.coroutines.b.w) r1
            h.g.b.aq r1 = r0.f51533c
            r2 = r1
            h.g.b.aq r2 = (h.g.b.aq) r2
            e.b.c.b(r7)     // Catch: kotlinx.coroutines.b.a.a -> L31
            goto L6e
        L31:
            r7 = move-exception
            goto L64
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            e.b.c.b(r7)
            h.g.b.aq r7 = new h.g.b.aq
            r7.<init>()
            kotlinx.coroutines.e.ak r2 = kotlinx.coroutines.b.a.ab.f51383a
            r7.f48105a = r2
            kotlinx.coroutines.b.w r2 = new kotlinx.coroutines.b.w
            r4 = 2
            r5 = 0
            r2.<init>(r7, r4, r5)
            r4 = r2
            kotlinx.coroutines.b.l r4 = (kotlinx.coroutines.b.l) r4     // Catch: kotlinx.coroutines.b.a.a -> L60
            r0.f51533c = r7     // Catch: kotlinx.coroutines.b.a.a -> L60
            r0.f51534d = r2     // Catch: kotlinx.coroutines.b.a.a -> L60
            r0.f51532b = r3     // Catch: kotlinx.coroutines.b.a.a -> L60
            java.lang.Object r6 = r6.collect(r4, r0)     // Catch: kotlinx.coroutines.b.a.a -> L60
            if (r6 == r1) goto L5f
            r1 = r7
            goto L6e
        L5f:
            return r1
        L60:
            r6 = move-exception
            r1 = r7
            r7 = r6
            r6 = r2
        L64:
            h.g.b.x.s(r7, r6)
            h.c.j r6 = r0.getContext()
            h.g.b.o.f(r6)
        L6e:
            java.lang.Object r6 = r1.f48105a
            kotlinx.coroutines.e.ak r7 = kotlinx.coroutines.b.a.ab.f51383a
            if (r6 == r7) goto L75
            return r6
        L75:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bl.d(kotlinx.coroutines.b.k, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(kotlinx.coroutines.b.k r5, h.g.a.p r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.b.aw
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.b.aw r0 = (kotlinx.coroutines.b.aw) r0
            int r1 = r0.f51536b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51536b = r1
            goto L18
        L13:
            kotlinx.coroutines.b.aw r0 = new kotlinx.coroutines.b.aw
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f51535a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51536b
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.b.al r5 = r0.f51538d
            r6 = r5
            kotlinx.coroutines.b.al r6 = (kotlinx.coroutines.b.al) r6
            h.g.b.aq r6 = r0.f51537c
            r1 = r6
            h.g.b.aq r1 = (h.g.b.aq) r1
            e.b.c.b(r7)     // Catch: kotlinx.coroutines.b.a.a -> L31
            goto L6d
        L31:
            r7 = move-exception
            goto L63
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            e.b.c.b(r7)
            h.g.b.aq r7 = new h.g.b.aq
            r7.<init>()
            kotlinx.coroutines.e.ak r2 = kotlinx.coroutines.b.a.ab.f51383a
            r7.f48105a = r2
            kotlinx.coroutines.b.al r2 = new kotlinx.coroutines.b.al
            r4 = 3
            r2.<init>(r6, r7, r4)
            r6 = r2
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6     // Catch: kotlinx.coroutines.b.a.a -> L5f
            r0.f51537c = r7     // Catch: kotlinx.coroutines.b.a.a -> L5f
            r0.f51538d = r2     // Catch: kotlinx.coroutines.b.a.a -> L5f
            r0.f51536b = r3     // Catch: kotlinx.coroutines.b.a.a -> L5f
            java.lang.Object r5 = r5.collect(r6, r0)     // Catch: kotlinx.coroutines.b.a.a -> L5f
            if (r5 == r1) goto L5e
            r6 = r7
            goto L6d
        L5e:
            return r1
        L5f:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L63:
            h.g.b.x.s(r7, r5)
            h.c.j r5 = r0.getContext()
            h.g.b.o.f(r5)
        L6d:
            java.lang.Object r5 = r6.f48105a
            kotlinx.coroutines.e.ak r6 = kotlinx.coroutines.b.a.ab.f51383a
            if (r5 == r6) goto L74
            return r5
        L74:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bl.e(kotlinx.coroutines.b.k, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(kotlinx.coroutines.b.k r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.b.ay
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.b.ay r0 = (kotlinx.coroutines.b.ay) r0
            int r1 = r0.f51544b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51544b = r1
            goto L18
        L13:
            kotlinx.coroutines.b.ay r0 = new kotlinx.coroutines.b.ay
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f51543a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51544b
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.b.w r6 = r0.f51546d
            r1 = r6
            kotlinx.coroutines.b.w r1 = (kotlinx.coroutines.b.w) r1
            h.g.b.aq r1 = r0.f51545c
            r2 = r1
            h.g.b.aq r2 = (h.g.b.aq) r2
            e.b.c.b(r7)     // Catch: kotlinx.coroutines.b.a.a -> L31
            goto L6a
        L31:
            r7 = move-exception
            goto L60
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            e.b.c.b(r7)
            h.g.b.aq r7 = new h.g.b.aq
            r7.<init>()
            kotlinx.coroutines.b.w r2 = new kotlinx.coroutines.b.w
            r4 = 3
            r5 = 0
            r2.<init>(r7, r4, r5)
            r4 = r2
            kotlinx.coroutines.b.l r4 = (kotlinx.coroutines.b.l) r4     // Catch: kotlinx.coroutines.b.a.a -> L5c
            r0.f51545c = r7     // Catch: kotlinx.coroutines.b.a.a -> L5c
            r0.f51546d = r2     // Catch: kotlinx.coroutines.b.a.a -> L5c
            r0.f51544b = r3     // Catch: kotlinx.coroutines.b.a.a -> L5c
            java.lang.Object r6 = r6.collect(r4, r0)     // Catch: kotlinx.coroutines.b.a.a -> L5c
            if (r6 == r1) goto L5b
            r1 = r7
            goto L6a
        L5b:
            return r1
        L5c:
            r6 = move-exception
            r1 = r7
            r7 = r6
            r6 = r2
        L60:
            h.g.b.x.s(r7, r6)
            h.c.j r6 = r0.getContext()
            h.g.b.o.f(r6)
        L6a:
            java.lang.Object r6 = r1.f48105a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bl.f(kotlinx.coroutines.b.k, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(kotlinx.coroutines.b.k r5, h.g.a.p r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.b.az
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.b.az r0 = (kotlinx.coroutines.b.az) r0
            int r1 = r0.f51548b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51548b = r1
            goto L18
        L13:
            kotlinx.coroutines.b.az r0 = new kotlinx.coroutines.b.az
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f51547a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51548b
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.b.al r5 = r0.f51550d
            r6 = r5
            kotlinx.coroutines.b.al r6 = (kotlinx.coroutines.b.al) r6
            h.g.b.aq r6 = r0.f51549c
            r1 = r6
            h.g.b.aq r1 = (h.g.b.aq) r1
            e.b.c.b(r7)     // Catch: kotlinx.coroutines.b.a.a -> L31
            goto L69
        L31:
            r7 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            e.b.c.b(r7)
            h.g.b.aq r7 = new h.g.b.aq
            r7.<init>()
            kotlinx.coroutines.b.al r2 = new kotlinx.coroutines.b.al
            r4 = 4
            r2.<init>(r6, r7, r4)
            r6 = r2
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6     // Catch: kotlinx.coroutines.b.a.a -> L5b
            r0.f51549c = r7     // Catch: kotlinx.coroutines.b.a.a -> L5b
            r0.f51550d = r2     // Catch: kotlinx.coroutines.b.a.a -> L5b
            r0.f51548b = r3     // Catch: kotlinx.coroutines.b.a.a -> L5b
            java.lang.Object r5 = r5.collect(r6, r0)     // Catch: kotlinx.coroutines.b.a.a -> L5b
            if (r5 == r1) goto L5a
            r6 = r7
            goto L69
        L5a:
            return r1
        L5b:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L5f:
            h.g.b.x.s(r7, r5)
            h.c.j r5 = r0.getContext()
            h.g.b.o.f(r5)
        L69:
            java.lang.Object r5 = r6.f48105a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bl.g(kotlinx.coroutines.b.k, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(kotlinx.coroutines.b.k r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.b.ba
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.b.ba r0 = (kotlinx.coroutines.b.ba) r0
            int r1 = r0.f51553b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51553b = r1
            goto L18
        L13:
            kotlinx.coroutines.b.ba r0 = new kotlinx.coroutines.b.ba
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f51552a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51553b
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            h.g.b.aq r5 = r0.f51554c
            r0 = r5
            h.g.b.aq r0 = (h.g.b.aq) r0
            e.b.c.b(r6)
            goto L53
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            e.b.c.b(r6)
            h.g.b.aq r6 = new h.g.b.aq
            r6.<init>()
            kotlinx.coroutines.e.ak r2 = kotlinx.coroutines.b.a.ab.f51383a
            r6.f48105a = r2
            kotlinx.coroutines.b.w r2 = new kotlinx.coroutines.b.w
            r4 = 4
            r2.<init>(r6, r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f51554c = r6
            r0.f51553b = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 == r1) goto L62
            r5 = r6
        L53:
            java.lang.Object r5 = r5.f48105a
            kotlinx.coroutines.e.ak r6 = kotlinx.coroutines.b.a.ab.f51383a
            if (r5 == r6) goto L5a
            return r5
        L5a:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Flow is empty"
            r5.<init>(r6)
            throw r5
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bl.h(kotlinx.coroutines.b.k, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object i(kotlinx.coroutines.b.l r4, java.lang.Object r5, java.lang.Object r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.b.an
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.b.an r0 = (kotlinx.coroutines.b.an) r0
            int r1 = r0.f51506c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51506c = r1
            goto L18
        L13:
            kotlinx.coroutines.b.an r0 = new kotlinx.coroutines.b.an
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f51505b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51506c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.f51504a
            e.b.c.b(r7)
            goto L3f
        L31:
            e.b.c.b(r7)
            r0.f51504a = r6
            r0.f51506c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.b.a.a r4 = new kotlinx.coroutines.b.a.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bl.i(kotlinx.coroutines.b.l, java.lang.Object, java.lang.Object, h.c.e):java.lang.Object");
    }

    public static final k j(k kVar, h.g.a.p pVar) {
        return new ad(kVar, pVar, 4);
    }

    public static final k k(k kVar, long j2) {
        return u(kVar, new com.waze.main_screen.c.f(j2, 9));
    }

    public static final k l(k kVar, h.g.a.l lVar) {
        return u(kVar, lVar);
    }

    public static final k m(k kVar, long j2) {
        if (j2 > 0) {
            return kotlinx.coroutines.b.a.x.b(new y(j2, kVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    public static final Object n(k kVar, h.c.e eVar) {
        Object objCollect = kVar.collect(kotlinx.coroutines.b.a.aa.f51382a, eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public static final Object o(k kVar, h.g.a.p pVar, h.c.e eVar) {
        int i2 = at.f51526a;
        Object objN = n(ai.W(at.a(kVar, new bj(pVar, (h.c.e) null, 1)), 0), eVar);
        return objN == h.c.a.a.f48038a ? objN : h.ab.f48028a;
    }

    public static final Object q(l lVar, kotlinx.coroutines.a.af afVar, h.c.e eVar) throws Throwable {
        Object objV = v(lVar, afVar, true, eVar);
        return objV == h.c.a.a.f48038a ? objV : h.ab.f48028a;
    }

    public static final k r(Object obj) {
        return new aj(obj, 1);
    }

    private static final kotlinx.coroutines.br s(kotlinx.coroutines.af afVar, h.c.j jVar, k kVar, bm bmVar, bz bzVar, Object obj) {
        return kotlinx.coroutines.aj.x(afVar, jVar, h.g.b.x.n(bzVar, by.b()) ? kotlinx.coroutines.ag.f51342a : kotlinx.coroutines.ag.f51345d, new bd(bzVar, kVar, bmVar, obj, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlinx.coroutines.b.bx t(kotlinx.coroutines.b.k r7, int r8) {
        /*
            int r0 = kotlinx.coroutines.ai.f51347a
            kotlinx.coroutines.a.n r0 = kotlinx.coroutines.a.o.f51319b
            int r0 = r0.a()
            int r0 = h.k.n.h(r8, r0)
            boolean r1 = r7 instanceof kotlinx.coroutines.b.a.e
            int r0 = r0 - r8
            if (r1 == 0) goto L3f
            r1 = r7
            kotlinx.coroutines.b.a.e r1 = (kotlinx.coroutines.b.a.e) r1
            kotlinx.coroutines.b.k r2 = r1.e()
            if (r2 == 0) goto L3f
            kotlinx.coroutines.b.bx r7 = new kotlinx.coroutines.b.bx
            int r3 = r1.f51405b
            r4 = -3
            if (r3 == r4) goto L28
            r4 = -2
            if (r3 == r4) goto L28
            if (r3 == 0) goto L28
            r0 = r3
            goto L37
        L28:
            kotlinx.coroutines.a.a r4 = r1.f51406c
            kotlinx.coroutines.a.a r5 = kotlinx.coroutines.a.a.f51271a
            r6 = 0
            if (r4 != r5) goto L32
            if (r3 != 0) goto L37
            goto L36
        L32:
            if (r8 != 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = r6
        L37:
            kotlinx.coroutines.a.a r8 = r1.f51406c
            h.c.j r1 = r1.f51404a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3f:
            kotlinx.coroutines.b.bx r8 = new kotlinx.coroutines.b.bx
            kotlinx.coroutines.a.a r1 = kotlinx.coroutines.a.a.f51271a
            h.c.k r2 = h.c.k.f48060a
            h.c.j r2 = (h.c.j) r2
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bl.t(kotlinx.coroutines.b.k, int):kotlinx.coroutines.b.bx");
    }

    private static final k u(k kVar, h.g.a.l lVar) {
        return kotlinx.coroutines.b.a.x.b(new r(lVar, kVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:13:0x0034, B:23:0x0062, B:27:0x0077, B:29:0x007f, B:18:0x0050, B:22:0x005e), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0093 -> B:23:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(kotlinx.coroutines.b.l r6, kotlinx.coroutines.a.af r7, boolean r8, h.c.e r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.b.m
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.b.m r0 = (kotlinx.coroutines.b.m) r0
            int r1 = r0.f51695f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51695f = r1
            goto L18
        L13:
            kotlinx.coroutines.b.m r0 = new kotlinx.coroutines.b.m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f51694e
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51695f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            boolean r8 = r0.f51693d
            java.lang.Object r6 = r0.f51692c
            kotlinx.coroutines.a.q r6 = (kotlinx.coroutines.a.q) r6
            java.lang.Object r7 = r0.f51691b
            kotlinx.coroutines.a.af r7 = (kotlinx.coroutines.a.af) r7
            java.lang.Object r2 = r0.f51690a
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> La0
            r9 = r6
            r6 = r2
            goto L62
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            boolean r8 = r0.f51693d
            java.lang.Object r6 = r0.f51692c
            kotlinx.coroutines.a.q r6 = (kotlinx.coroutines.a.q) r6
            java.lang.Object r7 = r0.f51691b
            kotlinx.coroutines.a.af r7 = (kotlinx.coroutines.a.af) r7
            java.lang.Object r2 = r0.f51690a
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> La0
            r5 = r0
            r0 = r6
            r6 = r2
        L56:
            r2 = r5
            goto L77
        L58:
            e.b.c.b(r9)
            kotlinx.coroutines.b.ai.c(r6)
            kotlinx.coroutines.a.q r9 = r7.p()     // Catch: java.lang.Throwable -> La0
        L62:
            r0.f51690a = r6     // Catch: java.lang.Throwable -> La0
            r0.f51691b = r7     // Catch: java.lang.Throwable -> La0
            r0.f51692c = r9     // Catch: java.lang.Throwable -> La0
            r0.f51693d = r8     // Catch: java.lang.Throwable -> La0
            r0.f51695f = r4     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> La0
            if (r2 != r1) goto L73
            goto L96
        L73:
            r5 = r0
            r0 = r9
            r9 = r2
            goto L56
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> La0
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> La0
            if (r9 == 0) goto L97
            java.lang.Object r9 = r0.b()     // Catch: java.lang.Throwable -> La0
            r2.f51690a = r6     // Catch: java.lang.Throwable -> La0
            r2.f51691b = r7     // Catch: java.lang.Throwable -> La0
            r2.f51692c = r0     // Catch: java.lang.Throwable -> La0
            r2.f51693d = r8     // Catch: java.lang.Throwable -> La0
            r2.f51695f = r3     // Catch: java.lang.Throwable -> La0
            java.lang.Object r9 = r6.emit(r9, r2)     // Catch: java.lang.Throwable -> La0
            if (r9 == r1) goto L96
            r9 = r0
            r0 = r2
            goto L62
        L96:
            return r1
        L97:
            if (r8 == 0) goto L9d
            r6 = 0
            kotlinx.coroutines.a.ab.f(r7, r6)
        L9d:
            h.ab r6 = h.ab.f48028a
            return r6
        La0:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r9 = move-exception
            if (r8 != 0) goto La6
            goto La9
        La6:
            kotlinx.coroutines.a.ab.f(r7, r6)
        La9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bl.v(kotlinx.coroutines.b.l, kotlinx.coroutines.a.af, boolean, h.c.e):java.lang.Object");
    }
}
