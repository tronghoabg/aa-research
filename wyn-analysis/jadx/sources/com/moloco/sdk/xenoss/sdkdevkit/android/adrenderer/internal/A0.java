package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f29892a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29893b;

    /* renamed from: c, reason: collision with root package name */
    public final B0 f29894c;

    public A0(Integer num, String str, B0 b02) {
        this.f29892a = num;
        this.f29893b = str;
        this.f29894c = b02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return AbstractC3340k.a(this.f29892a, a02.f29892a) && AbstractC3340k.a(this.f29893b, a02.f29893b) && AbstractC3340k.a(this.f29894c, a02.f29894c);
    }

    public final int hashCode() {
        Integer num = this.f29892a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f29893b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        B0 b02 = this.f29894c;
        return iHashCode2 + (b02 != null ? b02.hashCode() : 0);
    }

    public final String toString() {
        return "DECAppIcon(size=" + this.f29892a + ", appIconUri=" + this.f29893b + ", border=" + this.f29894c + ')';
    }
}
