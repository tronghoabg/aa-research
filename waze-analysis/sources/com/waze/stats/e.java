package com.waze.stats;

import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40587a;

    /* renamed from: b, reason: collision with root package name */
    private final n f40588b;

    /* renamed from: c, reason: collision with root package name */
    private final w f40589c;

    /* renamed from: d, reason: collision with root package name */
    private final z f40590d;

    /* renamed from: e, reason: collision with root package name */
    private final s f40591e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.af f40592f;

    public e(com.waze.shared_infra.i.e eVar, n nVar, w wVar, z zVar, s sVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(nVar, "configuration");
        h.g.b.x.f(wVar, "requestMetadataProvider");
        h.g.b.x.f(zVar, "sharedRequestMetadataProvider");
        h.g.b.x.f(sVar, "network");
        h.g.b.x.f(abVar, "coroutineDispatcher");
        this.f40587a = eVar;
        this.f40588b = nVar;
        this.f40589c = wVar;
        this.f40590d = zVar;
        this.f40591e = sVar;
        this.f40592f = kotlinx.coroutines.aj.e(abVar.plus(kotlinx.coroutines.aj.Q()).plus(new ak(CoroutineExceptionHandler.f51269c, this, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object b(com.waze.stats.e r6, java.lang.Object r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.stats.d
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.stats.d r0 = (com.waze.stats.d) r0
            int r1 = r0.f40586e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40586e = r1
            goto L18
        L13:
            com.waze.stats.d r0 = new com.waze.stats.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f40584c
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40586e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f40583b
            com.google.v.fi r7 = (com.google.v.fi) r7
            java.lang.Object r0 = r0.f40582a
            e.b.c.b(r8)
            h.m r8 = (h.m) r8
            java.lang.Object r8 = r8.b()
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L6a
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            e.b.c.b(r8)
            com.waze.shared_infra.i.e r8 = r6.f40587a
            java.lang.String r2 = "About to send event"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            com.waze.stats.w r8 = r6.f40589c
            com.waze.stats.z r2 = r6.f40590d
            com.waze.stats.y r2 = r2.a()
            com.google.v.fi r8 = r8.a(r2)
            com.waze.stats.s r2 = r6.f40591e
            java.util.List r4 = h.a.i.d(r7)
            r0.f40582a = r7
            r0.f40583b = r8
            r0.f40586e = r3
            java.lang.Object r0 = r2.c(r4, r8)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            boolean r1 = r0 instanceof h.l
            if (r1 == 0) goto L7b
            java.lang.Throwable r1 = h.m.c(r0)
            com.waze.stats.p r2 = com.waze.stats.p.f40601a
            boolean r1 = h.g.b.x.n(r1, r2)
            if (r1 != 0) goto L7b
            return r0
        L7b:
            com.waze.shared_infra.i.e r6 = r6.f40587a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Metric successfully sent "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " with metadata "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.a(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.stats.e.b(com.waze.stats.e, java.lang.Object, h.c.e):java.lang.Object");
    }

    @Override // com.waze.stats.v
    public final void c(Object obj) {
        Objects.toString(obj);
        this.f40587a.a("Report metric: ".concat(String.valueOf(obj)));
        kotlinx.coroutines.aj.z(this.f40592f, null, null, new c(this, obj, null), 3);
    }

    @Override // com.waze.stats.v
    public final void d() {
        n nVar = this.f40588b;
        Objects.toString(nVar);
        this.f40587a.g("Reporter is created with configuration: ".concat(nVar.toString()));
    }

    @Override // com.waze.stats.v
    public final Object e() {
        return h.ab.f48028a;
    }
}
