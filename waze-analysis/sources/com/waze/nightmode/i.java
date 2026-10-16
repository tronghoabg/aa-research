package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32469a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.b.a f32470b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32471c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.l.d f32472d;

    public i(com.waze.shared_infra.i.e eVar, com.waze.shared_infra.b.a aVar, long j2) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(aVar, "storage");
        this.f32469a = eVar;
        this.f32470b = aVar;
        this.f32471c = j2;
        this.f32472d = new com.google.l.e().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.nightmode.NightModeDaylightTime c(com.waze.nightmode.i r5) {
        /*
            r0 = 0
            r1 = r5
            com.waze.nightmode.i r1 = (com.waze.nightmode.i) r1     // Catch: java.lang.Throwable -> L26
            com.waze.shared_infra.b.a r1 = r5.f32470b     // Catch: java.lang.Throwable -> L26
            byte[] r1 = r1.c()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L24
            int r2 = r1.length     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L10
            r1 = r0
        L10:
            if (r1 == 0) goto L24
            com.google.l.d r2 = r5.f32472d     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L26
            java.nio.charset.Charset r4 = h.n.a.f48221b     // Catch: java.lang.Throwable -> L26
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Class<com.waze.nightmode.NightModeDaylightTime> r1 = com.waze.nightmode.NightModeDaylightTime.class
            java.lang.Object r1 = r2.f(r3, r1)     // Catch: java.lang.Throwable -> L26
            com.waze.nightmode.NightModeDaylightTime r1 = (com.waze.nightmode.NightModeDaylightTime) r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L24:
            r1 = r0
            goto L2b
        L26:
            r1 = move-exception
            java.lang.Object r1 = e.b.c.a(r1)
        L2b:
            java.lang.Throwable r2 = h.m.c(r1)
            if (r2 == 0) goto L38
            com.waze.shared_infra.i.e r5 = r5.f32469a
            java.lang.String r3 = "failed to read model"
            r5.h(r3, r2)
        L38:
            r5 = 1
            boolean r2 = r1 instanceof h.l
            if (r5 != r2) goto L3e
            goto L3f
        L3e:
            r0 = r1
        L3f:
            com.waze.nightmode.NightModeDaylightTime r0 = (com.waze.nightmode.NightModeDaylightTime) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.nightmode.i.c(com.waze.nightmode.i):com.waze.nightmode.NightModeDaylightTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.waze.nightmode.NightModeDaylightTime r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.nightmode.g
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.nightmode.g r0 = (com.waze.nightmode.g) r0
            int r1 = r0.f32466c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32466c = r1
            goto L18
        L13:
            com.waze.nightmode.g r0 = new com.waze.nightmode.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f32464a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32466c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L4d
        L27:
            r6 = move-exception
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            e.b.c.b(r7)
            r7 = r5
            com.waze.nightmode.i r7 = (com.waze.nightmode.i) r7     // Catch: java.lang.Throwable -> L27
            kotlinx.coroutines.ab r7 = kotlinx.coroutines.av.b()     // Catch: java.lang.Throwable -> L27
            h.c.j r7 = (h.c.j) r7     // Catch: java.lang.Throwable -> L27
            com.waze.nightmode.h r2 = new com.waze.nightmode.h     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Throwable -> L27
            h.g.a.p r2 = (h.g.a.p) r2     // Catch: java.lang.Throwable -> L27
            r0.f32466c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = kotlinx.coroutines.aj.v(r7, r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == r1) goto L50
        L4d:
            h.ab r6 = h.ab.f48028a     // Catch: java.lang.Throwable -> L27
            goto L55
        L50:
            return r1
        L51:
            java.lang.Object r6 = e.b.c.a(r6)
        L55:
            java.lang.Throwable r6 = h.m.c(r6)
            if (r6 == 0) goto L62
            com.waze.shared_infra.i.e r5 = r5.f32469a
            java.lang.String r7 = "failed to store daylight time"
            r5.h(r7, r6)
        L62:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.nightmode.i.f(com.waze.nightmode.NightModeDaylightTime, h.c.e):java.lang.Object");
    }
}
