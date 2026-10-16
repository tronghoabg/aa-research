package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes4.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public final int f31962a;

    public d(int i5) {
        this.f31962a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f31962a == ((d) obj).f31962a;
    }

    public final int hashCode() {
        return this.f31962a;
    }

    public final String toString() {
        return "Countdown(seconds=" + ((Object) String.valueOf(this.f31962a & 4294967295L)) + ')';
    }
}
