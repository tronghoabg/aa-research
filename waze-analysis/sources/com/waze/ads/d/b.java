package com.waze.ads.d;

import com.waze.network.bn;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final bn f13997a;

    public b(bn bnVar) {
        x.f(bnVar, "trackingHttpClient");
        this.f13997a = bnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.ads.d.b r4, java.lang.String r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.ads.d.a
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.ads.d.a r0 = (com.waze.ads.d.a) r0
            int r1 = r0.f13996c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13996c = r1
            goto L18
        L13:
            com.waze.ads.d.a r0 = new com.waze.ads.d.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13994a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f13996c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r6)
            h.m r6 = (h.m) r6
            java.lang.Object r4 = r6.b()
            goto L42
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r6)
            com.waze.network.bn r4 = r4.f13997a
            r0.f13996c = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 == r1) goto L75
        L42:
            boolean r5 = h.m.e(r4)
            if (r5 == 0) goto L6d
            boolean r5 = r4 instanceof h.l
            r6 = 0
            if (r3 != r5) goto L4e
            r4 = r6
        L4e:
            com.waze.network.bm r4 = (com.waze.network.bm) r4
            if (r4 == 0) goto L56
            java.lang.Integer r6 = r4.a()
        L56:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Ad reporting to trackAddStopUrl success ("
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = ")"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.waze.shared_infra.i.h.a(r4)
            goto L72
        L6d:
            java.lang.String r4 = "Ad reporting to trackAddStopUrl failed"
            com.waze.shared_infra.i.h.c(r4)
        L72:
            h.ab r4 = h.ab.f48028a
            return r4
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ads.d.b.b(com.waze.ads.d.b, java.lang.String, h.c.e):java.lang.Object");
    }

    public final Object a(String str, h.c.e eVar) {
        return b(this, str, eVar);
    }
}
