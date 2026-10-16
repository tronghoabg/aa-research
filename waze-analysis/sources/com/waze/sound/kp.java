package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class kp implements com.waze.sound.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final kq f40390a;

    /* renamed from: b, reason: collision with root package name */
    private final kh f40391b;

    /* renamed from: c, reason: collision with root package name */
    private final kk f40392c;

    public kp(kq kqVar, kh khVar, kk kkVar) {
        h.g.b.x.f(kqVar, "stringProvider");
        h.g.b.x.f(khVar, "downloader");
        h.g.b.x.f(kkVar, "player");
        this.f40390a = kqVar;
        this.f40391b = khVar;
        this.f40392c = kkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.sound.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.sound.kn
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.sound.kn r0 = (com.waze.sound.kn) r0
            int r1 = r0.f40385c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40385c = r1
            goto L18
        L13:
            com.waze.sound.kn r0 = new com.waze.sound.kn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40383a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40385c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r7)
            goto L43
        L36:
            e.b.c.b(r7)
            com.waze.sound.kq r7 = r5.f40390a
            r0.f40385c = r4
            java.lang.Object r7 = r7.getTranslatedString(r6, r0)
            if (r7 == r1) goto L59
        L43:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L4d
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L4d:
            com.waze.sound.kh r5 = r5.f40391b
            r0.f40385c = r3
            java.lang.Object r5 = r5.downloadAudio(r7, r0)
            if (r5 != r1) goto L58
            goto L59
        L58:
            return r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.kp.a(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.sound.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.sound.ko
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sound.ko r0 = (com.waze.sound.ko) r0
            int r1 = r0.f40388c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40388c = r1
            goto L18
        L13:
            com.waze.sound.ko r0 = new com.waze.sound.ko
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f40386a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40388c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r3) goto L30
            java.lang.String r7 = r0.f40389d
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            e.b.c.b(r8)
            goto L5f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            e.b.c.b(r8)
            goto L49
        L3c:
            e.b.c.b(r8)
            com.waze.sound.kq r8 = r6.f40390a
            r0.f40388c = r5
            java.lang.Object r8 = r8.getTranslatedString(r7, r0)
            if (r8 == r1) goto L76
        L49:
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L53
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L53:
            com.waze.sound.kh r8 = r6.f40391b
            r0.f40389d = r7
            r0.f40388c = r3
            java.lang.Object r8 = r8.downloadAudio(r7, r0)
            if (r8 == r1) goto L76
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L6c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L6c:
            com.waze.sound.kk r6 = r6.f40392c
            r6.play(r7, r4)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.kp.b(java.lang.String, h.c.e):java.lang.Object");
    }
}
