package md;

import A7.C0237b0;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class K {

    /* renamed from: e, reason: collision with root package name */
    public static final K f40583e = new K(null, null, k0.f40674e, false);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3537e f40584a;

    /* renamed from: b, reason: collision with root package name */
    public final vd.p f40585b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f40586c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f40587d;

    public K(AbstractC3537e abstractC3537e, vd.p pVar, k0 k0Var, boolean z2) {
        this.f40584a = abstractC3537e;
        this.f40585b = pVar;
        Fe.e.t(k0Var, "status");
        this.f40586c = k0Var;
        this.f40587d = z2;
    }

    public static K a(k0 k0Var) {
        Fe.e.p("error status shouldn't be OK", !k0Var.f());
        return new K(null, null, k0Var, false);
    }

    public static K b(AbstractC3537e abstractC3537e, vd.p pVar) {
        Fe.e.t(abstractC3537e, "subchannel");
        return new K(abstractC3537e, pVar, k0.f40674e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K)) {
            return false;
        }
        K k = (K) obj;
        return Fe.b.v(this.f40584a, k.f40584a) && Fe.b.v(this.f40586c, k.f40586c) && Fe.b.v(this.f40585b, k.f40585b) && this.f40587d == k.f40587d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40584a, this.f40586c, this.f40585b, Boolean.valueOf(this.f40587d)});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f40584a, "subchannel");
        c0237b0S.f(this.f40585b, "streamTracerFactory");
        c0237b0S.f(this.f40586c, "status");
        c0237b0S.g("drop", this.f40587d);
        return c0237b0S.toString();
    }
}
