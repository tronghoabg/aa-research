package com.waze.modules.c;

import com.waze.navigate.DriveToNativeManager;
import i.b.l.oq;
import i.b.l.or;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private final DriveToNativeManager f29999a;

    /* renamed from: b, reason: collision with root package name */
    private final df f30000b;

    public cr(DriveToNativeManager driveToNativeManager, df dfVar) {
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(dfVar, "routingParamsAndOptionsRepository");
        this.f29999a = driveToNativeManager;
        this.f30000b = dfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(i.b.l.pn r5, com.waze.modules.c.ce r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.modules.c.cm
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.modules.c.cm r0 = (com.waze.modules.c.cm) r0
            int r1 = r0.f29977c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29977c = r1
            goto L18
        L13:
            com.waze.modules.c.cm r0 = new com.waze.modules.c.cm
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f29975a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29977c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.waze.modules.c.ce r6 = r0.f29979e
            r4 = r6
            com.waze.modules.c.ce r4 = (com.waze.modules.c.ce) r4
            i.b.l.pn r5 = r0.f29978d
            r4 = r5
            i.b.l.pn r4 = (i.b.l.pn) r4
            e.b.c.b(r7)
            goto L53
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            e.b.c.b(r7)
            r7 = r6
            com.waze.modules.c.cf r7 = (com.waze.modules.c.cf) r7
            com.waze.modules.c.cg r2 = r6.a()
            boolean r2 = r2.b()
            r0.f29978d = r5
            r0.f29979e = r6
            r0.f29977c = r3
            java.lang.Object r7 = r4.g(r5, r7, r2, r0)
            if (r7 == r1) goto L6e
        L53:
            i.b.l.pn r7 = (i.b.l.pn) r7
            if (r7 == 0) goto L6d
            com.waze.modules.c.cg r4 = r6.a()
            java.lang.String r4 = r4.a()
            r7.u(r4)
            com.waze.modules.c.cg r4 = r6.a()
            java.lang.String r4 = com.waze.gas.a.c(r4)
            r7.v(r4)
        L6d:
            return r5
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.cr.f(i.b.l.pn, com.waze.modules.c.ce, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01db A[LOOP:0: B:68:0x01d5->B:70:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(i.b.l.pn r15, com.waze.modules.c.cf r16, boolean r17, h.c.e r18) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.cr.g(i.b.l.pn, com.waze.modules.c.cf, boolean, h.c.e):java.lang.Object");
    }

    private static final oq h(com.waze.shared_infra.h.c cVar, Long l2, Long l3, boolean z) {
        oq oqVarNewBuilder = or.newBuilder();
        h.g.b.x.e(oqVarNewBuilder, "newBuilder(...)");
        if (z) {
            oqVarNewBuilder.a();
        }
        oqVarNewBuilder.d(com.waze.sharedui.e.e.e(cVar));
        if (l2 != null && l3 != null) {
            oqVarNewBuilder.c(l2.longValue());
            oqVarNewBuilder.g(l3.longValue());
        }
        return oqVarNewBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(i.b.l.pn r5, com.waze.modules.c.cf r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.modules.c.cn
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.modules.c.cn r0 = (com.waze.modules.c.cn) r0
            int r1 = r0.f29982c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29982c = r1
            goto L18
        L13:
            com.waze.modules.c.cn r0 = new com.waze.modules.c.cn
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f29980a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29982c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            i.b.l.pn r4 = r0.f29983d
            r5 = r4
            i.b.l.pn r5 = (i.b.l.pn) r5
            e.b.c.b(r7)
            return r4
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r7)
            r7 = r6
            com.waze.modules.c.cf r7 = (com.waze.modules.c.cf) r7
            r0.f29983d = r5
            r0.f29982c = r3
            r7 = 0
            java.lang.Object r4 = r4.g(r5, r6, r7, r0)
            if (r4 != r1) goto L46
            return r1
        L46:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.cr.i(i.b.l.pn, com.waze.modules.c.cf, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.modules.c.ce r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.modules.c.cq
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.modules.c.cq r0 = (com.waze.modules.c.cq) r0
            int r1 = r0.f29997c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29997c = r1
            goto L18
        L13:
            com.waze.modules.c.cq r0 = new com.waze.modules.c.cq
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f29995a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29997c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            i.b.l.pn r5 = r0.f29998d
            r6 = r5
            i.b.l.pn r6 = (i.b.l.pn) r6
            e.b.c.b(r7)
            goto L61
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            e.b.c.b(r7)
            goto L4f
        L3b:
            e.b.c.b(r7)
            i.b.l.pn r7 = i.b.l.pq.newBuilder()
            java.lang.String r2 = "newBuilder(...)"
            h.g.b.x.e(r7, r2)
            r0.f29997c = r4
            java.lang.Object r7 = r5.f(r7, r6, r0)
            if (r7 == r1) goto L7a
        L4f:
            r6 = r7
            i.b.l.pn r6 = (i.b.l.pn) r6
            r0.f29998d = r6
            r0.f29997c = r3
            com.waze.navigate.DriveToNativeManager r5 = r5.f29999a
            com.waze.navigate.bt r5 = (com.waze.navigate.bt) r5
            java.lang.Object r7 = com.waze.navigate.et.w(r5, r0)
            if (r7 == r1) goto L7a
            r5 = r6
        L61:
            i.c.a.a.l r7 = (i.c.a.a.l) r7
            if (r7 == 0) goto L68
            r5.s(r7)
        L68:
            i.b.l.cc r6 = i.b.l.cd.newBuilder()
            com.google.v.du r5 = r5.build()
            i.b.l.pq r5 = (i.b.l.pq) r5
            r6.P(r5)
            com.google.v.du r5 = r6.build()
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.cr.a(com.waze.modules.c.ce, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.waze.modules.c.cf r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.modules.c.cp
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.modules.c.cp r0 = (com.waze.modules.c.cp) r0
            int r1 = r0.f29993c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29993c = r1
            goto L18
        L13:
            com.waze.modules.c.cp r0 = new com.waze.modules.c.cp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f29991a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29993c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.modules.c.cf r5 = r0.f29994d
            r4 = r5
            com.waze.modules.c.cf r4 = (com.waze.modules.c.cf) r4
            e.b.c.b(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            i.b.l.pn r6 = i.b.l.pq.newBuilder()
            java.lang.String r2 = "newBuilder(...)"
            h.g.b.x.e(r6, r2)
            r0.f29994d = r5
            r0.f29993c = r3
            java.lang.Object r6 = r4.i(r6, r5, r0)
            if (r6 == r1) goto L7e
        L4a:
            i.b.l.pn r6 = (i.b.l.pn) r6
            com.google.v.du r4 = r6.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r4, r6)
            i.b.l.pq r4 = (i.b.l.pq) r4
            i.b.l.ab r6 = i.b.l.ac.newBuilder()
            r6.b(r4)
            java.lang.String r4 = "setRoutingRequest(...)"
            h.g.b.x.e(r6, r4)
            boolean r4 = r5.h()
            if (r4 == 0) goto L6c
            r6.a()
        L6c:
            i.b.l.cc r4 = i.b.l.cd.newBuilder()
            com.google.v.du r5 = r6.build()
            i.b.l.ac r5 = (i.b.l.ac) r5
            r4.c(r5)
            com.google.v.du r4 = r4.build()
            return r4
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.cr.e(com.waze.modules.c.cf, h.c.e):java.lang.Object");
    }
}
