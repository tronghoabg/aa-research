package com.waze.app_nav.hub.c;

import androidx.media3.common.C;
import h.g.b.x;
import java.util.PriorityQueue;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p implements g {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f15323a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15324b;

    /* renamed from: c, reason: collision with root package name */
    private long f15325c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue f15326d;

    /* renamed from: e, reason: collision with root package name */
    private final bm f15327e;

    public p(af afVar, kotlinx.coroutines.b.k kVar, com.waze.shared_infra.i.e eVar) {
        x.f(afVar, "scope");
        x.f(kVar, "policy");
        x.f(eVar, "logger");
        this.f15323a = kVar;
        this.f15324b = eVar;
        this.f15326d = new PriorityQueue(1, new com.waze.app_nav.hub.a.f(new i(0), 2));
        bm bmVarE = bu.e(1, 0, null, 6);
        this.f15327e = bmVarE;
        ai.m(ai.K(ai.w(bmVarE, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS), new j(this, null)), afVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.app_nav.hub.c.p r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.app_nav.hub.c.l
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.app_nav.hub.c.l r0 = (com.waze.app_nav.hub.c.l) r0
            int r1 = r0.f15314c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15314c = r1
            goto L18
        L13:
            com.waze.app_nav.hub.c.l r0 = new com.waze.app_nav.hub.c.l
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f15312a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15314c
            r3 = 1
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            goto L2c
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            e.b.c.b(r8)
        L2f:
            monitor-enter(r7)
            java.util.PriorityQueue r8 = r7.f15326d     // Catch: java.lang.Throwable -> L6d
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L6d
            r4 = 0
            if (r2 != 0) goto L43
            java.lang.Object r8 = r8.remove()     // Catch: java.lang.Throwable -> L6d
            com.waze.app_nav.hub.c.k r8 = (com.waze.app_nav.hub.c.k) r8     // Catch: java.lang.Throwable -> L6d
            goto L44
        L43:
            r8 = r4
        L44:
            monitor-exit(r7)
            com.waze.shared_infra.i.e r2 = r7.f15324b
            java.lang.String r5 = "next presenter "
            java.util.Objects.toString(r8)
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.lang.String r5 = r5.concat(r6)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.a(r5)
            if (r8 == 0) goto L5f
            com.waze.app_nav.hub.c.b r4 = r8.b()
        L5f:
            if (r4 != 0) goto L64
            h.ab r7 = h.ab.f48028a
            return r7
        L64:
            r0.f15314c = r3
            java.lang.Object r8 = r7.f(r4, r0)
            if (r8 != r1) goto L2f
            return r1
        L6d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.app_nav.hub.c.p.d(com.waze.app_nav.hub.c.p, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r7.collect(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.waze.app_nav.hub.c.b r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.app_nav.hub.c.m
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.app_nav.hub.c.m r0 = (com.waze.app_nav.hub.c.m) r0
            int r1 = r0.f15318d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15318d = r1
            goto L18
        L13:
            com.waze.app_nav.hub.c.m r0 = new com.waze.app_nav.hub.c.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f15316b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15318d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r8)
            goto L81
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            java.lang.Object r7 = r0.f15315a
            com.waze.app_nav.hub.c.b r7 = (com.waze.app_nav.hub.c.b) r7
            e.b.c.b(r8)
            goto L5c
        L3b:
            e.b.c.b(r8)
            kotlinx.coroutines.b.k r8 = r6.f15323a
            com.waze.app_nav.hub.c.n r2 = new com.waze.app_nav.hub.c.n
            r2.<init>(r4, r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r8 = kotlinx.coroutines.b.ai.Q(r8, r2)
            com.waze.app_nav.hub.c.o r2 = new com.waze.app_nav.hub.c.o
            r2.<init>(r6, r5)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f15315a = r7
            r0.f15318d = r5
            java.lang.Object r8 = r8.collect(r2, r0)
            if (r8 == r1) goto L84
        L5c:
            r7.c()
            kotlinx.coroutines.b.k r7 = r7.a()
            com.waze.app_nav.hub.c.n r8 = new com.waze.app_nav.hub.c.n
            r2 = 0
            r8.<init>(r4, r2)
            h.g.a.p r8 = (h.g.a.p) r8
            kotlinx.coroutines.b.k r7 = kotlinx.coroutines.b.ai.Q(r7, r8)
            com.waze.app_nav.hub.c.o r8 = new com.waze.app_nav.hub.c.o
            r8.<init>(r6, r2)
            kotlinx.coroutines.b.l r8 = (kotlinx.coroutines.b.l) r8
            r0.f15315a = r4
            r0.f15318d = r3
            java.lang.Object r6 = r7.collect(r8, r0)
            if (r6 != r1) goto L81
            goto L84
        L81:
            h.ab r6 = h.ab.f48028a
            return r6
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.app_nav.hub.c.p.f(com.waze.app_nav.hub.c.b, h.c.e):java.lang.Object");
    }

    @Override // com.waze.app_nav.hub.c.g
    public final void a(b bVar, f fVar) {
        k kVar;
        x.f(bVar, "presenter");
        x.f(fVar, "priority");
        synchronized (this) {
            kVar = new k(bVar, fVar, this.f15325c);
            this.f15326d.add(kVar);
            this.f15325c++;
        }
        com.waze.shared_infra.i.e eVar = this.f15324b;
        kVar.toString();
        eVar.a("added presenter: presenter=".concat(kVar.toString()));
        this.f15327e.c(Long.valueOf(kVar.a()));
    }

    @Override // com.waze.app_nav.hub.c.g
    public final boolean b(b bVar) {
        boolean z;
        x.f(bVar, "presenter");
        synchronized (this) {
            z = h.a.i.z(this.f15326d, new h(bVar, 0));
        }
        this.f15324b.a("removePresenter presenter=" + bVar + ", removed=" + z);
        return z;
    }
}
