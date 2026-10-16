package com.waze.main_screen.b.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f25883a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f25884b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25885c;

    public j(kotlinx.coroutines.b.l lVar, Object obj, int i2) {
        this.f25885c = i2;
        this.f25883a = lVar;
        this.f25884b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r8.emit(r10, r0) == r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, h.c.e r10) {
        /*
            r8 = this;
            int r0 = r8.f25885c
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L58
            boolean r0 = r10 instanceof com.waze.main_screen.b.a.g
            if (r0 == 0) goto L1b
            r0 = r10
            com.waze.main_screen.b.a.g r0 = (com.waze.main_screen.b.a.g) r0
            int r5 = r0.f25874b
            r6 = r5 & r4
            if (r6 == 0) goto L1b
            int r5 = r5 - r4
            r0.f25874b = r5
            goto L20
        L1b:
            com.waze.main_screen.b.a.g r0 = new com.waze.main_screen.b.a.g
            r0.<init>(r8, r10)
        L20:
            java.lang.Object r10 = r0.f25873a
            h.c.a.a r4 = h.c.a.a.f48038a
            int r5 = r0.f25874b
            if (r5 == 0) goto L34
            if (r5 != r3) goto L2e
            e.b.c.b(r10)
            goto L55
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L34:
            e.b.c.b(r10)
            kotlinx.coroutines.b.l r10 = r8.f25883a
            r1 = r0
            h.c.e r1 = (h.c.e) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4c
            java.lang.Object r8 = r8.f25884b
            com.waze.main_screen.b.a.h r8 = (com.waze.main_screen.b.a.h) r8
            com.waze.main_screen.b.a.f r2 = r8.b()
        L4c:
            r0.f25874b = r3
            java.lang.Object r8 = r10.emit(r2, r0)
            if (r8 != r4) goto L55
            return r4
        L55:
            h.ab r8 = h.ab.f48028a
            return r8
        L58:
            boolean r0 = r10 instanceof com.waze.main_screen.b.a.i
            if (r0 == 0) goto L69
            r0 = r10
            com.waze.main_screen.b.a.i r0 = (com.waze.main_screen.b.a.i) r0
            int r5 = r0.f25880b
            r6 = r5 & r4
            if (r6 == 0) goto L69
            int r5 = r5 - r4
            r0.f25880b = r5
            goto L6e
        L69:
            com.waze.main_screen.b.a.i r0 = new com.waze.main_screen.b.a.i
            r0.<init>(r8, r10)
        L6e:
            java.lang.Object r10 = r0.f25879a
            h.c.a.a r4 = h.c.a.a.f48038a
            int r5 = r0.f25880b
            r6 = 2
            if (r5 == 0) goto L8d
            if (r5 == r3) goto L85
            if (r5 != r6) goto L7f
            e.b.c.b(r10)
            goto Lc0
        L7f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L85:
            java.lang.Object r8 = r0.f25881c
            kotlinx.coroutines.b.l r8 = (kotlinx.coroutines.b.l) r8
            e.b.c.b(r10)
            goto Lb5
        L8d:
            e.b.c.b(r10)
            kotlinx.coroutines.b.l r10 = r8.f25883a
            r1 = r0
            h.c.e r1 = (h.c.e) r1
            com.waze.main_screen.b.a.e r9 = (com.waze.main_screen.b.a.e) r9
            java.lang.Object r8 = r8.f25884b
            com.waze.main_screen.b.a.m r8 = (com.waze.main_screen.b.a.m) r8
            kotlinx.coroutines.ab r8 = com.waze.main_screen.b.a.m.e(r8)
            h.c.j r8 = (h.c.j) r8
            com.waze.main_screen.b.a.l r1 = new com.waze.main_screen.b.a.l
            r1.<init>(r9, r2)
            h.g.a.p r1 = (h.g.a.p) r1
            r0.f25881c = r10
            r0.f25880b = r3
            java.lang.Object r8 = kotlinx.coroutines.aj.v(r8, r1, r0)
            if (r8 == r4) goto Lc3
            r7 = r10
            r10 = r8
            r8 = r7
        Lb5:
            r0.f25881c = r2
            r0.f25880b = r6
            java.lang.Object r8 = r8.emit(r10, r0)
            if (r8 != r4) goto Lc0
            goto Lc3
        Lc0:
            h.ab r8 = h.ab.f48028a
            return r8
        Lc3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.b.a.j.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
