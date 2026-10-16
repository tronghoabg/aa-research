package com.waze.modules.c;

import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class an implements al {

    /* renamed from: a, reason: collision with root package name */
    private final DriveToNativeManager f29855a;

    public an(DriveToNativeManager driveToNativeManager) {
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        this.f29855a = driveToNativeManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.modules.c.al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.modules.c.aj r13, h.c.e r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.waze.modules.c.am
            if (r0 == 0) goto L13
            r0 = r14
            com.waze.modules.c.am r0 = (com.waze.modules.c.am) r0
            int r1 = r0.f29854c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29854c = r1
            goto L18
        L13:
            com.waze.modules.c.am r0 = new com.waze.modules.c.am
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f29852a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29854c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r14)
            goto L68
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            e.b.c.b(r14)
            r0.f29854c = r3
            com.waze.navigate.DriveToNativeManager r12 = r12.f29855a
            kotlinx.coroutines.CompletableDeferred r14 = kotlinx.coroutines.bo.j()
            com.waze.jni.protos.navigate.RoutingRequestParams$Builder r2 = com.waze.jni.protos.navigate.RoutingRequestParams.newBuilder()
            com.waze.shared_infra.h.c r4 = r13.b()
            com.waze.jni.protos.Position$IntPosition r4 = com.waze.jni.protos.ConversionExtensionsKt.toIntPosition(r4)
            r2.setOrigin(r4)
            com.waze.shared_infra.h.c r13 = r13.a()
            com.waze.jni.protos.Position$IntPosition r13 = com.waze.jni.protos.ConversionExtensionsKt.toIntPosition(r13)
            r2.setDestination(r13)
            com.google.v.du r13 = r2.build()
            com.waze.jni.protos.navigate.RoutingRequestParams r13 = (com.waze.jni.protos.navigate.RoutingRequestParams) r13
            com.waze.car_lib.f.u r2 = new com.waze.car_lib.f.u
            r2.<init>(r14, r3)
            r12.getRoutingRequestParams(r13, r2)
            java.lang.Object r14 = r14.c(r0)
            if (r14 == r1) goto Le4
        L68:
            com.waze.jni.protos.navigate.RoutingRequestParamsResult r14 = (com.waze.jni.protos.navigate.RoutingRequestParamsResult) r14
            r12 = 0
            if (r14 == 0) goto L79
            boolean r13 = r14.hasTempVehicleType()
            if (r13 != r3) goto L79
            java.lang.String r13 = r14.getTempVehicleType()
            r11 = r13
            goto L7a
        L79:
            r11 = r12
        L7a:
            if (r14 == 0) goto L8c
            boolean r13 = r14.hasTempAvoidPrimaries()
            if (r13 != r3) goto L8c
            boolean r13 = r14.getTempAvoidPrimaries()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r5 = r13
            goto L8d
        L8c:
            r5 = r12
        L8d:
            if (r14 == 0) goto L9b
            boolean r13 = r14.hasTempAvoidTrails()
            if (r13 != r3) goto L9b
            java.lang.String r13 = r14.getTempAvoidTrails()
            r6 = r13
            goto L9c
        L9b:
            r6 = r12
        L9c:
            if (r14 == 0) goto Lae
            boolean r13 = r14.hasTempAvoidFerries()
            if (r13 != r3) goto Lae
            boolean r13 = r14.getTempAvoidFerries()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r7 = r13
            goto Laf
        Lae:
            r7 = r12
        Laf:
            if (r14 == 0) goto Lc1
            boolean r13 = r14.hasTempAvoidTollRoads()
            if (r13 != r3) goto Lc1
            boolean r13 = r14.getTempAvoidTollRoads()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r8 = r13
            goto Lc2
        Lc1:
            r8 = r12
        Lc2:
            if (r14 == 0) goto Ld0
            boolean r13 = r14.hasOriginDangerZoneType()
            if (r13 != r3) goto Ld0
            com.waze.jni.protos.navigate.DriveTo$DangerZoneType r13 = r14.getOriginDangerZoneType()
            r9 = r13
            goto Ld1
        Ld0:
            r9 = r12
        Ld1:
            if (r14 == 0) goto Ldd
            boolean r13 = r14.hasDestinationDangerZoneType()
            if (r13 != r3) goto Ldd
            com.waze.jni.protos.navigate.DriveTo$DangerZoneType r12 = r14.getDestinationDangerZoneType()
        Ldd:
            r10 = r12
            com.waze.modules.c.ak r4 = new com.waze.modules.c.ak
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.an.a(com.waze.modules.c.aj, h.c.e):java.lang.Object");
    }
}
