package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bp implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f28099a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f28100b;

    public bp(kotlinx.coroutines.b.l lVar, Class cls) {
        this.f28099a = lVar;
        this.f28100b = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.map.b.bo
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.b.bo r0 = (com.waze.map.b.bo) r0
            int r1 = r0.f28097b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28097b = r1
            goto L18
        L13:
            com.waze.map.b.bo r0 = new com.waze.map.b.bo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f28096a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28097b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            kotlinx.coroutines.b.l r7 = r5.f28099a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            r2 = r6
            com.waze.install.ah r2 = (com.waze.install.ah) r2
            java.lang.Class r5 = r5.f28100b
            java.lang.Class r4 = r2.getClass()
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L4a
            boolean r5 = r2 instanceof com.waze.map.b.x
            if (r5 == 0) goto L53
        L4a:
            r0.f28097b = r3
            java.lang.Object r5 = r7.emit(r6, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.b.bp.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
