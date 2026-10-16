package com.waze.main_screen.ae.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f25736a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f25737b;

    public j(kotlinx.coroutines.b.l lVar, n nVar) {
        this.f25736a = lVar;
        this.f25737b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r7.emit(r9, r0) == r1) goto L24;
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
            boolean r0 = r9 instanceof com.waze.main_screen.ae.a.i
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.main_screen.ae.a.i r0 = (com.waze.main_screen.ae.a.i) r0
            int r1 = r0.f25733b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25733b = r1
            goto L18
        L13:
            com.waze.main_screen.ae.a.i r0 = new com.waze.main_screen.ae.a.i
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f25732a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f25733b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            e.b.c.b(r9)
            goto L6c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r7 = r0.f25734c
            kotlinx.coroutines.b.l r7 = (kotlinx.coroutines.b.l) r7
            e.b.c.b(r9)
            goto L61
        L3b:
            e.b.c.b(r9)
            kotlinx.coroutines.b.l r9 = r7.f25736a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            com.waze.sdk.bk r8 = (com.waze.sdk.bk) r8
            com.waze.main_screen.ae.a.n r7 = r7.f25737b
            kotlinx.coroutines.ab r7 = r7.d()
            h.c.j r7 = (h.c.j) r7
            com.waze.main_screen.ae.a.l r2 = new com.waze.main_screen.ae.a.l
            r2.<init>(r8, r3)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f25734c = r9
            r0.f25733b = r5
            java.lang.Object r7 = kotlinx.coroutines.aj.v(r7, r2, r0)
            if (r7 == r1) goto L6f
            r6 = r9
            r9 = r7
            r7 = r6
        L61:
            r0.f25734c = r3
            r0.f25733b = r4
            java.lang.Object r7 = r7.emit(r9, r0)
            if (r7 != r1) goto L6c
            goto L6f
        L6c:
            h.ab r7 = h.ab.f48028a
            return r7
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.ae.a.j.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
