package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cp<T> implements bq<T> {

    /* renamed from: a, reason: collision with root package name */
    private final bq f51672a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.p f51673b;

    public cp(bq bqVar, h.g.a.p pVar) {
        this.f51672a = bqVar;
        this.f51673b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.bq, kotlinx.coroutines.b.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.b.l<? super T> r5, h.c.e<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.b.co
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.b.co r0 = (kotlinx.coroutines.b.co) r0
            int r1 = r0.f51671c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51671c = r1
            goto L18
        L13:
            kotlinx.coroutines.b.co r0 = new kotlinx.coroutines.b.co
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f51669a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51671c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r6)
            goto L46
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.bq r6 = r4.f51672a
            h.g.a.p r4 = r4.f51673b
            kotlinx.coroutines.b.cn r2 = new kotlinx.coroutines.b.cn
            r2.<init>(r5, r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f51671c = r3
            java.lang.Object r4 = r6.collect(r2, r0)
            if (r4 != r1) goto L46
            return r1
        L46:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.cp.collect(kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }
}
