package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import Hf.x0;

/* loaded from: classes4.dex */
public final class c {
    public static final void b(c cVar) {
        cVar.getClass();
        x0 x0Var = StaticAdActivity.f30525h;
        Boolean bool = Boolean.TRUE;
        x0Var.getClass();
        x0Var.k(null, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r6, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g r7, S8.d r8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1980a r9, F4.f r10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v r11, com.moloco.sdk.acm.recorder.c r12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1982b r13, lf.AbstractC3464c r14) {
        /*
            r5 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a) r0
            int r1 = r0.f30530c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30530c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a
            r0.<init>(r5, r14)
        L18:
            java.lang.Object r14 = r0.f30528a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f30530c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r14)     // Catch: java.lang.Throwable -> L28
            goto L6e
        L28:
            r6 = move-exception
            goto L93
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            Fe.e.U(r14)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30526i = r11     // Catch: java.lang.Throwable -> L28
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30527j = r12     // Catch: java.lang.Throwable -> L28
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.k = r13     // Catch: java.lang.Throwable -> L28
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30521d = r7     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = r10.f3847c     // Catch: java.lang.Throwable -> L28
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f r7 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f) r7     // Catch: java.lang.Throwable -> L28
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30520c = r7     // Catch: java.lang.Throwable -> L28
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30523f = r8     // Catch: java.lang.Throwable -> L28
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30524g = r9     // Catch: java.lang.Throwable -> L28
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> L28
            java.lang.Class<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity> r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.class
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L28
            int r8 = r10.f3845a     // Catch: java.lang.Throwable -> L28
            java.lang.String r9 = "CLOSE_DELAY_SECONDS"
            r7.putExtra(r9, r8)     // Catch: java.lang.Throwable -> L28
            r8 = 268435456(0x10000000, float:2.524355E-29)
            r7.setFlags(r8)     // Catch: java.lang.Throwable -> L28
            r6.startActivity(r7)     // Catch: java.lang.Throwable -> L28
            Hf.x0 r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30525h     // Catch: java.lang.Throwable -> L28
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b     // Catch: java.lang.Throwable -> L28
            r8 = 2
            r7.<init>(r8, r4)     // Catch: java.lang.Throwable -> L28
            r0.f30530c = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r14 = Hf.k0.p(r6, r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r14 != r1) goto L6e
            return r1
        L6e:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L28
            r14.getClass()     // Catch: java.lang.Throwable -> L28
            Hf.x0 r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30525h
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.getClass()
            r6.k(r4, r7)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30523f = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30524g = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30521d = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30520c = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30527j = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.k = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity r6 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30522e
            if (r6 == 0) goto L90
            r6.finish()
        L90:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        L93:
            Hf.x0 r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30525h
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r7.getClass()
            r7.k(r4, r8)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30523f = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30524g = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30521d = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30520c = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30527j = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.k = r4
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.f30522e
            if (r7 == 0) goto Lb0
            r7.finish()
        Lb0:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c.a(android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g, S8.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a, F4.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v, com.moloco.sdk.acm.recorder.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b, lf.c):java.lang.Object");
    }
}
