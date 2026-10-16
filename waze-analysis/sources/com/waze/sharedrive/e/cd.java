package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cd extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38477a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ch f38478b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f38479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cd(ch chVar, h.c.e eVar) {
        super(2, eVar);
        this.f38478b = chVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cd cdVar = new cd(this.f38478b, eVar);
        cdVar.f38479c = obj;
        return cdVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cd) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r6.emit(null, r5) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.io.IOException {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.f38477a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L10
            e.b.c.b(r6)
            goto L70
        L10:
            java.lang.Object r5 = r5.f38479c
            java.io.Closeable r5 = (java.io.Closeable) r5
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L18
            goto L53
        L18:
            r6 = move-exception
            goto L5c
        L1a:
            java.lang.Object r1 = r5.f38479c
            java.io.Closeable r1 = (java.io.Closeable) r1
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L22
            goto L47
        L22:
            r6 = move-exception
        L23:
            r5 = r1
            goto L5c
        L25:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.f38479c
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            com.waze.sharedrive.e.ch r1 = r5.f38478b
            com.waze.sharedrive.e.q r1 = com.waze.sharedrive.e.ch.f(r1)
            com.waze.sharedrive.e.r r1 = r1.a()
            if (r1 == 0) goto L62
            java.io.Closeable r1 = (java.io.Closeable) r1
            r4 = r1
            com.waze.sharedrive.e.r r4 = (com.waze.sharedrive.e.r) r4     // Catch: java.lang.Throwable -> L59
            r5.f38479c = r1     // Catch: java.lang.Throwable -> L59
            r5.f38477a = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.emit(r4, r5)     // Catch: java.lang.Throwable -> L59
            if (r6 == r0) goto L6f
        L47:
            r5.f38479c = r1     // Catch: java.lang.Throwable -> L59
            r5.f38477a = r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = kotlinx.coroutines.aj.p(r5)     // Catch: java.lang.Throwable -> L59
            if (r5 != r0) goto L52
            goto L6f
        L52:
            r5 = r1
        L53:
            h.e r6 = new h.e     // Catch: java.lang.Throwable -> L18
            r6.<init>()     // Catch: java.lang.Throwable -> L18
            throw r6     // Catch: java.lang.Throwable -> L18
        L59:
            r5 = move-exception
            r6 = r5
            goto L23
        L5c:
            throw r6     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            h.a.i.aW(r5, r6)
            throw r0
        L62:
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r2 = 3
            r5.f38477a = r2
            r5 = 0
            java.lang.Object r5 = r6.emit(r5, r1)
            if (r5 != r0) goto L70
        L6f:
            return r0
        L70:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.e.cd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
