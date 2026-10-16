package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    private final by f34315a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.m f34316b;

    public ca(by byVar, com.waze.sound.m mVar) {
        h.g.b.x.f(byVar, "generateAlertReportedTtsStringUseCase");
        h.g.b.x.f(mVar, "androidTextToSpeechService");
        this.f34315a = byVar;
        this.f34316b = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r11 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.reports_v2.b.at r8, java.lang.String r9, android.content.Context r10, h.c.e r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.waze.reports_v2.c.bz
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.reports_v2.c.bz r0 = (com.waze.reports_v2.c.bz) r0
            int r1 = r0.f34312d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34312d = r1
            goto L18
        L13:
            com.waze.reports_v2.c.bz r0 = new com.waze.reports_v2.c.bz
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f34310b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34312d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            e.b.c.b(r11)
            goto L80
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.String r7 = r0.f34313e
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            e.b.c.b(r11)
            goto L72
        L3f:
            java.lang.Object r8 = r0.f34309a
            r10 = r8
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r9 = r0.f34313e
            r8 = r9
            java.lang.String r8 = (java.lang.String) r8
            e.b.c.b(r11)
            goto L5e
        L4d:
            e.b.c.b(r11)
            com.waze.reports_v2.c.by r11 = r7.f34315a
            r0.f34313e = r9
            r0.f34309a = r10
            r0.f34312d = r6
            java.lang.Object r11 = r11.a(r8, r0)
            if (r11 == r1) goto L85
        L5e:
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L82
            com.waze.sound.m r7 = r7.f34316b
            r0.f34313e = r8
            r0.f34309a = r3
            r0.f34312d = r5
            java.lang.Object r11 = com.waze.sound.fb.f(r7, r10, r9, r0)
            if (r11 == r1) goto L85
            r7 = r8
        L72:
            com.waze.sound.m r11 = (com.waze.sound.m) r11
            if (r11 == 0) goto L82
            r0.f34313e = r3
            r0.f34312d = r4
            java.lang.Object r11 = com.waze.sound.m.j(r11, r7, r0)
            if (r11 == r1) goto L85
        L80:
            com.waze.sound.f r11 = (com.waze.sound.f) r11
        L82:
            h.ab r7 = h.ab.f48028a
            return r7
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.ca.a(com.waze.reports_v2.b.at, java.lang.String, android.content.Context, h.c.e):java.lang.Object");
    }
}
