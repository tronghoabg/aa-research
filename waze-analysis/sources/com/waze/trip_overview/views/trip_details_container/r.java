package com.waze.trip_overview.views.trip_details_container;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41592a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TripOverviewDetailsList f41593b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f41594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(TripOverviewDetailsList tripOverviewDetailsList, h.c.e eVar) {
        super(2, eVar);
        this.f41593b = tripOverviewDetailsList;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        r rVar = new r(this.f41593b, eVar);
        rVar.f41594c = obj;
        return rVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r1.emit(new java.lang.Integer(r4.f41593b.getHeight()), r4) == r0) goto L14;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f41592a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            e.b.c.b(r5)
            goto L49
        Ld:
            java.lang.Object r1 = r4.f41594c
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r5)
            goto L2e
        L15:
            e.b.c.b(r5)
            java.lang.Object r5 = r4.f41594c
            r1 = r5
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            com.waze.trip_overview.views.trip_details_container.TripOverviewDetailsList r5 = r4.f41593b
            android.view.View r5 = (android.view.View) r5
            r3 = r4
            h.c.e r3 = (h.c.e) r3
            r4.f41594c = r1
            r4.f41592a = r2
            java.lang.Object r5 = com.waze.ad.a.j.o(r5, r3)
            if (r5 == r0) goto L4c
        L2e:
            com.waze.trip_overview.views.trip_details_container.TripOverviewDetailsList r5 = r4.f41593b
            int r5 = r5.getHeight()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r5 = r4
            h.c.e r5 = (h.c.e) r5
            r3 = 0
            r4.f41594c = r3
            r3 = 2
            r4.f41592a = r3
            java.lang.Object r4 = r1.emit(r2, r5)
            if (r4 != r0) goto L49
            goto L4c
        L49:
            h.ab r4 = h.ab.f48028a
            return r4
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.views.trip_details_container.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
