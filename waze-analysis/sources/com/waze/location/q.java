package com.waze.location;

import android.content.Context;
import android.location.LocationManager;
import androidx.core.content.ContextCompat;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class q {
    public q() {
    }

    public static boolean e(Context context) {
        h.g.b.x.f(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static boolean f(Context context) {
        h.g.b.x.f(context, "context");
        LocationManager locationManager = (LocationManager) ContextCompat.getSystemService(context, LocationManager.class);
        return locationManager != null && locationManager.isProviderEnabled("gps");
    }

    public static boolean g(com.waze.google_assistant.ba baVar, String str, boolean z) {
        h.g.b.x.f(baVar, "<this>");
        return h.g.b.x.n(z ? baVar.a() : baVar.b(), str);
    }

    public static boolean h(com.waze.google_assistant.az azVar, String str, boolean z) {
        h.g.b.x.f(azVar, "<this>");
        return h.g.b.x.n(z ? azVar.a() : azVar.b(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.location.p
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.location.p r0 = (com.waze.location.p) r0
            int r1 = r0.f25416c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25416c = r1
            goto L18
        L13:
            com.waze.location.p r0 = new com.waze.location.p
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.f25414a
            h.c.a.a r8 = h.c.a.a.f48038a
            int r1 = r0.f25416c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L89
        L27:
            r6 = move-exception
            goto L8d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            e.b.c.b(r6)
            com.google.android.gms.location.d r6 = new com.google.android.gms.location.d
            r6.<init>()
            com.google.android.gms.location.b r1 = new com.google.android.gms.location.b
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 30000(0x7530, double:1.4822E-319)
            r1.<init>(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 5000(0x1388, double:2.4703E-320)
            r1.b(r3)
            com.google.android.gms.location.LocationRequest r1 = r1.a()
            r6.b(r1)
            r6.c()
            com.google.android.gms.location.e r6 = r6.a()
            com.google.android.gms.common.api.q r1 = new com.google.android.gms.common.api.q
            com.google.android.gms.common.api.internal.u r3 = com.google.android.gms.location.a.d.f5671a
            com.google.android.gms.common.api.e r4 = com.google.android.gms.common.api.f.f4696g
            com.google.android.gms.common.api.p r5 = com.google.android.gms.common.api.p.f4878a
            r1.<init>(r7, r3, r4, r5)
            com.google.android.gms.o.t r6 = r1.s(r6)
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.bo.j()
            com.waze.asks.ax r1 = new com.waze.asks.ax
            r1.<init>(r7, r2)
            com.google.firebase.messaging.n r3 = new com.google.firebase.messaging.n
            r4 = 7
            r3.<init>(r1, r4)
            r6.r(r3)
            com.waze.authentication.au r1 = new com.waze.authentication.au
            r3 = 2
            r1.<init>(r7, r3)
            r6.o(r1)
            r0.f25416c = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r7.c(r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == r8) goto L8c
        L89:
            com.waze.location.h r6 = (com.waze.location.h) r6     // Catch: java.lang.Throwable -> L27
            goto L91
        L8c:
            return r8
        L8d:
            java.lang.Object r6 = e.b.c.a(r6)
        L91:
            boolean r7 = r6 instanceof h.l
            if (r2 != r7) goto L96
            r6 = 0
        L96:
            com.waze.location.h r6 = (com.waze.location.h) r6
            if (r6 != 0) goto La0
            com.waze.location.h r6 = new com.waze.location.h
            r7 = 0
            r6.<init>(r7)
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.location.q.d(android.content.Context, h.c.e):java.lang.Object");
    }

    public String i() {
        throw null;
    }

    public q(char[] cArr) {
    }
}
