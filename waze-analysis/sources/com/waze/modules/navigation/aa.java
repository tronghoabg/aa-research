package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final aa f30271a = new aa();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.kd r11, com.waze.jni.protos.navigate.DriveTo.DangerZoneType r12, boolean r13, com.waze.shared_infra.h.c r14, com.waze.bf r15, com.waze.navigate.ar r16, h.c.e r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.waze.modules.navigation.y
            if (r1 == 0) goto L15
            r1 = r0
            com.waze.modules.navigation.y r1 = (com.waze.modules.navigation.y) r1
            int r2 = r1.f30508c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f30508c = r2
            goto L1a
        L15:
            com.waze.modules.navigation.y r1 = new com.waze.modules.navigation.y
            r1.<init>(r10, r0)
        L1a:
            java.lang.Object r10 = r1.f30506a
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r1.f30508c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L29
            goto L6d
        L29:
            r0 = move-exception
            r10 = r0
            goto L71
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            e.b.c.b(r10)
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.bo.j()
            com.waze.navigate.ar r10 = com.waze.navigate.ar.f31000a
            com.waze.modules.navigation.w r10 = com.waze.modules.navigation.w.f30499a
            int r10 = r16.ordinal()
            if (r10 == 0) goto L50
            if (r10 != r3) goto L4a
            com.waze.jni.protos.navigate.DriveTo$DangerZoneStatType r10 = com.waze.jni.protos.navigate.DriveTo.DangerZoneStatType.FAVORITE_IN_DANGER_ZONE
            goto L52
        L4a:
            h.i r10 = new h.i
            r10.<init>()
            throw r10
        L50:
            com.waze.jni.protos.navigate.DriveTo$DangerZoneStatType r10 = com.waze.jni.protos.navigate.DriveTo.DangerZoneStatType.NAVIGATE_TO_DANGEROUS_AREA_POPUP_CLICKED
        L52:
            r7 = r10
            com.waze.jp r10 = new com.waze.jp
            com.waze.z.a.c.j r4 = new com.waze.z.a.c.j
            r9 = 5
            r6 = r14
            r5 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            r10.<init>(r12, r13, r4)
            com.waze.ka r10 = (com.waze.ka) r10
            r11.e(r10)
            r1.f30508c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r8.c(r1)     // Catch: java.lang.Throwable -> L29
            if (r10 == r0) goto L70
        L6d:
            com.waze.modules.navigation.w r10 = (com.waze.modules.navigation.w) r10     // Catch: java.lang.Throwable -> L29
            goto L75
        L70:
            return r0
        L71:
            java.lang.Object r10 = e.b.c.a(r10)
        L75:
            boolean r11 = r10 instanceof h.l
            if (r3 != r11) goto L7a
            r10 = 0
        L7a:
            com.waze.modules.navigation.w r11 = com.waze.modules.navigation.w.f30499a
            if (r10 != r11) goto L7f
            goto L80
        L7f:
            r3 = 0
        L80:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.aa.a(com.waze.kd, com.waze.jni.protos.navigate.DriveTo$DangerZoneType, boolean, com.waze.shared_infra.h.c, com.waze.bf, com.waze.navigate.ar, h.c.e):java.lang.Object");
    }
}
