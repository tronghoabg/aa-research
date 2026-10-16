package k1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import b1.C1494c;
import j$.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f38876b;

    /* renamed from: a, reason: collision with root package name */
    public final s0 f38877a;

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            f38876b = r0.f38869s;
        } else if (i5 >= 30) {
            f38876b = q0.f38868r;
        } else {
            f38876b = s0.f38870b;
        }
    }

    public v0(WindowInsets windowInsets) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            this.f38877a = new r0(this, windowInsets);
            return;
        }
        if (i5 >= 30) {
            this.f38877a = new q0(this, windowInsets);
            return;
        }
        if (i5 >= 29) {
            this.f38877a = new p0(this, windowInsets);
        } else if (i5 >= 28) {
            this.f38877a = new o0(this, windowInsets);
        } else {
            this.f38877a = new n0(this, windowInsets);
        }
    }

    public static C1494c e(C1494c c1494c, int i5, int i10, int i11, int i12) {
        int iMax = Math.max(0, c1494c.f19121a - i5);
        int iMax2 = Math.max(0, c1494c.f19122b - i10);
        int iMax3 = Math.max(0, c1494c.f19123c - i11);
        int iMax4 = Math.max(0, c1494c.f19124d - i12);
        return (iMax == i5 && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? c1494c : C1494c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static v0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        v0 v0Var = new v0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = S.f38779a;
            v0 v0VarA = K.a(view);
            s0 s0Var = v0Var.f38877a;
            s0Var.r(v0VarA);
            s0Var.d(view.getRootView());
            s0Var.t(view.getWindowSystemUiVisibility());
        }
        return v0Var;
    }

    public final int a() {
        return this.f38877a.k().f19124d;
    }

    public final int b() {
        return this.f38877a.k().f19121a;
    }

    public final int c() {
        return this.f38877a.k().f19123c;
    }

    public final int d() {
        return this.f38877a.k().f19122b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        return Objects.equals(this.f38877a, ((v0) obj).f38877a);
    }

    public final WindowInsets f() {
        s0 s0Var = this.f38877a;
        if (s0Var instanceof m0) {
            return ((m0) s0Var).f38853c;
        }
        return null;
    }

    public final int hashCode() {
        s0 s0Var = this.f38877a;
        if (s0Var == null) {
            return 0;
        }
        return s0Var.hashCode();
    }

    public v0() {
        this.f38877a = new s0(this);
    }
}
