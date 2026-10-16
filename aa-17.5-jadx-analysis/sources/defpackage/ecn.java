package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class ecn extends ecv {
    private static boolean g = false;
    private static Method h;
    private static Class k;
    private static Field l;
    private static Field m;
    final WindowInsets a;
    dve b;
    int c;
    eab d;
    int e;
    int f;
    private dve[] n;
    private dve o;
    private ecy p;
    private Rect[][] q;
    private Rect[][] r;

    public ecn(ecy ecyVar, WindowInsets windowInsets) {
        super(ecyVar);
        this.o = null;
        this.q = new Rect[10][];
        this.r = new Rect[10][];
        this.a = windowInsets;
    }

    private dve G(int i, boolean z) {
        dve dveVarB = dve.a;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                dveVarB = dve.b(dveVarB, b(i2, z));
            }
        }
        return dveVarB;
    }

    private dve H() {
        ecy ecyVar = this.p;
        return ecyVar != null ? ecyVar.h() : dve.a;
    }

    private dve I(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!g) {
            L();
        }
        Method method = h;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return dve.d(rect);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        return null;
    }

    private eab J(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.j.b.s()) {
            int i = point.x;
            int i2 = point.y;
            return new eab(eab.a(i, i2, true, 0, 0, 0, 0), i, i2);
        }
        eam eamVarI = ebe.i(display, 0);
        eam eamVarI2 = ebe.i(display, 1);
        eam eamVarI3 = ebe.i(display, 2);
        eam eamVarI4 = ebe.i(display, 3);
        int i3 = point.x;
        int i4 = point.y;
        return new eab(eab.a(i3, i4, false, eamVarI != null ? eamVarI.a : 0, eamVarI2 != null ? eamVarI2.a : 0, eamVarI3 != null ? eamVarI3.a : 0, eamVarI4 != null ? eamVarI4.a : 0), i3, i4);
    }

    private static List<Rect> K(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[ebi.g(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    int length = rectArr3.length;
                    int length2 = rectArr2.length;
                    Rect[] rectArr4 = new Rect[length + length2];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, length);
                    System.arraycopy(rectArr2, 0, rectArr4, length, length2);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private static void L() throws ClassNotFoundException {
        try {
            h = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
        }
        g = true;
    }

    private Rect[] M(dve dveVar) {
        ArrayList arrayList = new ArrayList();
        int i = dveVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, i, this.e));
        }
        int i2 = dveVar.c;
        if (i2 != 0) {
            arrayList.add(new Rect(0, 0, this.f, i2));
        }
        int i3 = dveVar.d;
        if (i3 != 0) {
            int i4 = this.f;
            arrayList.add(new Rect(i4 - i3, 0, i4, this.e));
        }
        int i5 = dveVar.e;
        if (i5 != 0) {
            int i6 = this.e;
            arrayList.add(new Rect(0, i6 - i5, this.f, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    static boolean v(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.ecv
    public dve a(int i) {
        return G(i, false);
    }

    protected dve b(int i, boolean z) {
        dve dveVarH;
        dve dveVar;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    dve[] dveVarArr = this.n;
                    dveVarH = dveVarArr != null ? dveVarArr[ebi.g(8)] : null;
                    if (dveVarH != null) {
                        return dveVarH;
                    }
                    dve dveVarD = d();
                    dve dveVarH2 = H();
                    int i2 = dveVarD.e;
                    int i3 = dveVarH2.e;
                    if (i2 > i3 || ((dveVar = this.b) != null && !dveVar.equals(dve.a) && (i2 = this.b.e) > i3)) {
                        return dve.e(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return E();
                    }
                    if (i == 32) {
                        return D();
                    }
                    if (i == 64) {
                        return F();
                    }
                    if (i == 128) {
                        ecy ecyVar = this.p;
                        dzz dzzVarK = ecyVar != null ? ecyVar.k() : B();
                        if (dzzVarK != null) {
                            DisplayCutout displayCutout = dzzVarK.a;
                            return dve.e(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    dve dveVarH3 = H();
                    dve dveVarW = w();
                    return dve.e(Math.max(dveVarH3.b, dveVarW.b), 0, Math.max(dveVarH3.d, dveVarW.d), Math.max(dveVarH3.e, dveVarW.e));
                }
                if ((this.c & 2) == 0) {
                    dve dveVarD2 = d();
                    ecy ecyVar2 = this.p;
                    dveVarH = ecyVar2 != null ? ecyVar2.h() : null;
                    int iMin = dveVarD2.e;
                    if (dveVarH != null) {
                        iMin = Math.min(iMin, dveVarH.e);
                    }
                    return dve.e(dveVarD2.b, 0, dveVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return dve.e(0, Math.max(H().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return dve.e(0, d().c, 0, 0);
            }
        }
        return dve.a;
    }

    @Override // defpackage.ecv
    public dve c(int i) {
        return G(i, true);
    }

    @Override // defpackage.ecv
    public final dve d() {
        dve dveVar = this.o;
        if (dveVar != null) {
            return dveVar;
        }
        WindowInsets windowInsets = this.a;
        dve dveVarE = dve.e(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.o = dveVarE;
        return dveVarE;
    }

    @Override // defpackage.ecv
    public ecy e(int i, int i2, int i3, int i4) {
        ecy ecyVarQ = ecy.q(this.a, null);
        ecm eclVar = Build.VERSION.SDK_INT >= 36 ? new ecl(ecyVarQ) : Build.VERSION.SDK_INT >= 35 ? new eck(ecyVarQ) : Build.VERSION.SDK_INT >= 34 ? new ecj(ecyVarQ) : Build.VERSION.SDK_INT >= 31 ? new eci(ecyVarQ) : Build.VERSION.SDK_INT >= 30 ? new ech(ecyVarQ) : Build.VERSION.SDK_INT >= 29 ? new ecg(ecyVarQ) : new ecf(ecyVarQ);
        eclVar.c(ecy.j(d(), i, i2, i3, i4));
        eclVar.b(ecy.j(w(), i, i2, i3, i4));
        return eclVar.a();
    }

    @Override // defpackage.ecv
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ecn ecnVar = (ecn) obj;
        return Objects.equals(this.b, ecnVar.b) && v(this.c, ecnVar.c);
    }

    @Override // defpackage.ecv
    public List<Rect> f(int i) {
        return K(this.q, i);
    }

    @Override // defpackage.ecv
    public List<Rect> g(int i) {
        return K(this.r, i);
    }

    @Override // defpackage.ecv
    public void h(View view) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        this.f = view.getWidth();
        this.e = view.getHeight();
        dve dveVarI = I(view);
        if (dveVarI == null) {
            dveVarI = dve.a;
        }
        n(dveVarI);
    }

    @Override // defpackage.ecv
    public void i(ecy ecyVar) {
        ecyVar.u(this.p);
        ecyVar.b.n(this.b);
        ecyVar.v(this.c);
        ecyVar.s(this.d);
        ecyVar.w(this.q);
        ecyVar.x(this.r);
    }

    @Override // defpackage.ecv
    public void j(View view) {
        this.d = J(view);
    }

    @Override // defpackage.ecv
    public void k() {
        for (int i = 1; i <= 512; i += i) {
            int iG = ebi.g(i);
            this.q[iG] = M(a(i));
            if (i != 8) {
                this.r[iG] = M(c(i));
            }
        }
    }

    @Override // defpackage.ecv
    public void l(eab eabVar) {
        this.d = eabVar;
    }

    @Override // defpackage.ecv
    public void m(dve[] dveVarArr) {
        this.n = dveVarArr;
    }

    @Override // defpackage.ecv
    public void n(dve dveVar) {
        this.b = dveVar;
    }

    @Override // defpackage.ecv
    public void o(ecy ecyVar) {
        this.p = ecyVar;
    }

    @Override // defpackage.ecv
    public void p(int i) {
        this.c = i;
    }

    @Override // defpackage.ecv
    public void q(Rect[][] rectArr) {
        rectArr.getClass();
        this.q = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ecv
    public void r(Rect[][] rectArr) {
        rectArr.getClass();
        this.r = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ecv
    public boolean s() {
        return this.a.isRound();
    }

    protected boolean t(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !b(i, false).equals(dve.a);
    }

    @Override // defpackage.ecv
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0 && !t(i2)) {
                return false;
            }
        }
        return true;
    }

    public ecn(ecy ecyVar, ecn ecnVar) {
        this(ecyVar, new WindowInsets(ecnVar.a));
    }
}
