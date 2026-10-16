package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.b.h f22785a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.data.b.a f22786b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sound.a.c f22787c;

    public bg(com.waze.copilot.data.b.h hVar, com.waze.copilot.data.b.a aVar, com.waze.sound.a.c cVar) {
        h.g.b.x.f(hVar, "copilotRepository");
        h.g.b.x.f(aVar, "carsRepository");
        h.g.b.x.f(cVar, "voiceRepository");
        this.f22785a = hVar;
        this.f22786b = aVar;
        this.f22787c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r6.d(r7, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object a(com.waze.copilot.a.bg r6, boolean r7, boolean r8, boolean r9, boolean r10, com.waze.mywaze.ag r11, h.c.e r12) {
        /*
            boolean r0 = r12 instanceof com.waze.copilot.a.bf
            if (r0 == 0) goto L13
            r0 = r12
            com.waze.copilot.a.bf r0 = (com.waze.copilot.a.bf) r0
            int r1 = r0.f22783f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22783f = r1
            goto L18
        L13:
            com.waze.copilot.a.bf r0 = new com.waze.copilot.a.bf
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.f22781d
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22783f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L44
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r12)
            goto L97
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.waze.copilot.a.bg r6 = r0.f22784g
            r7 = r6
            com.waze.copilot.a.bg r7 = (com.waze.copilot.a.bg) r7
            e.b.c.b(r12)
            h.m r12 = (h.m) r12
            java.lang.Object r7 = r12.b()
            goto L80
        L44:
            boolean r10 = r0.f22780c
            boolean r9 = r0.f22779b
            boolean r8 = r0.f22778a
            com.waze.copilot.a.bg r6 = r0.f22784g
            r7 = r6
            com.waze.copilot.a.bg r7 = (com.waze.copilot.a.bg) r7
            e.b.c.b(r12)
            goto L6b
        L53:
            e.b.c.b(r12)
            if (r7 == 0) goto L6b
            com.waze.copilot.data.b.a r7 = r6.f22786b
            r0.f22784g = r6
            r0.f22778a = r8
            r0.f22779b = r9
            r0.f22780c = r10
            r0.f22783f = r5
            java.lang.Object r7 = r7.j(r10, r11)
            if (r7 != r1) goto L6b
            goto L96
        L6b:
            if (r8 == 0) goto L72
            com.waze.copilot.data.b.h r7 = r6.f22785a
            r7.e(r10)
        L72:
            if (r9 == 0) goto L97
            com.waze.copilot.data.b.h r7 = r6.f22785a
            r0.f22784g = r6
            r0.f22783f = r4
            java.lang.Object r7 = com.waze.copilot.data.b.k.c(r7, r0)
            if (r7 == r1) goto L96
        L80:
            boolean r8 = r7 instanceof h.l
            r9 = 0
            if (r5 != r8) goto L86
            r7 = r9
        L86:
            com.waze.copilot.data.ag r7 = (com.waze.copilot.data.ag) r7
            if (r7 == 0) goto L97
            com.waze.sound.a.c r6 = r6.f22787c
            r0.f22784g = r9
            r0.f22783f = r3
            java.lang.Object r6 = r6.d(r7, r0)
            if (r6 != r1) goto L97
        L96:
            return r1
        L97:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.bg.a(com.waze.copilot.a.bg, boolean, boolean, boolean, boolean, com.waze.mywaze.ag, h.c.e):java.lang.Object");
    }
}
