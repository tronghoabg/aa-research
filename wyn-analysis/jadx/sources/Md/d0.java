package md;

import A7.C0237b0;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f40632a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40633b;

    public d0(Object obj) {
        this.f40633b = obj;
        this.f40632a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (Fe.b.v(this.f40632a, d0Var.f40632a) && Fe.b.v(this.f40633b, d0Var.f40633b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40632a, this.f40633b});
    }

    public final String toString() {
        Object obj = this.f40633b;
        if (obj != null) {
            C0237b0 c0237b0S = Ba.c.S(this);
            c0237b0S.f(obj, "config");
            return c0237b0S.toString();
        }
        C0237b0 c0237b0S2 = Ba.c.S(this);
        c0237b0S2.f(this.f40632a, "error");
        return c0237b0S2.toString();
    }

    public d0(k0 k0Var) {
        this.f40633b = null;
        Fe.e.t(k0Var, "status");
        this.f40632a = k0Var;
        Fe.e.r(!k0Var.f(), "cannot use OK status: %s", k0Var);
    }
}
