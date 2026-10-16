package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import defpackage.aat;
import defpackage.ap;
import defpackage.bii;
import defpackage.ca;
import defpackage.duw;
import defpackage.dzx;
import defpackage.dzy;
import defpackage.eae;
import defpackage.eaf;
import defpackage.ebf;
import defpackage.ebh;
import defpackage.ebm;
import defpackage.ebp;
import defpackage.eeg;
import defpackage.eel;
import defpackage.etz;
import defpackage.fv;
import defpackage.it;
import defpackage.iu;
import defpackage.izj;
import defpackage.ke;
import defpackage.kv;
import defpackage.kx;
import defpackage.kz;
import defpackage.lt;
import defpackage.lv;
import defpackage.lw;
import defpackage.lz;
import defpackage.ma;
import defpackage.mb;
import defpackage.mc;
import defpackage.me;
import defpackage.mg;
import defpackage.mh;
import defpackage.mj;
import defpackage.mk;
import defpackage.ml;
import defpackage.mm;
import defpackage.mn;
import defpackage.mo;
import defpackage.mq;
import defpackage.mt;
import defpackage.mu;
import defpackage.nn;
import defpackage.nv;
import defpackage.sm;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements eae {
    public static final /* synthetic */ int ac = 0;
    private static final Class[] af;
    public static final Interpolator c;
    static final mm d;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public lw E;
    public int F;
    public mb G;
    public final int H;
    public float I;
    public float J;
    public final mn K;
    public kz L;
    public kx M;
    public final ml N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public mq R;
    public final int[] S;
    final List T;
    boolean U;
    dzx V;
    sm W;
    private int aA;
    private int aB;
    private int aC;
    private final int aD;
    private boolean aE;
    private boolean aF;
    private List aG;
    private final int[] aH;
    private eaf aI;
    private final int[] aJ;
    private final int[] aK;
    private Runnable aL;
    private boolean aM;
    private int aN;
    private int aO;
    private final dzy aP;
    private ca aQ;
    private izj aR;
    private final izj aS;
    public ca aa;
    public final bii ab;
    private final float ag;
    private boolean ah;
    private final mg ai;
    private final Rect aj;
    private Rect ak;
    private final ArrayList al;
    private mc am;
    private final Runnable an;
    private boolean ao;
    private boolean ap;
    private int aq;
    private boolean ar;
    private int as;
    private final AccessibilityManager at;
    private int au;
    private int av;
    private int aw;
    private VelocityTracker ax;
    private int ay;
    private int az;
    public final me e;
    SavedState f;
    public iu g;
    public ke h;
    public boolean i;
    public final Runnable j;
    public final Rect k;
    public final RectF l;
    public lt m;
    public lz n;
    public final List o;
    public final ArrayList p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;
    private static final int[] ad = {R.attr.nestedScrollingEnabled};
    private static final float ae = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    static final boolean b = true;

    static {
        Class cls = Integer.TYPE;
        af = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new eel(1);
        d = new mm();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        String str;
        super(context, attributeSet, i);
        RecyclerView recyclerView = this;
        recyclerView.ah = false;
        recyclerView.ai = new mg(recyclerView);
        recyclerView.e = new me(recyclerView);
        recyclerView.ab = new bii((char[]) null, (byte[]) null, (byte[]) null);
        recyclerView.j = new ap(recyclerView, 19, null);
        recyclerView.k = new Rect();
        recyclerView.aj = new Rect();
        recyclerView.l = new RectF();
        recyclerView.o = new ArrayList();
        recyclerView.p = new ArrayList();
        recyclerView.al = new ArrayList();
        recyclerView.an = new ap(recyclerView, 18);
        recyclerView.aq = 0;
        recyclerView.y = false;
        recyclerView.z = false;
        recyclerView.au = 0;
        recyclerView.av = 0;
        recyclerView.aQ = d;
        recyclerView.E = new mu();
        recyclerView.F = 0;
        recyclerView.aw = -1;
        recyclerView.I = Float.MIN_VALUE;
        recyclerView.J = Float.MIN_VALUE;
        recyclerView.aE = true;
        recyclerView.aF = true;
        recyclerView.K = new mn(recyclerView);
        recyclerView.M = new kx();
        recyclerView.N = new ml();
        recyclerView.O = false;
        recyclerView.P = false;
        recyclerView.aR = new izj(recyclerView);
        recyclerView.Q = false;
        recyclerView.aH = new int[2];
        recyclerView.aJ = new int[2];
        recyclerView.aK = new int[2];
        recyclerView.S = new int[2];
        recyclerView.T = new ArrayList();
        recyclerView.aL = new ap(recyclerView, 20, null);
        recyclerView.aN = 0;
        recyclerView.aO = 0;
        recyclerView.aS = new izj(recyclerView);
        eeg eegVar = new eeg(recyclerView, 1);
        recyclerView.aP = eegVar;
        recyclerView.V = new dzx(recyclerView.getContext(), eegVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.aC = viewConfiguration.getScaledTouchSlop();
        recyclerView.I = viewConfiguration.getScaledHorizontalScrollFactor();
        recyclerView.J = viewConfiguration.getScaledVerticalScrollFactor();
        recyclerView.H = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.aD = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ag = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.E.a = recyclerView.aR;
        recyclerView.g = new iu(new izj(recyclerView));
        recyclerView.h = new ke(new izj(recyclerView));
        int[] iArr = ebm.a;
        if (ebh.a(recyclerView) == 0) {
            ebh.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.at = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.Y(new mq(recyclerView));
        int[] iArr2 = fv.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ebm.n(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        recyclerView.aF = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.n()));
            }
            Resources resources = recyclerView.getContext().getResources();
            str = string;
            new kv(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.projection.gearhead.R.dimen.fastscroll_margin));
            recyclerView = this;
        } else {
            str = string;
        }
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.U = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.aR(context, str, attributeSet, i);
        int[] iArr3 = ad;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        ebm.n(recyclerView, context, iArr3, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(com.google.android.projection.gearhead.R.id.is_pooling_container_tag, true);
    }

    public static void K(View view, Rect rect) {
        ma maVar = (ma) view.getLayoutParams();
        Rect rect2 = maVar.d;
        rect.set((view.getLeft() - rect2.left) - maVar.leftMargin, (view.getTop() - rect2.top) - maVar.topMargin, view.getRight() + rect2.right + maVar.rightMargin, view.getBottom() + rect2.bottom + maVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.A;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect == null || ebf.fK(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && ebf.fK(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.C;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fE = ebf.e(edgeEffect3, width, height);
                    if (ebf.fK(this.C) == BitmapDescriptorFactory.HUE_RED) {
                        this.C.onRelease();
                    }
                    f2 = fE;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.A;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -ebf.e(edgeEffect4, -width, 1.0f - height);
                if (ebf.fK(this.A) == BitmapDescriptorFactory.HUE_RED) {
                    this.A.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private final int aA(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.B;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect == null || ebf.fK(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && ebf.fK(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.D;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fE = ebf.e(edgeEffect3, height, 1.0f - width);
                    if (ebf.fK(this.D) == BitmapDescriptorFactory.HUE_RED) {
                        this.D.onRelease();
                    }
                    f2 = fE;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.B;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -ebf.e(edgeEffect4, -height, width);
                if (ebf.fK(this.B) == BitmapDescriptorFactory.HUE_RED) {
                    this.B.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private final eaf aB() {
        eaf eafVar = this.aI;
        if (eafVar != null) {
            return eafVar;
        }
        eaf eafVar2 = new eaf(this);
        this.aI = eafVar2;
        return eafVar2;
    }

    private final void aC() {
        aL();
        ac(0);
    }

    private final void aD() {
        View viewM;
        ml mlVar = this.N;
        mlVar.b(1);
        J(mlVar);
        mlVar.i = false;
        ae();
        bii biiVar = this.ab;
        biiVar.C();
        Q();
        aH();
        View focusedChild = (this.aE && hasFocus() && this.m != null) ? getFocusedChild() : null;
        mo moVarJ = (focusedChild == null || (viewM = m(focusedChild)) == null) ? null : j(viewM);
        if (moVarJ == null) {
            aK();
        } else {
            mlVar.m = this.m.c ? moVarJ.e : -1L;
            mlVar.l = this.y ? -1 : moVarJ.v() ? moVarJ.d : moVarJ.a();
            View focusedChild2 = moVarJ.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            mlVar.n = id;
        }
        mlVar.h = mlVar.j && this.P;
        this.P = false;
        this.O = false;
        mlVar.g = mlVar.k;
        mlVar.e = this.m.a();
        aF(this.aH);
        if (mlVar.j) {
            int iA = this.h.a();
            for (int i = 0; i < iA; i++) {
                View viewD = this.h.d(i);
                mo moVar = viewD == null ? null : ((ma) viewD.getLayoutParams()).c;
                if (!moVar.A() && (!moVar.t() || this.m.c)) {
                    lw.i(moVar);
                    moVar.d();
                    biiVar.Z(moVar, lw.n(moVar));
                    if (mlVar.h && moVar.y() && !moVar.v() && !moVar.A() && !moVar.t()) {
                        biiVar.B(e(moVar), moVar);
                    }
                }
            }
        }
        if (mlVar.k) {
            int iB = this.h.b();
            for (int i2 = 0; i2 < iB; i2++) {
                View viewE = this.h.e(i2);
                mo moVar2 = viewE == null ? null : ((ma) viewE.getLayoutParams()).c;
                if (!moVar2.A() && moVar2.d == -1) {
                    moVar2.d = moVar2.c;
                }
            }
            boolean z = mlVar.f;
            mlVar.f = false;
            this.n.p(this.e, mlVar);
            mlVar.f = z;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                View viewD2 = this.h.d(i3);
                mo moVar3 = viewD2 == null ? null : ((ma) viewD2.getLayoutParams()).c;
                if (!moVar3.A()) {
                    aat aatVar = (aat) biiVar.b;
                    nn nnVar = (nn) aatVar.get(moVar3);
                    if (nnVar == null || (nnVar.b & 4) == 0) {
                        lw.i(moVar3);
                        boolean zQ = moVar3.q(8192);
                        moVar3.d();
                        etz etzVarN = lw.n(moVar3);
                        if (zQ) {
                            ax(moVar3, etzVarN);
                        } else {
                            nn nnVarA = (nn) aatVar.get(moVar3);
                            if (nnVarA == null) {
                                nnVarA = nn.a();
                                aatVar.put(moVar3, nnVarA);
                            }
                            nnVarA.b |= 2;
                            nnVarA.c = etzVarN;
                        }
                    }
                }
            }
            x();
        } else {
            x();
        }
        R(true);
        af(false);
        mlVar.d = 2;
    }

    private final void aE() {
        ae();
        Q();
        ml mlVar = this.N;
        mlVar.b(6);
        this.g.d();
        mlVar.e = this.m.a();
        mlVar.c = 0;
        SavedState savedState = this.f;
        if (savedState != null) {
            int i = this.m.d;
            Parcelable parcelable = savedState.a;
            if (parcelable != null) {
                this.n.ab(parcelable);
            }
            this.f = null;
        }
        mlVar.g = false;
        this.n.p(this.e, mlVar);
        mlVar.f = false;
        mlVar.j = mlVar.j && this.E != null;
        mlVar.d = 4;
        R(true);
        af(false);
    }

    private final void aF(int[] iArr) {
        int iA = this.h.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i3 = 0; i3 < iA; i3++) {
            View viewD = this.h.d(i3);
            mo moVar = viewD == null ? null : ((ma) viewD.getLayoutParams()).c;
            if (!moVar.A()) {
                int iC = moVar.c();
                if (iC < i2) {
                    i2 = iC;
                }
                if (iC > i) {
                    i = iC;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aG(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.aw) {
            int i = actionIndex == 0 ? 1 : 0;
            this.aw = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.aA = x;
            this.ay = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.aB = y;
            this.az = y;
        }
    }

    private final void aH() {
        boolean z;
        if (this.y) {
            this.g.i();
            if (this.z) {
                this.n.gc();
            }
        }
        boolean zAP = aP();
        iu iuVar = this.g;
        if (zAP) {
            iuVar.f();
        } else {
            iuVar.d();
        }
        boolean z2 = this.O || this.P;
        ml mlVar = this.N;
        boolean z3 = this.s && this.E != null && ((z = this.y) || z2 || this.n.u) && (!z || this.m.c);
        mlVar.j = z3;
        mlVar.k = z3 && z2 && !this.y && aP();
    }

    private final void aI() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void aJ(View view, View view2) {
        boolean z;
        RecyclerView recyclerView;
        View view3;
        View view4 = view2 != null ? view2 : view;
        Rect rect = this.k;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof ma) {
            ma maVar = (ma) layoutParams;
            if (!maVar.e) {
                Rect rect2 = maVar.d;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        } else {
            view2 = null;
        }
        lz lzVar = this.n;
        boolean z2 = !this.s;
        if (view2 == null) {
            z = true;
            view3 = view;
            recyclerView = this;
        } else {
            z = false;
            recyclerView = this;
            view3 = view;
        }
        lzVar.bf(recyclerView, view3, rect, z2, z);
    }

    private final void aK() {
        ml mlVar = this.N;
        mlVar.m = -1L;
        mlVar.l = -1;
        mlVar.n = -1;
    }

    private final void aL() {
        VelocityTracker velocityTracker = this.ax;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        ag(0);
        aI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aM(int i) {
        boolean zAg = this.n.ag();
        int i2 = zAg;
        if (this.n.ah()) {
            i2 = (zAg ? 1 : 0) | 2;
        }
        at(i2, i);
    }

    private final void aN() {
        mk mkVar;
        this.K.d();
        lz lzVar = this.n;
        if (lzVar == null || (mkVar = lzVar.t) == null) {
            return;
        }
        mkVar.i();
    }

    private final boolean aO(MotionEvent motionEvent) {
        ArrayList arrayList = this.al;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mc mcVar = (mc) arrayList.get(i);
            if (mcVar.j(motionEvent) && action != 3) {
                this.am = mcVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aP() {
        return this.E != null && this.n.gb();
    }

    private final boolean aQ(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fFK = ebf.fK(edgeEffect) * i2;
        float fAbs = Math.abs(-i);
        float f = this.ag * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d2 = ae;
        return ((float) (((double) f) * Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fFK;
    }

    private final void aR(Context context, String str, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = String.valueOf(context.getPackageName()).concat(String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(lz.class);
                try {
                    constructor = clsAsSubclass.getConstructor(af);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(a.bx(strTrim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                ab((lz) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(a.bx(strTrim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(a.bx(strTrim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(a.bx(strTrim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(a.bx(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(a.bx(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    private final sm aS() {
        sm smVar = this.W;
        if (smVar != null) {
            return smVar;
        }
        sm smVar2 = new sm((View) this);
        this.W = smVar2;
        return smVar2;
    }

    public static final int aq(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && ebf.fK(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            int iRound = Math.round(((-i2) / 4.0f) * ebf.e(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || ebf.fK(edgeEffect2) == BitmapDescriptorFactory.HUE_RED) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * ebf.e(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static mo k(View view) {
        if (view == null) {
            return null;
        }
        return ((ma) view.getLayoutParams()).c;
    }

    public static RecyclerView l(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewL = l(viewGroup.getChildAt(i));
            if (recyclerViewL != null) {
                return recyclerViewL;
            }
        }
        return null;
    }

    public static void w(mo moVar) {
        WeakReference weakReference = moVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == moVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            moVar.b = null;
        }
    }

    public final void A(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = ebm.a;
        setMeasuredDimension(lz.au(i, paddingLeft, getMinimumWidth()), lz.au(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void B(View view) {
        if (view != null) {
            mo moVar = ((ma) view.getLayoutParams()).c;
        }
        List list = this.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            nv nvVar = (nv) this.x.get(size);
            nvVar.h(view);
            mo moVarJ = nvVar.o.j(view);
            if (moVarJ != null) {
                mo moVar2 = nvVar.b;
                if (moVar2 == null || moVarJ != moVar2) {
                    nvVar.d(moVarJ, false);
                    if (nvVar.a.remove(moVarJ.a)) {
                        nvVar.l.c(nvVar.o, moVarJ);
                    }
                } else {
                    nvVar.j(null, 0);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void C() {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.C():void");
    }

    public final void D(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aB().f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void E(int i, int i2) {
        this.av++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        ca caVar = this.aa;
        if (caVar != null) {
            caVar.q(this, i, i2);
        }
        List list = this.aG;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((ca) this.aG.get(size)).q(this, i, i2);
                }
            }
        }
        this.av--;
    }

    public final void F() {
        if (this.D != null) {
            return;
        }
        EdgeEffect edgeEffectR = this.aQ.r(this);
        this.D = edgeEffectR;
        if (this.i) {
            edgeEffectR.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectR.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void G() {
        if (this.A != null) {
            return;
        }
        EdgeEffect edgeEffectR = this.aQ.r(this);
        this.A = edgeEffectR;
        if (this.i) {
            edgeEffectR.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectR.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void H() {
        if (this.C != null) {
            return;
        }
        EdgeEffect edgeEffectR = this.aQ.r(this);
        this.C = edgeEffectR;
        if (this.i) {
            edgeEffectR.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectR.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void I() {
        if (this.B != null) {
            return;
        }
        EdgeEffect edgeEffectR = this.aQ.r(this);
        this.B = edgeEffectR;
        if (this.i) {
            edgeEffectR.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectR.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void J(ml mlVar) {
        if (this.F != 2) {
            mlVar.o = 0;
            mlVar.p = 0;
        } else {
            OverScroller overScroller = this.K.a;
            mlVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            mlVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void L() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void M() {
        if (this.p.size() == 0) {
            return;
        }
        lz lzVar = this.n;
        if (lzVar != null) {
            lzVar.W("Cannot invalidate item decorations during a scroll or layout");
        }
        O();
        requestLayout();
    }

    public final void N(int i) {
        if (this.n == null) {
            return;
        }
        ac(2);
        this.n.ad(i);
        awakenScrollBars();
    }

    final void O() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            ((ma) this.h.e(i).getLayoutParams()).e = true;
        }
        ArrayList arrayList = this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ma maVar = (ma) ((mo) arrayList.get(i2)).a.getLayoutParams();
            if (maVar != null) {
                maVar.e = true;
            }
        }
    }

    public final void P(int i, int i2, boolean z) {
        int i3;
        int iB = this.h.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iB) {
                break;
            }
            mo moVarK = k(this.h.e(i4));
            if (moVarK != null && !moVarK.A()) {
                int i5 = moVarK.c;
                if (i5 >= i3) {
                    moVarK.k(-i2, z);
                    this.N.f = true;
                } else if (i5 >= i) {
                    moVarK.f(8);
                    moVarK.k(-i2, z);
                    moVarK.c = i - 1;
                    this.N.f = true;
                }
            }
            i4++;
        }
        me meVar = this.e;
        ArrayList arrayList = meVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            mo moVar = (mo) arrayList.get(size);
            if (moVar != null) {
                int i6 = moVar.c;
                if (i6 >= i3) {
                    moVar.k(-i2, z);
                } else if (i6 >= i) {
                    moVar.f(8);
                    meVar.h(size);
                }
            }
        }
    }

    public final void Q() {
        this.au++;
    }

    public final void R(boolean z) {
        int i;
        int i2 = this.au - 1;
        this.au = i2;
        if (i2 <= 0) {
            this.au = 0;
            if (z) {
                int i3 = this.as;
                this.as = 0;
                if (i3 != 0 && an()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                List list = this.T;
                for (int size = list.size() - 1; size >= 0; size--) {
                    mo moVar = (mo) list.get(size);
                    View view = moVar.a;
                    if (view.getParent() == this && !moVar.A() && (i = moVar.p) != -1) {
                        view.setImportantForAccessibility(i);
                        moVar.p = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public final void S() {
        if (this.Q || !this.q) {
            return;
        }
        Runnable runnable = this.aL;
        int[] iArr = ebm.a;
        postOnAnimation(runnable);
        this.Q = true;
    }

    public final void T(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int iB = this.h.b();
        int i = 0;
        while (true) {
            if (i >= iB) {
                break;
            }
            View viewE = this.h.e(i);
            mo moVar = viewE != null ? ((ma) viewE.getLayoutParams()).c : null;
            if (moVar != null && !moVar.A()) {
                moVar.f(6);
            }
            i++;
        }
        O();
        me meVar = this.e;
        ArrayList arrayList = meVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo moVar2 = (mo) arrayList.get(i2);
            if (moVar2 != null) {
                moVar2.f(6);
                moVar2.e(null);
            }
        }
        lt ltVar = meVar.f.m;
        if (ltVar == null || !ltVar.c) {
            meVar.g();
        }
    }

    public final void U() {
        lw lwVar = this.E;
        if (lwVar != null) {
            lwVar.d();
        }
        lz lzVar = this.n;
        if (lzVar != null) {
            me meVar = this.e;
            lzVar.aQ(meVar);
            this.n.aR(meVar);
        }
        this.e.c();
    }

    public final void V(mc mcVar) {
        this.al.remove(mcVar);
        if (this.am == mcVar) {
            this.am = null;
        }
    }

    public final void W(int i, int i2, int[] iArr) {
        mo moVar;
        ae();
        Q();
        ml mlVar = this.N;
        J(mlVar);
        int iD = i != 0 ? this.n.d(i, this.e, mlVar) : 0;
        int iE = i2 != 0 ? this.n.e(i2, this.e, mlVar) : 0;
        int iA = this.h.a();
        for (int i3 = 0; i3 < iA; i3++) {
            View viewD = this.h.d(i3);
            mo moVarJ = j(viewD);
            if (moVarJ != null && (moVar = moVarJ.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = moVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R(true);
        af(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    public final void X(int i) {
        if (this.v) {
            return;
        }
        ah();
        lz lzVar = this.n;
        if (lzVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lzVar.ad(i);
            awakenScrollBars();
        }
    }

    public final void Y(mq mqVar) {
        this.R = mqVar;
        ebm.o(this, mqVar);
    }

    public final void Z(lt ltVar) {
        suppressLayout(false);
        lt ltVar2 = this.m;
        if (ltVar2 != null) {
            ltVar2.r(this.ai);
        }
        U();
        this.g.i();
        lt ltVar3 = this.m;
        this.m = ltVar;
        if (ltVar != null) {
            ltVar.q(this.ai);
            ltVar.m(this);
        }
        lz lzVar = this.n;
        if (lzVar != null) {
            lzVar.bt();
        }
        me meVar = this.e;
        lt ltVar4 = this.m;
        meVar.c();
        meVar.e(ltVar3, true);
        duw duwVarP = meVar.p();
        if (ltVar3 != null) {
            duwVarP.a--;
        }
        if (duwVarP.a == 0) {
            duwVarP.f();
        }
        if (ltVar4 != null) {
            duwVarP.a++;
        }
        meVar.d();
        this.N.f = true;
        T(false);
        requestLayout();
    }

    public final void aa(lw lwVar) {
        lw lwVar2 = this.E;
        if (lwVar2 != null) {
            lwVar2.d();
            this.E.a = null;
        }
        this.E = lwVar;
        if (lwVar != null) {
            lwVar.a = this.aR;
        }
    }

    public final void ab(lz lzVar) {
        if (lzVar == this.n) {
            return;
        }
        ah();
        if (this.n != null) {
            lw lwVar = this.E;
            if (lwVar != null) {
                lwVar.d();
            }
            lz lzVar2 = this.n;
            me meVar = this.e;
            lzVar2.aQ(meVar);
            this.n.aR(meVar);
            meVar.c();
            if (this.q) {
                this.n.bz(this);
            }
            this.n.bb(null);
            this.n = null;
        } else {
            this.e.c();
        }
        ke keVar = this.h;
        keVar.a.d();
        List list = keVar.b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            keVar.e.z((View) list.get(size));
            list.remove(size);
        }
        izj izjVar = keVar.e;
        int iW = izjVar.w();
        for (int i = 0; i < iW; i++) {
            View viewY = izjVar.y(i);
            ((RecyclerView) izjVar.a).B(viewY);
            viewY.clearAnimation();
        }
        ((RecyclerView) izjVar.a).removeAllViews();
        this.n = lzVar;
        if (lzVar != null) {
            if (lzVar.s != null) {
                throw new IllegalArgumentException("LayoutManager " + lzVar + " is already attached to a RecyclerView:" + lzVar.s.n());
            }
            this.n.bb(this);
            if (this.q) {
                this.n.aJ(this);
            }
        }
        this.e.m();
        requestLayout();
    }

    public final void ac(int i) {
        if (i == this.F) {
            return;
        }
        boolean z = this.ah;
        if (i == 1) {
            if (!z) {
                System.identityHashCode(this);
                this.ah = true;
            }
            i = 1;
        } else if (z) {
            System.identityHashCode(this);
            this.ah = false;
        }
        this.F = i;
        if (i != 2) {
            aN();
        }
        lz lzVar = this.n;
        if (lzVar != null) {
            lzVar.aO(i);
        }
        ca caVar = this.aa;
        if (caVar != null) {
            caVar.p(this, i);
        }
        List list = this.aG;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ca) this.aG.get(size)).p(this, i);
            }
        }
    }

    public final void ad(int i) {
        if (this.v) {
            return;
        }
        lz lzVar = this.n;
        if (lzVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            lzVar.as(this, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        lz lzVar = this.n;
        if (lzVar == null || !lzVar.bu(arrayList, i)) {
            if (b && isFocusable() && !this.ap && (!hasFocus() || this.ao)) {
                if (i != 2) {
                    if (i == 1) {
                        i = 1;
                    }
                }
                if (i == 2) {
                    arrayList.add(this);
                }
                super.addFocusables(arrayList, i, i2);
                if (i == 1) {
                    arrayList.add(this);
                }
                Runnable runnable = this.an;
                removeCallbacks(runnable);
                this.t = true;
                post(runnable);
                return;
            }
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final void ae() {
        int i = this.aq + 1;
        this.aq = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void af(boolean z) {
        int i = this.aq;
        if (i <= 0) {
            this.aq = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.n != null && this.m != null) {
                C();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.aq--;
    }

    public final void ag(int i) {
        aB().b(i);
    }

    public final void ah() {
        ac(0);
        aN();
    }

    public final boolean aj(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aB().e(i, i2, iArr, iArr2, i3);
    }

    public boolean ak(int i, int i2) {
        return al(i, i2, this.H, this.aD);
    }

    public final boolean al(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        lz lzVarG;
        int i7;
        mk mkVarD;
        int iA;
        lz lzVar = this.n;
        if (lzVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        boolean zAg = lzVar.ag();
        boolean zAh = this.n.ah();
        if (!zAg || Math.abs(i) < i3) {
            i = 0;
        }
        if (!zAh || Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i5 = 0;
        } else {
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || ebf.fK(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
                EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 != null && ebf.fK(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                    if (aQ(this.C, i, getWidth())) {
                        this.C.onAbsorb(i);
                        i = 0;
                    }
                    i5 = i;
                    i = 0;
                }
                i5 = 0;
            } else {
                int i8 = -i;
                if (aQ(this.A, i8, getWidth())) {
                    this.A.onAbsorb(i8);
                    i = 0;
                }
                i5 = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 == null || ebf.fK(edgeEffect3) == BitmapDescriptorFactory.HUE_RED) {
                EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 != null && ebf.fK(edgeEffect4) != BitmapDescriptorFactory.HUE_RED) {
                    if (aQ(this.D, i2, getHeight())) {
                        this.D.onAbsorb(i2);
                        i2 = 0;
                    }
                    i6 = 0;
                }
                i6 = i2;
                i2 = 0;
            } else {
                int i9 = -i2;
                if (aQ(this.B, i9, getHeight())) {
                    this.B.onAbsorb(i9);
                    i2 = 0;
                }
                i6 = 0;
            }
        }
        if (i5 != 0) {
            int i10 = -i4;
            iMax = Math.max(i10, Math.min(i5, i4));
            iMax2 = Math.max(i10, Math.min(i2, i4));
            aM(1);
            this.K.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i102 = -i4;
            iMax = Math.max(i102, Math.min(i5, i4));
            iMax2 = Math.max(i102, Math.min(i2, i4));
            aM(1);
            this.K.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i == 0) {
            if (i6 == 0) {
                return (iMax == 0 && iMax2 == 0) ? false : true;
            }
            i = 0;
        }
        float f = i;
        float f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = zAg || zAh;
            dispatchNestedFling(f, f2, z);
            mb mbVar = this.G;
            if (mbVar != null && (lzVarG = mbVar.a.g()) != null) {
                RecyclerView recyclerView = mbVar.a;
                if (recyclerView.m != null && ((Math.abs(i6) > (i7 = recyclerView.H) || Math.abs(i) > i7) && (lzVarG instanceof mj) && (mkVarD = mbVar.d(lzVarG)) != null && (iA = mbVar.a(lzVarG, i, i6)) != -1)) {
                    mkVarD.b = iA;
                    lzVarG.bc(mkVarD);
                    return true;
                }
            }
            if (z) {
                int i11 = -i4;
                aM(1);
                this.K.a(Math.max(i11, Math.min(i, i4)), Math.max(i11, Math.min(i6, i4)));
                return true;
            }
        }
        return false;
    }

    public final boolean am() {
        return !this.s || this.y || this.g.k();
    }

    public final boolean an() {
        AccessibilityManager accessibilityManager = this.at;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean ao() {
        return this.au > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean ap(int r22, int r23, int r24, int r25, android.view.MotionEvent r26, int r27) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ap(int, int, int, int, android.view.MotionEvent, int):boolean");
    }

    public final void ar(mo moVar, int i) {
        if (!ao()) {
            moVar.a.setImportantForAccessibility(i);
        } else {
            moVar.p = i;
            this.T.add(moVar);
        }
    }

    public final void as(int i, int i2, boolean z) {
        lz lzVar = this.n;
        if (lzVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != lzVar.ag()) {
            i = 0;
        }
        if (true != this.n.ah()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            at(i3, 1);
        }
        this.K.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void at(int i, int i2) {
        aB().h(i, i2);
    }

    public final duw au() {
        return this.e.p();
    }

    public final void av(lv lvVar) {
        lz lzVar = this.n;
        if (lzVar != null) {
            lzVar.W("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(lvVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        O();
        requestLayout();
    }

    public final void aw(lv lvVar) {
        lz lzVar = this.n;
        if (lzVar != null) {
            lzVar.W("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lvVar);
        O();
        requestLayout();
    }

    public final void ax(mo moVar, etz etzVar) {
        moVar.m(0, 8192);
        if (this.N.h && moVar.y() && !moVar.v() && !moVar.A()) {
            this.ab.B(e(moVar), moVar);
        }
        this.ab.Z(moVar, etzVar);
    }

    public final void ay(ca caVar) {
        if (this.aG == null) {
            this.aG = new ArrayList();
        }
        this.aG.add(caVar);
    }

    public final void az(ca caVar) {
        List list = this.aG;
        if (list != null) {
            list.remove(caVar);
        }
    }

    public final int b(mo moVar) {
        if (moVar.q(524) || !moVar.s()) {
            return -1;
        }
        iu iuVar = this.g;
        int i = moVar.c;
        ArrayList arrayList = iuVar.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            it itVar = (it) arrayList.get(i2);
            int i3 = itVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = itVar.b;
                    if (i4 <= i) {
                        int i5 = itVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = itVar.b;
                    if (i6 == i) {
                        i = itVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (itVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (itVar.b <= i) {
                i += itVar.d;
            }
        }
        return i;
    }

    public final int c(View view) {
        mo moVarK = k(view);
        if (moVarK != null) {
            return moVarK.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ma) && this.n.u((ma) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        lz lzVar = this.n;
        if (lzVar != null && lzVar.ag()) {
            return this.n.D(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        lz lzVar = this.n;
        if (lzVar != null && lzVar.ag()) {
            return this.n.E(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        lz lzVar = this.n;
        if (lzVar != null && lzVar.ag()) {
            return this.n.F(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        lz lzVar = this.n;
        if (lzVar != null && lzVar.ah()) {
            return this.n.G(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        lz lzVar = this.n;
        if (lzVar != null && lzVar.ah()) {
            return this.n.H(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        lz lzVar = this.n;
        if (lzVar != null && lzVar.ah()) {
            return this.n.I(this.N);
        }
        return 0;
    }

    public final int d(View view) {
        mo moVarK = k(view);
        if (moVarK != null) {
            return moVarK.c();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        lz lzVarG = g();
        int iA = 0;
        if (lzVarG == null) {
            return false;
        }
        if (lzVarG.ah()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    as(0, measuredHeight, false);
                } else {
                    as(0, -measuredHeight, false);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zAk = lzVarG.ak();
                if (keyCode == 122) {
                    if (zAk) {
                        iA = this.m.a();
                    }
                } else if (!zAk) {
                    iA = this.m.a();
                }
                ad(iA);
                return true;
            }
        } else if (lzVarG.ag()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    as(measuredWidth, 0, false);
                } else {
                    as(-measuredWidth, 0, false);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zAk2 = lzVarG.ak();
                if (keyCode2 == 122) {
                    if (zAk2) {
                        iA = this.m.a();
                    }
                } else if (!zAk2) {
                    iA = this.m.a();
                }
                ad(iA);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aB().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aB().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aB().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aB().f(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((lv) arrayList.get(i)).i(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, BitmapDescriptorFactory.HUE_RED);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.E != null && arrayList.size() > 0 && this.E.h())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    final long e(mo moVar) {
        return this.m.c ? moVar.e : moVar.c;
    }

    public final Rect f(View view) {
        ma maVar = (ma) view.getLayoutParams();
        if (!maVar.e) {
            return maVar.d;
        }
        ml mlVar = this.N;
        if (mlVar.g && (maVar.fQ() || maVar.c.t())) {
            return maVar.d;
        }
        Rect rect = maVar.d;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.k;
            rect2.set(0, 0, 0, 0);
            ((lv) arrayList.get(i)).a(rect2, view, this, mlVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        maVar.e = false;
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0163, code lost:
    
        if (r5 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0181, code lost:
    
        if (r14 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0184, code lost:
    
        if (r5 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0187, code lost:
    
        if (r14 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0197, code lost:
    
        if ((r14 * r13) >= 0) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public lz g() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        lz lzVar = this.n;
        if (lzVar != null) {
            return lzVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(n()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        lz lzVar = this.n;
        if (lzVar != null) {
            return lzVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(n()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    public final mo h(int i) {
        mo moVar = null;
        if (this.y) {
            return null;
        }
        int iB = this.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            mo moVarK = k(this.h.e(i2));
            if (moVarK != null && !moVarK.v() && b(moVarK) == i) {
                if (!this.h.k(moVarK.a)) {
                    return moVarK;
                }
                moVar = moVarK;
            }
        }
        return moVar;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aB().g(0);
    }

    public final mo i(long j) {
        lt ltVar = this.m;
        mo moVar = null;
        if (ltVar != null && ltVar.c) {
            int iB = this.h.b();
            for (int i = 0; i < iB; i++) {
                mo moVarK = k(this.h.e(i));
                if (moVarK != null && !moVarK.v() && moVarK.e == j) {
                    if (!this.h.k(moVarK.a)) {
                        return moVarK;
                    }
                    moVar = moVarK;
                }
            }
        }
        return moVar;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aB().a;
    }

    public final mo j(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return k(view);
        }
        throw new IllegalArgumentException(a.bt(this, view, "View ", " is not a direct child of "));
    }

    public final View m(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final String n() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.au = 0;
        this.q = true;
        this.s = this.s && !isLayoutRequested();
        this.e.d();
        lz lzVar = this.n;
        if (lzVar != null) {
            lzVar.aJ(this);
        }
        this.Q = false;
        ThreadLocal threadLocal = kz.a;
        kz kzVar = (kz) threadLocal.get();
        this.L = kzVar;
        if (kzVar == null) {
            this.L = new kz();
            int[] iArr = ebm.a;
            Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            kz kzVar2 = this.L;
            kzVar2.e = (long) (1.0E9f / f);
            threadLocal.set(kzVar2);
        }
        this.L.c.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lw lwVar = this.E;
        if (lwVar != null) {
            lwVar.d();
        }
        ah();
        this.q = false;
        lz lzVar = this.n;
        if (lzVar != null) {
            lzVar.bz(this);
        }
        this.T.clear();
        removeCallbacks(this.aL);
        while (nn.a.a() != null) {
        }
        me meVar = this.e;
        int i = 0;
        while (true) {
            ArrayList arrayList = meVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            ebf.fJ(((mo) arrayList.get(i)).a);
            i++;
        }
        meVar.e(meVar.f.m, false);
        Iterator itA = new ebp(this).a();
        while (itA.hasNext()) {
            ebf.N((View) itA.next()).Q();
        }
        kz kzVar = this.L;
        if (kzVar != null) {
            kzVar.c.remove(this);
            this.L = null;
        }
        removeCallbacks(this.an);
        this.t = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lv) arrayList.get(i)).b(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.v) {
            return false;
        }
        this.am = null;
        if (aO(motionEvent)) {
            aC();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            ArrayList arrayList = this.al;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mc mcVar = (mc) arrayList.get(i);
                if (mcVar != null && mcVar != this.am) {
                    mcVar.j(motionEventObtain);
                }
            }
            return true;
        }
        lz lzVar = this.n;
        if (lzVar == null) {
            return false;
        }
        boolean zAg = lzVar.ag();
        boolean zAh = this.n.ah();
        VelocityTracker velocityTrackerObtain = this.ax;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.ax = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.ar) {
                this.ar = false;
            }
            this.aw = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.aA = x;
            this.ay = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.aB = y;
            this.az = y;
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || ebf.fK(edgeEffect) == BitmapDescriptorFactory.HUE_RED || canScrollHorizontally(-1)) {
                z = false;
            } else {
                ebf.e(this.A, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && ebf.fK(edgeEffect2) != BitmapDescriptorFactory.HUE_RED && !canScrollHorizontally(1)) {
                ebf.e(this.C, BitmapDescriptorFactory.HUE_RED, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 != null && ebf.fK(edgeEffect3) != BitmapDescriptorFactory.HUE_RED && !canScrollVertically(-1)) {
                ebf.e(this.B, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.D;
            if (edgeEffect4 == null || ebf.fK(edgeEffect4) == BitmapDescriptorFactory.HUE_RED || canScrollVertically(1)) {
                if (z || this.F == 2) {
                }
                int[] iArr = this.aK;
                iArr[1] = 0;
                iArr[0] = 0;
                aM(0);
            } else {
                ebf.e(this.D, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            ac(1);
            ag(1);
            int[] iArr2 = this.aK;
            iArr2[1] = 0;
            iArr2[0] = 0;
            aM(0);
        } else if (actionMasked == 1) {
            this.ax.clear();
            ag(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.aw);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.aw + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
            if (this.F != 1) {
                int i2 = (int) y2;
                int i3 = (int) x2;
                int i4 = i3 - this.ay;
                int i5 = i2 - this.az;
                if (!zAg || Math.abs(i4) <= this.aC) {
                    z2 = false;
                } else {
                    this.aA = i3;
                    z2 = true;
                }
                if (zAh && Math.abs(i5) > this.aC) {
                    this.aB = i2;
                } else if (z2) {
                }
                ac(1);
            }
        } else if (actionMasked == 3) {
            aC();
        } else if (actionMasked == 5) {
            this.aw = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.aA = x3;
            this.ay = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.aB = y3;
            this.az = y3;
        } else if (actionMasked == 6) {
            aG(motionEvent);
        }
        return this.F == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C();
        this.s = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        lz lzVar = this.n;
        if (lzVar == null) {
            A(i, i2);
            return;
        }
        boolean z = false;
        if (lzVar.ai()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            lz lzVar2 = this.n;
            ml mlVar = this.N;
            lzVar2.bw(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aM = z;
            if (z || this.m == null) {
                return;
            }
            if (mlVar.d == 1) {
                aD();
            }
            this.n.aY(i, i2);
            mlVar.i = true;
            aE();
            this.n.ba(i, i2);
            if (this.n.am()) {
                this.n.aY(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                mlVar.i = true;
                aE();
                this.n.ba(i, i2);
            }
            this.aN = getMeasuredWidth();
            this.aO = getMeasuredHeight();
            return;
        }
        if (this.r) {
            lzVar.bw(i, i2);
            return;
        }
        if (this.w) {
            ae();
            Q();
            aH();
            R(true);
            ml mlVar2 = this.N;
            if (mlVar2.k) {
                mlVar2.g = true;
            } else {
                this.g.d();
                mlVar2.g = false;
            }
            this.w = false;
            af(false);
        } else if (this.N.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        lt ltVar = this.m;
        ml mlVar3 = this.N;
        if (ltVar != null) {
            mlVar3.e = ltVar.a();
        } else {
            mlVar3.e = 0;
        }
        ae();
        lz lzVar3 = this.n;
        ml mlVar4 = this.N;
        lzVar3.bw(i, i2);
        af(false);
        mlVar4.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        removeCallbacks(this.an);
        this.t = false;
        if (ao()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f;
        if (savedState2 != null) {
            savedState.a = savedState2.a;
            return savedState;
        }
        lz lzVar = this.n;
        if (lzVar != null) {
            savedState.a = lzVar.P();
            return savedState;
        }
        savedState.a = null;
        return savedState;
    }

    public final boolean onScrollToTop(int i) {
        if (!this.aF || g() == null || !g().ah() || !canScrollVertically(-1)) {
            return false;
        }
        ad(0);
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        L();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        mo moVarK = k(view);
        if (moVarK != null) {
            if (moVarK.x()) {
                moVarK.j();
            } else if (!moVarK.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + moVarK + n());
            }
        }
        view.clearAnimation();
        B(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n.bx(this, view, view2) && view2 != null) {
            aJ(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (Build.VERSION.SDK_INT < 36 || mt.a() < 3700001) {
            return this.n.bf(this, view, rect, z, false);
        }
        Rect rect2 = this.ak;
        if (rect2 == null) {
            rect2 = new Rect();
            this.ak = rect2;
        }
        Rect rect3 = rect2;
        rect3.set(rect);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ma) {
            ma maVar = (ma) layoutParams;
            if (!maVar.e) {
                Rect rect4 = maVar.d;
                rect3.offset(-view.getScrollX(), -view.getScrollY());
                if (rect3.left <= 0) {
                    rect3.left -= rect4.left;
                }
                if (rect3.right >= view.getWidth()) {
                    rect3.right += rect4.right;
                }
                if (rect3.top <= 0) {
                    rect3.top -= rect4.top;
                }
                if (rect3.bottom >= view.getHeight()) {
                    rect3.bottom += rect4.bottom;
                }
                rect3.offset(view.getScrollX(), view.getScrollY());
            }
        }
        return this.n.bf(this, view, rect3, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mc) arrayList.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!this.t) {
            return super.requestFocus(i, rect);
        }
        removeCallbacks(this.an);
        this.t = false;
        View viewFV = null;
        if (this.m != null && this.n != null && !ao() && !this.v) {
            z();
            viewFV = this.n.fV(i, this.e, this.N);
        }
        if ((viewFV != null && viewFV.requestFocus(i, rect)) || super.requestFocus(i, rect)) {
            return true;
        }
        this.ap = true;
        try {
            View viewFocusSearch = super.focusSearch(getRootView().findFocus(), i);
            if (viewFocusSearch != null) {
                viewFocusSearch.requestFocus(i, rect);
            }
            return true;
        } finally {
            this.ap = false;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.aq != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        lz lzVar = this.n;
        if (lzVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean zAg = lzVar.ag();
        boolean zAh = this.n.ah();
        if (!zAg) {
            if (!zAh) {
                return;
            } else {
                zAh = true;
            }
        }
        ap(true != zAg ? 0 : i, true != zAh ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!ao()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.as |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            L();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.s) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aB().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aB().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aB().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            v("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
                this.v = true;
                this.ar = true;
                ah();
                return;
            }
            this.v = false;
            if (this.u && this.n != null && this.m != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void t(mo moVar) {
        View view = moVar.a;
        ViewParent parent = view.getParent();
        this.e.l(j(view));
        if (moVar.x()) {
            this.h.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        ke keVar = this.h;
        if (parent != this) {
            keVar.f(view, -1, true);
            return;
        }
        int iX = keVar.e.x(view);
        if (iX < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        keVar.a.e(iX);
        keVar.i(view);
    }

    public final void u(mc mcVar) {
        this.al.add(mcVar);
    }

    public final void v(String str) {
        if (ao()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(n()));
        }
        if (this.av > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(n())));
        }
    }

    final void x() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            View viewE = this.h.e(i);
            mo moVar = viewE == null ? null : ((ma) viewE.getLayoutParams()).c;
            if (!moVar.A()) {
                moVar.g();
            }
        }
        me meVar = this.e;
        ArrayList arrayList = meVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((mo) arrayList.get(i2)).g();
        }
        ArrayList arrayList2 = meVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((mo) arrayList2.get(i3)).g();
        }
        ArrayList arrayList3 = meVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((mo) meVar.b.get(i4)).g();
            }
        }
    }

    public final void y(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void z() {
        if (!this.s || this.y) {
            C();
            return;
        }
        if (this.g.k()) {
            if (!this.g.j(4) || this.g.j(11)) {
                if (this.g.k()) {
                    C();
                    return;
                }
                return;
            }
            ae();
            Q();
            this.g.f();
            if (!this.u) {
                int iA = this.h.a();
                int i = 0;
                while (true) {
                    if (i < iA) {
                        mo moVarK = k(this.h.d(i));
                        if (moVarK != null && !moVarK.A() && moVarK.y()) {
                            C();
                            break;
                        }
                        i++;
                    } else {
                        this.g.c();
                        break;
                    }
                }
            }
            af(true);
            R(true);
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new mh(0);
        Parcelable a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readParcelable(classLoader == null ? lz.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        lz lzVar = this.n;
        if (lzVar != null) {
            return lzVar.fU(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(n()));
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
