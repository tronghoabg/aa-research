package com.waze.an.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f14622a;

    public b(kotlinx.coroutines.b.l lVar) {
        this.f14622a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, h.c.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.waze.an.b.a
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.an.b.a r0 = (com.waze.an.b.a) r0
            int r1 = r0.f14620b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14620b = r1
            goto L18
        L13:
            com.waze.an.b.a r0 = new com.waze.an.b.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f14619a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f14620b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r10)
            goto L88
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            e.b.c.b(r10)
            kotlinx.coroutines.b.l r8 = r8.f14622a
            r10 = r0
            h.c.e r10 = (h.c.e) r10
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            boolean r10 = r9.hasNext()
            r2 = 0
            if (r10 != 0) goto L48
            r10 = r2
            goto L78
        L48:
            java.lang.Object r10 = r9.next()
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L78
            r4 = r10
            com.waze.an.a.r r4 = (com.waze.an.a.r) r4
            com.waze.an.a.x r4 = r4.j()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
        L5b:
            java.lang.Object r5 = r9.next()
            r6 = r5
            com.waze.an.a.r r6 = (com.waze.an.a.r) r6
            com.waze.an.a.x r6 = r6.j()
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r7 = r4.compareTo(r6)
            if (r7 <= 0) goto L6f
            r4 = r6
        L6f:
            if (r7 <= 0) goto L72
            r10 = r5
        L72:
            boolean r5 = r9.hasNext()
            if (r5 != 0) goto L5b
        L78:
            com.waze.an.a.r r10 = (com.waze.an.a.r) r10
            com.waze.an.b.f r9 = new com.waze.an.b.f
            r9.<init>(r10, r2)
            r0.f14620b = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.an.b.b.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
