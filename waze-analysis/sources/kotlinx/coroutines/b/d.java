package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends f {

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.p f51675d;

    public d(h.g.a.p pVar, h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        super(pVar, jVar, i2, aVar);
        this.f51675d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.f, kotlinx.coroutines.b.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object a(kotlinx.coroutines.a.ad r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.b.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.b.c r0 = (kotlinx.coroutines.b.c) r0
            int r1 = r0.f51634d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51634d = r1
            goto L18
        L13:
            kotlinx.coroutines.b.c r0 = new kotlinx.coroutines.b.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f51632b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f51634d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.f51631a
            r5 = r4
            kotlinx.coroutines.a.ad r5 = (kotlinx.coroutines.a.ad) r5
            e.b.c.b(r6)
            goto L41
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            r0.f51631a = r5
            r0.f51634d = r3
            java.lang.Object r4 = kotlinx.coroutines.b.f.f(r4, r5, r0)
            if (r4 == r1) goto L52
        L41:
            boolean r4 = r5.y()
            if (r4 == 0) goto L4a
            h.ab r4 = h.ab.f48028a
            return r4
        L4a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.d.a(kotlinx.coroutines.a.ad, h.c.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.b.f, kotlinx.coroutines.b.a.e
    protected final kotlinx.coroutines.b.a.e b(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return new d(this.f51675d, jVar, i2, aVar);
    }
}
