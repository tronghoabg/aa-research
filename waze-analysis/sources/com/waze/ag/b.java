package com.waze.ag;

import com.waze.location.q;
import com.waze.sharedui.f.k;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final k f14054a;

    public b(q qVar, k kVar) {
        x.f(qVar, "dataProvider");
        x.f(kVar, "networkGateway");
        this.f14054a = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.ag.a
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.ag.a r0 = (com.waze.ag.a) r0
            int r1 = r0.f14053c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14053c = r1
            goto L18
        L13:
            com.waze.ag.a r0 = new com.waze.ag.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14051a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f14053c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L84
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            i.b.l.cc r7 = i.b.l.cd.newBuilder()
            i.b.f.a.i r2 = i.b.f.a.l.newBuilder()
            com.waze.sharedui.profile.b r4 = com.waze.sharedui.profile.b.a()
            java.lang.Long r4 = r4.d()
            java.lang.String r5 = "getMyUserId(...)"
            h.g.b.x.e(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r2.b(r4)
            i.b.f.a.j r4 = i.b.f.a.k.newBuilder()
            r4.a()
            com.google.v.du r4 = r4.build()
            i.b.f.a.k r4 = (i.b.f.a.k) r4
            r2.a(r4)
            com.google.v.du r2 = r2.build()
            i.b.f.a.l r2 = (i.b.f.a.l) r2
            r7.p(r2)
            com.google.v.du r7 = r7.build()
            java.lang.String r2 = "build(...)"
            h.g.b.x.e(r7, r2)
            i.b.l.cd r7 = (i.b.l.cd) r7
            com.waze.sharedui.f.k r6 = r6.f14054a
            int r2 = com.waze.sharedui.api.a.f38785a
            com.waze.sharedui.f.d r2 = com.waze.sharedui.api.a.l()
            r0.f14053c = r3
            java.lang.Object r7 = com.waze.sharedui.f.n.b(r6, r2, r7, r0)
            if (r7 == r1) goto Lb6
        L84:
            com.waze.sharedui.f.n r7 = (com.waze.sharedui.f.n) r7
            boolean r6 = r7 instanceof com.waze.sharedui.f.i
            if (r6 == 0) goto La0
            com.waze.sharedui.f.i r7 = (com.waze.sharedui.f.i) r7
            java.lang.Object r6 = r7.a()
            i.b.l.cd r6 = (i.b.l.cd) r6
            i.b.f.a.u r6 = r6.getGetGamingStatusResponse()
            int r6 = r6.getUnseenCount()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        La0:
            boolean r6 = r7 instanceof com.waze.sharedui.f.j
            if (r6 == 0) goto Lb0
            com.waze.sharedui.f.b r6 = new com.waze.sharedui.f.b
            com.waze.sharedui.f.j r7 = (com.waze.sharedui.f.j) r7
            com.waze.sharedui.b r7 = r7.a()
            r6.<init>(r7)
            throw r6
        Lb0:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ag.b.a(h.c.e):java.lang.Object");
    }
}
