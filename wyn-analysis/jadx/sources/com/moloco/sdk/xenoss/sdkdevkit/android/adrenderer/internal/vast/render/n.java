package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class n extends p {

    /* renamed from: a, reason: collision with root package name */
    public final long f32074a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32075b;

    public n(long j8, long j10) {
        this.f32074a = j8;
        this.f32075b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f32074a == nVar.f32074a && this.f32075b == nVar.f32075b;
    }

    public final int hashCode() {
        long j8 = this.f32074a;
        int i5 = ((int) (j8 ^ (j8 >>> 32))) * 31;
        long j10 = this.f32075b;
        return i5 + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Position(currentPositionMillis=");
        sb2.append(this.f32074a);
        sb2.append(", totalDurationMillis=");
        return AbstractC0213f.e(sb2, this.f32075b, ')');
    }
}
