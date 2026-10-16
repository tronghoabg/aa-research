package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class mk {
    public RecyclerView c;
    public lz d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected PointF k;
    private final DisplayMetrics n;
    private float p;
    public int b = -1;
    private final mi a = new mi();
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    private boolean o = false;
    protected int l = 0;
    protected int m = 0;

    public mk(Context context) {
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

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int b(int i) {
        float fAbs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(fAbs * this.p);
    }

    protected void c(View view, mi miVar) {
        PointF pointF = this.k;
        int iM = 0;
        int i = (pointF == null || pointF.x == BitmapDescriptorFactory.HUE_RED) ? 0 : this.k.x > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
        lz lzVar = this.d;
        if (lzVar != null && lzVar.ag()) {
            ma maVar = (ma) view.getLayoutParams();
            iM = m(lz.bB(view) - maVar.leftMargin, lz.bC(view) + maVar.rightMargin, lzVar.getPaddingLeft(), lzVar.C - lzVar.getPaddingRight(), i);
        }
        int iJ = j(view, l());
        int iK = k((int) Math.sqrt((iM * iM) + (iJ * iJ)));
        if (iK > 0) {
            miVar.b(-iM, -iJ, iK, this.j);
        }
    }

    public final int d() {
        return this.c.n.av();
    }

    public final int e(View view) {
        return this.c.d(view);
    }

    public int f() {
        return this.b;
    }

    public PointF g(int i) {
        Object obj = this.d;
        if (obj instanceof mj) {
            return ((mj) obj).O(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(mj.class.getCanonicalName())));
        return null;
    }

    final void h(int i, int i2) {
        PointF pointFG;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            i();
        }
        if (this.e && this.g == null && this.d != null && (pointFG = g(this.b)) != null && (pointFG.x != BitmapDescriptorFactory.HUE_RED || pointFG.y != BitmapDescriptorFactory.HUE_RED)) {
            recyclerView.W((int) Math.signum(pointFG.x), (int) Math.signum(pointFG.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (e(view) == this.b) {
                View view2 = this.g;
                ml mlVar = recyclerView.N;
                mi miVar = this.a;
                c(view2, miVar);
                miVar.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            ml mlVar2 = recyclerView.N;
            mi miVar2 = this.a;
            if (d() == 0) {
                i();
            } else {
                int iN = n(this.l, i);
                this.l = iN;
                int iN2 = n(this.m, i2);
                this.m = iN2;
                if (iN == 0 && iN2 == 0) {
                    PointF pointFG2 = g(f());
                    if (pointFG2 == null || (pointFG2.x == BitmapDescriptorFactory.HUE_RED && pointFG2.y == BitmapDescriptorFactory.HUE_RED)) {
                        miVar2.a = f();
                        i();
                    } else {
                        float fSqrt = (float) Math.sqrt((pointFG2.x * pointFG2.x) + (pointFG2.y * pointFG2.y));
                        pointFG2.x /= fSqrt;
                        pointFG2.y /= fSqrt;
                        this.k = pointFG2;
                        this.l = (int) (pointFG2.x * 10000.0f);
                        this.m = (int) (pointFG2.y * 10000.0f);
                        miVar2.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    }
                }
            }
            int i3 = miVar2.a;
            miVar2.a(recyclerView);
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
            lz lzVar = this.d;
            if (lzVar.t == this) {
                lzVar.t = null;
            }
            this.d = null;
            this.c = null;
        }
    }

    public final int j(View view, int i) {
        lz lzVar = this.d;
        if (lzVar == null || !lzVar.ah()) {
            return 0;
        }
        ma maVar = (ma) view.getLayoutParams();
        return m(lz.bD(view) - maVar.topMargin, lz.bA(view) + maVar.bottomMargin, lzVar.getPaddingTop(), lzVar.D - lzVar.getPaddingBottom(), i);
    }

    protected int k(int i) {
        return (int) Math.ceil(b(i) / 0.3356d);
    }

    protected int l() {
        PointF pointF = this.k;
        if (pointF == null || pointF.y == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return this.k.y <= BitmapDescriptorFactory.HUE_RED ? -1 : 1;
    }
}
