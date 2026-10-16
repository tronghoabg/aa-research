package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class b<T> implements k<T> {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.p f51551a;

    public b(h.g.a.p pVar) {
        this.f51551a = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.b.l<? super T> r5, h.c.e<? super h.ab> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.b.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.b.a r0 = (kotlinx.coroutines.b.a) r0
            int r1 = r0.f51379c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51379c = r1
            goto L18
        L13:
            kotlinx.coroutines.b.a r0 = new kotlinx.coroutines.b.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f51377a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51379c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlinx.coroutines.b.a.ac r4 = r0.f51380d
            r5 = r4
            kotlinx.coroutines.b.a.ac r5 = (kotlinx.coroutines.b.a.ac) r5
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L56
        L2c:
            r5 = move-exception
            goto L60
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            e.b.c.b(r6)
            kotlinx.coroutines.b.a.ac r6 = new kotlinx.coroutines.b.a.ac
            h.c.j r2 = r0.getContext()
            r6.<init>(r5, r2)
            r5 = r6
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5     // Catch: java.lang.Throwable -> L5d
            r0.f51380d = r6     // Catch: java.lang.Throwable -> L5d
            r0.f51379c = r3     // Catch: java.lang.Throwable -> L5d
            h.g.a.p r4 = r4.f51551a     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r4.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r4 == r1) goto L53
            h.ab r4 = h.ab.f48028a     // Catch: java.lang.Throwable -> L5d
        L53:
            if (r4 == r1) goto L5c
            r4 = r6
        L56:
            r4.releaseIntercepted()
            h.ab r4 = h.ab.f48028a
            return r4
        L5c:
            return r1
        L5d:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L60:
            r4.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.b.collect(kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }
}
