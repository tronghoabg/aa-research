package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.b.h f22796a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.data.b.a f22797b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sound.a.c f22798c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.mywaze.ah f22799d;

    public bj(com.waze.copilot.data.b.h hVar, com.waze.copilot.data.b.a aVar, com.waze.sound.a.c cVar, com.waze.mywaze.ah ahVar) {
        h.g.b.x.f(hVar, "copilotRepository");
        h.g.b.x.f(aVar, "carsRepository");
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(ahVar, "statsSender");
        this.f22796a = hVar;
        this.f22797b = aVar;
        this.f22798c = cVar;
        this.f22799d = ahVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r5 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object a(com.waze.copilot.a.bj r5, com.waze.copilot.data.c r6, com.waze.copilot.data.af r7, com.waze.copilot.data.ag r8, boolean r9, com.waze.mywaze.ag r10, h.c.e r11) {
        /*
            boolean r0 = r11 instanceof com.waze.copilot.a.bi
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.copilot.a.bi r0 = (com.waze.copilot.a.bi) r0
            int r1 = r0.f22792d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22792d = r1
            goto L18
        L13:
            com.waze.copilot.a.bi r0 = new com.waze.copilot.a.bi
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r11 = r0.f22790b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22792d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r11)
            goto La2
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            boolean r9 = r0.f22789a
            com.waze.copilot.data.ag r8 = r0.f22795g
            r5 = r8
            com.waze.copilot.data.ag r5 = (com.waze.copilot.data.ag) r5
            com.waze.copilot.data.af r7 = r0.f22794f
            r5 = r7
            com.waze.copilot.data.af r5 = (com.waze.copilot.data.af) r5
            com.waze.copilot.a.bj r5 = r0.f22793e
            r6 = r5
            com.waze.copilot.a.bj r6 = (com.waze.copilot.a.bj) r6
            e.b.c.b(r11)
            goto L60
        L48:
            e.b.c.b(r11)
            if (r6 == 0) goto L60
            com.waze.copilot.data.b.a r11 = r5.f22797b
            r0.f22793e = r5
            r0.f22794f = r7
            r0.f22795g = r8
            r0.f22789a = r9
            r0.f22792d = r4
            java.lang.Object r6 = com.waze.copilot.data.b.k.e(r11, r6, r9, r10)
            if (r6 != r1) goto L60
            goto La1
        L60:
            if (r7 == 0) goto L6b
            com.waze.copilot.data.b.h r6 = r5.f22796a
            java.lang.String r7 = r7.c()
            r6.f(r7, r9)
        L6b:
            if (r8 == 0) goto La2
            r6 = 0
            r0.f22793e = r6
            r0.f22794f = r6
            r0.f22795g = r6
            r0.f22792d = r3
            if (r9 == 0) goto L95
            com.waze.sound.a.c r7 = r5.f22798c
            com.waze.sound.a.b r7 = r7.c()
            if (r7 == 0) goto L8a
            com.waze.copilot.data.ag r7 = r7.a()
            if (r7 == 0) goto L8a
            java.lang.String r6 = r7.f()
        L8a:
            com.waze.mywaze.ah r7 = r5.f22799d
            java.lang.String r9 = r8.f()
            com.waze.mywaze.ag r10 = com.waze.mywaze.ag.f30570d
            r7.f(r6, r9, r10)
        L95:
            com.waze.sound.a.c r5 = r5.f22798c
            java.lang.Object r5 = r5.d(r8, r0)
            if (r5 == r1) goto L9f
            h.ab r5 = h.ab.f48028a
        L9f:
            if (r5 != r1) goto La2
        La1:
            return r1
        La2:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.bj.a(com.waze.copilot.a.bj, com.waze.copilot.data.c, com.waze.copilot.data.af, com.waze.copilot.data.ag, boolean, com.waze.mywaze.ag, h.c.e):java.lang.Object");
    }
}
