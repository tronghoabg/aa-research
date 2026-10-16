package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.b.a f22686a;

    public aj(com.waze.copilot.data.b.a aVar) {
        h.g.b.x.f(aVar, "carsRepository");
        this.f22686a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.copilot.a.aj r4, h.c.e r5) {
        /*
            boolean r0 = r5 instanceof com.waze.copilot.a.ai
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.copilot.a.ai r0 = (com.waze.copilot.a.ai) r0
            int r1 = r0.f22685c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22685c = r1
            goto L18
        L13:
            com.waze.copilot.a.ai r0 = new com.waze.copilot.a.ai
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22683a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22685c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r5)
            h.m r5 = (h.m) r5
            java.lang.Object r4 = r5.b()
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r5)
            com.waze.copilot.data.b.a r4 = r4.f22686a
            r0.f22685c = r3
            java.lang.Object r4 = r4.b(r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.aj.b(com.waze.copilot.a.aj, h.c.e):java.lang.Object");
    }

    public final Object a(h.c.e eVar) {
        return b(this, eVar);
    }
}
