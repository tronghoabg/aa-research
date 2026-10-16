package com.waze.ui.z;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f44027a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44028b;

    public y(kotlinx.coroutines.b.l lVar, int i2) {
        this.f44028b = i2;
        this.f44027a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
        /*
            r6 = this;
            int r0 = r6.f44028b
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L50
            boolean r0 = r8 instanceof com.waze.ui.z.u
            if (r0 == 0) goto L1a
            r0 = r8
            com.waze.ui.z.u r0 = (com.waze.ui.z.u) r0
            int r4 = r0.f44018b
            r5 = r4 & r3
            if (r5 == 0) goto L1a
            int r4 = r4 - r3
            r0.f44018b = r4
            goto L1f
        L1a:
            com.waze.ui.z.u r0 = new com.waze.ui.z.u
            r0.<init>(r6, r8)
        L1f:
            java.lang.Object r8 = r0.f44017a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r0.f44018b
            if (r4 == 0) goto L33
            if (r4 != r2) goto L2d
            e.b.c.b(r8)
            goto L4d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L33:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r6 = r6.f44027a
            r8 = r0
            h.c.e r8 = (h.c.e) r8
            r8 = r7
            androidx.compose.ui.geometry.Rect r8 = (androidx.compose.ui.geometry.Rect) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4d
            r0.f44018b = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r3) goto L4d
            return r3
        L4d:
            h.ab r6 = h.ab.f48028a
            return r6
        L50:
            boolean r0 = r8 instanceof com.waze.ui.z.x
            if (r0 == 0) goto L61
            r0 = r8
            com.waze.ui.z.x r0 = (com.waze.ui.z.x) r0
            int r4 = r0.f44025b
            r5 = r4 & r3
            if (r5 == 0) goto L61
            int r4 = r4 - r3
            r0.f44025b = r4
            goto L66
        L61:
            com.waze.ui.z.x r0 = new com.waze.ui.z.x
            r0.<init>(r6, r8)
        L66:
            java.lang.Object r8 = r0.f44024a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r0.f44025b
            if (r4 == 0) goto L7a
            if (r4 != r2) goto L74
            e.b.c.b(r8)
            goto L94
        L74:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L7a:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r6 = r6.f44027a
            r8 = r0
            h.c.e r8 = (h.c.e) r8
            r8 = r7
            androidx.compose.ui.geometry.Rect r8 = (androidx.compose.ui.geometry.Rect) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L94
            r0.f44025b = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r3) goto L94
            return r3
        L94:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.z.y.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
