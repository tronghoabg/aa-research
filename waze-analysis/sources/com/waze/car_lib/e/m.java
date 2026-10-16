package com.waze.car_lib.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f19296a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f19297b;

    public m(kotlinx.coroutines.b.l lVar, p pVar) {
        this.f19296a = lVar;
        this.f19297b = pVar;
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
            boolean r0 = r6 instanceof com.waze.car_lib.e.l
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.car_lib.e.l r0 = (com.waze.car_lib.e.l) r0
            int r1 = r0.f19294b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19294b = r1
            goto L18
        L13:
            com.waze.car_lib.e.l r0 = new com.waze.car_lib.e.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f19293a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f19294b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L6e
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.l r6 = r4.f19296a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            r2 = r5
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L65
            com.waze.car_lib.e.p r4 = r4.f19297b
            com.waze.shared_infra.i.e r5 = com.waze.car_lib.e.p.d(r4)
            com.waze.shared_infra.r.y r4 = com.waze.car_lib.e.p.e(r4)
            kotlinx.coroutines.b.ch r4 = r4.a()
            java.lang.Object r4 = r4.d()
            java.util.Objects.toString(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "User not logged in - not starting cluster map. User state "
            java.lang.String r4 = r6.concat(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5.g(r4)
            goto L6e
        L65:
            r0.f19294b = r3
            java.lang.Object r4 = r6.emit(r5, r0)
            if (r4 != r1) goto L6e
            return r1
        L6e:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.e.m.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
