package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class co {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.a.c f39704a;

    /* renamed from: b, reason: collision with root package name */
    private final SoundNativeManager f39705b;

    /* renamed from: c, reason: collision with root package name */
    private final fm f39706c;

    /* renamed from: d, reason: collision with root package name */
    private final hx f39707d;

    /* renamed from: e, reason: collision with root package name */
    private final gf f39708e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39709f;

    public co(com.waze.sound.a.c cVar, SoundNativeManager soundNativeManager, fm fmVar, hx hxVar, gf gfVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(cVar, "voiceRepository");
        h.g.b.x.f(soundNativeManager, "soundNativeManager");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(hxVar, "ttsStatsSender");
        h.g.b.x.f(gfVar, "soundPlayerStatSender");
        h.g.b.x.f(eVar, "logger");
        this.f39704a = cVar;
        this.f39705b = soundNativeManager;
        this.f39706c = fmVar;
        this.f39707d = hxVar;
        this.f39708e = gfVar;
        this.f39709f = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x011c, code lost:
    
        if (r6.e(r7, r8, r0) == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013f, code lost:
    
        if (r0 != r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0147, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object a(com.waze.sound.co r6, com.waze.sound.ck r7, h.g.a.a r8, h.c.e r9) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.co.a(com.waze.sound.co, com.waze.sound.ck, h.g.a.a, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (d(r9, r5, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        r5 = r9;
        r9 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.sound.co r8, java.util.List r9, h.g.a.a r10, h.c.e r11) {
        /*
            boolean r0 = r11 instanceof com.waze.sound.cn
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.sound.cn r0 = (com.waze.sound.cn) r0
            int r1 = r0.f39702g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39702g = r1
            goto L18
        L13:
            com.waze.sound.cn r0 = new com.waze.sound.cn
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f39700e
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f39702g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            int r8 = r0.f39699d
            int r9 = r0.f39698c
            java.lang.Object r10 = r0.f39697b
            goto L3b
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            int r8 = r0.f39699d
            int r9 = r0.f39698c
            java.lang.Object r10 = r0.f39697b
        L3b:
            h.g.a.a r10 = (h.g.a.a) r10
            java.lang.Object r2 = r0.f39696a
            java.util.List r2 = (java.util.List) r2
            com.waze.sound.co r5 = r0.f39703h
            r6 = r5
            com.waze.sound.co r6 = (com.waze.sound.co) r6
            e.b.c.b(r11)
            r11 = r10
            r10 = r2
            goto La4
        L4c:
            e.b.c.b(r11)
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L5b
            r10.invoke()
            h.ab r8 = h.ab.f48028a
            return r8
        L5b:
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            r2 = 0
            r7 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r7
        L68:
            if (r2 >= r8) goto La8
            int r5 = h.a.i.e(r10)
            if (r2 != r5) goto L89
            java.lang.Object r5 = r10.get(r2)
            com.waze.sound.ck r5 = (com.waze.sound.ck) r5
            r0.f39703h = r9
            r0.f39696a = r10
            r0.f39697b = r11
            r0.f39698c = r2
            r0.f39699d = r8
            r0.f39702g = r4
            java.lang.Object r5 = a(r9, r5, r11, r0)
            if (r5 != r1) goto La2
            goto La1
        L89:
            java.lang.Object r5 = r10.get(r2)
            com.waze.sound.ck r5 = (com.waze.sound.ck) r5
            r0.f39703h = r9
            r0.f39696a = r10
            r0.f39697b = r11
            r0.f39698c = r2
            r0.f39699d = r8
            r0.f39702g = r3
            java.lang.Object r5 = d(r9, r5, r0)
            if (r5 != r1) goto La2
        La1:
            return r1
        La2:
            r5 = r9
            r9 = r2
        La4:
            int r2 = r9 + 1
            r9 = r5
            goto L68
        La8:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.co.b(com.waze.sound.co, java.util.List, h.g.a.a, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object d(co coVar, ck ckVar, h.c.e eVar) {
        return a(coVar, ckVar, new com.waze.settings.ao(18), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, h.g.a.a r10, h.c.e r11) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.co.e(java.lang.String, h.g.a.a, h.c.e):java.lang.Object");
    }

    private final void f(String str, String str2, String str3, h.g.a.a aVar) {
        com.waze.shared_infra.i.e eVar = this.f39709f;
        if (str == null) {
            eVar.b(f.a(str2, "Failed to return path for ", " from SoundNativeManager"));
            this.f39708e.a(false, "PROMPT_PATH_NOT_FOUND (promptTypeStr: " + str2 + ", voiceId: " + str3 + ")");
            aVar.invoke();
            return;
        }
        eVar.a("Playing prompt " + str2 + " for voice " + str3 + " - path is: " + str);
        this.f39707d.c(str);
        com.waze.sharedui.e.e.i(this.f39706c, str, null, false, false, aVar, 14);
    }
}
