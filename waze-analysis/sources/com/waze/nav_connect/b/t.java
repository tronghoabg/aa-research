package com.waze.nav_connect.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f30827a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f30828b;

    public t(kotlinx.coroutines.b.l lVar, w wVar) {
        this.f30827a = lVar;
        this.f30828b = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.nav_connect.b.s
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.nav_connect.b.s r0 = (com.waze.nav_connect.b.s) r0
            int r1 = r0.f30825b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30825b = r1
            goto L18
        L13:
            com.waze.nav_connect.b.s r0 = new com.waze.nav_connect.b.s
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f30824a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f30825b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L60
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            kotlinx.coroutines.b.l r7 = r5.f30827a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            com.google.v.v r6 = (com.google.v.v) r6
            r2 = 0
            if (r6 == 0) goto L57
            com.waze.nav_connect.b.w r4 = r5.f30828b     // Catch: java.lang.Exception -> L49
            android.graphics.Bitmap r6 = com.waze.nav_connect.b.w.e(r4, r6)     // Catch: java.lang.Exception -> L49
            if (r6 == 0) goto L57
            androidx.compose.ui.graphics.ImageBitmap r2 = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(r6)     // Catch: java.lang.Exception -> L49
            goto L57
        L49:
            r6 = move-exception
            com.waze.nav_connect.b.w r5 = r5.f30828b
            com.waze.shared_infra.i.e r5 = com.waze.nav_connect.b.w.f(r5)
            java.lang.String r4 = "Failed to load NavConnect partner icon"
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r5.c(r4, r6)
        L57:
            r0.f30825b = r3
            java.lang.Object r5 = r7.emit(r2, r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.nav_connect.b.t.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
