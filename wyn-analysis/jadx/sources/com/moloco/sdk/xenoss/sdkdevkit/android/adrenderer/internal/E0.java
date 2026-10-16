package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final Float f29924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29925b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29927d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29928e;

    public E0(Float f10, String str, String str2, int i5, int i10) {
        this.f29924a = f10;
        this.f29925b = str;
        this.f29926c = str2;
        this.f29927d = i5;
        this.f29928e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return AbstractC3340k.a(this.f29924a, e02.f29924a) && AbstractC3340k.a(this.f29925b, e02.f29925b) && AbstractC3340k.a(this.f29926c, e02.f29926c) && this.f29927d == e02.f29927d && this.f29928e == e02.f29928e;
    }

    public final int hashCode() {
        Float f10 = this.f29924a;
        return ((N0.a.c(N0.a.c((f10 == null ? 0 : f10.hashCode()) * 31, 31, this.f29925b), 31, this.f29926c) + this.f29927d) * 31) + this.f29928e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DECRating(value=");
        sb2.append(this.f29924a);
        sb2.append(", foregroundColor=");
        sb2.append(this.f29925b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f29926c);
        sb2.append(", size=");
        sb2.append(this.f29927d);
        sb2.append(", fontSize=");
        return M6.r(sb2, this.f29928e, ')');
    }
}
