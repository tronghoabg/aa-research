package com.vungle.ads.internal;

import Va.M6;

/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33077a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33078b;

    public m0(int i5, int i10) {
        this.f33077a = i5;
        this.f33078b = i10;
    }

    public final int a() {
        return this.f33077a;
    }

    public final int b() {
        return this.f33078b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f33077a == m0Var.f33077a && this.f33078b == m0Var.f33078b;
    }

    public final int hashCode() {
        return this.f33078b + (this.f33077a * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Coordinate(x=");
        sbA.append(this.f33077a);
        sbA.append(", y=");
        return M6.r(sbA, this.f33078b, ')');
    }
}
