package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f29897a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29898b;

    public B0(Integer num, List list) {
        this.f29897a = num;
        this.f29898b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return AbstractC3340k.a(this.f29897a, b02.f29897a) && this.f29898b.equals(b02.f29898b);
    }

    public final int hashCode() {
        Integer num = this.f29897a;
        return this.f29898b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "DECBorder(borderWidth=" + this.f29897a + ", gradient=" + this.f29898b + ')';
    }
}
