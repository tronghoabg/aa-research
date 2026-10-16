package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    private final bs f34268a;

    /* renamed from: b, reason: collision with root package name */
    private final cj f34269b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.system.a f34270c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sound.m f34271d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34272e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34273f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.places.a.b f34274g;

    public bo(bs bsVar, cj cjVar, com.waze.system.a aVar, com.waze.config.a aVar2, com.waze.sound.m mVar, com.waze.places.a.b bVar, com.waze.reports_v2.d.j jVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bsVar, "conversationalReportingSupportedLocaleState");
        h.g.b.x.f(cjVar, "getUserSelectedVoiceLanguageUseCase");
        h.g.b.x.f(aVar, "getSystemLangLocaleUseCase");
        h.g.b.x.f(aVar2, "awaitConfigsSyncedUseCase");
        h.g.b.x.f(mVar, "ttsService");
        h.g.b.x.f(bVar, "configs");
        h.g.b.x.f(jVar, "statsSender");
        h.g.b.x.f(eVar, "logger");
        this.f34268a = bsVar;
        this.f34269b = cjVar;
        this.f34270c = aVar;
        this.f34271d = mVar;
        this.f34274g = bVar;
        this.f34272e = jVar;
        this.f34273f = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r5, java.lang.String r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.reports_v2.c.bm
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.reports_v2.c.bm r0 = (com.waze.reports_v2.c.bm) r0
            int r1 = r0.f34257c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34257c = r1
            goto L18
        L13:
            com.waze.reports_v2.c.bm r0 = new com.waze.reports_v2.c.bm
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f34255a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34257c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.f34258d
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            e.b.c.b(r7)
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r7)
            com.waze.sound.m r7 = r4.f34271d
            r0.f34258d = r6
            r0.f34257c = r3
            java.lang.String r2 = "LocaleValidatorUseCase"
            java.lang.Object r7 = com.waze.sound.fb.f(r7, r5, r2, r0)
            if (r7 == r1) goto L65
        L45:
            com.waze.sound.m r7 = (com.waze.sound.m) r7
            r5 = 0
            if (r7 != 0) goto L58
            com.waze.shared_infra.i.e r4 = r4.f34273f
            java.lang.String r6 = "Android's text to speech service is not ready"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.g(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            return r4
        L58:
            java.util.Locale r4 = r7.e(r6)
            if (r4 == 0) goto L5f
            goto L60
        L5f:
            r3 = r5
        L60:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.bo.c(android.content.Context, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r17, h.c.e r18) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.bo.a(android.content.Context, h.c.e):java.lang.Object");
    }
}
