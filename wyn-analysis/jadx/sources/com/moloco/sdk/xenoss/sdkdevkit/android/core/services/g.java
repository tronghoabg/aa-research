package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f32420a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32421b;

    public g(float f10, float f11) {
        this.f32420a = f10;
        this.f32421b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f32420a, gVar.f32420a) == 0 && Float.compare(this.f32421b, gVar.f32421b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32421b) + (Float.floatToIntBits(this.f32420a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Position(topLeftXDp=");
        sb2.append(this.f32420a);
        sb2.append(", topLeftYDp=");
        return AbstractC0279p0.m(sb2, this.f32421b, ')');
    }
}
