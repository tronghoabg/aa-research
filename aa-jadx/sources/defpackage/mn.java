package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class mn {
    public android.support.v7.widget.RecyclerView c;
    public defpackage.mc d;
    public boolean e;
    public boolean f;
    public android.view.View g;
    public boolean h;
    protected android.graphics.PointF k;
    private final android.util.DisplayMetrics n;
    private float p;
    public int b = -1;
    private final defpackage.ml a = new defpackage.ml();
    protected final android.view.animation.LinearInterpolator i = new android.view.animation.LinearInterpolator();
    protected final android.view.animation.DecelerateInterpolator j = new android.view.animation.DecelerateInterpolator();
    private boolean o = false;
    protected int l = 0;
    protected int m = 0;

    public mn(android.content.Context context) {
        this.n = context.getResources().getDisplayMetrics();
    }

    public static int m(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    private static int n(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(android.util.DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int b(int i) {
        float fAbs = java.lang.Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) java.lang.Math.ceil(fAbs * this.p);
    }

    protected void c(android.view.View view, defpackage.ml mlVar) {
        int i;
        android.graphics.PointF pointF = this.k;
        int iM = 0;
        if (pointF == null || pointF.x == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            i = 0;
        } else {
            i = this.k.x > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : -1;
        }
        defpackage.mc mcVar = this.d;
        if (mcVar != null && mcVar.ag()) {
            defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
            iM = m(defpackage.mc.bB(view) - mdVar.leftMargin, defpackage.mc.bC(view) + mdVar.rightMargin, mcVar.getPaddingLeft(), mcVar.C - mcVar.getPaddingRight(), i);
        }
        int iJ = j(view, l());
        int iK = k((int) java.lang.Math.sqrt((iM * iM) + (iJ * iJ)));
        if (iK > 0) {
            mlVar.b(-iM, -iJ, iK, this.j);
        }
    }

    public final int d() {
        return this.c.n.av();
    }

    public final int e(android.view.View view) {
        return this.c.d(view);
    }

    public int f() {
        return this.b;
    }

    public android.graphics.PointF g(int i) {
        java.lang.Object obj = this.d;
        if (obj instanceof defpackage.mm) {
            return ((defpackage.mm) obj).O(i);
        }
        android.util.Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(java.lang.String.valueOf(defpackage.mm.class.getCanonicalName())));
        return null;
    }

    final void h(int i, int i2) {
        android.graphics.PointF pointFG;
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            i();
        }
        if (this.e && this.g == null && this.d != null && (pointFG = g(this.b)) != null && (pointFG.x != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || pointFG.y != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) {
            recyclerView.W((int) java.lang.Math.signum(pointFG.x), (int) java.lang.Math.signum(pointFG.y), null);
        }
        this.e = false;
        android.view.View view = this.g;
        if (view != null) {
            if (e(view) == this.b) {
                android.view.View view2 = this.g;
                defpackage.mo moVar = recyclerView.N;
                defpackage.ml mlVar = this.a;
                c(view2, mlVar);
                mlVar.a(recyclerView);
                i();
            } else {
                android.util.Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            defpackage.mo moVar2 = recyclerView.N;
            defpackage.ml mlVar2 = this.a;
            if (d() == 0) {
                i();
            } else {
                int iN = n(this.l, i);
                this.l = iN;
                int iN2 = n(this.m, i2);
                this.m = iN2;
                if (iN == 0 && iN2 == 0) {
                    android.graphics.PointF pointFG2 = g(f());
                    if (pointFG2 == null || (pointFG2.x == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && pointFG2.y == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) {
                        mlVar2.a = f();
                        i();
                    } else {
                        float fSqrt = (float) java.lang.Math.sqrt((pointFG2.x * pointFG2.x) + (pointFG2.y * pointFG2.y));
                        pointFG2.x /= fSqrt;
                        pointFG2.y /= fSqrt;
                        this.k = pointFG2;
                        this.l = (int) (pointFG2.x * 10000.0f);
                        this.m = (int) (pointFG2.y * 10000.0f);
                        mlVar2.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    }
                }
            }
            int i3 = mlVar2.a;
            mlVar2.a(recyclerView);
            if (i3 < 0 || !this.f) {
                return;
            }
            this.e = true;
            recyclerView.K.b();
        }
    }

    public final void i() {
        if (this.f) {
            this.f = false;
            this.m = 0;
            this.l = 0;
            this.k = null;
            this.c.N.a = -1;
            this.g = null;
            this.b = -1;
            this.e = false;
            defpackage.mc mcVar = this.d;
            if (mcVar.t == this) {
                mcVar.t = null;
            }
            this.d = null;
            this.c = null;
        }
    }

    public final int j(android.view.View view, int i) {
        defpackage.mc mcVar = this.d;
        if (mcVar == null || !mcVar.ah()) {
            return 0;
        }
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        return m(defpackage.mc.bD(view) - mdVar.topMargin, defpackage.mc.bA(view) + mdVar.bottomMargin, mcVar.getPaddingTop(), mcVar.D - mcVar.getPaddingBottom(), i);
    }

    protected int k(int i) {
        return (int) java.lang.Math.ceil(((double) b(i)) / 0.3356d);
    }

    protected int l() {
        android.graphics.PointF pointF = this.k;
        if (pointF == null || pointF.y == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return this.k.y <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? -1 : 1;
    }
}
