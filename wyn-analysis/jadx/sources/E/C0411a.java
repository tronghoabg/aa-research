package E;

import N.C0718d;
import N.Y;
import Va.M6;
import b1.C1494c;
import k1.s0;
import k1.v0;
import kotlin.jvm.internal.AbstractC3340k;
import t0.C4070r;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411a implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final int f2733a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2734b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f2735c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f2736d;

    public C0411a(int i5, String str) {
        this.f2733a = i5;
        this.f2734b = str;
        C1494c c1494c = C1494c.f19120e;
        N.P p10 = N.P.f7730f;
        this.f2735c = C0718d.G(c1494c, p10);
        this.f2736d = C0718d.G(Boolean.TRUE, p10);
    }

    @Override // E.Q
    public final int a(C4070r density, L0.i layoutDirection) {
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        return e().f19123c;
    }

    @Override // E.Q
    public final int b(C4070r density, L0.i layoutDirection) {
        AbstractC3340k.e(density, "density");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        return e().f19121a;
    }

    @Override // E.Q
    public final int c(C4070r density) {
        AbstractC3340k.e(density, "density");
        return e().f19124d;
    }

    @Override // E.Q
    public final int d(C4070r density) {
        AbstractC3340k.e(density, "density");
        return e().f19122b;
    }

    public final C1494c e() {
        return (C1494c) this.f2735c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0411a) {
            return this.f2733a == ((C0411a) obj).f2733a;
        }
        return false;
    }

    public final void f(v0 windowInsetsCompat, int i5) {
        AbstractC3340k.e(windowInsetsCompat, "windowInsetsCompat");
        int i10 = this.f2733a;
        if (i5 == 0 || (i5 & i10) != 0) {
            s0 s0Var = windowInsetsCompat.f38877a;
            C1494c c1494cF = s0Var.f(i10);
            AbstractC3340k.e(c1494cF, "<set-?>");
            this.f2735c.setValue(c1494cF);
            this.f2736d.setValue(Boolean.valueOf(s0Var.p(i10)));
        }
    }

    public final int hashCode() {
        return this.f2733a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2734b);
        sb2.append('(');
        sb2.append(e().f19121a);
        sb2.append(", ");
        sb2.append(e().f19122b);
        sb2.append(", ");
        sb2.append(e().f19123c);
        sb2.append(", ");
        return M6.r(sb2, e().f19124d, ')');
    }
}
