package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class fa {

    /* renamed from: a, reason: collision with root package name */
    private int f1445a;

    /* renamed from: b, reason: collision with root package name */
    protected final LinearInterpolator f1446b;

    /* renamed from: c, reason: collision with root package name */
    protected final DecelerateInterpolator f1447c;

    /* renamed from: d, reason: collision with root package name */
    protected PointF f1448d;

    /* renamed from: e, reason: collision with root package name */
    protected int f1449e;

    /* renamed from: f, reason: collision with root package name */
    protected int f1450f;

    /* renamed from: g, reason: collision with root package name */
    private RecyclerView f1451g;

    /* renamed from: h, reason: collision with root package name */
    private en f1452h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1453i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1454j;

    /* renamed from: k, reason: collision with root package name */
    private View f1455k;

    /* renamed from: l, reason: collision with root package name */
    private final ey f1456l;
    private boolean m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public fa(Context context) {
        this.f1445a = -1;
        this.f1456l = new ey();
        this.f1446b = new LinearInterpolator();
        this.f1447c = new DecelerateInterpolator();
        this.o = false;
        this.f1449e = 0;
        this.f1450f = 0;
        this.n = context.getResources().getDisplayMetrics();
    }

    public static final int o(View view) {
        fe feVarP = RecyclerView.p(view);
        if (feVarP != null) {
            return feVarP.getLayoutPosition();
        }
        return -1;
    }

    private static int p(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int b(int i2) {
        float fAbs = Math.abs(i2);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(fAbs * this.p);
    }

    protected void c(View view, ey eyVar) {
        fa faVar;
        int iM;
        PointF pointF = this.f1448d;
        int iM2 = 0;
        int i2 = (pointF == null || pointF.x == 0.0f) ? 0 : this.f1448d.x > 0.0f ? 1 : -1;
        en enVar = this.f1452h;
        if (enVar == null || !enVar.ae()) {
            faVar = this;
            iM = 0;
        } else {
            eo eoVar = (eo) view.getLayoutParams();
            faVar = this;
            iM = faVar.m(en.bp(view) - eoVar.leftMargin, en.bs(view) + eoVar.rightMargin, enVar.aB(), enVar.aE() - enVar.aC(), i2);
        }
        PointF pointF2 = faVar.f1448d;
        int i3 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : faVar.f1448d.y > 0.0f ? 1 : -1;
        en enVar2 = faVar.f1452h;
        if (enVar2 != null && enVar2.af()) {
            eo eoVar2 = (eo) view.getLayoutParams();
            iM2 = faVar.m(en.bt(view) - eoVar2.topMargin, en.bo(view) + eoVar2.bottomMargin, enVar2.aD(), enVar2.au() - enVar2.aA(), i3);
        }
        int iN = faVar.n((int) Math.sqrt((iM * iM) + (iM2 * iM2)));
        if (iN > 0) {
            eyVar.c(-iM, -iM2, iN, faVar.f1447c);
        }
    }

    public final int d() {
        return this.f1445a;
    }

    public final PointF e(int i2) {
        Object obj = this.f1452h;
        if (obj instanceof ez) {
            return ((ez) obj).P(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(ez.class.getCanonicalName())));
        return null;
    }

    final void f(int i2, int i3) {
        PointF pointFE;
        RecyclerView recyclerView = this.f1451g;
        if (this.f1445a == -1 || recyclerView == null) {
            j();
        }
        if (this.f1453i && this.f1455k == null && this.f1452h != null && (pointFE = e(this.f1445a)) != null && (pointFE.x != 0.0f || pointFE.y != 0.0f)) {
            recyclerView.ah((int) Math.signum(pointFE.x), (int) Math.signum(pointFE.y), null);
        }
        this.f1453i = false;
        View view = this.f1455k;
        if (view != null) {
            if (o(view) == this.f1445a) {
                View view2 = this.f1455k;
                fb fbVar = recyclerView.E;
                ey eyVar = this.f1456l;
                c(view2, eyVar);
                eyVar.b(recyclerView);
                j();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f1455k = null;
            }
        }
        if (this.f1454j) {
            fb fbVar2 = recyclerView.E;
            ey eyVar2 = this.f1456l;
            if (this.f1451g.n.as() == 0) {
                j();
            } else {
                int iP = p(this.f1449e, i2);
                this.f1449e = iP;
                int iP2 = p(this.f1450f, i3);
                this.f1450f = iP2;
                if (iP == 0 && iP2 == 0) {
                    PointF pointFE2 = e(this.f1445a);
                    if (pointFE2 == null || (pointFE2.x == 0.0f && pointFE2.y == 0.0f)) {
                        eyVar2.a(this.f1445a);
                        j();
                    } else {
                        float fSqrt = (float) Math.sqrt((pointFE2.x * pointFE2.x) + (pointFE2.y * pointFE2.y));
                        pointFE2.x /= fSqrt;
                        pointFE2.y /= fSqrt;
                        this.f1448d = pointFE2;
                        this.f1449e = (int) (pointFE2.x * 10000.0f);
                        this.f1450f = (int) (pointFE2.y * 10000.0f);
                        eyVar2.c((int) (this.f1449e * 1.2f), (int) (this.f1450f * 1.2f), (int) (b(10000) * 1.2f), this.f1446b);
                    }
                }
            }
            boolean zD = eyVar2.d();
            eyVar2.b(recyclerView);
            if (zD && this.f1454j) {
                this.f1453i = true;
                recyclerView.B.b();
            }
        }
    }

    protected final void g(View view) {
        if (o(view) == this.f1445a) {
            this.f1455k = view;
            int i2 = RecyclerView.O;
        }
    }

    public final void h(int i2) {
        this.f1445a = i2;
    }

    final void i(RecyclerView recyclerView, en enVar) {
        recyclerView.B.d();
        if (this.m) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.f1451g = recyclerView;
        this.f1452h = enVar;
        int i2 = this.f1445a;
        if (i2 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.E.f1457a = i2;
        this.f1454j = true;
        this.f1453i = true;
        this.f1455k = recyclerView.n.S(this.f1445a);
        this.f1451g.B.b();
        this.m = true;
    }

    protected final void j() {
        if (this.f1454j) {
            this.f1454j = false;
            this.f1450f = 0;
            this.f1449e = 0;
            this.f1448d = null;
            this.f1451g.E.f1457a = -1;
            this.f1455k = null;
            this.f1445a = -1;
            this.f1453i = false;
            en enVar = this.f1452h;
            if (enVar.v == this) {
                enVar.v = null;
            }
            this.f1452h = null;
            this.f1451g = null;
        }
    }

    public final boolean k() {
        return this.f1453i;
    }

    public final boolean l() {
        return this.f1454j;
    }

    public int m(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            return i5 - i3;
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    protected final int n(int i2) {
        return (int) Math.ceil(b(i2) / 0.3356d);
    }

    public fa() {
        this.f1445a = -1;
        this.f1456l = new ey();
    }
}
