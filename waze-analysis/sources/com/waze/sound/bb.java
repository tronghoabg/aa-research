package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb implements com.waze.t.b.ca {

    /* renamed from: a, reason: collision with root package name */
    private final kq f39513a;

    /* renamed from: b, reason: collision with root package name */
    private final kh f39514b;

    /* renamed from: c, reason: collision with root package name */
    private final kk f39515c;

    public bb(kq kqVar, kh khVar, kk kkVar) {
        h.g.b.x.f(kqVar, "stringProvider");
        h.g.b.x.f(khVar, "downloader");
        h.g.b.x.f(kkVar, "player");
        this.f39513a = kqVar;
        this.f39514b = khVar;
        this.f39515c = kkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.t.b.ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.sound.az
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.sound.az r0 = (com.waze.sound.az) r0
            int r1 = r0.f39491c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39491c = r1
            goto L18
        L13:
            com.waze.sound.az r0 = new com.waze.sound.az
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f39489a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39491c
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
            com.waze.sound.kq r7 = r5.f39513a
            r0.f39491c = r4
            java.lang.Object r7 = r7.getTranslatedString(r6, r0)
            if (r7 == r1) goto L59
        L43:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L4d
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L4d:
            com.waze.sound.kh r5 = r5.f39514b
            r0.f39491c = r3
            java.lang.Object r5 = r5.downloadAudio(r7, r0)
            if (r5 != r1) goto L58
            goto L59
        L58:
            return r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.bb.a(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.t.b.ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, boolean r8, h.c.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.waze.sound.ba
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.sound.ba r0 = (com.waze.sound.ba) r0
            int r1 = r0.f39511d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39511d = r1
            goto L18
        L13:
            com.waze.sound.ba r0 = new com.waze.sound.ba
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f39509b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39511d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            boolean r7 = r0.f39508a
            java.lang.String r8 = r0.f39512e
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            e.b.c.b(r9)
            goto L65
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            boolean r8 = r0.f39508a
            e.b.c.b(r9)
            goto L4e
        L3f:
            e.b.c.b(r9)
            com.waze.sound.kq r9 = r6.f39513a
            r0.f39508a = r8
            r0.f39511d = r4
            java.lang.Object r9 = r9.getTranslatedString(r7, r0)
            if (r9 == r1) goto L78
        L4e:
            r7 = r9
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L54
            goto L75
        L54:
            com.waze.sound.kh r9 = r6.f39514b
            r0.f39512e = r7
            r0.f39508a = r8
            r0.f39511d = r3
            java.lang.Object r9 = r9.downloadAudio(r7, r0)
            if (r9 == r1) goto L78
            r5 = r8
            r8 = r7
            r7 = r5
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L75
            com.waze.sound.kk r6 = r6.f39515c
            r6.play(r8, r7)
            h.ab r6 = h.ab.f48028a
            return r6
        L75:
            h.ab r6 = h.ab.f48028a
            return r6
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.bb.b(java.lang.String, boolean, h.c.e):java.lang.Object");
    }
}
