package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f21700a;

    s(u uVar) {
        this.f21700a = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:18:0x007a). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.b.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.waze.reports_v2.c.bf r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.car_lib.r.r
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.car_lib.r.r r0 = (com.waze.car_lib.r.r) r0
            int r1 = r0.f21698f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21698f = r1
            goto L18
        L13:
            com.waze.car_lib.r.r r0 = new com.waze.car_lib.r.r
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f21696d
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21698f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f21695c
            com.waze.car_lib.r.u r7 = r0.f21699g
            r2 = r7
            com.waze.car_lib.r.u r2 = (com.waze.car_lib.r.u) r2
            java.lang.Object r2 = r0.f21694b
            kotlinx.coroutines.b.bn r2 = (kotlinx.coroutines.b.bn) r2
            java.lang.Object r4 = r0.f21693a
            com.waze.reports_v2.c.bf r4 = (com.waze.reports_v2.c.bf) r4
            e.b.c.b(r8)
            goto L7a
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            e.b.c.b(r8)
            com.waze.car_lib.r.u r6 = r6.f21700a
            com.waze.shared_infra.i.e r8 = com.waze.car_lib.r.u.b(r6)
            java.util.Objects.toString(r7)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r4 = "ConversationalReportingControllerState recieved "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            kotlinx.coroutines.b.bn r8 = com.waze.car_lib.r.u.h(r6)
            r2 = r8
        L5e:
            java.lang.Object r8 = r2.d()
            r4 = r8
            com.waze.alerters.a.k r4 = (com.waze.alerters.a.k) r4
            r0.f21693a = r7
            r0.f21694b = r2
            r0.f21699g = r6
            r0.f21695c = r8
            r0.f21698f = r3
            java.lang.Object r4 = com.waze.car_lib.r.u.f(r6, r7, r0)
            if (r4 == r1) goto L88
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r4
            r4 = r5
        L7a:
            com.waze.alerters.a.k r8 = (com.waze.alerters.a.k) r8
            boolean r6 = r2.f(r6, r8)
            if (r6 != 0) goto L85
            r6 = r7
            r7 = r4
            goto L5e
        L85:
            h.ab r6 = h.ab.f48028a
            return r6
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.s.emit(com.waze.reports_v2.c.bf, h.c.e):java.lang.Object");
    }
}
