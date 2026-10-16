package com.waze.alerters.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f14204a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f14205b;

    public w(kotlinx.coroutines.b.l lVar, y yVar) {
        this.f14204a = lVar;
        this.f14205b = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, h.c.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.waze.alerters.a.v
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.alerters.a.v r0 = (com.waze.alerters.a.v) r0
            int r1 = r0.f14201b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14201b = r1
            goto L18
        L13:
            com.waze.alerters.a.v r0 = new com.waze.alerters.a.v
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f14200a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f14201b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r9)
            goto L98
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f14202c
            kotlinx.coroutines.b.l r7 = (kotlinx.coroutines.b.l) r7
            e.b.c.b(r9)
            goto L8a
        L3a:
            e.b.c.b(r9)
            kotlinx.coroutines.b.l r9 = r7.f14204a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r8 = r8.iterator()
        L51:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r8.next()
            r6 = r5
            com.waze.alerters.a.z r6 = (com.waze.alerters.a.z) r6
            com.waze.alerters.a.ad r6 = r6.d()
            if (r6 != 0) goto L51
            r2.add(r5)
            goto L51
        L68:
            java.util.List r2 = (java.util.List) r2
            com.waze.alerters.a.y r7 = r7.f14205b
            java.util.List r8 = com.waze.alerters.a.y.b(r7)
            java.util.List r8 = com.waze.alerters.a.y.c(r7, r8, r2)
            com.waze.alerters.a.y.e(r7, r8)
            kotlinx.coroutines.b.bm r8 = com.waze.alerters.a.y.d(r7)
            java.util.List r7 = com.waze.alerters.a.y.b(r7)
            r0.f14202c = r9
            r0.f14201b = r4
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 == r1) goto L9b
            r7 = r9
        L8a:
            h.ab r8 = h.ab.f48028a
            r9 = 0
            r0.f14202c = r9
            r0.f14201b = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L98
            goto L9b
        L98:
            h.ab r7 = h.ab.f48028a
            return r7
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.alerters.a.w.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
