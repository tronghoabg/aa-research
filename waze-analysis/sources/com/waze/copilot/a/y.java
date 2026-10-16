package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final ac f22886a;

    /* renamed from: b, reason: collision with root package name */
    private final bm f22887b;

    public y(ac acVar, bm bmVar) {
        h.g.b.x.f(acVar, "downloadCopilotMetadataAndAssetsUseCase");
        h.g.b.x.f(bmVar, "setTempCarUseCase");
        this.f22886a = acVar;
        this.f22887b = bmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r6.a(r3) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.copilot.a.x
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.copilot.a.x r0 = (com.waze.copilot.a.x) r0
            int r1 = r0.f22885d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22885d = r1
            goto L18
        L13:
            com.waze.copilot.a.x r0 = new com.waze.copilot.a.x
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f22883b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22885d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.f22882a
            e.b.c.b(r8)
            goto L80
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            e.b.c.b(r8)
            h.m r8 = (h.m) r8
            java.lang.Object r7 = r8.b()
            goto L50
        L3f:
            e.b.c.b(r8)
            if (r7 == 0) goto L83
            com.waze.copilot.a.ac r8 = r6.f22886a
            r0.f22885d = r5
            r2 = 6
            java.lang.Object r7 = com.waze.copilot.a.ac.b(r8, r7, r3, r0, r2)
            if (r7 != r1) goto L50
            goto L7e
        L50:
            boolean r8 = h.m.e(r7)
            if (r8 == 0) goto L7f
            r8 = r7
            com.waze.copilot.a.aa r8 = (com.waze.copilot.a.aa) r8
            com.waze.copilot.data.a.g r8 = r8.d()
            h.m r8 = r8.a()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r8.b()
            boolean r2 = r8 instanceof h.l
            if (r5 != r2) goto L6c
            goto L6d
        L6c:
            r3 = r8
        L6d:
            com.waze.copilot.data.c r3 = (com.waze.copilot.data.c) r3
            if (r3 == 0) goto L7f
            com.waze.copilot.a.bm r6 = r6.f22887b
            r0.f22882a = r7
            r0.f22885d = r4
            java.lang.Object r6 = r6.a(r3)
            if (r6 == r1) goto L7e
            goto L7f
        L7e:
            return r1
        L7f:
            r6 = r7
        L80:
            h.m.c(r6)
        L83:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.y.a(java.lang.String, h.c.e):java.lang.Object");
    }
}
