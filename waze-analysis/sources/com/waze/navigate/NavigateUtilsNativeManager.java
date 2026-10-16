package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigateUtilsNativeManager extends da implements ef {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.navigate.ef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getNavigationRouteArea(boolean r5, h.c.e<? super com.waze.shared_infra.h.a> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.navigate.cz
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.navigate.cz r0 = (com.waze.navigate.cz) r0
            int r1 = r0.f31220c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31220c = r1
            goto L18
        L13:
            com.waze.navigate.cz r0 = new com.waze.navigate.cz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f31218a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f31220c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.navigate.da r4 = (com.waze.navigate.da) r4
            r0.f31220c = r3
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.f.u r2 = new com.waze.car_lib.f.u
            r3 = 15
            r2.<init>(r6, r3)
            r4.getRouteArea(r5, r2)
            java.lang.Object r6 = r6.c(r0)
            if (r6 == r1) goto L6e
        L4a:
            com.waze.jni.protos.Position$IntArea r6 = (com.waze.jni.protos.Position.IntArea) r6
            if (r6 == 0) goto L69
            java.lang.String r4 = "<this>"
            h.g.b.x.f(r6, r4)
            com.waze.shared_infra.h.a r4 = new com.waze.shared_infra.h.a
            int r5 = r6.getNorth()
            int r0 = r6.getSouth()
            int r1 = r6.getEast()
            int r6 = r6.getWest()
            r4.<init>(r5, r0, r1, r6)
            return r4
        L69:
            com.waze.shared_infra.h.a r4 = com.waze.shared_infra.h.a.e()
            return r4
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.NavigateUtilsNativeManager.getNavigationRouteArea(boolean, h.c.e):java.lang.Object");
    }

    public final native byte[] getRouteAreaNTV(boolean z);
}
