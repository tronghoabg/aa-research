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
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
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
import androidx.collection.SimpleArrayMap;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollFeedbackProviderCompat;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import com.waze.strings.DisplayStrings;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    public static final /* synthetic */ int O = 0;
    private static final Class[] R;

    /* renamed from: b, reason: collision with root package name */
    static final Interpolator f935b;

    /* renamed from: c, reason: collision with root package name */
    static final fc f936c;
    float A;
    final fd B;
    cv C;
    ct D;
    final fb E;
    boolean F;
    boolean G;
    boolean H;
    fg I;
    final int[] J;
    final List K;
    boolean L;
    DifferentialMotionFlingController M;
    ScrollFeedbackProviderCompat N;
    private final float S;
    private final ev T;
    private final Rect U;
    private final ArrayList V;
    private eq W;
    private NestedScrollingChildHelper aA;
    private final int[] aB;
    private final int[] aC;
    private Runnable aD;
    private boolean aE;
    private int aF;
    private int aG;
    private final DifferentialMotionFlingTarget aH;
    private ei aI;
    private ej aJ;
    private final ei aK;
    private int aa;
    private boolean ab;
    private int ac;
    private final AccessibilityManager ad;
    private List ae;
    private int af;
    private int ag;
    private EdgeEffect ah;
    private EdgeEffect ai;
    private EdgeEffect aj;
    private EdgeEffect ak;
    private int al;
    private int am;
    private VelocityTracker an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private ep at;
    private final int au;
    private final int av;
    private boolean aw;
    private boolean ax;
    private List ay;
    private final int[] az;

    /* renamed from: d, reason: collision with root package name */
    final et f937d;

    /* renamed from: e, reason: collision with root package name */
    ew f938e;

    /* renamed from: f, reason: collision with root package name */
    v f939f;

    /* renamed from: g, reason: collision with root package name */
    br f940g;

    /* renamed from: h, reason: collision with root package name */
    final gr f941h;

    /* renamed from: i, reason: collision with root package name */
    boolean f942i;

    /* renamed from: j, reason: collision with root package name */
    final Runnable f943j;

    /* renamed from: k, reason: collision with root package name */
    final Rect f944k;

    /* renamed from: l, reason: collision with root package name */
    final RectF f945l;
    eb m;
    en n;
    final List o;
    final ArrayList p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    eh y;
    float z;
    private static final int[] P = {R.attr.nestedScrollingEnabled};
    private static final float Q = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: a, reason: collision with root package name */
    static final boolean f934a = true;

    static {
        Class cls = Integer.TYPE;
        R = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f935b = new dy();
        f936c = new fc();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException, SecurityException {
        int i3;
        TypedArray typedArray;
        String str;
        super(context, attributeSet, i2);
        RecyclerView recyclerView = this;
        recyclerView.T = new ev(recyclerView);
        recyclerView.f937d = new et(recyclerView);
        recyclerView.f941h = new gr();
        recyclerView.f943j = new e(recyclerView, 6);
        recyclerView.f944k = new Rect();
        recyclerView.U = new Rect();
        recyclerView.f945l = new RectF();
        recyclerView.o = new ArrayList();
        recyclerView.p = new ArrayList();
        recyclerView.V = new ArrayList();
        recyclerView.aa = 0;
        recyclerView.w = false;
        recyclerView.x = false;
        recyclerView.af = 0;
        recyclerView.ag = 0;
        recyclerView.aJ = f936c;
        recyclerView.y = new eh();
        recyclerView.al = 0;
        recyclerView.am = -1;
        recyclerView.z = Float.MIN_VALUE;
        recyclerView.A = Float.MIN_VALUE;
        recyclerView.aw = true;
        recyclerView.ax = true;
        recyclerView.B = new fd(recyclerView);
        recyclerView.D = new ct();
        recyclerView.E = new fb();
        recyclerView.F = false;
        recyclerView.G = false;
        recyclerView.aI = new ei(recyclerView);
        recyclerView.H = false;
        recyclerView.az = new int[2];
        recyclerView.aB = new int[2];
        recyclerView.aC = new int[2];
        recyclerView.J = new int[2];
        recyclerView.K = new ArrayList();
        recyclerView.aD = new e(recyclerView, 7);
        recyclerView.aF = 0;
        recyclerView.aG = 0;
        recyclerView.aK = new ei(recyclerView);
        dz dzVar = new dz(recyclerView);
        recyclerView.aH = dzVar;
        recyclerView.M = new DifferentialMotionFlingController(recyclerView.getContext(), dzVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.as = viewConfiguration.getScaledTouchSlop();
        recyclerView.z = ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        recyclerView.A = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        recyclerView.au = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.av = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.S = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.y.d(recyclerView.aI);
        recyclerView.f939f = new v(new ei(recyclerView));
        recyclerView.f940g = new br(new ei(recyclerView));
        if (ViewCompat.getImportantForAutofill(recyclerView) == 0) {
            ViewCompat.setImportantForAutofill(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.ad = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.aj(new fg(recyclerView));
        int[] iArr = android.support.v7.c.a.f639a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        ViewCompat.saveAttributeDataForStyleable(recyclerView, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.f942i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        recyclerView.ax = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.t()));
            }
            Resources resources = recyclerView.getContext().getResources();
            typedArray = typedArrayObtainStyledAttributes;
            str = string;
            i3 = i2;
            new cq(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.waze.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.waze.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.waze.R.dimen.fastscroll_margin));
            recyclerView = this;
        } else {
            i3 = i2;
            typedArray = typedArrayObtainStyledAttributes;
            str = string;
        }
        typedArray.recycle();
        recyclerView.L = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.bc(context, str, attributeSet, i3);
        int[] iArr2 = P;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        ViewCompat.saveAttributeDataForStyleable(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i3, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        PoolingContainer.setPoolingContainer(recyclerView, true);
    }

    static void E(fe feVar) {
        WeakReference<RecyclerView> weakReference = feVar.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == feVar.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            feVar.mNestedRecyclerView = null;
        }
    }

    static void S(View view, Rect rect) {
        eo eoVar = (eo) view.getLayoutParams();
        Rect rect2 = eoVar.f1419d;
        rect.set((view.getLeft() - rect2.left) - eoVar.leftMargin, (view.getTop() - rect2.top) - eoVar.topMargin, view.getRight() + rect2.right + eoVar.rightMargin, view.getBottom() + rect2.bottom + eoVar.bottomMargin);
    }

    private final int a(int i2, float f2) {
        float width = i2 / getWidth();
        float height = f2 / getHeight();
        EdgeEffect edgeEffect = this.ah;
        float f3 = 0.0f;
        if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.aj;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.aj;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fOnPullDistance = EdgeEffectCompat.onPullDistance(edgeEffect3, width, height);
                    if (EdgeEffectCompat.getDistance(this.aj) == 0.0f) {
                        this.aj.onRelease();
                    }
                    f3 = fOnPullDistance;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.ah;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -EdgeEffectCompat.onPullDistance(edgeEffect4, -width, 1.0f - height);
                if (EdgeEffectCompat.getDistance(this.ah) == 0.0f) {
                    this.ah.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    private final int aH(int i2, float f2) {
        float height = i2 / getHeight();
        float width = f2 / getWidth();
        EdgeEffect edgeEffect = this.ai;
        float f3 = 0.0f;
        if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.ak;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.ak;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fOnPullDistance = EdgeEffectCompat.onPullDistance(edgeEffect3, height, 1.0f - width);
                    if (EdgeEffectCompat.getDistance(this.ak) == 0.0f) {
                        this.ak.onRelease();
                    }
                    f3 = fOnPullDistance;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.ai;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -EdgeEffectCompat.onPullDistance(edgeEffect4, -height, width);
                if (EdgeEffectCompat.getDistance(this.ai) == 0.0f) {
                    this.ai.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    private final NestedScrollingChildHelper aI() {
        NestedScrollingChildHelper nestedScrollingChildHelper = this.aA;
        if (nestedScrollingChildHelper != null) {
            return nestedScrollingChildHelper;
        }
        NestedScrollingChildHelper nestedScrollingChildHelper2 = new NestedScrollingChildHelper(this);
        this.aA = nestedScrollingChildHelper2;
        return nestedScrollingChildHelper2;
    }

    private final ScrollFeedbackProviderCompat aJ() {
        ScrollFeedbackProviderCompat scrollFeedbackProviderCompat = this.N;
        if (scrollFeedbackProviderCompat != null) {
            return scrollFeedbackProviderCompat;
        }
        ScrollFeedbackProviderCompat scrollFeedbackProviderCompatCreateProvider = ScrollFeedbackProviderCompat.createProvider(this);
        this.N = scrollFeedbackProviderCompatCreateProvider;
        return scrollFeedbackProviderCompatCreateProvider;
    }

    private final void aK(fe feVar) {
        View view = feVar.itemView;
        ViewParent parent = view.getParent();
        this.f937d.o(o(view));
        if (feVar.isTmpDetached()) {
            this.f940g.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        br brVar = this.f940g;
        if (parent != this) {
            brVar.f(view, -1, true);
        } else {
            brVar.i(view);
        }
    }

    private final void aL() {
        aU();
        an(0);
    }

    private final void aM() {
        View viewS;
        fb fbVar = this.E;
        fbVar.b(1);
        R(fbVar);
        fbVar.f1465i = false;
        ap();
        gr grVar = this.f941h;
        grVar.g();
        Y();
        aQ();
        fe feVarO = null;
        View focusedChild = (this.aw && hasFocus() && this.m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewS = s(focusedChild)) != null) {
            feVarO = o(viewS);
        }
        if (feVarO == null) {
            aT();
        } else {
            fbVar.m = this.m.hasStableIds() ? feVarO.getItemId() : -1L;
            fbVar.f1468l = this.w ? -1 : feVarO.isRemoved() ? feVarO.mOldPosition : feVarO.getAbsoluteAdapterPosition();
            View focusedChild2 = feVarO.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            fbVar.n = id;
        }
        fbVar.f1464h = fbVar.f1466j && this.G;
        this.G = false;
        this.F = false;
        fbVar.f1463g = fbVar.f1467k;
        fbVar.f1461e = this.m.getItemCount();
        aO(this.az);
        if (fbVar.f1466j) {
            int iA = this.f940g.a();
            for (int i2 = 0; i2 < iA; i2++) {
                fe feVarP = p(this.f940g.d(i2));
                if (!feVarP.shouldIgnore() && (!feVarP.isInvalid() || this.m.hasStableIds())) {
                    eh.q(feVarP);
                    feVarP.getUnmodifiedPayloads();
                    grVar.f(feVarP, eh.e(feVarP));
                    if (fbVar.f1464h && feVarP.isUpdated() && !feVarP.isRemoved() && !feVarP.shouldIgnore() && !feVarP.isInvalid()) {
                        grVar.d(h(feVarP), feVarP);
                    }
                }
            }
        }
        if (fbVar.f1467k) {
            int iB = this.f940g.b();
            for (int i3 = 0; i3 < iB; i3++) {
                fe feVarP2 = p(this.f940g.e(i3));
                if (!feVarP2.shouldIgnore()) {
                    feVarP2.saveOldPosition();
                }
            }
            boolean z = fbVar.f1462f;
            fbVar.f1462f = false;
            this.n.q(this.f937d, fbVar);
            fbVar.f1462f = z;
            for (int i4 = 0; i4 < this.f940g.a(); i4++) {
                fe feVarP3 = p(this.f940g.d(i4));
                if (!feVarP3.shouldIgnore()) {
                    SimpleArrayMap simpleArrayMap = grVar.f1587a;
                    gq gqVar = (gq) simpleArrayMap.get(feVarP3);
                    if (gqVar == null || (gqVar.f1584b & 4) == 0) {
                        eh.q(feVarP3);
                        boolean zHasAnyOfTheFlags = feVarP3.hasAnyOfTheFlags(8192);
                        feVarP3.getUnmodifiedPayloads();
                        eg egVarE = eh.e(feVarP3);
                        if (zHasAnyOfTheFlags) {
                            ad(feVarP3, egVarE);
                        } else {
                            gq gqVarA = (gq) simpleArrayMap.get(feVarP3);
                            if (gqVarA == null) {
                                gqVarA = gq.a();
                                simpleArrayMap.put(feVarP3, gqVarA);
                            }
                            gqVarA.f1584b |= 2;
                            gqVarA.f1585c = egVarE;
                        }
                    }
                }
            }
            F();
        } else {
            F();
        }
        Z();
        aq(false);
        fbVar.f1460d = 2;
    }

    private final void aN() {
        ap();
        Y();
        fb fbVar = this.E;
        fbVar.b(6);
        this.f939f.e();
        fbVar.f1461e = this.m.getItemCount();
        fbVar.f1459c = 0;
        if (this.f938e != null && this.m.canRestoreState()) {
            Parcelable parcelable = this.f938e.f1437a;
            if (parcelable != null) {
                this.n.Z(parcelable);
            }
            this.f938e = null;
        }
        fbVar.f1463g = false;
        this.n.q(this.f937d, fbVar);
        fbVar.f1462f = false;
        fbVar.f1466j = fbVar.f1466j && this.y != null;
        fbVar.f1460d = 4;
        Z();
        aq(false);
    }

    private final void aO(int[] iArr) {
        int iA = this.f940g.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < iA; i4++) {
            fe feVarP = p(this.f940g.d(i4));
            if (!feVarP.shouldIgnore()) {
                int layoutPosition = feVarP.getLayoutPosition();
                if (layoutPosition < i3) {
                    i3 = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i2;
    }

    private final void aP(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.am) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.am = motionEvent.getPointerId(i2);
            int x = (int) (motionEvent.getX(i2) + 0.5f);
            this.aq = x;
            this.ao = x;
            int y = (int) (motionEvent.getY(i2) + 0.5f);
            this.ar = y;
            this.ap = y;
        }
    }

    private final void aQ() {
        boolean z;
        if (this.w) {
            this.f939f.j();
            if (this.x) {
                this.n.A();
            }
        }
        boolean zAZ = aZ();
        v vVar = this.f939f;
        if (zAZ) {
            vVar.g();
        } else {
            vVar.e();
        }
        boolean z2 = this.F || this.G;
        fb fbVar = this.E;
        boolean z3 = this.s && this.y != null && ((z = this.w) || z2 || this.n.w) && (!z || this.m.hasStableIds());
        fbVar.f1466j = z3;
        fbVar.f1467k = z3 && z2 && !this.w && aZ();
    }

    private final void aR() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.ah;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.ah.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.ai;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.ai.isFinished();
        }
        EdgeEffect edgeEffect3 = this.aj;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.aj.isFinished();
        }
        EdgeEffect edgeEffect4 = this.ak;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.ak.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void aS(View view, View view2) {
        boolean z;
        RecyclerView recyclerView;
        View view3;
        View view4 = view2 != null ? view2 : view;
        Rect rect = this.f944k;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof eo) {
            eo eoVar = (eo) layoutParams;
            if (!eoVar.f1420e) {
                Rect rect2 = eoVar.f1419d;
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
        en enVar = this.n;
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
        enVar.bk(recyclerView, view3, rect, z2, z);
    }

    private final void aT() {
        fb fbVar = this.E;
        fbVar.m = -1L;
        fbVar.f1468l = -1;
        fbVar.n = -1;
    }

    private final void aU() {
        VelocityTracker velocityTracker = this.an;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        aR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aV(int i2) {
        boolean zAe = this.n.ae();
        int i3 = zAe;
        if (this.n.af()) {
            i3 = (zAe ? 1 : 0) | 2;
        }
        startNestedScroll(i3, i2);
    }

    private final void aW() {
        fa faVar;
        this.B.d();
        en enVar = this.n;
        if (enVar == null || (faVar = enVar.v) == null) {
            return;
        }
        faVar.j();
    }

    private final boolean aX(MotionEvent motionEvent) {
        ArrayList arrayList = this.V;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            eq eqVar = (eq) arrayList.get(i2);
            if (eqVar.h(this, motionEvent) && action != 3) {
                this.W = eqVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aY(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int iMax;
        int iMax2;
        en enVar = this.n;
        if (enVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.u) {
            return false;
        }
        boolean zAe = enVar.ae();
        boolean zAf = enVar.af();
        if (!zAe || Math.abs(i2) < i4) {
            i2 = 0;
        }
        if (!zAf || Math.abs(i3) < i4) {
            i3 = 0;
        }
        if (i2 == 0) {
            if (i3 == 0) {
                return false;
            }
            i2 = 0;
        }
        if (i2 == 0) {
            i6 = 0;
        } else {
            EdgeEffect edgeEffect = this.ah;
            if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.aj;
                if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                    if (ba(this.aj, i2, getWidth())) {
                        this.aj.onAbsorb(i2);
                        i2 = 0;
                    }
                    i6 = i2;
                    i2 = 0;
                }
                i6 = 0;
            } else {
                int i8 = -i2;
                if (ba(this.ah, i8, getWidth())) {
                    this.ah.onAbsorb(i8);
                    i2 = 0;
                }
                i6 = i2;
                i2 = 0;
            }
        }
        if (i3 == 0) {
            i7 = i3;
            i3 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.ai;
            if (edgeEffect3 == null || EdgeEffectCompat.getDistance(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.ak;
                if (edgeEffect4 != null && EdgeEffectCompat.getDistance(edgeEffect4) != 0.0f) {
                    if (ba(this.ak, i3, getHeight())) {
                        this.ak.onAbsorb(i3);
                        i3 = 0;
                    }
                    i7 = 0;
                }
                i7 = i3;
                i3 = 0;
            } else {
                int i9 = -i3;
                if (ba(this.ai, i9, getHeight())) {
                    this.ai.onAbsorb(i9);
                    i3 = 0;
                }
                i7 = 0;
            }
        }
        if (i6 != 0) {
            int i10 = -i5;
            iMax = Math.max(i10, Math.min(i6, i5));
            iMax2 = Math.max(i10, Math.min(i3, i5));
            aV(1);
            this.B.a(iMax, iMax2);
        } else if (i3 != 0) {
            i6 = 0;
            int i102 = -i5;
            iMax = Math.max(i102, Math.min(i6, i5));
            iMax2 = Math.max(i102, Math.min(i3, i5));
            aV(1);
            this.B.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i2 == 0) {
            if (i7 == 0) {
                return (iMax == 0 && iMax2 == 0) ? false : true;
            }
            i2 = 0;
        }
        float f2 = i2;
        float f3 = i7;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z = zAe || zAf;
            dispatchNestedFling(f2, f3, z);
            ep epVar = this.at;
            if (epVar != null && epVar.e(i2, i7)) {
                return true;
            }
            if (z) {
                int i11 = -i5;
                aV(1);
                this.B.a(Math.max(i11, Math.min(i2, i5)), Math.max(i11, Math.min(i7, i5)));
                return true;
            }
        }
        return false;
    }

    private final boolean aZ() {
        return this.y != null && this.n.y();
    }

    private final boolean ba(EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        float distance = EdgeEffectCompat.getDistance(edgeEffect) * i3;
        float fAbs = Math.abs(-i2);
        float f2 = this.S * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f2);
        double d2 = Q;
        return ((float) (((double) f2) * Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < distance;
    }

    private static final int bb(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i3) / 4.0f) * EdgeEffectCompat.onPullDistance(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f));
            if (iRound != i2) {
                edgeEffect.finish();
            }
            return i2 - iRound;
        }
        if (i2 >= 0 || edgeEffect2 == null || EdgeEffectCompat.getDistance(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f2 = i3;
        int iRound2 = Math.round((f2 / 4.0f) * EdgeEffectCompat.onPullDistance(edgeEffect2, (i2 * 4.0f) / f2, 0.5f));
        if (iRound2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - iRound2;
    }

    private final void bc(Context context, String str, AttributeSet attributeSet, int i2) throws NoSuchMethodException, SecurityException {
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
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(en.class);
                try {
                    constructor = clsAsSubclass.getConstructor(R);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), 0};
                } catch (NoSuchMethodException e2) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e3);
                    }
                }
                constructor.setAccessible(true);
                al((en) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e8);
            }
        }
    }

    static fe p(View view) {
        if (view == null) {
            return null;
        }
        return ((eo) view.getLayoutParams()).f1418c;
    }

    static RecyclerView q(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewQ = q(viewGroup.getChildAt(i2));
            if (recyclerViewQ != null) {
                return recyclerViewQ;
            }
        }
        return null;
    }

    public final void A(ej ejVar) {
        en enVar = this.n;
        if (enVar != null) {
            enVar.T("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(ejVar);
        W();
        requestLayout();
    }

    public final void B(eq eqVar) {
        this.V.add(eqVar);
    }

    final void C(fe feVar, eg egVar, eg egVar2) {
        aK(feVar);
        feVar.setIsRecyclable(false);
        eh ehVar = this.y;
        int i2 = egVar.f1389a;
        int i3 = egVar.f1390b;
        View view = feVar.itemView;
        int left = egVar2 == null ? view.getLeft() : egVar2.f1389a;
        int top = egVar2 == null ? view.getTop() : egVar2.f1390b;
        if (feVar.isRemoved() || (i2 == left && i3 == top)) {
            ehVar.o(feVar);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!ehVar.l(feVar, i2, i3, left, top)) {
                return;
            }
        }
        ab();
    }

    final void D(String str) {
        if (aw()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(t()));
        }
        if (this.ag > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(t())));
        }
    }

    final void F() {
        int iB = this.f940g.b();
        for (int i2 = 0; i2 < iB; i2++) {
            fe feVarP = p(this.f940g.e(i2));
            if (!feVarP.shouldIgnore()) {
                feVarP.clearOldPosition();
            }
        }
        et etVar = this.f937d;
        ArrayList arrayList = etVar.f1431c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((fe) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList2 = etVar.f1429a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((fe) arrayList2.get(i4)).clearOldPosition();
        }
        ArrayList arrayList3 = etVar.f1430b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ((fe) etVar.f1430b.get(i5)).clearOldPosition();
            }
        }
    }

    final void G(int i2, int i3) {
        EdgeEffect edgeEffect = this.ah;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i2 > 0) {
            this.ah.onRelease();
            zIsFinished = this.ah.isFinished();
        }
        EdgeEffect edgeEffect2 = this.aj;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.aj.onRelease();
            zIsFinished |= this.aj.isFinished();
        }
        EdgeEffect edgeEffect3 = this.ai;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.ai.onRelease();
            zIsFinished |= this.ai.isFinished();
        }
        EdgeEffect edgeEffect4 = this.ak;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.ak.onRelease();
            zIsFinished |= this.ak.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    final void H() {
        if (!this.s || this.w) {
            Trace.beginSection("RV FullInvalidate");
            L();
            Trace.endSection();
            return;
        }
        if (this.f939f.l()) {
            if (!this.f939f.k(4) || this.f939f.k(11)) {
                if (this.f939f.l()) {
                    Trace.beginSection("RV FullInvalidate");
                    L();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            ap();
            Y();
            this.f939f.g();
            if (!this.t) {
                int iA = this.f940g.a();
                int i2 = 0;
                while (true) {
                    if (i2 < iA) {
                        fe feVarP = p(this.f940g.d(i2));
                        if (feVarP != null && !feVarP.shouldIgnore() && feVarP.isUpdated()) {
                            L();
                            break;
                        }
                        i2++;
                    } else {
                        this.f939f.d();
                        break;
                    }
                }
            }
            aq(true);
            Z();
            Trace.endSection();
        }
    }

    final void I(int i2, int i3) {
        setMeasuredDimension(en.ar(i2, getPaddingLeft() + getPaddingRight(), ViewCompat.getMinimumWidth(this)), en.ar(i3, getPaddingTop() + getPaddingBottom(), ViewCompat.getMinimumHeight(this)));
    }

    final void J(View view) {
        fe feVarP = p(view);
        eb ebVar = this.m;
        if (ebVar != null && feVarP != null) {
            ebVar.onViewAttachedToWindow(feVarP);
        }
        List list = this.ae;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    final void K(View view) {
        fe feVarP = p(view);
        eb ebVar = this.m;
        if (ebVar != null && feVarP != null) {
            ebVar.onViewDetachedFromWindow(feVarP);
        }
        List list = this.ae;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((android.support.v7.widget.a.j) this.ae.get(size)).f(view);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03a4  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void L() {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.L():void");
    }

    final void M(int i2, int i3) {
        this.ag++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        aA(i3);
        List list = this.ay;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((ed) this.ay.get(size)).a(this, i2, i3);
                }
            }
        }
        this.ag--;
    }

    final void N() {
        if (this.ak != null) {
            return;
        }
        EdgeEffect edgeEffectJ = this.aJ.j(this);
        this.ak = edgeEffectJ;
        if (this.f942i) {
            edgeEffectJ.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectJ.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void O() {
        if (this.ah != null) {
            return;
        }
        EdgeEffect edgeEffectJ = this.aJ.j(this);
        this.ah = edgeEffectJ;
        if (this.f942i) {
            edgeEffectJ.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectJ.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    final void P() {
        if (this.aj != null) {
            return;
        }
        EdgeEffect edgeEffectJ = this.aJ.j(this);
        this.aj = edgeEffectJ;
        if (this.f942i) {
            edgeEffectJ.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectJ.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    final void Q() {
        if (this.ai != null) {
            return;
        }
        EdgeEffect edgeEffectJ = this.aJ.j(this);
        this.ai = edgeEffectJ;
        if (this.f942i) {
            edgeEffectJ.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectJ.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void R(fb fbVar) {
        if (this.al != 2) {
            fbVar.o = 0;
            fbVar.p = 0;
        } else {
            OverScroller overScroller = this.B.f1469a;
            fbVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            fbVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void T() {
        this.ak = null;
        this.ai = null;
        this.aj = null;
        this.ah = null;
    }

    public final void U() {
        if (this.p.size() == 0) {
            return;
        }
        en enVar = this.n;
        if (enVar != null) {
            enVar.T("Cannot invalidate item decorations during a scroll or layout");
        }
        W();
        requestLayout();
    }

    final void V(int i2) {
        if (this.n == null) {
            return;
        }
        an(2);
        this.n.aa(i2);
        awakenScrollBars();
    }

    final void W() {
        int iB = this.f940g.b();
        for (int i2 = 0; i2 < iB; i2++) {
            ((eo) this.f940g.e(i2).getLayoutParams()).f1420e = true;
        }
        ArrayList arrayList = this.f937d.f1431c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            eo eoVar = (eo) ((fe) arrayList.get(i3)).itemView.getLayoutParams();
            if (eoVar != null) {
                eoVar.f1420e = true;
            }
        }
    }

    final void X(int i2, int i3, boolean z) {
        int i4;
        int iB = this.f940g.b();
        int i5 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i5 >= iB) {
                break;
            }
            fe feVarP = p(this.f940g.e(i5));
            if (feVarP != null && !feVarP.shouldIgnore()) {
                int i6 = feVarP.mPosition;
                if (i6 >= i4) {
                    feVarP.offsetPosition(-i3, z);
                    this.E.f1462f = true;
                } else if (i6 >= i2) {
                    feVarP.flagRemovedAndOffsetPosition(i2 - 1, -i3, z);
                    this.E.f1462f = true;
                }
            }
            i5++;
        }
        et etVar = this.f937d;
        ArrayList arrayList = etVar.f1431c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            fe feVar = (fe) arrayList.get(size);
            if (feVar != null) {
                int i7 = feVar.mPosition;
                if (i7 >= i4) {
                    feVar.offsetPosition(-i3, z);
                } else if (i7 >= i2) {
                    feVar.addFlags(8);
                    etVar.k(size);
                }
            }
        }
    }

    final void Y() {
        this.af++;
    }

    final void Z() {
        aa(true);
    }

    final void aB(fe feVar, int i2) {
        if (!aw()) {
            feVar.itemView.setImportantForAccessibility(i2);
        } else {
            feVar.mPendingAccessibilityState = i2;
            this.K.add(feVar);
        }
    }

    public final void aC() {
        this.r = true;
    }

    public final void aD(int i2, int i3) {
        aE(i2, i3, false);
    }

    final void aE(int i2, int i3, boolean z) {
        en enVar = this.n;
        if (enVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.u) {
            return;
        }
        if (true != enVar.ae()) {
            i2 = 0;
        }
        if (true != enVar.af()) {
            i3 = 0;
        }
        if (i2 == 0) {
            if (i3 == 0) {
                return;
            } else {
                i2 = 0;
            }
        }
        if (z) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.B.c(i2, i3, Integer.MIN_VALUE, null);
    }

    public final void aF(ed edVar) {
        if (this.ay == null) {
            this.ay = new ArrayList();
        }
        this.ay.add(edVar);
    }

    public final void aG(ed edVar) {
        List list = this.ay;
        if (list != null) {
            list.remove(edVar);
        }
    }

    final void aa(boolean z) {
        int i2;
        int i3 = this.af - 1;
        this.af = i3;
        if (i3 <= 0) {
            this.af = 0;
            if (z) {
                int i4 = this.ac;
                this.ac = 0;
                if (i4 != 0 && av()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    AccessibilityEventCompat.setContentChangeTypes(accessibilityEventObtain, i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                List list = this.K;
                for (int size = list.size() - 1; size >= 0; size--) {
                    fe feVar = (fe) list.get(size);
                    if (feVar.itemView.getParent() == this && !feVar.shouldIgnore() && (i2 = feVar.mPendingAccessibilityState) != -1) {
                        feVar.itemView.setImportantForAccessibility(i2);
                        feVar.mPendingAccessibilityState = -1;
                    }
                }
                list.clear();
            }
        }
    }

    final void ab() {
        if (this.H || !this.q) {
            return;
        }
        ViewCompat.postOnAnimation(this, this.aD);
        this.H = true;
    }

    final void ac(boolean z) {
        this.x = z | this.x;
        this.w = true;
        int iB = this.f940g.b();
        for (int i2 = 0; i2 < iB; i2++) {
            fe feVarP = p(this.f940g.e(i2));
            if (feVarP != null && !feVarP.shouldIgnore()) {
                feVarP.addFlags(6);
            }
        }
        W();
        et etVar = this.f937d;
        ArrayList arrayList = etVar.f1431c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            fe feVar = (fe) arrayList.get(i3);
            if (feVar != null) {
                feVar.addFlags(6);
                feVar.addChangePayload(null);
            }
        }
        eb ebVar = etVar.f1434f.m;
        if (ebVar == null || !ebVar.hasStableIds()) {
            etVar.j();
        }
    }

    final void ad(fe feVar, eg egVar) {
        feVar.setFlags(0, 8192);
        if (this.E.f1464h && feVar.isUpdated() && !feVar.isRemoved() && !feVar.shouldIgnore()) {
            this.f941h.d(h(feVar), feVar);
        }
        this.f941h.f(feVar, egVar);
    }

    final void ae() {
        eh ehVar = this.y;
        if (ehVar != null) {
            ehVar.j();
        }
        en enVar = this.n;
        if (enVar != null) {
            et etVar = this.f937d;
            enVar.aV(etVar);
            this.n.aW(etVar);
        }
        this.f937d.f();
    }

    public final void af(ej ejVar) {
        en enVar = this.n;
        if (enVar != null) {
            enVar.T("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(ejVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        W();
        requestLayout();
    }

    public final void ag(eq eqVar) {
        this.V.remove(eqVar);
        if (this.W == eqVar) {
            this.W = null;
        }
    }

    final void ah(int i2, int i3, int[] iArr) {
        fe feVar;
        ap();
        Y();
        Trace.beginSection("RV Scroll");
        fb fbVar = this.E;
        R(fbVar);
        int iE = i2 != 0 ? this.n.e(i2, this.f937d, fbVar) : 0;
        int iF = i3 != 0 ? this.n.f(i3, this.f937d, fbVar) : 0;
        Trace.endSection();
        int iA = this.f940g.a();
        for (int i4 = 0; i4 < iA; i4++) {
            View viewD = this.f940g.d(i4);
            fe feVarO = o(viewD);
            if (feVarO != null && (feVar = feVarO.mShadowingHolder) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = feVar.itemView;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Z();
        aq(false);
        if (iArr != null) {
            iArr[0] = iE;
            iArr[1] = iF;
        }
    }

    public final void ai(int i2) {
        if (this.u) {
            return;
        }
        ar();
        en enVar = this.n;
        if (enVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            enVar.aa(i2);
            awakenScrollBars();
        }
    }

    public final void aj(fg fgVar) {
        this.I = fgVar;
        ViewCompat.setAccessibilityDelegate(this, fgVar);
    }

    public void ak(eb ebVar) {
        suppressLayout(false);
        eb ebVar2 = this.m;
        if (ebVar2 != null) {
            ebVar2.unregisterAdapterDataObserver(this.T);
            this.m.onDetachedFromRecyclerView(this);
        }
        ae();
        this.f939f.j();
        eb ebVar3 = this.m;
        this.m = ebVar;
        if (ebVar != null) {
            ebVar.registerAdapterDataObserver(this.T);
            ebVar.onAttachedToRecyclerView(this);
        }
        en enVar = this.n;
        if (enVar != null) {
            enVar.by();
        }
        this.f937d.q(ebVar3, this.m);
        this.E.f1462f = true;
        ac(false);
        requestLayout();
    }

    public final void al(en enVar) {
        if (enVar == this.n) {
            return;
        }
        ar();
        if (this.n != null) {
            eh ehVar = this.y;
            if (ehVar != null) {
                ehVar.j();
            }
            en enVar2 = this.n;
            et etVar = this.f937d;
            enVar2.aV(etVar);
            this.n.aW(etVar);
            etVar.f();
            if (this.q) {
                this.n.bB(this);
            }
            this.n.bg(null);
            this.n = null;
        } else {
            this.f937d.f();
        }
        br brVar = this.f940g;
        brVar.f1174a.d();
        List list = brVar.f1175b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            brVar.f1176c.j((View) list.get(size));
            list.remove(size);
        }
        ei eiVar = brVar.f1176c;
        int iG = eiVar.g();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewI = eiVar.i(i2);
            eiVar.f1403a.K(viewI);
            viewI.clearAnimation();
        }
        eiVar.f1403a.removeAllViews();
        this.n = enVar;
        if (enVar != null) {
            if (enVar.s != null) {
                throw new IllegalArgumentException("LayoutManager " + enVar + " is already attached to a RecyclerView:" + enVar.s.t());
            }
            this.n.bg(this);
            if (this.q) {
                this.n.bn();
            }
        }
        this.f937d.p();
        requestLayout();
    }

    public final void am(ep epVar) {
        this.at = epVar;
    }

    final void an(int i2) {
        if (i2 == this.al) {
            return;
        }
        this.al = i2;
        if (i2 != 2) {
            aW();
        }
        en enVar = this.n;
        if (enVar != null) {
            enVar.aU(i2);
        }
        List list = this.ay;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ed) this.ay.get(size)).f(this, i2);
            }
        }
    }

    public void ao(int i2) {
        if (this.u) {
            return;
        }
        en enVar = this.n;
        if (enVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            enVar.aq(this, i2);
        }
    }

    final void ap() {
        int i2 = this.aa + 1;
        this.aa = i2;
        if (i2 != 1 || this.u) {
            return;
        }
        this.t = false;
    }

    final void aq(boolean z) {
        int i2 = this.aa;
        if (i2 <= 0) {
            this.aa = 1;
            i2 = 1;
        }
        if (!z && !this.u) {
            this.t = false;
        }
        if (i2 == 1) {
            if (z && this.t && !this.u && this.n != null && this.m != null) {
                L();
            }
            if (!this.u) {
                this.t = false;
            }
        }
        this.aa--;
    }

    public final void ar() {
        an(0);
        aW();
    }

    final boolean at(int i2, int i3) {
        return aY(i2, i3, 0, Integer.MAX_VALUE);
    }

    public final boolean au() {
        return !this.s || this.w || this.f939f.l();
    }

    final boolean av() {
        AccessibilityManager accessibilityManager = this.ad;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean aw() {
        return this.af > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean ax(int r22, int r23, int r24, int r25, android.view.MotionEvent r26, int r27) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.ax(int, int, int, int, android.view.MotionEvent, int):boolean");
    }

    public final void ay(android.support.v7.widget.a.j jVar) {
        if (this.ae == null) {
            this.ae = new ArrayList();
        }
        this.ae.add(jVar);
    }

    public final void az(android.support.v7.widget.a.j jVar) {
        List list = this.ae;
        if (list == null) {
            return;
        }
        list.remove(jVar);
    }

    final int b(int i2) {
        return bb(i2, this.ah, this.aj, getWidth());
    }

    final int c(int i2) {
        return bb(i2, this.ai, this.ak, getHeight());
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof eo) && this.n.w((eo) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        en enVar = this.n;
        if (enVar != null && enVar.ae()) {
            return enVar.E(this.E);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        en enVar = this.n;
        if (enVar != null && enVar.ae()) {
            return enVar.F(this.E);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        en enVar = this.n;
        if (enVar != null && enVar.ae()) {
            return enVar.G(this.E);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        en enVar = this.n;
        if (enVar != null && enVar.af()) {
            return enVar.H(this.E);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        en enVar = this.n;
        if (enVar != null && enVar.af()) {
            return enVar.I(this.E);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        en enVar = this.n;
        if (enVar != null && enVar.af()) {
            return enVar.J(this.E);
        }
        return 0;
    }

    final int d(fe feVar) {
        if (feVar.hasAnyOfTheFlags(DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_TITLE) || !feVar.isBound()) {
            return -1;
        }
        v vVar = this.f939f;
        int i2 = feVar.mPosition;
        ArrayList arrayList = vVar.f1620a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            u uVar = (u) arrayList.get(i3);
            int i4 = uVar.f1616a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = uVar.f1617b;
                    if (i5 <= i2) {
                        int i6 = uVar.f1619d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = uVar.f1617b;
                    if (i7 == i2) {
                        i2 = uVar.f1619d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (uVar.f1619d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (uVar.f1617b <= i2) {
                i2 += uVar.f1619d;
            }
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        en enVar = this.n;
        int itemCount = 0;
        if (enVar == null) {
            return false;
        }
        if (enVar.af()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    aD(0, measuredHeight);
                } else {
                    aD(0, -measuredHeight);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zAi = enVar.ai();
                if (keyCode == 122) {
                    if (zAi) {
                        itemCount = this.m.getItemCount();
                    }
                } else if (!zAi) {
                    itemCount = this.m.getItemCount();
                }
                ao(itemCount);
                return true;
            }
        } else if (enVar.ae()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    aD(measuredWidth, 0);
                } else {
                    aD(-measuredWidth, 0);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zAi2 = enVar.ai();
                if (keyCode2 == 122) {
                    if (zAi2) {
                        itemCount = this.m.getItemCount();
                    }
                } else if (!zAi2) {
                    itemCount = this.m.getItemCount();
                }
                ao(itemCount);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return aI().dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return aI().dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return aI().dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return aI().dispatchNestedScroll(i2, i3, i4, i5, iArr);
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
        for (int i2 = 0; i2 < size; i2++) {
            ((ej) arrayList.get(i2)).onDrawOver(canvas, this, this.E);
        }
        EdgeEffect edgeEffect = this.ah;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f942i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.ah;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.ai;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f942i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.ai;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.aj;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f942i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.aj;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.ak;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f942i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.ak;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.y != null && arrayList.size() > 0 && this.y.m())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final int e(View view) {
        fe feVarP = p(view);
        if (feVarP != null) {
            return feVarP.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public final int f() {
        return this.au;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0166, code lost:
    
        if (r16 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0184, code lost:
    
        if (r5 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0187, code lost:
    
        if (r16 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x018a, code lost:
    
        if (r5 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x019a, code lost:
    
        if ((r5 * r13) >= 0) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final int g() {
        return this.al;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        en enVar = this.n;
        if (enVar != null) {
            return enVar.g();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(t()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        en enVar = this.n;
        if (enVar != null) {
            return enVar.i(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(t()));
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
        return this.f942i;
    }

    final long h(fe feVar) {
        return this.m.hasStableIds() ? feVar.getItemId() : feVar.mPosition;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean hasNestedScrollingParent() {
        return aI().hasNestedScrollingParent();
    }

    final Rect i(View view) {
        eo eoVar = (eo) view.getLayoutParams();
        if (!eoVar.f1420e) {
            return eoVar.f1419d;
        }
        fb fbVar = this.E;
        if (fbVar.f1463g && (eoVar.b() || eoVar.f1418c.isInvalid())) {
            return eoVar.f1419d;
        }
        Rect rect = eoVar.f1419d;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f944k;
            rect2.set(0, 0, 0, 0);
            ((ej) arrayList.get(i2)).getItemOffsets(rect2, view, this, fbVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        eoVar.f1420e = false;
        return rect;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.u;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean isNestedScrollingEnabled() {
        return aI().isNestedScrollingEnabled();
    }

    public final eb j() {
        return this.m;
    }

    public final eh k() {
        return this.y;
    }

    public final en l() {
        return this.n;
    }

    public final ep m() {
        return this.at;
    }

    public final fe n(int i2) {
        fe feVar = null;
        if (this.w) {
            return null;
        }
        int iB = this.f940g.b();
        for (int i3 = 0; i3 < iB; i3++) {
            fe feVarP = p(this.f940g.e(i3));
            if (feVarP != null && !feVarP.isRemoved() && d(feVarP) == i2) {
                if (!this.f940g.m(feVarP.itemView)) {
                    return feVarP;
                }
                feVar = feVarP;
            }
        }
        return feVar;
    }

    public final fe o(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return p(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.af = 0;
        this.q = true;
        this.s = this.s && !isLayoutRequested();
        this.f937d.g();
        en enVar = this.n;
        if (enVar != null) {
            enVar.bn();
        }
        this.H = false;
        ThreadLocal threadLocal = cv.f1288a;
        cv cvVar = (cv) threadLocal.get();
        this.C = cvVar;
        if (cvVar == null) {
            this.C = new cv();
            Display display = ViewCompat.getDisplay(this);
            float f2 = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f2 = refreshRate;
                }
            }
            cv cvVar2 = this.C;
            cvVar2.f1292e = (long) (1.0E9f / f2);
            threadLocal.set(cvVar2);
        }
        this.C.f1290c.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eh ehVar = this.y;
        if (ehVar != null) {
            ehVar.j();
        }
        ar();
        this.q = false;
        en enVar = this.n;
        if (enVar != null) {
            enVar.bB(this);
        }
        this.K.clear();
        removeCallbacks(this.aD);
        while (gq.f1583a.acquire() != null) {
        }
        this.f937d.h();
        PoolingContainer.callPoolingContainerOnReleaseForChildren(this);
        cv cvVar = this.C;
        if (cvVar != null) {
            cvVar.f1290c.remove(this);
            this.C = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ej) arrayList.get(i2)).onDraw(canvas, this, this.E);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.u) {
            return false;
        }
        this.W = null;
        if (aX(motionEvent)) {
            aL();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            ArrayList arrayList = this.V;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                eq eqVar = (eq) arrayList.get(i2);
                if (eqVar != null && eqVar != this.W) {
                    eqVar.h(this, motionEventObtain);
                }
            }
            return true;
        }
        en enVar = this.n;
        if (enVar == null) {
            return false;
        }
        boolean zAe = enVar.ae();
        boolean zAf = enVar.af();
        VelocityTracker velocityTrackerObtain = this.an;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.an = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.ab) {
                this.ab = false;
            }
            this.am = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.aq = x;
            this.ao = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.ar = y;
            this.ap = y;
            EdgeEffect edgeEffect = this.ah;
            if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                EdgeEffectCompat.onPullDistance(this.ah, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.aj;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                EdgeEffectCompat.onPullDistance(this.aj, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.ai;
            if (edgeEffect3 != null && EdgeEffectCompat.getDistance(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                EdgeEffectCompat.onPullDistance(this.ai, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.ak;
            if (edgeEffect4 == null || EdgeEffectCompat.getDistance(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                if (z || this.al == 2) {
                }
                int[] iArr = this.aC;
                iArr[1] = 0;
                iArr[0] = 0;
                aV(0);
            } else {
                EdgeEffectCompat.onPullDistance(this.ak, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            an(1);
            stopNestedScroll(1);
            int[] iArr2 = this.aC;
            iArr2[1] = 0;
            iArr2[0] = 0;
            aV(0);
        } else if (actionMasked == 1) {
            this.an.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.am);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.am + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
            if (this.al != 1) {
                int i3 = (int) y2;
                int i4 = (int) x2;
                int i5 = i4 - this.ao;
                int i6 = i3 - this.ap;
                if (!zAe || Math.abs(i5) <= this.as) {
                    z2 = false;
                } else {
                    this.aq = i4;
                    z2 = true;
                }
                if (zAf && Math.abs(i6) > this.as) {
                    this.ar = i3;
                } else if (z2) {
                }
                an(1);
            }
        } else if (actionMasked == 3) {
            aL();
        } else if (actionMasked == 5) {
            this.am = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.aq = x3;
            this.ao = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ar = y3;
            this.ap = y3;
        } else if (actionMasked == 6) {
            aP(motionEvent);
        }
        return this.al == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Trace.beginSection("RV OnLayout");
        L();
        Trace.endSection();
        this.s = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        en enVar = this.n;
        if (enVar == null) {
            I(i2, i3);
            return;
        }
        boolean z = false;
        if (enVar.ag()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            en enVar2 = this.n;
            fb fbVar = this.E;
            enVar2.bz(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aE = z;
            if (z || this.m == null) {
                return;
            }
            if (fbVar.f1460d == 1) {
                aM();
            }
            this.n.bd(i2, i3);
            fbVar.f1465i = true;
            aN();
            this.n.bf(i2, i3);
            if (this.n.ak()) {
                this.n.bd(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                fbVar.f1465i = true;
                aN();
                this.n.bf(i2, i3);
            }
            this.aF = getMeasuredWidth();
            this.aG = getMeasuredHeight();
            return;
        }
        if (this.r) {
            enVar.bz(i2, i3);
            return;
        }
        if (this.v) {
            ap();
            Y();
            aQ();
            Z();
            fb fbVar2 = this.E;
            if (fbVar2.f1467k) {
                fbVar2.f1463g = true;
            } else {
                this.f939f.e();
                fbVar2.f1463g = false;
            }
            this.v = false;
            aq(false);
        } else if (this.E.f1467k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        eb ebVar = this.m;
        fb fbVar3 = this.E;
        if (ebVar != null) {
            fbVar3.f1461e = ebVar.getItemCount();
        } else {
            fbVar3.f1461e = 0;
        }
        ap();
        en enVar3 = this.n;
        fb fbVar4 = this.E;
        enVar3.bz(i2, i3);
        aq(false);
        fbVar4.f1463g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (aw()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ew)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ew ewVar = (ew) parcelable;
        this.f938e = ewVar;
        super.onRestoreInstanceState(ewVar.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ew ewVar = new ew(super.onSaveInstanceState());
        ew ewVar2 = this.f938e;
        if (ewVar2 != null) {
            ewVar.f1437a = ewVar2.f1437a;
            return ewVar;
        }
        en enVar = this.n;
        if (enVar != null) {
            ewVar.f1437a = enVar.Q();
            return ewVar;
        }
        ewVar.f1437a = null;
        return ewVar;
    }

    public final boolean onScrollToTop(int i2) {
        en enVar;
        if (!this.ax || (enVar = this.n) == null || !enVar.af() || !canScrollVertically(-1)) {
            return false;
        }
        ao(0);
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        T();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final View r(float f2, float f3) {
        int iA = this.f940g.a();
        while (true) {
            iA--;
            if (iA < 0) {
                return null;
            }
            View viewD = this.f940g.d(iA);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f2 >= viewD.getLeft() + translationX && f2 <= viewD.getRight() + translationX && f3 >= viewD.getTop() + translationY && f3 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final void removeDetachedView(View view, boolean z) {
        fe feVarP = p(view);
        if (feVarP != null) {
            if (feVarP.isTmpDetached()) {
                feVarP.clearTmpDetachFlag();
            } else if (!feVarP.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + feVarP + t());
            }
        }
        view.clearAnimation();
        K(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n.bj() && !aw() && view2 != null) {
            aS(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.bk(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.V;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((eq) arrayList.get(i2)).a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.aa != 0 || this.u) {
            this.t = true;
        } else {
            super.requestLayout();
        }
    }

    public final View s(View view) {
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

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        en enVar = this.n;
        if (enVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.u) {
            return;
        }
        boolean zAe = enVar.ae();
        boolean zAf = enVar.af();
        if (!zAe) {
            if (!zAf) {
                return;
            } else {
                zAf = true;
            }
        }
        ax(true != zAe ? 0 : i2, true != zAf ? 0 : i3, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!aw()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent) : 0;
            this.ac |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.f942i) {
            T();
        }
        this.f942i = z;
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

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final void setNestedScrollingEnabled(boolean z) {
        aI().setNestedScrollingEnabled(z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean startNestedScroll(int i2) {
        return aI().startNestedScroll(i2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final void stopNestedScroll() {
        aI().stopNestedScroll();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.u) {
            D("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.u = true;
                this.ab = true;
                ar();
                return;
            }
            this.u = false;
            if (this.t && this.n != null && this.m != null) {
                requestLayout();
            }
            this.t = false;
        }
    }

    final String t() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    final void u(int i2, int i3) {
        if (i2 < 0) {
            O();
            if (this.ah.isFinished()) {
                this.ah.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            P();
            if (this.aj.isFinished()) {
                this.aj.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            Q();
            if (this.ai.isFinished()) {
                this.ai.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            N();
            if (this.ak.isFinished()) {
                this.ak.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final void stopNestedScroll(int i2) {
        aI().stopNestedScroll(i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return aI().dispatchNestedPreScroll(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return aI().dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final boolean hasNestedScrollingParent(int i2) {
        return aI().hasNestedScrollingParent(i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final boolean startNestedScroll(int i2, int i3) {
        return aI().startNestedScroll(i2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        aI().dispatchNestedScroll(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void aA(int i2) {
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        en enVar = this.n;
        if (enVar != null) {
            return enVar.h(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(t()));
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.waze.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
