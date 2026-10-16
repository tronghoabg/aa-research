package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class b extends Ba.c {

    /* renamed from: j, reason: collision with root package name */
    public final long f32404j;

    public b(long j8) {
        this.f32404j = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f32404j == ((b) obj).f32404j;
    }

    public final int hashCode() {
        long j8 = this.f32404j;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return AbstractC0213f.e(new StringBuilder("AppForeground(lastBgTimestamp="), this.f32404j, ')');
    }
}
