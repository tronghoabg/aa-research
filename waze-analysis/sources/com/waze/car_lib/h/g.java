package com.waze.car_lib.h;

import androidx.car.app.CarContext;
import com.waze.location.q;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends q {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.car_lib.h.g r4, androidx.car.app.CarContext r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.car_lib.h.f
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.car_lib.h.f r0 = (com.waze.car_lib.h.f) r0
            int r1 = r0.f19826c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19826c = r1
            goto L18
        L13:
            com.waze.car_lib.h.f r0 = new com.waze.car_lib.h.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.f19824a
            h.c.a.a r6 = h.c.a.a.f48038a
            int r1 = r0.f19826c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            e.b.c.b(r4)     // Catch: java.lang.Throwable -> L59
            goto L52
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r4)
            kotlinx.coroutines.CompletableDeferred r4 = kotlinx.coroutines.bo.j()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1}
            java.util.List r1 = h.a.i.i(r1)
            com.waze.car_lib.m.a r3 = new com.waze.car_lib.m.a
            r3.<init>(r4, r2)
            r5.requestPermissions(r1, r3)
            r0.f19826c = r2     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r4.c(r0)     // Catch: java.lang.Throwable -> L59
            if (r4 == r6) goto L58
        L52:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L59
            r4.booleanValue()     // Catch: java.lang.Throwable -> L59
            goto L5e
        L58:
            return r6
        L59:
            r4 = move-exception
            java.lang.Object r4 = e.b.c.a(r4)
        L5e:
            java.lang.Throwable r5 = h.m.c(r4)
            if (r5 != 0) goto L65
            return r4
        L65:
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.h.g.b(com.waze.car_lib.h.g, androidx.car.app.CarContext, h.c.e):java.lang.Object");
    }

    public final Object a(CarContext carContext, h.c.e eVar) {
        return b(this, carContext, eVar);
    }
}
