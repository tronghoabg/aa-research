package com.waze.c.d;

import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bb implements az {

    /* renamed from: a, reason: collision with root package name */
    private final DriveToNativeManager f18341a;

    public bb(DriveToNativeManager driveToNativeManager) {
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        this.f18341a = driveToNativeManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.waze.c.d.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof com.waze.c.d.ba
            if (r2 == 0) goto L17
            r2 = r1
            com.waze.c.d.ba r2 = (com.waze.c.d.ba) r2
            int r3 = r2.f18340c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f18340c = r3
            goto L1c
        L17:
            com.waze.c.d.ba r2 = new com.waze.c.d.ba
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f18338a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r2.f18340c
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            e.b.c.b(r1)
            goto L55
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            e.b.c.b(r1)
            com.waze.navigate.DriveToNativeManager r0 = r0.f18341a
            r6 = r0
            com.waze.navigate.bt r6 = (com.waze.navigate.bt) r6
            r2.f18340c = r5
            kotlinx.coroutines.CompletableDeferred r0 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.f.u r11 = new com.waze.car_lib.f.u
            r1 = 12
            r11.<init>(r0, r1)
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r6.getLocationData(r7, r8, r9, r10, r11)
            java.lang.Object r1 = r0.c(r2)
            if (r1 == r3) goto Lb8
        L55:
            com.waze.main.navigate.LocationData r1 = (com.waze.main.navigate.LocationData) r1
            if (r1 == 0) goto Lb6
            com.waze.modules.navigation.ai r0 = new com.waze.modules.navigation.ai
            com.waze.av.b.m r2 = new com.waze.av.b.m
            java.lang.String r3 = "<this>"
            h.g.b.x.f(r1, r3)
            com.waze.av.a.p r3 = new com.waze.av.a.p
            com.waze.av.a.a r4 = new com.waze.av.a.a
            java.lang.String r5 = r1.mCity
            java.lang.String r13 = ""
            if (r5 != 0) goto L6e
            r6 = r13
            goto L6f
        L6e:
            r6 = r5
        L6f:
            java.lang.String r5 = r1.mStreet
            if (r5 != 0) goto L75
            r7 = r13
            goto L76
        L75:
            r7 = r5
        L76:
            r11 = 0
            r12 = 112(0x70, float:1.57E-43)
            java.lang.String r5 = ""
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            com.waze.shared_infra.h.c r5 = new com.waze.shared_infra.h.c
            int r6 = r1.locationY
            int r7 = r1.locationX
            r5.<init>(r6, r7)
            com.waze.av.a.o r14 = new com.waze.av.a.o
            java.lang.String r6 = r1.mVenueId
            if (r6 != 0) goto L93
            r15 = r13
            goto L94
        L93:
            r15 = r6
        L94:
            java.lang.String r1 = r1.locationName
            if (r1 != 0) goto L9b
            r16 = r13
            goto L9d
        L9b:
            r16 = r1
        L9d:
            r20 = 0
            r21 = 60
            r17 = 0
            r18 = 0
            r19 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r3.<init>(r4, r5, r14)
            r2.<init>(r3)
            com.waze.av.b.n r2 = (com.waze.av.b.n) r2
            r0.<init>(r2)
            return r0
        Lb6:
            r0 = 0
            return r0
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.d.bb.a(h.c.e):java.lang.Object");
    }
}
