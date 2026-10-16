package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f20404a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f20405b;

    public h(kotlinx.coroutines.b.l lVar, j jVar) {
        this.f20404a = lVar;
        this.f20405b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.car_lib.n.g
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.car_lib.n.g r0 = (com.waze.car_lib.n.g) r0
            int r1 = r0.f20402b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20402b = r1
            goto L18
        L13:
            com.waze.car_lib.n.g r0 = new com.waze.car_lib.n.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f20401a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20402b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L69
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r8 = r6.f20404a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r7 = r7.iterator()
        L46:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r7.next()
            com.waze.li r4 = (com.waze.li) r4
            com.waze.car_lib.n.j r5 = r6.f20405b
            com.waze.car_lib.n.d r4 = com.waze.car_lib.n.j.a(r5, r4)
            if (r4 == 0) goto L46
            r2.add(r4)
            goto L46
        L5e:
            java.util.List r2 = (java.util.List) r2
            r0.f20402b = r3
            java.lang.Object r6 = r8.emit(r2, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.n.h.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
