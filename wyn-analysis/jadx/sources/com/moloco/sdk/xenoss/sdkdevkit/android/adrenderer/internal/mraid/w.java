package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class w extends AbstractC2021p {
    public final tf.a k;

    /* renamed from: l, reason: collision with root package name */
    public final tf.a f30462l;

    public w(Context context, String adm, tf.a aVar, tf.a aVar2, tf.a onShowListenerClick, tf.l onError, G0 externalLinkHandler, K8.H h10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, int i5) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar2 = (i5 & 512) != 0 ? null : kVar;
        new LinkedHashMap();
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(adm, "adm");
        AbstractC3340k.e(onShowListenerClick, "onShowListenerClick");
        AbstractC3340k.e(onError, "onError");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        super(context, adm, F.f30346b, onShowListenerClick, new Ff.d(4, onShowListenerClick, kVar2), onError, externalLinkHandler, true, h10);
        this.k = aVar;
        this.f30462l = aVar2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.AbstractC2021p
    public final void a() {
        this.k.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.AbstractC2021p
    public final void d() {
        if (this.f30435i == G.f30351c) {
            c(G.f30350b);
        }
        this.f30462l.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(lf.AbstractC3464c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v) r0
            int r1 = r0.f30461d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30461d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30459b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f30461d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w r0 = r0.f30458a
            Fe.e.U(r5)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Fe.e.U(r5)
            r0.f30458a = r4
            r0.f30461d = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r4
        L40:
            boolean r5 = r5 instanceof com.moloco.sdk.internal.z
            if (r5 == 0) goto L4b
            K8.H r5 = r0.f30433g
            java.lang.Object r5 = r5.f6587f
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O) r5
            return r5
        L4b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.e(lf.c):java.lang.Object");
    }
}
