package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import Va.Za;

/* loaded from: classes4.dex */
public final class t implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n {

    /* renamed from: a, reason: collision with root package name */
    public final s f32081a;

    /* renamed from: b, reason: collision with root package name */
    public final Za f32082b;

    public t(s sVar, Za za2) {
        this.f32081a = sVar;
        this.f32082b = za2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        Za za2 = this.f32082b;
        if (za2 != null) {
            za2.destroy();
        }
    }
}
