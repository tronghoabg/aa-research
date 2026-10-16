package com.moloco.sdk.common_adapter_internal;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f28476a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28477b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28478c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28479d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28480e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28481f;

    public a(int i5, int i10, float f10, float f11, int i11, float f12) {
        this.f28476a = i5;
        this.f28477b = i10;
        this.f28478c = f10;
        this.f28479d = f11;
        this.f28480e = i11;
        this.f28481f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28476a == aVar.f28476a && this.f28477b == aVar.f28477b && Float.compare(this.f28478c, aVar.f28478c) == 0 && Float.compare(this.f28479d, aVar.f28479d) == 0 && this.f28480e == aVar.f28480e && Float.compare(this.f28481f, aVar.f28481f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f28481f) + ((AbstractC0213f.c(this.f28479d, AbstractC0213f.c(this.f28478c, ((this.f28476a * 31) + this.f28477b) * 31, 31), 31) + this.f28480e) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenData(widthPx=");
        sb2.append(this.f28476a);
        sb2.append(", heightPx=");
        sb2.append(this.f28477b);
        sb2.append(", widthDp=");
        sb2.append(this.f28478c);
        sb2.append(", heightDp=");
        sb2.append(this.f28479d);
        sb2.append(", dpi=");
        sb2.append(this.f28480e);
        sb2.append(", pxRatio=");
        return AbstractC0279p0.m(sb2, this.f28481f, ')');
    }
}
