package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bk implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f51591a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f51592b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f51593c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f51594d;

    public bk(Object obj, k kVar, h.g.a.q qVar, int i2) {
        this.f51594d = i2;
        this.f51593c = obj;
        this.f51591a = kVar;
        this.f51592b = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r9.collect(r5, r0) == r4) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARN: Type inference failed for: r7v1, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [h.g.a.q, java.lang.Object] */
    @Override // kotlinx.coroutines.b.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.b.l r8, h.c.e r9) {
        /*
            r7 = this;
            int r0 = r7.f51594d
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L7f
            boolean r0 = r9 instanceof kotlinx.coroutines.b.bg
            if (r0 == 0) goto L1a
            r0 = r9
            kotlinx.coroutines.b.bg r0 = (kotlinx.coroutines.b.bg) r0
            int r4 = r0.f51575b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r0.f51575b = r4
            goto L1f
        L1a:
            kotlinx.coroutines.b.bg r0 = new kotlinx.coroutines.b.bg
            r0.<init>(r7, r9)
        L1f:
            java.lang.Object r9 = r0.f51574a
            h.c.a.a r4 = h.c.a.a.f48038a
            int r5 = r0.f51575b
            if (r5 == 0) goto L44
            if (r5 == r2) goto L37
            if (r5 != r3) goto L2f
            e.b.c.b(r9)
            goto L7b
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            h.g.b.aq r8 = r0.f51577d
            r2 = r8
            h.g.b.aq r2 = (h.g.b.aq) r2
            java.lang.Object r2 = r0.f51576c
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            e.b.c.b(r9)
            goto L63
        L44:
            e.b.c.b(r9)
            r9 = r0
            h.c.e r9 = (h.c.e) r9
            h.g.b.aq r9 = new h.g.b.aq
            r9.<init>()
            java.lang.Object r5 = r7.f51593c
            r9.f48105a = r5
            java.lang.Object r5 = r9.f48105a
            r0.f51576c = r8
            r0.f51577d = r9
            r0.f51575b = r2
            java.lang.Object r2 = r8.emit(r5, r0)
            if (r2 == r4) goto L7e
            r2 = r8
            r8 = r9
        L63:
            kotlinx.coroutines.b.k r9 = r7.f51591a
            java.lang.Object r7 = r7.f51592b
            kotlinx.coroutines.b.aq r5 = new kotlinx.coroutines.b.aq
            r5.<init>(r8, r7, r2, r3)
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5
            r0.f51576c = r1
            r0.f51577d = r1
            r0.f51575b = r3
            java.lang.Object r7 = r9.collect(r5, r0)
            if (r7 != r4) goto L7b
            goto L7e
        L7b:
            h.ab r7 = h.ab.f48028a
            return r7
        L7e:
            return r4
        L7f:
            kotlinx.coroutines.b.k r0 = r7.f51591a
            kotlinx.coroutines.b.k[] r3 = new kotlinx.coroutines.b.k[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.Object r0 = r7.f51592b
            r3[r2] = r0
            com.waze.ui.r.a.e.c r0 = new com.waze.ui.r.a.e.c
            r2 = 16
            r0.<init>(r2)
            kotlinx.coroutines.b.bj r2 = new kotlinx.coroutines.b.bj
            java.lang.Object r7 = r7.f51593c
            r4 = 4
            r2.<init>(r7, r1, r4)
            h.g.a.q r2 = (h.g.a.q) r2
            java.lang.Object r7 = kotlinx.coroutines.b.a.x.c(r8, r3, r0, r2, r9)
            h.c.a.a r8 = h.c.a.a.f48038a
            if (r7 != r8) goto La4
            return r7
        La4:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bk.collect(kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }

    public bk(k kVar, k kVar2, h.g.a.q qVar, int i2) {
        this.f51594d = i2;
        this.f51591a = kVar;
        this.f51592b = kVar2;
        this.f51593c = qVar;
    }
}
