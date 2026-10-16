package com.waze.car_lib.r.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f20894a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f20895b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f20896c;

    i(p pVar, h.g.a.a aVar, boolean z) {
        this.f20894a = pVar;
        this.f20895b = aVar;
        this.f20896c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.waze.c.d.t r6, h.c.e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.car_lib.r.a.h
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.car_lib.r.a.h r0 = (com.waze.car_lib.r.a.h) r0
            int r1 = r0.f20893d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20893d = r1
            goto L18
        L13:
            com.waze.car_lib.r.a.h r0 = new com.waze.car_lib.r.a.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f20891b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20893d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f20890a
            com.waze.perf.tracer.f r5 = (com.waze.perf.tracer.f) r5
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L6c
        L2b:
            r6 = move-exception
            goto L74
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            e.b.c.b(r7)
            com.waze.car_lib.r.a.p r7 = r5.f20894a
            h.g.a.a r2 = r5.f20895b
            boolean r4 = com.waze.car_lib.r.a.p.q(r7, r6, r2)
            if (r4 == 0) goto L78
            boolean r5 = r5.f20896c
            com.waze.car_lib.r.a.p.j(r7, r6, r5)
            com.waze.car_lib.r.a.p.h(r7, r6, r2)
            com.waze.c.e.a.t r5 = com.waze.car_lib.r.a.p.b(r7)
            if (r5 == 0) goto L78
            com.waze.perf.tracer.g r7 = com.waze.car_lib.r.a.p.c(r7)
            com.waze.perf.x r2 = com.waze.perf.x.f33083e
            java.lang.String r2 = r2.a()
            com.waze.perf.tracer.f r7 = r7.a(r2)
            r7.c()     // Catch: java.lang.Throwable -> L71
            r0.f20890a = r7     // Catch: java.lang.Throwable -> L71
            r0.f20893d = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r5 = r5.j(r6, r0)     // Catch: java.lang.Throwable -> L71
            if (r5 == r1) goto L70
            r5 = r7
        L6c:
            r5.d()
            goto L78
        L70:
            return r1
        L71:
            r5 = move-exception
            r6 = r5
            r5 = r7
        L74:
            r5.d()
            throw r6
        L78:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.a.i.emit(com.waze.c.d.t, h.c.e):java.lang.Object");
    }
}
