package com.vungle.ads.internal;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public m0 f33034a;

    /* renamed from: b, reason: collision with root package name */
    public m0 f33035b;

    public l0(m0 downCoordinate, m0 upCoordinate) {
        AbstractC3340k.e(downCoordinate, "downCoordinate");
        AbstractC3340k.e(upCoordinate, "upCoordinate");
        this.f33034a = downCoordinate;
        this.f33035b = upCoordinate;
    }

    public final m0 a() {
        return this.f33034a;
    }

    public final m0 b() {
        return this.f33035b;
    }

    public final boolean c() {
        m0 m0Var = this.f33034a;
        if (m0Var.f33077a == Integer.MIN_VALUE || m0Var.f33078b == Integer.MIN_VALUE) {
            return false;
        }
        m0 m0Var2 = this.f33035b;
        return (m0Var2.f33077a == Integer.MIN_VALUE || m0Var2.f33078b == Integer.MIN_VALUE) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return AbstractC3340k.a(this.f33034a, l0Var.f33034a) && AbstractC3340k.a(this.f33035b, l0Var.f33035b);
    }

    public final int hashCode() {
        return this.f33035b.hashCode() + (this.f33034a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("ClickCoordinate(downCoordinate=");
        sbA.append(this.f33034a);
        sbA.append(", upCoordinate=");
        sbA.append(this.f33035b);
        sbA.append(')');
        return sbA.toString();
    }

    public final void a(m0 m0Var) {
        AbstractC3340k.e(m0Var, "<set-?>");
        this.f33034a = m0Var;
    }

    public final void b(m0 m0Var) {
        AbstractC3340k.e(m0Var, "<set-?>");
        this.f33035b = m0Var;
    }
}
