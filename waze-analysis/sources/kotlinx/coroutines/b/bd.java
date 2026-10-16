package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bd extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51561a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bz f51562b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f51563c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bm f51564d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f51565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(bz bzVar, k kVar, bm bmVar, Object obj, h.c.e eVar) {
        super(2, eVar);
        this.f51562b = bzVar;
        this.f51563c = kVar;
        this.f51564d = bmVar;
        this.f51565e = obj;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bd(this.f51562b, this.f51563c, this.f51564d, this.f51565e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bd) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r6.f51563c.collect(r6.f51564d, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r6.f51563c.collect(r6.f51564d, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (kotlinx.coroutines.b.bl.o(kotlinx.coroutines.b.z.a(r7.a(r4.a())), new kotlinx.coroutines.b.bc(r6.f51563c, r4, r6.f51565e, null), r6) == r0) goto L23;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f51561a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L17
            if (r1 == r4) goto L12
            if (r1 == r3) goto Le
            goto L12
        Le:
            e.b.c.b(r7)
            goto L55
        L12:
            e.b.c.b(r7)
            goto L8b
        L17:
            e.b.c.b(r7)
            kotlinx.coroutines.b.bz r7 = r6.f51562b
            kotlinx.coroutines.b.bz r1 = kotlinx.coroutines.b.by.b()
            if (r7 != r1) goto L34
            kotlinx.coroutines.b.k r7 = r6.f51563c
            kotlinx.coroutines.b.bm r1 = r6.f51564d
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            r2 = r6
            h.c.e r2 = (h.c.e) r2
            r6.f51561a = r4
            java.lang.Object r6 = r7.collect(r1, r2)
            if (r6 != r0) goto L8b
            goto L8a
        L34:
            kotlinx.coroutines.b.bz r1 = kotlinx.coroutines.b.by.c()
            kotlinx.coroutines.b.bm r4 = r6.f51564d
            r5 = 0
            if (r7 != r1) goto L67
            kotlinx.coroutines.b.ch r7 = r4.a()
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            kotlinx.coroutines.b.bb r1 = new kotlinx.coroutines.b.bb
            r1.<init>(r5)
            h.g.a.p r1 = (h.g.a.p) r1
            r4 = r6
            h.c.e r4 = (h.c.e) r4
            r6.f51561a = r3
            java.lang.Object r7 = kotlinx.coroutines.b.bl.e(r7, r1, r4)
            if (r7 == r0) goto L8a
        L55:
            kotlinx.coroutines.b.k r7 = r6.f51563c
            kotlinx.coroutines.b.bm r1 = r6.f51564d
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            r3 = r6
            h.c.e r3 = (h.c.e) r3
            r6.f51561a = r2
            java.lang.Object r6 = r7.collect(r1, r3)
            if (r6 != r0) goto L8b
            goto L8a
        L67:
            kotlinx.coroutines.b.ch r1 = r4.a()
            kotlinx.coroutines.b.k r7 = r7.a(r1)
            kotlinx.coroutines.b.k r7 = kotlinx.coroutines.b.z.a(r7)
            kotlinx.coroutines.b.k r1 = r6.f51563c
            java.lang.Object r2 = r6.f51565e
            kotlinx.coroutines.b.bc r3 = new kotlinx.coroutines.b.bc
            r3.<init>(r1, r4, r2, r5)
            h.g.a.p r3 = (h.g.a.p) r3
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r2 = 4
            r6.f51561a = r2
            java.lang.Object r6 = kotlinx.coroutines.b.bl.o(r7, r3, r1)
            if (r6 != r0) goto L8b
        L8a:
            return r0
        L8b:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
