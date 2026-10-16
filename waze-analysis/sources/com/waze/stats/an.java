package com.waze.stats;

import java.util.Objects;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an implements v {

    /* renamed from: a, reason: collision with root package name */
    private final s f40528a;

    /* renamed from: b, reason: collision with root package name */
    private final t f40529b;

    /* renamed from: c, reason: collision with root package name */
    private final w f40530c;

    /* renamed from: d, reason: collision with root package name */
    private final z f40531d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40532e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.g.d f40533f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40534g;

    /* renamed from: h, reason: collision with root package name */
    private final u f40535h;

    /* renamed from: i, reason: collision with root package name */
    private final aa f40536i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.af f40537j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.af f40538k;

    /* renamed from: l, reason: collision with root package name */
    private kotlinx.coroutines.am f40539l;
    private final kotlinx.coroutines.a.o m;
    private boolean n;
    private final com.waze.stats.storage.c o;

    public an(s sVar, com.waze.stats.storage.c cVar, t tVar, w wVar, z zVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar, kotlinx.coroutines.ab abVar2, com.waze.g.d dVar, com.waze.shared_infra.i.b bVar, u uVar, aa aaVar) {
        h.g.b.x.f(sVar, "network");
        h.g.b.x.f(cVar, "storage");
        h.g.b.x.f(tVar, "configuration");
        h.g.b.x.f(wVar, "requestMetadataProvider");
        h.g.b.x.f(zVar, "sharedRequestMetadataProvider");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "coroutineDispatcher");
        h.g.b.x.f(abVar2, "periodicCoroutineDispatcher");
        h.g.b.x.f(dVar, "applicationInfoRepository");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(uVar, "statParser");
        h.g.b.x.f(aaVar, "statType");
        this.f40528a = sVar;
        this.o = cVar;
        this.f40529b = tVar;
        this.f40530c = wVar;
        this.f40531d = zVar;
        this.f40532e = eVar;
        this.f40533f = dVar;
        this.f40534g = bVar;
        this.f40535h = uVar;
        this.f40536i = aaVar;
        h.c.j jVarPlus = abVar.plus(kotlinx.coroutines.aj.Q());
        kotlinx.coroutines.ac acVar = CoroutineExceptionHandler.f51269c;
        this.f40537j = kotlinx.coroutines.aj.e(jVarPlus.plus(new ak(acVar, this, 0)));
        this.f40538k = kotlinx.coroutines.aj.e(abVar2.plus(kotlinx.coroutines.aj.Q()).plus(new ak(acVar, this, 2, null)));
        this.m = h.g.b.w.c(Integer.MAX_VALUE, null, null, 6);
    }

    public static final /* synthetic */ Object f(an anVar, h.c.e eVar) {
        Object objCollect = kotlinx.coroutines.b.ai.v(anVar.m).collect(new ae(anVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.stats.an r13, java.lang.Object r14, h.c.e r15) {
        /*
            boolean r0 = r15 instanceof com.waze.stats.ag
            if (r0 == 0) goto L13
            r0 = r15
            com.waze.stats.ag r0 = (com.waze.stats.ag) r0
            int r1 = r0.f40508c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40508c = r1
            goto L18
        L13:
            com.waze.stats.ag r0 = new com.waze.stats.ag
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f40506a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40508c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r15)
            goto L69
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            e.b.c.b(r15)
            com.waze.shared_infra.i.e r15 = r13.f40532e
            java.util.Objects.toString(r14)
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r4 = "Saving stat: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r15.a(r2)
            com.waze.stats.storage.c r15 = r13.o
            com.waze.stats.u r2 = r13.f40535h
            com.waze.stats.StatsContract$StatContainer r4 = new com.waze.stats.StatsContract$StatContainer
            byte[] r7 = r2.c(r14)
            long r8 = r2.a(r14)
            com.waze.stats.aa r10 = r13.f40536i
            r11 = 1
            r12 = 0
            r5 = 0
            r4.<init>(r5, r7, r8, r10, r11, r12)
            r15.b(r4)
            r0.f40508c = r3
            java.lang.Object r15 = r15.g()
            if (r15 != r1) goto L69
            return r1
        L69:
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r15.intValue()
            int r14 = r14 + r3
            boolean r15 = r13.n
            if (r15 != 0) goto La0
            com.waze.stats.t r15 = r13.f40529b
            int r0 = r15.c()
            if (r14 <= r0) goto La0
            com.waze.shared_infra.i.e r0 = r13.f40532e
            int r15 = r15.c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Buffer is full - "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r14 = " while threshold is "
            r1.append(r14)
            r1.append(r15)
            java.lang.String r14 = r1.toString()
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r0.a(r14)
            m(r13)
        La0:
            h.ab r13 = h.ab.f48028a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.stats.an.g(com.waze.stats.an, java.lang.Object, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object i(com.waze.stats.an r5, boolean r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.stats.aj
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.stats.aj r0 = (com.waze.stats.aj) r0
            int r1 = r0.f40518d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40518d = r1
            goto L18
        L13:
            com.waze.stats.aj r0 = new com.waze.stats.aj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40516b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40518d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L68
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            boolean r6 = r0.f40515a
            e.b.c.b(r7)
            h.m r7 = (h.m) r7
            java.lang.Object r7 = r7.b()
            goto L4c
        L3e:
            e.b.c.b(r7)
            r0.f40515a = r6
            r0.f40518d = r4
            java.lang.Object r7 = r5.o(r0)
            if (r7 != r1) goto L4c
            goto L67
        L4c:
            boolean r7 = r7 instanceof h.l
            if (r7 == 0) goto L52
            r5.n = r4
        L52:
            if (r6 == 0) goto L83
            com.waze.shared_infra.i.e r6 = r5.f40532e
            java.lang.String r7 = "Clearing stats because forceClear was passed"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.g(r7)
            com.waze.stats.storage.c r6 = r5.o
            r0.f40518d = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            com.waze.shared_infra.i.e r5 = r5.f40532e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Number of events cleared: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.g(r6)
        L83:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.stats.an.i(com.waze.stats.an, boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.List r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.stats.af
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.stats.af r0 = (com.waze.stats.af) r0
            int r1 = r0.f40505e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40505e = r1
            goto L18
        L13:
            com.waze.stats.af r0 = new com.waze.stats.af
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40503c
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40505e
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.f40502b
            com.google.v.fi r6 = (com.google.v.fi) r6
            java.lang.Object r0 = r0.f40501a
            java.util.List r0 = (java.util.List) r0
            e.b.c.b(r7)
            h.m r7 = (h.m) r7
            java.lang.Object r7 = r7.b()
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L6d
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            e.b.c.b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L53
            com.waze.stats.p r5 = com.waze.stats.p.f40601a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r5 = e.b.c.a(r5)
            return r5
        L53:
            com.waze.stats.w r7 = r5.f40530c
            com.waze.stats.z r2 = r5.f40531d
            com.waze.stats.y r2 = r2.a()
            com.google.v.fi r7 = r7.a(r2)
            com.waze.stats.s r2 = r5.f40528a
            r0.f40501a = r6
            r0.f40502b = r7
            r0.f40505e = r3
            java.lang.Object r0 = r2.c(r6, r7)
            if (r0 == r1) goto Laf
        L6d:
            boolean r1 = r0 instanceof h.l
            if (r1 == 0) goto L72
            return r0
        L72:
            r1 = 0
            r5.n = r1
            com.waze.shared_infra.i.e r5 = r5.f40532e
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L86
            int r1 = r1.size()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            goto L87
        L86:
            r2 = 0
        L87:
            int r6 = r6.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stats successfully sent "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " out of "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " with metadata "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.a(r6)
            return r0
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.stats.an.n(java.util.List, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(h.c.e r15) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.stats.an.o(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean z) {
        this.f40532e.a("Send stats called with clearAll=" + z);
        ad adVar = new ad(z);
        q(this.m.i(adVar), adVar);
    }

    private final void q(Object obj, com.waze.sharedui.utils.f fVar) {
        if (obj instanceof kotlinx.coroutines.a.s) {
            Throwable thD = kotlinx.coroutines.a.t.d(obj);
            if (thD != null) {
                this.f40534g.a(thD, null);
            }
            com.waze.shared_infra.i.e eVar = this.f40532e;
            Objects.toString(fVar);
            com.waze.settings.tree.c.f.e(eVar, "Failed ".concat(fVar.toString()), kotlinx.coroutines.a.t.d(obj));
        }
    }

    @Override // com.waze.stats.v
    public final void c(Object obj) {
        ac acVar = new ac(obj);
        q(this.m.i(acVar), acVar);
    }

    @Override // com.waze.stats.v
    public final void d() {
        t tVar = this.f40529b;
        Objects.toString(tVar);
        String strConcat = "Reporter is created with configuration: ".concat(tVar.toString());
        com.waze.shared_infra.i.e eVar = this.f40532e;
        eVar.g(strConcat);
        al alVar = new al(this, null, 0);
        kotlinx.coroutines.af afVar = this.f40537j;
        kotlinx.coroutines.aj.z(afVar, null, null, alVar, 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new al(this, null, 1, null), 3);
        long jF = tVar.f();
        h.o.d dVar = h.o.d.f48272c;
        long jMax = Math.max(h.o.a.u(jF, dVar), h.o.a.u(tVar.d(), dVar));
        eVar.a("Reporter start periodic send, interval:" + jMax);
        kotlinx.coroutines.am amVar = this.f40539l;
        if (amVar != null) {
            amVar.s(null);
        }
        this.f40539l = kotlinx.coroutines.aj.y(this.f40538k, null, null, new am(this, jMax, null), 3);
    }

    @Override // com.waze.stats.v
    public final Object e() {
        kotlinx.coroutines.aj.z(this.f40537j, null, null, new ah(this, null), 3);
        return h.ab.f48028a;
    }
}
