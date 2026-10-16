package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22768a;

    /* renamed from: b, reason: collision with root package name */
    private final al f22769b;

    /* renamed from: c, reason: collision with root package name */
    private final ac f22770c;

    /* renamed from: d, reason: collision with root package name */
    private final bg f22771d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.copilot.data.b.h f22772e;

    /* renamed from: f, reason: collision with root package name */
    private final bh f22773f;

    /* renamed from: g, reason: collision with root package name */
    private final bj f22774g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.copilot.data.b.a f22775h;

    /* renamed from: i, reason: collision with root package name */
    private final o f22776i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f22777j;

    public be(com.waze.shared_infra.i.e eVar, al alVar, ac acVar, bg bgVar, com.waze.copilot.data.b.h hVar, bh bhVar, bj bjVar, com.waze.copilot.data.b.a aVar, o oVar, com.waze.shared_infra.i.b bVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(alVar, "getCopilotUserSelectionsUseCase");
        h.g.b.x.f(acVar, "downloadCopilotMetadataAndAssetsUseCase");
        h.g.b.x.f(bgVar, "resetToDefaultCopilotAssetsUseCase");
        h.g.b.x.f(hVar, "copilotRepository");
        h.g.b.x.f(bhVar, "setCopilotAssetsProtoUseCase");
        h.g.b.x.f(bjVar, "setCopilotSelectionsUseCase");
        h.g.b.x.f(aVar, "carsRepository");
        h.g.b.x.f(oVar, "statsSender");
        h.g.b.x.f(bVar, "exceptionReporter");
        this.f22768a = eVar;
        this.f22769b = alVar;
        this.f22770c = acVar;
        this.f22771d = bgVar;
        this.f22772e = hVar;
        this.f22773f = bhVar;
        this.f22774g = bjVar;
        this.f22775h = aVar;
        this.f22776i = oVar;
        this.f22777j = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a6, code lost:
    
        if (r4.o(r11, r7) == r0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.copilot.a.be r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.be.b(com.waze.copilot.a.be, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(h.c.e r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.waze.copilot.a.aw
            if (r0 == 0) goto L13
            r0 = r12
            com.waze.copilot.a.aw r0 = (com.waze.copilot.a.aw) r0
            int r1 = r0.f22728c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22728c = r1
            goto L18
        L13:
            com.waze.copilot.a.aw r0 = new com.waze.copilot.a.aw
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f22726a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22728c
            java.lang.String r3 = ", voice: "
            java.lang.String r4 = ", mood: "
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 != r6) goto L3b
            java.lang.String r1 = r0.f22731f
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r0.f22730e
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = r0.f22729d
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            e.b.c.b(r12)
            goto L9f
        L3b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L43:
            e.b.c.b(r12)
            com.waze.copilot.a.al r12 = r11.f22769b
            r2 = 0
            com.waze.copilot.data.b.q r12 = r12.a(r2)
            java.lang.String r2 = r12.a()
            java.lang.String r7 = r12.b()
            java.lang.String r12 = r12.c()
            com.waze.shared_infra.i.e r8 = r11.f22768a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "User selections: car: "
            r9.<init>(r10)
            r9.append(r2)
            r9.append(r4)
            r9.append(r7)
            r9.append(r3)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.a(r9)
            java.lang.String r8 = "Arrow"
            boolean r8 = h.g.b.x.n(r2, r8)
            if (r8 != 0) goto L8a
            java.lang.String r8 = "MAP_CAR_Arrow"
            boolean r8 = h.g.b.x.n(r2, r8)
            if (r8 == 0) goto L8b
        L8a:
            r2 = r5
        L8b:
            com.waze.copilot.data.b.h r8 = r11.f22772e
            r0.f22729d = r12
            r0.f22730e = r2
            r0.f22731f = r7
            r0.f22728c = r6
            java.lang.Object r0 = r8.d(r7, r0)
            if (r0 == r1) goto Ld4
            r1 = r0
            r0 = r12
            r12 = r1
            r1 = r7
        L9f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r6 != r12) goto La8
            goto La9
        La8:
            r5 = r1
        La9:
            com.waze.shared_infra.i.e r11 = r11.f22768a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "assets to verify: car: "
            r12.<init>(r1)
            r12.append(r2)
            r12.append(r4)
            r12.append(r5)
            r12.append(r3)
            if (r0 != 0) goto Lc2
            java.lang.String r0 = "EMPTY"
        Lc2:
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.a(r12)
            com.waze.copilot.data.y r11 = new com.waze.copilot.data.y
            r11.<init>(r2, r5, r0)
            return r11
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.be.i(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.waze.copilot.data.y r11, com.waze.copilot.a.aa r12, h.c.e r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.be.j(com.waze.copilot.data.y, com.waze.copilot.a.aa, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.waze.copilot.a.aa r8, java.lang.String r9, h.c.e r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.be.k(com.waze.copilot.a.aa, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.waze.copilot.data.a.g r6, java.lang.String r7, h.c.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.waze.copilot.a.ba
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.copilot.a.ba r0 = (com.waze.copilot.a.ba) r0
            int r1 = r0.f22753c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22753c = r1
            goto L18
        L13:
            com.waze.copilot.a.ba r0 = new com.waze.copilot.a.ba
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f22751a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22753c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            e.b.c.b(r8)
            goto L49
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r8)
            h.m r8 = r6.a()
            if (r8 == 0) goto L54
            java.lang.Object r8 = r8.b()
            boolean r8 = r8 instanceof h.l
            if (r8 != r4) goto L54
            r0.f22753c = r4
            java.lang.Object r8 = r5.t(r6, r7)
            if (r8 == r1) goto L53
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r5 = r8.booleanValue()
            if (r5 != 0) goto L54
            r3 = r4
            goto L54
        L53:
            return r1
        L54:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.be.l(com.waze.copilot.data.a.g, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.waze.copilot.data.a.g r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.copilot.a.bb
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.copilot.a.bb r0 = (com.waze.copilot.a.bb) r0
            int r1 = r0.f22756c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22756c = r1
            goto L18
        L13:
            com.waze.copilot.a.bb r0 = new com.waze.copilot.a.bb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f22754a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22756c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            e.b.c.b(r7)
            goto L49
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r7)
            h.m r7 = r6.b()
            if (r7 == 0) goto L54
            java.lang.Object r7 = r7.b()
            boolean r7 = r7 instanceof h.l
            if (r7 != r4) goto L54
            r0.f22756c = r4
            java.lang.Object r7 = r5.n(r6, r0)
            if (r7 == r1) goto L53
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 != 0) goto L54
            r3 = r4
            goto L54
        L53:
            return r1
        L54:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.be.m(com.waze.copilot.data.a.g, h.c.e):java.lang.Object");
    }

    private final Object n(com.waze.copilot.data.a.g gVar, h.c.e eVar) {
        h.m mVarB = gVar.b();
        if (r(mVarB != null ? h.m.c(mVarB.b()) : null)) {
            return false;
        }
        return this.f22772e.c(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r1 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (com.waze.copilot.a.bg.a(r1, r5, r3, false, false, r6, r7) != r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.waze.copilot.data.y r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.be.o(com.waze.copilot.data.y, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        if (com.waze.copilot.a.bj.a(r1, r10, r3, r5, false, r6, r7) != r0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.waze.copilot.a.aa r11, java.lang.String r12, h.c.e r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.be.p(com.waze.copilot.a.aa, java.lang.String, h.c.e):java.lang.Object");
    }

    private static final boolean q(com.waze.copilot.data.o oVar) {
        h.m mVarA = oVar.a();
        return mVarA != null && h.m.e(mVarA.b());
    }

    private static final boolean r(Throwable th) {
        com.waze.copilot.data.a.i iVar = th instanceof com.waze.copilot.data.a.i ? (com.waze.copilot.data.a.i) th : null;
        if ((iVar != null ? iVar.a() : null) != com.waze.copilot.data.x.f23079d) {
            return (iVar != null ? iVar.a() : null) == com.waze.copilot.data.x.f23080e;
        }
        return true;
    }

    private static final boolean s(com.waze.copilot.data.o oVar) {
        h.m mVarB = oVar.b();
        return mVarB != null && h.m.e(mVarB.b());
    }

    private final Object t(com.waze.copilot.data.a.g gVar, String str) {
        h.m mVarA = gVar.a();
        if (r(mVarA != null ? h.m.c(mVarA.b()) : null) || str == null) {
            return false;
        }
        return this.f22775h.g(str);
    }
}
