package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class x extends y {

    /* renamed from: a, reason: collision with root package name */
    public final long f31527a;

    public x(long j8) {
        this.f31527a = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f31527a == ((x) obj).f31527a;
    }

    public final int hashCode() {
        long j8 = this.f31527a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return AbstractC0213f.e(new StringBuilder("Time(millis="), this.f31527a, ')');
    }
}
