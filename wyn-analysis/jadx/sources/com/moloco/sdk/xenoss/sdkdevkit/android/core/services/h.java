package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f32422a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32423b;

    public h(float f10, float f11) {
        this.f32422a = f10;
        this.f32423b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f32422a, hVar.f32422a) == 0 && Float.compare(this.f32423b, hVar.f32423b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32423b) + (Float.floatToIntBits(this.f32422a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Size(widthDp=");
        sb2.append(this.f32422a);
        sb2.append(", heightDp=");
        return AbstractC0279p0.m(sb2, this.f32423b, ')');
    }
}
