package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ce extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f51644a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ int f51645b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cg f51646c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f51647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ce(cg cgVar, h.c.e eVar) {
        super(3, eVar);
        this.f51646c = cgVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        ce ceVar = new ce(this.f51646c, (h.c.e) obj3);
        ceVar.f51647d = (l) obj;
        ceVar.f51645b = iIntValue;
        return ceVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r1.emit(kotlinx.coroutines.b.bw.f51619a, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r1.emit(kotlinx.coroutines.b.bw.f51621c, r7) != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[PHI: r1
  0x006b: PHI (r1v4 kotlinx.coroutines.b.l) = (r1v3 kotlinx.coroutines.b.l), (r1v9 kotlinx.coroutines.b.l) binds: [B:21:0x0069, B:10:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[PHI: r1
  0x007d: PHI (r1v5 kotlinx.coroutines.b.l) = (r1v4 kotlinx.coroutines.b.l), (r1v11 kotlinx.coroutines.b.l) binds: [B:23:0x007b, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f51644a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L13
            goto L2b
        L13:
            java.lang.Object r1 = r7.f51647d
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r8)
            goto L7d
        L1b:
            java.lang.Object r1 = r7.f51647d
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r8)
            goto L6b
        L23:
            java.lang.Object r1 = r7.f51647d
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r8)
            goto L5c
        L2b:
            e.b.c.b(r8)
            goto L8f
        L2f:
            e.b.c.b(r8)
            java.lang.Object r8 = r7.f51647d
            r1 = r8
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            int r8 = r7.f51645b
            if (r8 <= 0) goto L49
            kotlinx.coroutines.b.bw r8 = kotlinx.coroutines.b.bw.f51619a
            r2 = r7
            h.c.e r2 = (h.c.e) r2
            r7.f51644a = r5
            java.lang.Object r7 = r1.emit(r8, r2)
            if (r7 != r0) goto L8f
            goto L92
        L49:
            kotlinx.coroutines.b.cg r8 = r7.f51646c
            long r5 = kotlinx.coroutines.b.cg.b(r8)
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.f51647d = r1
            r7.f51644a = r4
            java.lang.Object r8 = kotlinx.coroutines.aj.q(r5, r8)
            if (r8 == r0) goto L92
        L5c:
            kotlinx.coroutines.b.bw r8 = kotlinx.coroutines.b.bw.f51620b
            r4 = r7
            h.c.e r4 = (h.c.e) r4
            r7.f51647d = r1
            r7.f51644a = r3
            java.lang.Object r8 = r1.emit(r8, r4)
            if (r8 == r0) goto L92
        L6b:
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.f51647d = r1
            r7.f51644a = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = kotlinx.coroutines.aj.q(r2, r8)
            if (r8 == r0) goto L92
        L7d:
            kotlinx.coroutines.b.bw r8 = kotlinx.coroutines.b.bw.f51621c
            r2 = r7
            h.c.e r2 = (h.c.e) r2
            r3 = 0
            r7.f51647d = r3
            r3 = 5
            r7.f51644a = r3
            java.lang.Object r7 = r1.emit(r8, r2)
            if (r7 != r0) goto L8f
            goto L92
        L8f:
            h.ab r7 = h.ab.f48028a
            return r7
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.ce.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
