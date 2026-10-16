package com.waze.bp;

import com.waze.sharedui.f.k;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.c.b.b f17213a;

    /* renamed from: b, reason: collision with root package name */
    private final k f17214b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17215c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f17216d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f17217e;

    public i(com.waze.c.b.b bVar, k kVar, com.waze.shared_infra.i.e eVar) {
        x.f(bVar, "routeAlternativesRepository");
        x.f(kVar, "networkGateway");
        x.f(eVar, "logger");
        this.f17213a = bVar;
        this.f17214b = kVar;
        this.f17215c = eVar;
        bn bnVarB = ck.b(com.waze.c.b.i.f18249a);
        this.f17216d = bnVarB;
        this.f17217e = ai.U(bnVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.bp.i r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.bp.f
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.bp.f r0 = (com.waze.bp.f) r0
            int r1 = r0.f17207d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17207d = r1
            goto L18
        L13:
            com.waze.bp.f r0 = new com.waze.bp.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f17205b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f17207d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f17204a
            kotlinx.coroutines.b.bn r7 = (kotlinx.coroutines.b.bn) r7
            e.b.c.b(r8)
            goto L67
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            e.b.c.b(r8)
            kotlinx.coroutines.b.bn r8 = r7.f17216d
            java.lang.Object r2 = r8.d()
            boolean r4 = r2 instanceof com.waze.c.b.h
            r5 = 0
            if (r4 == 0) goto L44
            com.waze.c.b.h r2 = (com.waze.c.b.h) r2
            goto L45
        L44:
            r2 = r5
        L45:
            if (r2 == 0) goto L4b
            com.waze.modules.navigation.ak r5 = r2.b()
        L4b:
            com.waze.c.b.i r2 = com.waze.c.b.i.f18249a
            r8.e(r2)
            com.waze.c.b.b r7 = r7.f17213a
            com.waze.bp.g r2 = new com.waze.bp.g
            r2.<init>(r5)
            com.waze.c.d.az r2 = (com.waze.c.d.az) r2
            r0.f17204a = r8
            r0.f17207d = r3
            r3 = 0
            java.lang.Object r7 = r7.a(r2, r3, r0)
            if (r7 == r1) goto L6d
            r6 = r8
            r8 = r7
            r7 = r6
        L67:
            r7.e(r8)
            h.ab r7 = h.ab.f48028a
            return r7
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bp.i.b(com.waze.bp.i, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object d(com.waze.bp.i r4, int r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.bp.h
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.bp.h r0 = (com.waze.bp.h) r0
            int r1 = r0.f17211c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17211c = r1
            goto L18
        L13:
            com.waze.bp.h r0 = new com.waze.bp.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17209a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f17211c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.bp.i r4 = r0.f17212d
            r5 = r4
            com.waze.bp.i r5 = (com.waze.bp.i) r5
            e.b.c.b(r6)
            goto L68
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            i.b.l.cc r6 = i.b.l.cd.newBuilder()
            i.b.s.a r2 = i.b.s.b.newBuilder()
            r2.a(r5)
            com.google.v.du r5 = r2.build()
            i.b.s.b r5 = (i.b.s.b) r5
            r6.k(r5)
            com.google.v.du r5 = r6.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r5, r6)
            i.b.l.cd r5 = (i.b.l.cd) r5
            com.waze.sharedui.f.k r6 = r4.f17214b
            int r2 = com.waze.sharedui.api.a.f38785a
            com.waze.sharedui.f.d r2 = com.waze.sharedui.api.a.g()
            r0.f17212d = r4
            r0.f17211c = r3
            java.lang.Object r6 = com.waze.sharedui.f.n.b(r6, r2, r5, r0)
            if (r6 == r1) goto La0
        L68:
            com.waze.sharedui.f.n r6 = (com.waze.sharedui.f.n) r6
            boolean r5 = r6 instanceof com.waze.sharedui.f.i
            if (r5 == 0) goto L78
            com.waze.shared_infra.i.e r4 = r4.f17215c
            java.lang.String r5 = "Reported End of Trip Overview to BE successfully"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.a(r5)
            goto L97
        L78:
            boolean r5 = r6 instanceof com.waze.sharedui.f.j
            if (r5 == 0) goto L9a
            com.waze.shared_infra.i.e r4 = r4.f17215c
            com.waze.sharedui.f.j r6 = (com.waze.sharedui.f.j) r6
            com.waze.sharedui.b r5 = r6.a()
            java.lang.String r5 = r5.getErrorMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Failed to report End of Trip Overview to BE "
            java.lang.String r5 = r6.concat(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.b(r5)
        L97:
            h.ab r4 = h.ab.f48028a
            return r4
        L9a:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bp.i.d(com.waze.bp.i, int, h.c.e):java.lang.Object");
    }

    public final Object a(h.c.e eVar) {
        return b(this, eVar);
    }

    public final Object c(int i2, h.c.e eVar) {
        return d(this, i2, eVar);
    }

    public final ch e() {
        return this.f17217e;
    }

    public final void f(com.waze.c.b.j jVar) {
        x.f(jVar, "initialState");
        this.f17216d.e(jVar);
    }
}
