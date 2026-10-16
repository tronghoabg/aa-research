package com.google.firebase.sessions;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class an implements ak {

    /* renamed from: a, reason: collision with root package name */
    private static final double f10820a = Math.random();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.e f10821b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.d f10822c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.sessions.b.k f10823d;

    /* renamed from: e, reason: collision with root package name */
    private final h.c.j f10824e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.messaging.a.g f10825f;

    public an(com.google.firebase.e eVar, com.google.firebase.installations.d dVar, com.google.firebase.sessions.b.k kVar, com.google.firebase.messaging.a.g gVar, h.c.j jVar) {
        h.g.b.x.f(eVar, "firebaseApp");
        h.g.b.x.f(dVar, "firebaseInstallations");
        h.g.b.x.f(kVar, "sessionSettings");
        h.g.b.x.f(gVar, "eventGDTLogger");
        h.g.b.x.f(jVar, "backgroundDispatcher");
        this.f10821b = eVar;
        this.f10822c = dVar;
        this.f10823d = kVar;
        this.f10825f = gVar;
        this.f10824e = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.google.firebase.sessions.an r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.google.firebase.sessions.am
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.am r0 = (com.google.firebase.sessions.am) r0
            int r1 = r0.f10819c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10819c = r1
            goto L18
        L13:
            com.google.firebase.sessions.am r0 = new com.google.firebase.sessions.am
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10817a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f10819c
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            e.b.c.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            e.b.c.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            com.google.firebase.sessions.b.k r6 = r5.f10823d
            r0.f10819c = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            com.google.firebase.sessions.b.k r5 = r5.f10823d
            boolean r6 = r5.d()
            r0 = 0
            if (r6 != 0) goto L57
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L57:
            double r1 = com.google.firebase.sessions.an.f10820a
            double r5 = r5.a()
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 > 0) goto L66
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L66:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.an.e(com.google.firebase.sessions.an, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void f(an anVar, ai aiVar) {
        try {
            anVar.f10825f.c(aiVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + aiVar.c().g());
        } catch (RuntimeException e2) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e2);
        }
    }

    @Override // com.google.firebase.sessions.ak
    public final void a(ah ahVar) {
        h.g.b.x.f(ahVar, "sessionDetails");
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.e(this.f10824e), null, null, new al(this, ahVar, null), 3);
    }
}
