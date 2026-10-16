package com.moloco.sdk.internal.services;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f29374a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f29375b;

    public B(G0 externalLinkHandler, com.moloco.sdk.internal.services.events.c customUserEventBuilderService) {
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        this.f29374a = externalLinkHandler;
        this.f29375b = customUserEventBuilderService;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a r20, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s r21, Hf.j0 r22, lf.AbstractC3464c r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r23
            boolean r3 = r2 instanceof com.moloco.sdk.internal.services.A
            if (r3 == 0) goto L1a
            r3 = r2
            com.moloco.sdk.internal.services.A r3 = (com.moloco.sdk.internal.services.A) r3
            int r4 = r3.f29373e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f29373e = r4
        L18:
            r9 = r3
            goto L20
        L1a:
            com.moloco.sdk.internal.services.A r3 = new com.moloco.sdk.internal.services.A
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r9.f29371c
            kf.a r3 = kf.a.f39711a
            int r4 = r9.f29373e
            ef.C r10 = ef.C2515C.f34653a
            r11 = 2
            r5 = 1
            if (r4 == 0) goto L44
            if (r4 == r5) goto L3c
            if (r4 != r11) goto L34
            Fe.e.U(r2)
            return r10
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            Hf.b0 r1 = r9.f29370b
            com.moloco.sdk.internal.services.B r4 = r9.f29369a
            Fe.e.U(r2)
            goto L9d
        L44:
            Fe.e.U(r2)
            long r6 = java.lang.System.currentTimeMillis()
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g
            int r4 = r1.f30564e
            float r4 = Fe.e.c(r4)
            int r8 = r1.f30565f
            float r8 = Fe.e.c(r8)
            r2.<init>(r4, r8)
            r12 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e r7 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g
            int r6 = r1.f30560a
            float r6 = Fe.e.c(r6)
            int r8 = r1.f30561b
            float r8 = Fe.e.c(r8)
            r4.<init>(r6, r8)
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h r6 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h
            int r8 = r1.f30563d
            float r8 = Fe.e.c(r8)
            int r1 = r1.f30562c
            float r1 = Fe.e.c(r1)
            r6.<init>(r8, r1)
            java.util.ArrayList r1 = r21.b()
            r7.<init>(r2, r4, r6, r1)
            r9.f29369a = r0
            r1 = r22
            r9.f29370b = r1
            r9.f29373e = r5
            com.moloco.sdk.internal.services.events.c r4 = r0.f29375b
            r8 = r19
            r5 = r12
            java.lang.Object r2 = r4.a(r5, r7, r8, r9)
            if (r2 != r3) goto L9c
            goto Lcc
        L9c:
            r4 = r0
        L9d:
            java.lang.String r2 = (java.lang.String) r2
            com.moloco.sdk.internal.MolocoLogger r12 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r5 = "Launching url: "
            java.lang.String r14 = R8.v.f(r5, r2)
            java.lang.String r13 = "ClickthroughService"
            r15 = 0
            r16 = 4
            r17 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r12, r13, r14, r15, r16, r17)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0 r4 = r4.f29374a
            if (r2 != 0) goto Lb7
            java.lang.String r2 = ""
        Lb7:
            boolean r2 = r4.a(r2)
            if (r2 == 0) goto Lcd
            if (r1 == 0) goto Lcd
            r2 = 0
            r9.f29369a = r2
            r9.f29370b = r2
            r9.f29373e = r11
            java.lang.Object r1 = r1.emit(r10, r9)
            if (r1 != r3) goto Lcd
        Lcc:
            return r3
        Lcd:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.B.a(java.lang.String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s, Hf.j0, lf.c):java.lang.Object");
    }
}
