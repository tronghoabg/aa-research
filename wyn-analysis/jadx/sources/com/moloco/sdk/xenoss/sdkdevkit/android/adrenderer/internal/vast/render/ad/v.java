package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class v extends x {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h f31660a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31661b;

    public v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar, boolean z2) {
        this.f31660a = hVar;
        this.f31661b = z2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x
    public final boolean a() {
        return this.f31661b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f31660a.equals(vVar.f31660a) && this.f31661b == vVar.f31661b;
    }

    public final int hashCode() {
        return (this.f31660a.hashCode() * 31) + (this.f31661b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Linear(viewModel=");
        sb2.append(this.f31660a);
        sb2.append(", isLastAdPart=");
        return AbstractC0279p0.p(sb2, this.f31661b, ')');
    }
}
