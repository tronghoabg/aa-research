package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class w extends x {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t f31662a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31663b;

    public w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t tVar, boolean z2) {
        this.f31662a = tVar;
        this.f31663b = z2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x
    public final boolean a() {
        return this.f31663b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC3340k.a(this.f31662a, wVar.f31662a) && this.f31663b == wVar.f31663b;
    }

    public final int hashCode() {
        return (this.f31662a.hashCode() * 31) + (this.f31663b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mraid(viewModel=");
        sb2.append(this.f31662a);
        sb2.append(", isLastAdPart=");
        return AbstractC0279p0.p(sb2, this.f31663b, ')');
    }
}
