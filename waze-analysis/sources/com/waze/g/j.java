package com.waze.g;

import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final l f24005a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24006b;

    public j(l lVar) {
        x.f(lVar, "callback");
        this.f24005a = lVar;
        this.f24006b = "UptimeReporter";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.shared_infra.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.waze.g.i
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.g.i r0 = (com.waze.g.i) r0
            int r1 = r0.f24004c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24004c = r1
            goto L18
        L13:
            com.waze.g.i r0 = new com.waze.g.i
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f24002a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f24004c
            r3 = 60000(0xea60, double:2.9644E-319)
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L36
            if (r2 == r6) goto L32
            if (r2 != r5) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            e.b.c.b(r9)
            goto L41
        L36:
            e.b.c.b(r9)
            r0.f24004c = r6
            java.lang.Object r9 = kotlinx.coroutines.aj.q(r3, r0)
            if (r9 == r1) goto L57
        L41:
            long r6 = com.waze.t.a()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            h.g.a.l r2 = r8.f24005a
            r2.invoke(r9)
            r0.f24004c = r5
            java.lang.Object r9 = kotlinx.coroutines.aj.q(r3, r0)
            if (r9 != r1) goto L41
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.g.j.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f24006b;
    }
}
