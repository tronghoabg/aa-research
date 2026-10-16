package com.waze.navigate;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ax {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31023a = 0;

    static {
        h.g.a(new com.waze.main_screen.ac.k(18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.waze.bf r9, boolean r10, com.waze.shared_infra.h.c r11, com.waze.kd r12, com.waze.navigate.ar r13, h.c.e r14) {
        /*
            boolean r0 = r14 instanceof com.waze.navigate.at
            if (r0 == 0) goto L13
            r0 = r14
            com.waze.navigate.at r0 = (com.waze.navigate.at) r0
            int r1 = r0.f31009e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31009e = r1
            goto L18
        L13:
            com.waze.navigate.at r0 = new com.waze.navigate.at
            r0.<init>(r14)
        L18:
            r8 = r0
            java.lang.Object r14 = r8.f31008d
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f31009e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            e.b.c.b(r14)
            return r14
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            boolean r10 = r8.f31007c
            com.waze.navigate.ar r13 = r8.f31011g
            r9 = r13
            com.waze.navigate.ar r9 = (com.waze.navigate.ar) r9
            java.lang.Object r9 = r8.f31006b
            r12 = r9
            com.waze.kd r12 = (com.waze.kd) r12
            com.waze.shared_infra.h.c r11 = r8.f31010f
            r9 = r11
            com.waze.shared_infra.h.c r9 = (com.waze.shared_infra.h.c) r9
            java.lang.Object r9 = r8.f31005a
            com.waze.bf r9 = (com.waze.bf) r9
            e.b.c.b(r14)
            goto L61
        L4c:
            e.b.c.b(r14)
            r8.f31005a = r9
            r8.f31010f = r11
            r8.f31006b = r12
            r8.f31011g = r13
            r8.f31007c = r10
            r8.f31009e = r3
            java.lang.Object r14 = c(r11, r9, r8)
            if (r14 == r0) goto L87
        L61:
            r6 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            com.waze.jni.protos.navigate.DriveTo$DangerZoneType r14 = (com.waze.jni.protos.navigate.DriveTo.DangerZoneType) r14
            com.waze.jni.protos.navigate.DriveTo$DangerZoneType r9 = com.waze.jni.protos.navigate.DriveTo.DangerZoneType.NOT_DANGER_ZONE
            if (r14 != r9) goto L70
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L70:
            com.waze.modules.navigation.aa r1 = com.waze.modules.navigation.aa.f30271a
            r9 = 0
            r8.f31005a = r9
            r8.f31010f = r9
            r8.f31006b = r9
            r8.f31011g = r9
            r8.f31009e = r2
            r2 = r12
            r3 = r14
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            if (r9 != r0) goto L86
            goto L87
        L86:
            return r9
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.ax.a(com.waze.bf, boolean, com.waze.shared_infra.h.c, com.waze.kd, com.waze.navigate.ar, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
    
        if (r15 != r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.waze.bg] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.waze.bg] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.waze.bg] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.waze.bg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.waze.shared_infra.h.c r11, com.waze.bf r12, long r13, h.c.e r15) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.ax.b(com.waze.shared_infra.h.c, com.waze.bf, long, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object c(com.waze.shared_infra.h.c cVar, com.waze.bf bfVar, h.c.e eVar) {
        Long lB = ConfigValues.CONFIG_VALUE_DANGER_ZONE_TILE_DOWNLOAD_TIMEOUT_MS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return b(cVar, bfVar, lB.longValue(), eVar);
    }
}
