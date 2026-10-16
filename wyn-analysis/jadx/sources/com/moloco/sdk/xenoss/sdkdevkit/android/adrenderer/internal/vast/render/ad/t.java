package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class t extends x {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i f31656a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31657b;

    public t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar, boolean z2) {
        this.f31656a = iVar;
        this.f31657b = z2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x
    public final boolean a() {
        return this.f31657b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f31656a.equals(tVar.f31656a) && this.f31657b == tVar.f31657b;
    }

    public final int hashCode() {
        return (this.f31656a.hashCode() * 31) + (this.f31657b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion(viewModel=");
        sb2.append(this.f31656a);
        sb2.append(", isLastAdPart=");
        return AbstractC0279p0.p(sb2, this.f31657b, ')');
    }
}
