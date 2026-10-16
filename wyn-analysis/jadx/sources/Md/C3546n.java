package md;

/* renamed from: md.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3546n {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC3545m f40701a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f40702b;

    public C3546n(EnumC3545m enumC3545m, k0 k0Var) {
        this.f40701a = enumC3545m;
        Fe.e.t(k0Var, "status is null");
        this.f40702b = k0Var;
    }

    public static C3546n a(EnumC3545m enumC3545m) {
        Fe.e.p("state is TRANSIENT_ERROR. Use forError() instead", enumC3545m != EnumC3545m.f40694c);
        return new C3546n(enumC3545m, k0.f40674e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3546n)) {
            return false;
        }
        C3546n c3546n = (C3546n) obj;
        return this.f40701a.equals(c3546n.f40701a) && this.f40702b.equals(c3546n.f40702b);
    }

    public final int hashCode() {
        return this.f40701a.hashCode() ^ this.f40702b.hashCode();
    }

    public final String toString() {
        k0 k0Var = this.f40702b;
        boolean zF = k0Var.f();
        EnumC3545m enumC3545m = this.f40701a;
        if (zF) {
            return enumC3545m.toString();
        }
        return enumC3545m + "(" + k0Var + ")";
    }
}
