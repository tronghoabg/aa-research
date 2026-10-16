package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bc implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f25902a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25903b;

    public bc(kotlinx.coroutines.b.l lVar, int i2) {
        this.f25903b = i2;
        this.f25902a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
        /*
            r6 = this;
            int r0 = r6.f25903b
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L55
            boolean r0 = r8 instanceof com.waze.main_screen.ai
            if (r0 == 0) goto L1a
            r0 = r8
            com.waze.main_screen.ai r0 = (com.waze.main_screen.ai) r0
            int r4 = r0.f25827b
            r5 = r4 & r3
            if (r5 == 0) goto L1a
            int r4 = r4 - r3
            r0.f25827b = r4
            goto L1f
        L1a:
            com.waze.main_screen.ai r0 = new com.waze.main_screen.ai
            r0.<init>(r6, r8)
        L1f:
            java.lang.Object r8 = r0.f25826a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r0.f25827b
            if (r4 == 0) goto L33
            if (r4 != r2) goto L2d
            e.b.c.b(r8)
            goto L52
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L33:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r6 = r6.f25902a
            r8 = r0
            h.c.e r8 = (h.c.e) r8
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L52
            int r8 = r8.length()
            if (r8 != 0) goto L49
            goto L52
        L49:
            r0.f25827b = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r3) goto L52
            return r3
        L52:
            h.ab r6 = h.ab.f48028a
            return r6
        L55:
            boolean r0 = r8 instanceof com.waze.main_screen.bb
            if (r0 == 0) goto L66
            r0 = r8
            com.waze.main_screen.bb r0 = (com.waze.main_screen.bb) r0
            int r4 = r0.f25900b
            r5 = r4 & r3
            if (r5 == 0) goto L66
            int r4 = r4 - r3
            r0.f25900b = r4
            goto L6b
        L66:
            com.waze.main_screen.bb r0 = new com.waze.main_screen.bb
            r0.<init>(r6, r8)
        L6b:
            java.lang.Object r8 = r0.f25899a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r0.f25900b
            if (r4 == 0) goto L7f
            if (r4 != r2) goto L79
            e.b.c.b(r8)
            goto L98
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L7f:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r6 = r6.f25902a
            r8 = r0
            h.c.e r8 = (h.c.e) r8
            com.waze.cf r7 = (com.waze.cf) r7
            boolean r7 = r7 instanceof com.waze.am
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0.f25900b = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r3) goto L98
            return r3
        L98:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.bc.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
