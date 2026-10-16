package com.waze.trip_overview.c.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41269a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f41270b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41271c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ab abVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41271c = i2;
        this.f41270b = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f41271c != 0 ? new y(this.f41270b, eVar, 1, null) : new y(this.f41270b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f41271c != 0 ? ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r7 == r0) goto L14;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f41271c
            r1 = 1
            if (r0 == 0) goto L70
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r6.f41269a
            r3 = 0
            if (r2 == 0) goto L16
            if (r2 == r1) goto L12
            e.b.c.b(r7)
            goto L59
        L12:
            e.b.c.b(r7)
            goto L39
        L16:
            e.b.c.b(r7)
            com.waze.trip_overview.c.a.ab r7 = r6.f41270b
            com.waze.map.b.ed r2 = com.waze.trip_overview.c.a.ab.b(r7)
            kotlinx.coroutines.b.ch r2 = r2.t()
            kotlinx.coroutines.b.k r2 = (kotlinx.coroutines.b.k) r2
            com.waze.trip_overview.c.a.q r4 = new com.waze.trip_overview.c.a.q
            r5 = 0
            r4.<init>(r7, r3, r5)
            h.g.a.p r4 = (h.g.a.p) r4
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f41269a = r1
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r2, r4, r7)
            if (r7 != r0) goto L39
            goto L58
        L39:
            com.waze.trip_overview.c.a.ab r7 = r6.f41270b
            com.waze.map.b.ed r1 = com.waze.trip_overview.c.a.ab.b(r7)
            kotlinx.coroutines.b.ch r1 = r1.w()
            kotlinx.coroutines.b.k r1 = (kotlinx.coroutines.b.k) r1
            com.waze.trip_overview.c.a.q r2 = new com.waze.trip_overview.c.a.q
            r4 = 2
            r2.<init>(r7, r3, r4, r3)
            h.g.a.p r2 = (h.g.a.p) r2
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f41269a = r4
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r1, r2, r7)
            if (r7 != r0) goto L59
        L58:
            return r0
        L59:
            com.waze.map.b.dm r7 = (com.waze.map.b.dm) r7
            if (r7 == 0) goto L6d
            com.waze.trip_overview.c.a.ab r6 = r6.f41270b
            com.waze.trip_overview.c.a.ao r6 = r6.h()
            com.waze.trip_overview.ed r0 = new com.waze.trip_overview.ed
            r0.<init>(r7)
            com.waze.trip_overview.fh r0 = (com.waze.trip_overview.fh) r0
            r6.l(r0)
        L6d:
            h.ab r6 = h.ab.f48028a
            return r6
        L70:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r6.f41269a
            if (r2 == 0) goto L7a
            e.b.c.b(r7)
            goto L9a
        L7a:
            e.b.c.b(r7)
            com.waze.trip_overview.c.a.ab r7 = r6.f41270b
            com.waze.trip_overview.views.trip_details_container.q r2 = com.waze.trip_overview.c.a.ab.i(r7)
            kotlinx.coroutines.b.k r2 = r2.b()
            com.waze.trip_overview.c.a.x r3 = new com.waze.trip_overview.c.a.x
            r3.<init>(r7)
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f41269a = r1
            java.lang.Object r6 = r2.collect(r3, r7)
            if (r6 != r0) goto L9a
            return r0
        L9a:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.c.a.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ab abVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f41271c = i2;
        this.f41270b = abVar;
    }
}
