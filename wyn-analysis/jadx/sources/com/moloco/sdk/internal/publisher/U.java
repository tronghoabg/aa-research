package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class U implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f28946a;

    public U(V v2) {
        this.f28946a = v2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void a() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void b() {
        V v2 = this.f28946a;
        Y2.B b5 = v2.f28967v;
        if (b5 != null) {
            MolocoAd molocoAd = MolocoAdKt.createAdInfo$default(v2.f28950d, null, null, 6, null);
            b5.getClass();
            AbstractC3340k.e(molocoAd, "molocoAd");
            ((C1913b) b5.f16383b).c(molocoAd);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public final void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
        AbstractC3340k.e(internalShowError, "internalShowError");
        V v2 = this.f28946a;
        v2.b(com.moloco.sdk.internal.s.a(v2.f28950d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, ff.w.f35433a));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public final void a(boolean z2) {
    }
}
