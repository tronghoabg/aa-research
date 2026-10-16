package k1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import b1.C1494c;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class m0 extends s0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f38849i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f38850j;
    public static Class k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f38851l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f38852m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f38853c;

    /* renamed from: d, reason: collision with root package name */
    public C1494c[] f38854d;

    /* renamed from: e, reason: collision with root package name */
    public C1494c f38855e;

    /* renamed from: f, reason: collision with root package name */
    public v0 f38856f;

    /* renamed from: g, reason: collision with root package name */
    public C1494c f38857g;

    /* renamed from: h, reason: collision with root package name */
    public int f38858h;

    public m0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var);
        this.f38855e = null;
        this.f38853c = windowInsets;
    }

    public static boolean B(int i5, int i10) {
        return (i5 & 6) == (i10 & 6);
    }

    private C1494c u(int i5, boolean z2) {
        C1494c c1494cA = C1494c.f19120e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i5 & i10) != 0) {
                c1494cA = C1494c.a(c1494cA, v(i10, z2));
            }
        }
        return c1494cA;
    }

    private C1494c w() {
        v0 v0Var = this.f38856f;
        return v0Var != null ? v0Var.f38877a.i() : C1494c.f19120e;
    }

    private C1494c x(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f38849i) {
            z();
        }
        Method method = f38850j;
        if (method != null && k != null && f38851l != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f38851l.get(f38852m.get(objInvoke));
                if (rect != null) {
                    return C1494c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    private static void z() throws ClassNotFoundException, SecurityException {
        try {
            f38850j = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            f38851l = cls.getDeclaredField("mVisibleInsets");
            f38852m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f38851l.setAccessible(true);
            f38852m.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f38849i = true;
    }

    public void A(C1494c c1494c) {
        this.f38857g = c1494c;
    }

    @Override // k1.s0
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C1494c c1494cX = x(view);
        if (c1494cX == null) {
            c1494cX = C1494c.f19120e;
        }
        A(c1494cX);
    }

    @Override // k1.s0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Objects.equals(this.f38857g, m0Var.f38857g) && B(this.f38858h, m0Var.f38858h);
    }

    @Override // k1.s0
    public C1494c f(int i5) {
        return u(i5, false);
    }

    @Override // k1.s0
    public C1494c g(int i5) {
        return u(i5, true);
    }

    @Override // k1.s0
    public final C1494c k() {
        if (this.f38855e == null) {
            WindowInsets windowInsets = this.f38853c;
            this.f38855e = C1494c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f38855e;
    }

    @Override // k1.s0
    public v0 m(int i5, int i10, int i11, int i12) {
        v0 v0VarG = v0.g(null, this.f38853c);
        int i13 = Build.VERSION.SDK_INT;
        l0 k0Var = i13 >= 34 ? new k0(v0VarG) : i13 >= 30 ? new j0(v0VarG) : i13 >= 29 ? new i0(v0VarG) : new h0(v0VarG);
        k0Var.g(v0.e(k(), i5, i10, i11, i12));
        k0Var.e(v0.e(i(), i5, i10, i11, i12));
        return k0Var.b();
    }

    @Override // k1.s0
    public boolean o() {
        return this.f38853c.isRound();
    }

    @Override // k1.s0
    public boolean p(int i5) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i5 & i10) != 0 && !y(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // k1.s0
    public void q(C1494c[] c1494cArr) {
        this.f38854d = c1494cArr;
    }

    @Override // k1.s0
    public void r(v0 v0Var) {
        this.f38856f = v0Var;
    }

    @Override // k1.s0
    public void t(int i5) {
        this.f38858h = i5;
    }

    public C1494c v(int i5, boolean z2) {
        C1494c c1494cI;
        int i10;
        C1494c c1494c = C1494c.f19120e;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 8) {
                    C1494c[] c1494cArr = this.f38854d;
                    c1494cI = c1494cArr != null ? c1494cArr[android.support.v4.media.session.b.i0(8)] : null;
                    if (c1494cI != null) {
                        return c1494cI;
                    }
                    C1494c c1494cK = k();
                    C1494c c1494cW = w();
                    int i11 = c1494cK.f19124d;
                    if (i11 > c1494cW.f19124d) {
                        return C1494c.b(0, 0, 0, i11);
                    }
                    C1494c c1494c2 = this.f38857g;
                    if (c1494c2 != null && !c1494c2.equals(c1494c) && (i10 = this.f38857g.f19124d) > c1494cW.f19124d) {
                        return C1494c.b(0, 0, 0, i10);
                    }
                } else {
                    if (i5 == 16) {
                        return j();
                    }
                    if (i5 == 32) {
                        return h();
                    }
                    if (i5 == 64) {
                        return l();
                    }
                    if (i5 == 128) {
                        v0 v0Var = this.f38856f;
                        C3121h c3121hE = v0Var != null ? v0Var.f38877a.e() : e();
                        if (c3121hE != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return C1494c.b(i12 >= 28 ? Y0.c.i(c3121hE.f38831a) : 0, i12 >= 28 ? Y0.c.k(c3121hE.f38831a) : 0, i12 >= 28 ? Y0.c.j(c3121hE.f38831a) : 0, i12 >= 28 ? Y0.c.h(c3121hE.f38831a) : 0);
                        }
                    }
                }
            } else {
                if (z2) {
                    C1494c c1494cW2 = w();
                    C1494c c1494cI2 = i();
                    return C1494c.b(Math.max(c1494cW2.f19121a, c1494cI2.f19121a), 0, Math.max(c1494cW2.f19123c, c1494cI2.f19123c), Math.max(c1494cW2.f19124d, c1494cI2.f19124d));
                }
                if ((this.f38858h & 2) == 0) {
                    C1494c c1494cK2 = k();
                    v0 v0Var2 = this.f38856f;
                    c1494cI = v0Var2 != null ? v0Var2.f38877a.i() : null;
                    int iMin = c1494cK2.f19124d;
                    if (c1494cI != null) {
                        iMin = Math.min(iMin, c1494cI.f19124d);
                    }
                    return C1494c.b(c1494cK2.f19121a, 0, c1494cK2.f19123c, iMin);
                }
            }
        } else {
            if (z2) {
                return C1494c.b(0, Math.max(w().f19122b, k().f19122b), 0, 0);
            }
            if ((this.f38858h & 4) == 0) {
                return C1494c.b(0, k().f19122b, 0, 0);
            }
        }
        return c1494c;
    }

    public boolean y(int i5) {
        if (i5 != 1 && i5 != 2) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 8 && i5 != 128) {
                return true;
            }
        }
        return !v(i5, false).equals(C1494c.f19120e);
    }
}
