package com.waze.copilot.data.b;

import h.g.b.x;
import kotlinx.coroutines.a.ag;
import kotlinx.coroutines.a.t;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class k {
    public /* synthetic */ k(byte[] bArr) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(com.waze.copilot.data.b.h r4, h.c.e r5) {
        /*
            boolean r0 = r5 instanceof com.waze.copilot.data.b.i
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.copilot.data.b.i r0 = (com.waze.copilot.data.b.i) r0
            int r1 = r0.f22995b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22995b = r1
            goto L18
        L13:
            com.waze.copilot.data.b.i r0 = new com.waze.copilot.data.b.i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f22994a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22995b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r5)
            h.m r5 = (h.m) r5
            java.lang.Object r4 = r5.b()
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r5)
            r0.f22995b = r3
            java.lang.String r5 = "EMPTY"
            java.lang.Object r4 = d(r4, r5, r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.b.k.c(com.waze.copilot.data.b.h, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(com.waze.copilot.data.b.h r4, java.lang.String r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.copilot.data.b.j
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.copilot.data.b.j r0 = (com.waze.copilot.data.b.j) r0
            int r1 = r0.f22997b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22997b = r1
            goto L18
        L13:
            com.waze.copilot.data.b.j r0 = new com.waze.copilot.data.b.j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22996a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22997b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r6)
            h.m r6 = (h.m) r6
            java.lang.Object r4 = r6.b()
            goto L41
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r6)
            r0.f22997b = r3
            r6 = 0
            java.lang.Object r4 = r4.a(r6, r6, r5, r0)
            if (r4 == r1) goto L7c
        L41:
            boolean r5 = h.m.e(r4)
            if (r5 == 0) goto L68
            r5 = r4
            com.waze.copilot.data.a.g r5 = (com.waze.copilot.data.a.g) r5
            h.m r5 = r5.c()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r5.b()
            boolean r6 = h.m.e(r5)
            if (r6 == 0) goto L5d
            com.waze.copilot.data.ag r5 = (com.waze.copilot.data.ag) r5
            return r5
        L5d:
            java.lang.Throwable r5 = h.m.c(r5)
            if (r5 == 0) goto L68
            java.lang.Object r4 = e.b.c.a(r5)
            return r4
        L68:
            java.lang.Throwable r4 = h.m.c(r4)
            if (r4 == 0) goto L73
            java.lang.Object r4 = e.b.c.a(r4)
            return r4
        L73:
            com.waze.copilot.data.a.k r4 = com.waze.copilot.data.a.k.f22929a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r4 = e.b.c.a(r4)
            return r4
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.b.k.d(com.waze.copilot.data.b.h, java.lang.String, h.c.e):java.lang.Object");
    }

    public static com.waze.crash.k f(com.waze.crash.c cVar, com.waze.shared_infra.i.b bVar, String str) {
        x.f(cVar, "crashManager");
        x.f(bVar, "exceptionReporter");
        x.f(str, "tag");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d(str);
        x.e(eVarD, "create(...)");
        return new com.waze.crash.k(str, eVarD, cVar, bVar);
    }

    public static boolean g(ag agVar, Object obj) {
        x.f(agVar, "<this>");
        Object objI = agVar.i(obj);
        Throwable thD = t.d(objI);
        if (thD != null) {
            com.waze.shared_infra.i.h.l("SendChannel", "exception while trying to send", thD);
        }
        return t.g(objI);
    }

    private k() {
        throw null;
    }
}
