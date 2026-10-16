package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final long f32076a;

    public o(long j8) {
        this.f32076a = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f32076a == ((o) obj).f32076a;
    }

    public final int hashCode() {
        long j8 = this.f32076a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return AbstractC0213f.e(new StringBuilder("Preparing(totalDurationMillis="), this.f32076a, ')');
    }
}
