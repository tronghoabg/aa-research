package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private h.g.a.a f45960a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f45961b;

    public /* synthetic */ g(byte[] bArr) {
        b bVar = new b(14);
        h.g.b.x.f(bVar, "onImeSearchClicked");
        this.f45960a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.z.a.d.f
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.z.a.d.f r0 = (com.waze.z.a.d.f) r0
            int r1 = r0.f45959c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45959c = r1
            goto L18
        L13:
            com.waze.z.a.d.f r0 = new com.waze.z.a.d.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f45957a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f45959c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            boolean r7 = r6.f45961b
            if (r7 == 0) goto L39
            h.ab r6 = h.ab.f48028a
            return r6
        L39:
            r6.f45961b = r3
            h.g.a.a r7 = r6.f45960a
            r7.invoke()
            h.o.c r7 = h.o.a.f48264a
            r4 = 300(0x12c, double:1.48E-321)
            h.o.d r7 = h.o.d.f48272c
            long r4 = h.o.c.j(r4, r7)
            r0.f45959c = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.r(r4, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = 0
            r6.f45961b = r7
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.d.g.a(h.c.e):java.lang.Object");
    }

    public final void b(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "<set-?>");
        this.f45960a = aVar;
    }

    public g() {
        this(null);
    }
}
