package com.waze.reports_v2.c;

import com.waze.reports.WazeReportNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class de implements dc {

    /* renamed from: a, reason: collision with root package name */
    private final WazeReportNativeManager f34404a;

    public de(WazeReportNativeManager wazeReportNativeManager) {
        h.g.b.x.f(wazeReportNativeManager, "reportNativeManager");
        this.f34404a = wazeReportNativeManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // com.waze.reports_v2.c.dc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.shared_infra.h.c r21, h.c.e r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            java.lang.String r2 = "azimuth="
            boolean r3 = r1 instanceof com.waze.reports_v2.c.dd
            if (r3 == 0) goto L19
            r3 = r1
            com.waze.reports_v2.c.dd r3 = (com.waze.reports_v2.c.dd) r3
            int r4 = r3.f34402d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f34402d = r4
            goto L1e
        L19:
            com.waze.reports_v2.c.dd r3 = new com.waze.reports_v2.c.dd
            r3.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r3.f34400b
            h.c.a.a r4 = h.c.a.a.f48038a
            int r5 = r3.f34402d
            java.lang.String r6 = ")"
            java.lang.String r7 = ", "
            r8 = 1
            if (r5 == 0) goto L41
            if (r5 != r8) goto L39
            long r4 = r3.f34399a
            com.waze.shared_infra.h.c r0 = r3.f34403e
            r3 = r0
            com.waze.shared_infra.h.c r3 = (com.waze.shared_infra.h.c) r3
            e.b.c.b(r1)     // Catch: java.lang.Exception -> Lc3
        L37:
            r12 = r0
            goto L78
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            e.b.c.b(r1)
            h.o.c r1 = h.o.a.f48264a
            long r9 = java.lang.System.currentTimeMillis()
            h.o.d r1 = h.o.d.f48272c
            long r9 = h.o.c.j(r9, r1)
            com.waze.reports.WazeReportNativeManager r0 = r0.f34404a
            kotlinx.coroutines.CompletableDeferred r1 = kotlinx.coroutines.bo.j()
            int r5 = r21.c()
            int r11 = r21.d()
            com.waze.car_lib.screens.am r12 = new com.waze.car_lib.screens.am
            r13 = 20
            r12.<init>(r1, r13)
            r0.calcAzimuth(r5, r11, r12)
            r0 = r21
            r3.f34403e = r0     // Catch: java.lang.Exception -> Lc3
            r3.f34399a = r9     // Catch: java.lang.Exception -> Lc3
            r3.f34402d = r8     // Catch: java.lang.Exception -> Lc3
            java.lang.Object r1 = r1.c(r3)     // Catch: java.lang.Exception -> Lc3
            if (r1 == r4) goto Lc2
            r4 = r9
            goto L37
        L78:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Exception -> Lc0
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> Lc0
            int r1 = r12.c()     // Catch: java.lang.Exception -> Lc0
            int r3 = r12.d()     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r8.<init>(r2)     // Catch: java.lang.Exception -> Lc0
            r8.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r2 = " at pos=("
            r8.append(r2)     // Catch: java.lang.Exception -> Lc0
            r8.append(r1)     // Catch: java.lang.Exception -> Lc0
            r8.append(r7)     // Catch: java.lang.Exception -> Lc0
            r8.append(r3)     // Catch: java.lang.Exception -> Lc0
            r8.append(r6)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Exception -> Lc0
            com.waze.shared_infra.i.h.j(r1)     // Catch: java.lang.Exception -> Lc0
            float r15 = (float) r0     // Catch: java.lang.Exception -> Lc0
            long r0 = h.o.a.p(r4)     // Catch: java.lang.Exception -> Lc0
            com.waze.sharedui.e.c r11 = new com.waze.sharedui.e.c     // Catch: java.lang.Exception -> Lc0
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Exception -> Lc0
            r2.<init>(r0)     // Catch: java.lang.Exception -> Lc0
            r18 = 0
            r19 = 192(0xc0, float:2.69E-43)
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> Lc0
            return r11
        Lc0:
            r0 = r12
            goto Lc3
        Lc2:
            return r4
        Lc3:
            int r1 = r0.c()
            int r0 = r0.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "failed to get azimuth at pos=("
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r7)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            com.waze.shared_infra.i.h.j(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.de.a(com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }
}
