package com.waze.trip_overview.c.a;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41235a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f41236b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ab f41237c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aq f41238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(ab abVar, aq aqVar, h.c.e eVar) {
        super(2, eVar);
        this.f41237c = abVar;
        this.f41238d = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        m mVar = new m(this.f41237c, this.f41238d, eVar);
        mVar.f41236b = obj;
        return mVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r3.a().c(r6) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (com.waze.install.ah.e(r1, r4, r5, r2, 4).a().c(r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        return r0;
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
            int r1 = r6.f41235a
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.Object r3 = r6.f41236b
            if (r1 == r2) goto L12
            com.waze.trip_overview.c.a.h r3 = (com.waze.trip_overview.c.a.h) r3
            e.b.c.b(r7)
            goto La4
        L12:
            com.waze.trip_overview.c.a.h r3 = (com.waze.trip_overview.c.a.h) r3
            e.b.c.b(r7)
            goto L6d
        L18:
            e.b.c.b(r7)
            java.lang.Object r7 = r6.f41236b
            h.k r7 = (h.k) r7
            java.lang.Object r1 = r7.a()
            com.waze.trip_overview.c.a.ad r1 = (com.waze.trip_overview.c.a.ad) r1
            java.lang.Object r7 = r7.b()
            com.waze.map.b.dz r7 = (com.waze.map.b.dz) r7
            com.waze.map.b.bi r3 = r1.b()
            com.waze.trip_overview.c.a.ab r4 = r6.f41237c
            com.waze.map.b.ed r4 = com.waze.trip_overview.c.a.ab.b(r4)
            com.waze.shared_infra.s.c r3 = r4.b(r3)
            com.waze.trip_overview.c.a.h r4 = new com.waze.trip_overview.c.a.h
            com.waze.map.canvas.a.b r1 = r1.a()
            r4.<init>(r1, r7)
            h.g.b.aq r7 = r6.f41238d
            java.lang.Object r7 = r7.f48105a
            boolean r7 = h.g.b.x.n(r4, r7)
            if (r7 == 0) goto L4f
            h.ab r6 = h.ab.f48028a
            return r6
        L4f:
            com.waze.map.canvas.a.b r7 = r4.a()
            com.waze.destination_cell.b.e r7 = r7.a()
            boolean r7 = r7 instanceof com.waze.map.b.cp
            if (r7 == 0) goto L6c
            kotlinx.coroutines.am r7 = r3.a()
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r6.f41236b = r4
            r6.f41235a = r2
            java.lang.Object r7 = r7.c(r1)
            if (r7 == r0) goto La3
        L6c:
            r3 = r4
        L6d:
            h.g.b.aq r7 = r6.f41238d
            com.waze.trip_overview.c.a.ab r1 = r6.f41237c
            java.lang.Object r7 = r7.f48105a
            com.waze.map.b.ed r1 = com.waze.trip_overview.c.a.ab.b(r1)
            com.waze.map.b.dz r4 = r3.b()
            com.waze.map.b.ec r4 = (com.waze.map.b.ec) r4
            com.waze.map.canvas.a.b r5 = r3.a()
            com.waze.destination_cell.b.e r5 = r5.a()
            if (r7 == 0) goto L8b
            r3.a()
            goto L8c
        L8b:
            r2 = 0
        L8c:
            r7 = 4
            com.waze.shared_infra.s.c r7 = com.waze.install.ah.e(r1, r4, r5, r2, r7)
            kotlinx.coroutines.am r7 = r7.a()
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r6.f41236b = r3
            r2 = 2
            r6.f41235a = r2
            java.lang.Object r7 = r7.c(r1)
            if (r7 != r0) goto La4
        La3:
            return r0
        La4:
            h.g.b.aq r6 = r6.f41238d
            r6.f48105a = r3
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.c.a.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
