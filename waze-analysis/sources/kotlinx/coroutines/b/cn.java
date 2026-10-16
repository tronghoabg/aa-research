package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cn<T> implements l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final l f51667a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.p f51668b;

    public cn(l lVar, h.g.a.p pVar) {
        this.f51667a = lVar;
        this.f51668b = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (((kotlinx.coroutines.b.cn) r6).a(r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.b.a.ac] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.b.a.ac] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.b.cm
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.b.cm r0 = (kotlinx.coroutines.b.cm) r0
            int r1 = r0.f51665c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51665c = r1
            goto L18
        L13:
            kotlinx.coroutines.b.cm r0 = new kotlinx.coroutines.b.cm
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f51663a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51665c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlinx.coroutines.b.a.ac r2 = r0.f51666d
            r4 = r2
            kotlinx.coroutines.b.a.ac r4 = (kotlinx.coroutines.b.a.ac) r4
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L3b
            goto L57
        L3b:
            r6 = move-exception
            goto L72
        L3d:
            e.b.c.b(r7)
            kotlinx.coroutines.b.l r7 = r6.f51667a
            kotlinx.coroutines.b.a.ac r2 = new kotlinx.coroutines.b.a.ac
            h.c.j r5 = r0.getContext()
            r2.<init>(r7, r5)
            h.g.a.p r7 = r6.f51668b     // Catch: java.lang.Throwable -> L3b
            r0.f51666d = r2     // Catch: java.lang.Throwable -> L3b
            r0.f51665c = r4     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3b
            if (r7 == r1) goto L71
        L57:
            r2.releaseIntercepted()
            kotlinx.coroutines.b.l r6 = r6.f51667a
            boolean r7 = r6 instanceof kotlinx.coroutines.b.cn
            if (r7 == 0) goto L6e
            kotlinx.coroutines.b.cn r6 = (kotlinx.coroutines.b.cn) r6
            r7 = 0
            r0.f51666d = r7
            r0.f51665c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L6e
            goto L71
        L6e:
            h.ab r6 = h.ab.f48028a
            return r6
        L71:
            return r1
        L72:
            r2.releaseIntercepted()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.cn.a(h.c.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.b.l
    public final Object emit(T t, h.c.e<? super h.ab> eVar) {
        return this.f51667a.emit(t, eVar);
    }
}
