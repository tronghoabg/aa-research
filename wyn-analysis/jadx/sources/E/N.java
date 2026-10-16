package E;

import kotlin.jvm.internal.AbstractC3340k;
import t0.C4070r;

/* loaded from: classes.dex */
public final class N implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final Q f2707a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f2708b;

    public N(Q q4, Q second) {
        AbstractC3340k.e(second, "second");
        this.f2707a = q4;
        this.f2708b = second;
    }

    @Override // E.Q
    public final int a(C4070r density, L0.i layoutDirection) {
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        return Math.max(this.f2707a.a(density, layoutDirection), this.f2708b.a(density, layoutDirection));
    }

    @Override // E.Q
    public final int b(C4070r density, L0.i layoutDirection) {
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        return Math.max(this.f2707a.b(density, layoutDirection), this.f2708b.b(density, layoutDirection));
    }

    @Override // E.Q
    public final int c(C4070r density) {
        AbstractC3340k.e(density, "density");
        return Math.max(this.f2707a.c(density), this.f2708b.c(density));
    }

    @Override // E.Q
    public final int d(C4070r density) {
        AbstractC3340k.e(density, "density");
        return Math.max(this.f2707a.d(density), this.f2708b.d(density));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return AbstractC3340k.a(n10.f2707a, this.f2707a) && AbstractC3340k.a(n10.f2708b, this.f2708b);
    }

    public final int hashCode() {
        return (this.f2708b.hashCode() * 31) + this.f2707a.hashCode();
    }

    public final String toString() {
        return "(" + this.f2707a + " ∪ " + this.f2708b + ')';
    }
}
