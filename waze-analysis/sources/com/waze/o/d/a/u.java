package com.waze.o.d.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f32870a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f32871b;

    public u(kotlinx.coroutines.b.l lVar, boolean z) {
        this.f32870a = lVar;
        this.f32871b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.o.d.a.t
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.o.d.a.t r0 = (com.waze.o.d.a.t) r0
            int r1 = r0.f32868b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32868b = r1
            goto L18
        L13:
            com.waze.o.d.a.t r0 = new com.waze.o.d.a.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f32867a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32868b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L5b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.l r6 = r4.f32870a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            com.waze.t.b.bw r5 = (com.waze.t.b.bw) r5
            boolean r4 = r4.f32871b
            if (r4 != 0) goto L4e
            boolean r4 = r5 instanceof com.waze.t.b.bs
            if (r4 == 0) goto L4e
            com.waze.t.b.br r4 = new com.waze.t.b.br
            r5 = 0
            r4.<init>(r5)
            com.waze.t.b.bw r4 = (com.waze.t.b.bw) r4
            com.waze.o.d.a.s r4 = com.waze.car_lib.r.bq.m(r4)
            goto L52
        L4e:
            com.waze.o.d.a.s r4 = com.waze.car_lib.r.bq.m(r5)
        L52:
            r0.f32868b = r3
            java.lang.Object r4 = r6.emit(r4, r0)
            if (r4 != r1) goto L5b
            return r1
        L5b:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.o.d.a.u.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
