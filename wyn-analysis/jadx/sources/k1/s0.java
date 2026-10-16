package k1;

import android.os.Build;
import android.view.View;
import b1.C1494c;
import j$.util.Objects;

/* loaded from: classes.dex */
public class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f38870b;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f38871a;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f38870b = (i5 >= 34 ? new k0() : i5 >= 30 ? new j0() : i5 >= 29 ? new i0() : new h0()).b().f38877a.a().f38877a.b().f38877a.c();
    }

    public s0(v0 v0Var) {
        this.f38871a = v0Var;
    }

    public v0 a() {
        return this.f38871a;
    }

    public v0 b() {
        return this.f38871a;
    }

    public v0 c() {
        return this.f38871a;
    }

    public C3121h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return o() == s0Var.o() && n() == s0Var.n() && Objects.equals(k(), s0Var.k()) && Objects.equals(i(), s0Var.i()) && Objects.equals(e(), s0Var.e());
    }

    public C1494c f(int i5) {
        return C1494c.f19120e;
    }

    public C1494c g(int i5) {
        if ((i5 & 8) == 0) {
            return C1494c.f19120e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public C1494c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public C1494c i() {
        return C1494c.f19120e;
    }

    public C1494c j() {
        return k();
    }

    public C1494c k() {
        return C1494c.f19120e;
    }

    public C1494c l() {
        return k();
    }

    public v0 m(int i5, int i10, int i11, int i12) {
        return f38870b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i5) {
        return true;
    }

    public void d(View view) {
    }

    public void q(C1494c[] c1494cArr) {
    }

    public void r(v0 v0Var) {
    }

    public void s(C1494c c1494c) {
    }

    public void t(int i5) {
    }
}
