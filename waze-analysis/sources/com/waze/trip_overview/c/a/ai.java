package com.waze.trip_overview.c.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f41188a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f41189b;

    public ai(kotlinx.coroutines.b.l lVar, h.g.a.p pVar) {
        this.f41188a = lVar;
        this.f41189b = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r6.emit(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.trip_overview.c.a.ah
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.trip_overview.c.a.ah r0 = (com.waze.trip_overview.c.a.ah) r0
            int r1 = r0.f41185b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41185b = r1
            goto L18
        L13:
            com.waze.trip_overview.c.a.ah r0 = new com.waze.trip_overview.c.a.ah
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f41184a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f41185b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f41186c
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            e.b.c.b(r8)
            goto L51
        L3a:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r8 = r6.f41188a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            h.g.a.p r6 = r6.f41189b
            r0.f41186c = r8
            r0.f41185b = r4
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 == r1) goto L60
            r5 = r8
            r8 = r6
            r6 = r5
        L51:
            r7 = 0
            r0.f41186c = r7
            r0.f41185b = r3
            java.lang.Object r6 = r6.emit(r8, r0)
            if (r6 != r1) goto L5d
            goto L60
        L5d:
            h.ab r6 = h.ab.f48028a
            return r6
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.c.a.ai.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
