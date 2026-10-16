package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cc implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f42663a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f42664b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba f42665c;

    public cc(kotlinx.coroutines.b.l lVar, float f2, ba baVar) {
        this.f42663a = lVar;
        this.f42664b = f2;
        this.f42665c = baVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.ui.l.cb
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.ui.l.cb r0 = (com.waze.ui.l.cb) r0
            int r1 = r0.f42661b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42661b = r1
            goto L18
        L13:
            com.waze.ui.l.cb r0 = new com.waze.ui.l.cb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f42660a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f42661b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L6d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r8 = r6.f42663a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            r2 = r7
            h.k r2 = (h.k) r2
            java.lang.Object r4 = r2.a()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            java.lang.Object r2 = r2.b()
            com.waze.ui.l.aj r2 = (com.waze.ui.l.aj) r2
            float r5 = r6.f42664b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L64
            boolean r2 = r2 instanceof com.waze.ui.l.ai
            if (r2 == 0) goto L6d
            com.waze.ui.l.ba r6 = r6.f42665c
            com.waze.ui.l.ad r2 = r6.k()
            com.waze.ui.l.ad r6 = r6.j()
            boolean r6 = h.g.b.x.n(r2, r6)
            if (r6 == 0) goto L6d
        L64:
            r0.f42661b = r3
            java.lang.Object r6 = r8.emit(r7, r0)
            if (r6 != r1) goto L6d
            return r1
        L6d:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.cc.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
