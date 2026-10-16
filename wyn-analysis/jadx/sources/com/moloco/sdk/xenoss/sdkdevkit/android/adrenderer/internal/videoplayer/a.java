package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32208a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32209b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32210c;

    public a(boolean z2, boolean z10, boolean z11) {
        this.f32208a = z2;
        this.f32209b = z10;
        this.f32210c = z11;
    }

    public static a a(a aVar, boolean z2) {
        boolean z10 = aVar.f32208a;
        boolean z11 = aVar.f32210c;
        aVar.getClass();
        return new a(z10, z2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f32208a == aVar.f32208a && this.f32209b == aVar.f32209b && this.f32210c == aVar.f32210c;
    }

    public final int hashCode() {
        return ((((this.f32208a ? 1231 : 1237) * 31) + (this.f32209b ? 1231 : 1237)) * 31) + (this.f32210c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlayingState(isPlaying=");
        sb2.append(this.f32208a);
        sb2.append(", isVisible=");
        sb2.append(this.f32209b);
        sb2.append(", hasMore=");
        return AbstractC0279p0.p(sb2, this.f32210c, ')');
    }
}
