package com.waze.o.b.b;

import com.waze.reports_v2.c.ds;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    private final ds f32765a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.o.c.c.b f32766b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32767c;

    public o(ds dsVar, com.waze.o.c.c.b bVar, com.waze.shared_infra.i.e eVar) {
        x.f(dsVar, "reportPositionSaver");
        x.f(bVar, "config");
        x.f(eVar, "logger");
        this.f32765a = dsVar;
        this.f32766b = bVar;
        this.f32767c = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r8.b(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (kotlinx.coroutines.aj.r(r5, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:14:0x002e). Please report as a decompilation issue!!! */
    @Override // com.waze.o.b.b.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.waze.o.b.b.n
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.o.b.b.n r0 = (com.waze.o.b.b.n) r0
            int r1 = r0.f32764d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32764d = r1
            goto L18
        L13:
            com.waze.o.b.b.n r0 = new com.waze.o.b.b.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f32762b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32764d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            long r5 = r0.f32761a
            e.b.c.b(r9)
        L2e:
            r6 = r5
            goto L77
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            long r5 = r0.f32761a
            e.b.c.b(r9)
            goto L84
        L3e:
            e.b.c.b(r9)
            goto L74
        L42:
            e.b.c.b(r9)
            com.waze.shared_infra.i.e r9 = r8.f32767c
            java.lang.String r2 = "snapPeriodically started"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r9.a(r2)
            com.waze.o.c.c.b r2 = r8.f32766b
            long r6 = r2.a()
            h.o.d r2 = h.o.d.f48272c
            long r6 = h.o.c.j(r6, r2)
            boolean r2 = h.o.a.E(r6)
            if (r2 != 0) goto L77
            java.lang.String r2 = "snapPeriodically: expirationDuration <= 0, saving position once."
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r9.g(r2)
            com.waze.reports_v2.c.ds r8 = r8.f32765a
            r0.f32764d = r5
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L74
            goto L8f
        L74:
            h.ab r8 = h.ab.f48028a
            return r8
        L77:
            r0.f32761a = r6
            r0.f32764d = r4
            com.waze.reports_v2.c.ds r9 = r8.f32765a
            java.lang.Object r9 = r9.b(r0)
            if (r9 == r1) goto L8f
            r5 = r6
        L84:
            r0.f32761a = r5
            r0.f32764d = r3
            java.lang.Object r9 = kotlinx.coroutines.aj.r(r5, r0)
            if (r9 == r1) goto L8f
            goto L2e
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.o.b.b.o.a(h.c.e):java.lang.Object");
    }
}
