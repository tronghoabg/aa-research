package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class u extends x {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c f31658a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31659b;

    public u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c cVar, boolean z2) {
        this.f31658a = cVar;
        this.f31659b = z2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x
    public final boolean a() {
        return this.f31659b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f31658a.equals(uVar.f31658a) && this.f31659b == uVar.f31659b;
    }

    public final int hashCode() {
        return (this.f31658a.hashCode() * 31) + (this.f31659b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DEC(viewModel=");
        sb2.append(this.f31658a);
        sb2.append(", isLastAdPart=");
        return AbstractC0279p0.p(sb2, this.f31659b, ')');
    }
}
