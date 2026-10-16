package com.waze.parking;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33000a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f33001b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f33002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(y yVar, h.c.e eVar) {
        super(2, eVar);
        this.f33002c = yVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        x xVar = new x(this.f33002c, eVar);
        xVar.f33001b = obj;
        return xVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((com.waze.shared_infra.h.c) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r7 == r0) goto L40;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f33000a
            r2 = 1
            r3 = 3
            r4 = 0
            if (r1 == 0) goto L14
            if (r1 == r2) goto L10
            e.b.c.b(r7)
            goto L84
        L10:
            e.b.c.b(r7)
            goto L4f
        L14:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f33001b
            com.waze.shared_infra.h.c r7 = (com.waze.shared_infra.h.c) r7
            com.waze.parking.y r1 = r6.f33002c
            if (r7 != 0) goto L3a
            kotlinx.coroutines.b.bn r5 = com.waze.parking.y.f(r1)
        L23:
            java.lang.Object r6 = r5.d()
            r7 = r6
            com.waze.parking.r r7 = (com.waze.parking.r) r7
            com.waze.places.d r0 = com.waze.places.d.f33105a
            com.waze.reports_v2.presentation.p r0 = (com.waze.reports_v2.presentation.p) r0
            com.waze.parking.r r7 = com.waze.parking.r.d(r7, r4, r0, r3)
            boolean r6 = r5.f(r6, r7)
            if (r6 == 0) goto L23
            goto Lca
        L3a:
            com.waze.ah.b r1 = com.waze.parking.y.b(r1)
            com.waze.ah.a r5 = com.waze.ah.a.f14058a
            kotlinx.coroutines.am r7 = r1.a(r7, r5)
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r6.f33000a = r2
            java.lang.Object r7 = r7.c(r1)
            if (r7 == r0) goto Ld3
        L4f:
            com.waze.av.a.p r7 = (com.waze.av.a.p) r7
            com.waze.parking.y r1 = r6.f33002c
            if (r7 != 0) goto L6f
            kotlinx.coroutines.b.bn r2 = com.waze.parking.y.f(r1)
        L59:
            java.lang.Object r6 = r2.d()
            r7 = r6
            com.waze.parking.r r7 = (com.waze.parking.r) r7
            com.waze.places.b r0 = com.waze.places.b.f33103a
            com.waze.reports_v2.presentation.p r0 = (com.waze.reports_v2.presentation.p) r0
            com.waze.parking.r r7 = com.waze.parking.r.d(r7, r4, r0, r3)
            boolean r6 = r2.f(r6, r7)
            if (r6 == 0) goto L59
            goto Lca
        L6f:
            com.waze.af.e r1 = com.waze.parking.y.a(r1)
            kotlinx.coroutines.am r7 = r1.b(r7)
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r2 = 2
            r6.f33000a = r2
            java.lang.Object r7 = r7.c(r1)
            if (r7 != r0) goto L84
            goto Ld3
        L84:
            com.waze.af.d r7 = (com.waze.af.d) r7
            boolean r0 = r7 instanceof com.waze.af.b
            if (r0 == 0) goto L96
            com.waze.places.c r0 = new com.waze.places.c
            com.waze.af.b r7 = (com.waze.af.b) r7
            java.lang.String r7 = r7.f14048a
            r0.<init>(r7)
            com.waze.reports_v2.presentation.p r0 = (com.waze.reports_v2.presentation.p) r0
            goto Lb3
        L96:
            boolean r0 = r7 instanceof com.waze.af.c
            if (r0 == 0) goto La6
            com.waze.places.e r0 = new com.waze.places.e
            com.waze.af.c r7 = (com.waze.af.c) r7
            java.lang.String r7 = r7.f14049a
            r0.<init>(r7)
            com.waze.reports_v2.presentation.p r0 = (com.waze.reports_v2.presentation.p) r0
            goto Lb3
        La6:
            com.waze.af.a r0 = com.waze.af.a.f14047a
            boolean r7 = h.g.b.x.n(r7, r0)
            if (r7 == 0) goto Lcd
            com.waze.places.b r7 = com.waze.places.b.f33103a
            r0 = r7
            com.waze.reports_v2.presentation.p r0 = (com.waze.reports_v2.presentation.p) r0
        Lb3:
            com.waze.parking.y r6 = r6.f33002c
            kotlinx.coroutines.b.bn r6 = com.waze.parking.y.f(r6)
        Lb9:
            java.lang.Object r7 = r6.d()
            r1 = r7
            com.waze.parking.r r1 = (com.waze.parking.r) r1
            com.waze.parking.r r1 = com.waze.parking.r.d(r1, r4, r0, r3)
            boolean r7 = r6.f(r7, r1)
            if (r7 == 0) goto Lb9
        Lca:
            h.ab r6 = h.ab.f48028a
            return r6
        Lcd:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.parking.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
