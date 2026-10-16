package com.google;

import androidx.core.app.NotificationCompat;
import com.google.firebase.d.f;
import com.google.firebase.d.g;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    static final a f3588a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f3589b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f3590c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f3591d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f3592e;

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f3593f;

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f3594g;

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.d.e f3595h;

    /* renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.d.e f3596i;

    /* renamed from: j, reason: collision with root package name */
    private static final com.google.firebase.d.e f3597j;

    /* renamed from: k, reason: collision with root package name */
    private static final com.google.firebase.d.e f3598k;

    /* renamed from: l, reason: collision with root package name */
    private static final com.google.firebase.d.e f3599l;
    private static final com.google.firebase.d.e m;
    private static final com.google.firebase.d.e n;
    private static final com.google.firebase.d.e o;
    private static final com.google.firebase.d.e p;

    static {
        com.google.firebase.d.d dVarA = com.google.firebase.d.e.a("projectNumber");
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b();
        bVar.b(1);
        dVarA.b(bVar.a());
        f3589b = dVarA.a();
        com.google.firebase.d.d dVarA2 = com.google.firebase.d.e.a("messageId");
        com.google.firebase.d.c.b bVar2 = new com.google.firebase.d.c.b();
        bVar2.b(2);
        dVarA2.b(bVar2.a());
        f3590c = dVarA2.a();
        com.google.firebase.d.d dVarA3 = com.google.firebase.d.e.a("instanceId");
        com.google.firebase.d.c.b bVar3 = new com.google.firebase.d.c.b();
        bVar3.b(3);
        dVarA3.b(bVar3.a());
        f3591d = dVarA3.a();
        com.google.firebase.d.d dVarA4 = com.google.firebase.d.e.a("messageType");
        com.google.firebase.d.c.b bVar4 = new com.google.firebase.d.c.b();
        bVar4.b(4);
        dVarA4.b(bVar4.a());
        f3592e = dVarA4.a();
        com.google.firebase.d.d dVarA5 = com.google.firebase.d.e.a("sdkPlatform");
        com.google.firebase.d.c.b bVar5 = new com.google.firebase.d.c.b();
        bVar5.b(5);
        dVarA5.b(bVar5.a());
        f3593f = dVarA5.a();
        com.google.firebase.d.d dVarA6 = com.google.firebase.d.e.a("packageName");
        com.google.firebase.d.c.b bVar6 = new com.google.firebase.d.c.b();
        bVar6.b(6);
        dVarA6.b(bVar6.a());
        f3594g = dVarA6.a();
        com.google.firebase.d.d dVarA7 = com.google.firebase.d.e.a("collapseKey");
        com.google.firebase.d.c.b bVar7 = new com.google.firebase.d.c.b();
        bVar7.b(7);
        dVarA7.b(bVar7.a());
        f3595h = dVarA7.a();
        com.google.firebase.d.d dVarA8 = com.google.firebase.d.e.a("priority");
        com.google.firebase.d.c.b bVar8 = new com.google.firebase.d.c.b();
        bVar8.b(8);
        dVarA8.b(bVar8.a());
        f3596i = dVarA8.a();
        com.google.firebase.d.d dVarA9 = com.google.firebase.d.e.a("ttl");
        com.google.firebase.d.c.b bVar9 = new com.google.firebase.d.c.b();
        bVar9.b(9);
        dVarA9.b(bVar9.a());
        f3597j = dVarA9.a();
        com.google.firebase.d.d dVarA10 = com.google.firebase.d.e.a("topic");
        com.google.firebase.d.c.b bVar10 = new com.google.firebase.d.c.b();
        bVar10.b(10);
        dVarA10.b(bVar10.a());
        f3598k = dVarA10.a();
        com.google.firebase.d.d dVarA11 = com.google.firebase.d.e.a("bulkId");
        com.google.firebase.d.c.b bVar11 = new com.google.firebase.d.c.b();
        bVar11.b(11);
        dVarA11.b(bVar11.a());
        f3599l = dVarA11.a();
        com.google.firebase.d.d dVarA12 = com.google.firebase.d.e.a(NotificationCompat.CATEGORY_EVENT);
        com.google.firebase.d.c.b bVar12 = new com.google.firebase.d.c.b();
        bVar12.b(12);
        dVarA12.b(bVar12.a());
        m = dVarA12.a();
        com.google.firebase.d.d dVarA13 = com.google.firebase.d.e.a("analyticsLabel");
        com.google.firebase.d.c.b bVar13 = new com.google.firebase.d.c.b();
        bVar13.b(13);
        dVarA13.b(bVar13.a());
        n = dVarA13.a();
        com.google.firebase.d.d dVarA14 = com.google.firebase.d.e.a("campaignId");
        com.google.firebase.d.c.b bVar14 = new com.google.firebase.d.c.b();
        bVar14.b(14);
        dVarA14.b(bVar14.a());
        o = dVarA14.a();
        com.google.firebase.d.d dVarA15 = com.google.firebase.d.e.a("composerLabel");
        com.google.firebase.d.c.b bVar15 = new com.google.firebase.d.c.b();
        bVar15.b(15);
        dVarA15.b(bVar15.a());
        p = dVarA15.a();
    }

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        com.google.firebase.messaging.a.e eVar = (com.google.firebase.messaging.a.e) obj;
        g gVar = (g) obj2;
        gVar.c(f3589b, eVar.c());
        gVar.d(f3590c, eVar.l());
        gVar.d(f3591d, eVar.k());
        gVar.d(f3592e, eVar.f());
        gVar.d(f3593f, eVar.g());
        gVar.d(f3594g, eVar.m());
        gVar.d(f3595h, eVar.i());
        gVar.b(f3596i, eVar.a());
        gVar.b(f3597j, eVar.b());
        gVar.d(f3598k, eVar.n());
        gVar.c(f3599l, 0L);
        gVar.d(m, eVar.e());
        gVar.d(n, eVar.h());
        gVar.c(o, 0L);
        gVar.d(p, eVar.j());
    }
}
