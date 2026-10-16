package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

/* loaded from: classes4.dex */
public final class I {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0026, B:24:0x0060, B:26:0x0064, B:27:0x006a), top: B:43:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0026, B:24:0x0060, B:26:0x0064, B:27:0x006a), top: B:43:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, lf.AbstractC3464c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H) r0
            int r1 = r0.f31171d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31171d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.H
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f31169b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f31171d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.io.StringReader r8 = r0.f31168a
            Fe.e.U(r9)     // Catch: java.lang.Throwable -> L2a
            goto L60
        L2a:
            r9 = move-exception
            goto L79
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            Fe.e.U(r9)
            java.io.StringReader r9 = new java.io.StringReader     // Catch: java.lang.Exception -> L7f
            r9.<init>(r8)     // Catch: java.lang.Exception -> L7f
            org.xmlpull.v1.XmlPullParser r8 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r5 = 0
            r8.setFeature(r2, r5)     // Catch: java.lang.Throwable -> L75
            r8.setInput(r9)     // Catch: java.lang.Throwable -> L75
            r0.f31168a = r9     // Catch: java.lang.Throwable -> L75
            r0.f31171d = r3     // Catch: java.lang.Throwable -> L75
            Lf.e r2 = Ef.S.f3698a     // Catch: java.lang.Throwable -> L75
            Lf.d r2 = Lf.d.f7120b     // Catch: java.lang.Throwable -> L75
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b0 r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b0     // Catch: java.lang.Throwable -> L75
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r8 = Ef.H.P(r2, r3, r0)     // Catch: java.lang.Throwable -> L75
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r6 = r9
            r9 = r8
            r8 = r6
        L60:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.D r9 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.D) r9     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L6a
            com.moloco.sdk.internal.z r0 = new com.moloco.sdk.internal.z     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L2a
            goto L71
        L6a:
            com.moloco.sdk.internal.y r0 = new com.moloco.sdk.internal.y     // Catch: java.lang.Throwable -> L2a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k r9 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30148c     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L2a
        L71:
            Ba.c.n(r8, r4)     // Catch: java.lang.Exception -> L7f
            return r0
        L75:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L79:
            throw r9     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            Ba.c.n(r8, r9)     // Catch: java.lang.Exception -> L7f
            throw r0     // Catch: java.lang.Exception -> L7f
        L7f:
            com.moloco.sdk.internal.y r8 = new com.moloco.sdk.internal.y
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k r9 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30147b
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.I.a(java.lang.String, lf.c):java.lang.Object");
    }
}
