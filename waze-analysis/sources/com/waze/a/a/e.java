package com.waze.a.a;

import com.waze.b.o;
import com.waze.b.y;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f13583a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.hub.c.e f13584b;

    /* renamed from: c, reason: collision with root package name */
    private final y f13585c;

    /* renamed from: d, reason: collision with root package name */
    private final o f13586d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f13587e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13588f;

    /* renamed from: g, reason: collision with root package name */
    private long f13589g;

    public e(com.waze.sharedui.profile.b bVar, com.waze.app_nav.hub.c.e eVar, y yVar, o oVar, com.waze.shared_infra.i.e eVar2) {
        x.f(bVar, "profileManager");
        x.f(eVar, "presenterProvider");
        x.f(yVar, "preLoginAadcAgeRestrictionRepository");
        x.f(oVar, "ageRestrictionApi");
        x.f(eVar2, "logger");
        this.f13583a = bVar;
        this.f13584b = eVar;
        this.f13585c = yVar;
        this.f13586d = oVar;
        this.f13587e = eVar2;
        String canonicalName = e.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f13588f = canonicalName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
    
        if (r14 == r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a A[Catch: Exception -> 0x003a, TRY_ENTER, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:54:0x0135, B:56:0x0143, B:58:0x0161, B:48:0x011a, B:50:0x0124), top: B:63:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:54:0x0135, B:56:0x0143, B:58:0x0161, B:48:0x011a, B:50:0x0124), top: B:63:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:54:0x0135, B:56:0x0143, B:58:0x0161, B:48:0x011a, B:50:0x0124), top: B:63:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:54:0x0135, B:56:0x0143, B:58:0x0161, B:48:0x011a, B:50:0x0124), top: B:63:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(com.waze.a.a.e r12, com.waze.sharedui.profile.UserProfile r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.a.a.e.a(com.waze.a.a.e, com.waze.sharedui.profile.UserProfile, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.shared_infra.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.a.a.b
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.a.a.b r0 = (com.waze.a.a.b) r0
            int r1 = r0.f13576c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13576c = r1
            goto L18
        L13:
            com.waze.a.a.b r0 = new com.waze.a.a.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13574a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f13576c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r5)
            goto L48
        L2f:
            e.b.c.b(r5)
            com.waze.sharedui.profile.b r5 = r4.f13583a
            kotlinx.coroutines.b.ch r5 = r5.f()
            com.waze.a.a.c r2 = new com.waze.a.a.c
            r2.<init>(r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f13576c = r3
            java.lang.Object r4 = r5.collect(r2, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.a.a.e.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f13588f;
    }
}
