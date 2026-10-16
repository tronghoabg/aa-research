package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ao implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f24761a;

    public ao(kotlinx.coroutines.b.l lVar) {
        this.f24761a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, h.c.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.waze.install.an
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.install.an r0 = (com.waze.install.an) r0
            int r1 = r0.f24759b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24759b = r1
            goto L18
        L13:
            com.waze.install.an r0 = new com.waze.install.an
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f24758a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f24759b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r9)
            goto L81
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            e.b.c.b(r9)
            kotlinx.coroutines.b.l r7 = r7.f24761a
            r9 = r0
            h.c.e r9 = (h.c.e) r9
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L4b
            r8 = 0
            goto L78
        L4b:
            java.lang.Object r9 = r8.next()
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L77
            r2 = r9
            com.waze.install.w r2 = (com.waze.install.w) r2
            int r2 = r2.c()
        L5c:
            java.lang.Object r4 = r8.next()
            r5 = r4
            com.waze.install.w r5 = (com.waze.install.w) r5
            int r5 = r5.c()
            if (r2 <= r5) goto L6b
            r6 = r5
            goto L6c
        L6b:
            r6 = r2
        L6c:
            if (r2 <= r5) goto L6f
            r9 = r4
        L6f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L77
            r2 = r6
            goto L5c
        L77:
            r8 = r9
        L78:
            r0.f24759b = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L81
            return r1
        L81:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.install.ao.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
