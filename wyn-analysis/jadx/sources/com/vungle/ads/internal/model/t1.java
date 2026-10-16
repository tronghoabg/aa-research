package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* renamed from: a, reason: collision with root package name */
    public final b3 f33320a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f33321b;

    /* renamed from: c, reason: collision with root package name */
    public final s1 f33322c;

    /* renamed from: d, reason: collision with root package name */
    public m1 f33323d;

    /* renamed from: e, reason: collision with root package name */
    public p1 f33324e;

    public /* synthetic */ t1(int i5, b3 b3Var, l0 l0Var, s1 s1Var, m1 m1Var, p1 p1Var) {
        if (1 != (i5 & 1)) {
            AbstractC1240b0.k(i5, 1, q0.f33296a.getDescriptor());
            throw null;
        }
        this.f33320a = b3Var;
        if ((i5 & 2) == 0) {
            this.f33321b = null;
        } else {
            this.f33321b = l0Var;
        }
        if ((i5 & 4) == 0) {
            this.f33322c = null;
        } else {
            this.f33322c = s1Var;
        }
        if ((i5 & 8) == 0) {
            this.f33323d = null;
        } else {
            this.f33323d = m1Var;
        }
        if ((i5 & 16) == 0) {
            this.f33324e = null;
        } else {
            this.f33324e = p1Var;
        }
    }

    public static final void a(t1 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.f(serialDesc, 0, w2.f33354a, self.f33320a);
        if (output.A(serialDesc, 1) || self.f33321b != null) {
            output.i(serialDesc, 1, j0.f33232a, self.f33321b);
        }
        if (output.A(serialDesc, 2) || self.f33322c != null) {
            output.i(serialDesc, 2, q1.f33298a, self.f33322c);
        }
        if (output.A(serialDesc, 3) || self.f33323d != null) {
            output.i(serialDesc, 3, k1.f33237a, self.f33323d);
        }
        if (!output.A(serialDesc, 4) && self.f33324e == null) {
            return;
        }
        output.i(serialDesc, 4, n1.f33264a, self.f33324e);
    }

    public final m1 b() {
        return this.f33323d;
    }

    public final p1 c() {
        return this.f33324e;
    }

    public final s1 d() {
        return this.f33322c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return AbstractC3340k.a(this.f33320a, t1Var.f33320a) && AbstractC3340k.a(this.f33321b, t1Var.f33321b) && AbstractC3340k.a(this.f33322c, t1Var.f33322c) && AbstractC3340k.a(this.f33323d, t1Var.f33323d) && AbstractC3340k.a(this.f33324e, t1Var.f33324e);
    }

    public final int hashCode() {
        int iHashCode = this.f33320a.hashCode() * 31;
        l0 l0Var = this.f33321b;
        int iHashCode2 = (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        s1 s1Var = this.f33322c;
        int iHashCode3 = (iHashCode2 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        m1 m1Var = this.f33323d;
        int iHashCode4 = (iHashCode3 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        p1 p1Var = this.f33324e;
        return iHashCode4 + (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("CommonRequestBody(device=");
        sbA.append(this.f33320a);
        sbA.append(", app=");
        sbA.append(this.f33321b);
        sbA.append(", user=");
        sbA.append(this.f33322c);
        sbA.append(", ext=");
        sbA.append(this.f33323d);
        sbA.append(", request=");
        sbA.append(this.f33324e);
        sbA.append(')');
        return sbA.toString();
    }

    public t1(b3 device, l0 l0Var, s1 s1Var, m1 m1Var, p1 p1Var) {
        AbstractC3340k.e(device, "device");
        this.f33320a = device;
        this.f33321b = l0Var;
        this.f33322c = s1Var;
        this.f33323d = m1Var;
        this.f33324e = p1Var;
    }

    public final b3 a() {
        return this.f33320a;
    }

    public final void a(m1 m1Var) {
        this.f33323d = m1Var;
    }

    public final void a(p1 p1Var) {
        this.f33324e = p1Var;
    }

    public /* synthetic */ t1(b3 b3Var, l0 l0Var, s1 s1Var) {
        this(b3Var, l0Var, s1Var, null, null);
    }
}
