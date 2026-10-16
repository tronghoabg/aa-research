package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dk implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dt f23563a;

    dk(dt dtVar) {
        this.f23563a = dtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r9.b(r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, h.c.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.waze.dj
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.dj r0 = (com.waze.dj) r0
            int r1 = r0.f23562c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23562c = r1
            goto L18
        L13:
            com.waze.dj r0 = new com.waze.dj
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f23560a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f23562c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r11)
            goto L79
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            e.b.c.b(r11)
            goto L65
        L36:
            e.b.c.b(r11)
            com.waze.dt r11 = r8.f23563a
            kotlinx.coroutines.b.bn r11 = com.waze.dt.g(r11)
        L3f:
            java.lang.Object r2 = r11.d()
            r5 = r2
            com.waze.do r5 = (com.waze.Cdo) r5
            r5 = 0
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L4e
            r6 = r4
            goto L4f
        L4e:
            r6 = 0
        L4f:
            com.waze.do r7 = new com.waze.do
            r7.<init>(r6)
            boolean r2 = r11.f(r2, r7)
            if (r2 == 0) goto L3f
            if (r5 == 0) goto L86
            r0.f23562c = r4
            java.lang.Object r9 = com.waze.config.a.a(r0)
            if (r9 != r1) goto L65
            goto L85
        L65:
            com.waze.dt r9 = r8.f23563a
            boolean r10 = com.waze.dt.h(r9)
            if (r10 == 0) goto L86
            com.waze.copilot.a.s r9 = com.waze.dt.a(r9)
            r0.f23562c = r3
            java.lang.Object r9 = r9.b(r0)
            if (r9 == r1) goto L85
        L79:
            com.waze.dt r8 = r8.f23563a
            boolean r9 = com.waze.dt.h(r8)
            if (r9 == 0) goto L86
            com.waze.dt.i(r8)
            goto L86
        L85:
            return r1
        L86:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.dk.a(long, h.c.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        return a(((Number) obj).longValue(), eVar);
    }
}
