package E;

import N.C0718d;
import N.Y;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import t0.C4070r;

/* loaded from: classes.dex */
public final class P implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2711a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f2712b;

    public P(C c10, String str) {
        this.f2711a = str;
        this.f2712b = C0718d.G(c10, N.P.f7730f);
    }

    @Override // E.Q
    public final int a(C4070r density, L0.i layoutDirection) {
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        return e().f2670c;
    }

    @Override // E.Q
    public final int b(C4070r density, L0.i layoutDirection) {
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        return e().f2668a;
    }

    @Override // E.Q
    public final int c(C4070r density) {
        AbstractC3340k.e(density, "density");
        return e().f2671d;
    }

    @Override // E.Q
    public final int d(C4070r density) {
        AbstractC3340k.e(density, "density");
        return e().f2669b;
    }

    public final C e() {
        return (C) this.f2712b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P) {
            return AbstractC3340k.a(e(), ((P) obj).e());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2711a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2711a);
        sb2.append("(left=");
        sb2.append(e().f2668a);
        sb2.append(", top=");
        sb2.append(e().f2669b);
        sb2.append(", right=");
        sb2.append(e().f2670c);
        sb2.append(", bottom=");
        return M6.r(sb2, e().f2671d, ')');
    }
}
