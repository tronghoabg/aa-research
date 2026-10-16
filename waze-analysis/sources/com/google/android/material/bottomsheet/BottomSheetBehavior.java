package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.internal.t;
import com.google.android.material.k.r;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int A;
    private com.google.android.material.k.k B;
    private ColorStateList C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private int O;
    private int P;
    private boolean Q;
    private r R;
    private boolean S;
    private final j T;
    private ValueAnimator U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a, reason: collision with root package name */
    int f6268a;
    private boolean aa;
    private int ab;
    private boolean ac;
    private final float ad;
    private int ae;
    private final ArrayList af;
    private VelocityTracker ag;
    private int ah;
    private WeakReference ai;
    private Map aj;
    private final Rect ak;
    private final ViewDragHelper.Callback al;

    /* renamed from: b, reason: collision with root package name */
    int f6269b;

    /* renamed from: c, reason: collision with root package name */
    int f6270c;

    /* renamed from: d, reason: collision with root package name */
    float f6271d;

    /* renamed from: e, reason: collision with root package name */
    int f6272e;

    /* renamed from: f, reason: collision with root package name */
    float f6273f;

    /* renamed from: g, reason: collision with root package name */
    boolean f6274g;

    /* renamed from: h, reason: collision with root package name */
    int f6275h;

    /* renamed from: i, reason: collision with root package name */
    ViewDragHelper f6276i;

    /* renamed from: j, reason: collision with root package name */
    int f6277j;

    /* renamed from: k, reason: collision with root package name */
    int f6278k;

    /* renamed from: l, reason: collision with root package name */
    WeakReference f6279l;
    final List m;
    int n;
    boolean o;
    final SparseIntArray p;
    final SparseIntArray q;
    final SparseIntArray r;
    private int s;
    private boolean t;
    private float u;
    private int v;
    private boolean w;
    private int x;
    private boolean y;
    private int z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = 0;
        this.t = true;
        this.D = -1;
        this.E = -1;
        this.T = new j(this);
        this.f6271d = 0.5f;
        this.f6273f = -1.0f;
        this.W = true;
        this.X = true;
        this.Z = true;
        this.f6275h = 4;
        this.ad = 0.1f;
        this.m = new ArrayList();
        this.af = new ArrayList();
        this.ah = -1;
        this.p = new SparseIntArray();
        this.q = new SparseIntArray();
        this.r = new SparseIntArray();
        this.ak = new Rect();
        this.al = new d(this);
        this.A = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f6303a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.C = t.n(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.R = r.m(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).i();
        }
        if (this.R != null) {
            com.google.android.material.k.k kVar = new com.google.android.material.k.k(this.R);
            this.B = kVar;
            kVar.r(context);
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                this.B.v(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.B.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Q(), 1.0f);
        this.U = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.U.addUpdateListener(new b(this));
        this.f6273f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || typedValuePeekValue.data != -1) {
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            O(typedValuePeekValue.data);
        }
        w(typedArrayObtainStyledAttributes.getBoolean(10, false));
        this.G = typedArrayObtainStyledAttributes.getBoolean(16, false);
        u(typedArrayObtainStyledAttributes.getBoolean(8, true));
        this.V = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.W = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.X = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.s = typedArrayObtainStyledAttributes.getInt(13, 0);
        v(typedArrayObtainStyledAttributes.getFloat(9, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            t(typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0));
        } else {
            t(typedValuePeekValue2.data);
        }
        this.v = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.w = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.Z = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.H = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.I = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.J = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.M = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.N = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.Q = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.u = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private final float Q() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.B == null || (weakReference = this.f6279l) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f6279l.get();
        if (!ad() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(ag(this.B.h(), rootWindowInsets.getRoundedCorner(0)), ag(this.B.i(), rootWindowInsets.getRoundedCorner(1)));
    }

    private final int R(View view, int i2, int i3) {
        return ViewCompat.addAccessibilityAction(view, view.getResources().getString(i2), new e(this, i3));
    }

    private final int S() {
        int iMin;
        int i2;
        int i3;
        if (this.y) {
            iMin = Math.min(Math.max(this.z, this.f6278k - ((this.f6277j * 9) / 16)), this.ae);
            i2 = this.O;
        } else {
            if (!this.G && !this.H && (i3 = this.F) > 0) {
                return Math.max(this.x, i3 + this.A);
            }
            iMin = this.x;
            i2 = this.O;
        }
        return iMin + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View T() {
        List list = this.m;
        if (list.isEmpty()) {
            return null;
        }
        return (View) ((WeakReference) list.get(0)).get();
    }

    private final void U() {
        int iS = S();
        boolean z = this.t;
        int i2 = this.f6278k;
        if (z) {
            this.f6272e = Math.max(i2 - iS, this.f6269b);
        } else {
            this.f6272e = i2 - iS;
        }
    }

    private final void V() {
        this.f6270c = (int) (this.f6278k * (1.0f - this.f6271d));
    }

    private final void W() {
        this.n = -1;
        this.ah = -1;
        this.ai = null;
        VelocityTracker velocityTracker = this.ag;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ag = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(View view, int i2, boolean z) {
        int iE;
        if (i2 == 3) {
            iE = e();
        } else if (i2 == 4) {
            iE = this.f6272e;
        } else if (i2 == 5) {
            iE = this.f6278k;
        } else {
            if (i2 != 6) {
                throw new IllegalArgumentException("Invalid state to get top offset: " + i2);
            }
            iE = this.f6270c;
        }
        ViewDragHelper viewDragHelper = this.f6276i;
        if (viewDragHelper == null || (!z ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), iE) : viewDragHelper.settleCapturedViewAt(view.getLeft(), iE))) {
            y(i2);
            return;
        }
        y(2);
        Z(i2, true);
        this.T.b(i2);
    }

    private final void Y() {
        View view;
        WeakReference weakReference = this.f6279l;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 1048576);
        ViewCompat.removeAccessibilityAction(view, 524288);
        ViewCompat.removeAccessibilityAction(view, 262144);
        SparseIntArray sparseIntArray = this.q;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            ViewCompat.removeAccessibilityAction(view, i2);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.p;
        int i3 = sparseIntArray2.get(0, -1);
        if (i3 != -1) {
            ViewCompat.removeAccessibilityAction(view, i3);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.r;
        int i4 = sparseIntArray3.get(0, -1);
        if (i4 != -1) {
            ViewCompat.removeAccessibilityAction(view, i4);
            sparseIntArray3.delete(0);
        }
        if (!this.t && this.f6275h != 6) {
            sparseIntArray2.put(0, R(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f6274g && this.f6275h != 5) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new e(this, 5));
        }
        int i5 = this.f6275h;
        if (i5 == 3) {
            if (K()) {
                sparseIntArray3.put(0, R(view, R.string.bottomsheet_action_collapse, 4));
            }
        } else if (i5 == 4) {
            sparseIntArray.put(0, R(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i5 != 6) {
                return;
            }
            if (K()) {
                sparseIntArray3.put(0, R(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, R(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    private final void Z(int i2, boolean z) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z2 = this.f6275h == 3 && (this.Q || ad());
        if (this.S == z2 || this.B == null) {
            return;
        }
        this.S = z2;
        if (!z || (valueAnimator = this.U) == null) {
            ValueAnimator valueAnimator2 = this.U;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.U.cancel();
            }
            this.B.w(this.S ? Q() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.U.reverse();
        } else {
            this.U.setFloatValues(this.B.g(), z2 ? Q() : 1.0f);
            this.U.start();
        }
    }

    private final void aa(boolean z) {
        WeakReference weakReference = this.f6279l;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.aj != null) {
                    return;
                } else {
                    this.aj = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f6279l.get() && z) {
                    this.aj.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.aj = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ab() {
        return this.f6274g;
    }

    private final boolean ac() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean ad() {
        WeakReference weakReference = this.f6279l;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f6279l.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean ae(View view) {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    private final boolean af() {
        if (this.f6276i != null) {
            return this.W || this.f6275h == 1;
        }
        return false;
    }

    private static final float ag(float f2, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f2 > 0.0f) {
                return radius / f2;
            }
        }
        return 0.0f;
    }

    private static final int ah(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ai() {
        View view;
        if (this.f6279l != null) {
            U();
            if (this.f6275h != 4 || (view = (View) this.f6279l.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    final boolean K() {
        return (this.V && this.f6274g) ? false : true;
    }

    public final boolean L() {
        return this.W;
    }

    final boolean M(View view, float f2) {
        if (this.V) {
            return true;
        }
        if (view.getTop() < this.f6272e) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * this.ad)) - ((float) this.f6272e)) / ((float) S()) > 0.5f;
    }

    public final void O(int i2) {
        boolean z = this.y;
        if (i2 == -1) {
            if (z) {
                return;
            } else {
                this.y = true;
            }
        } else {
            if (!z && this.x == i2) {
                return;
            }
            this.y = false;
            this.x = Math.max(0, i2);
        }
        ai();
    }

    public final void P() {
        this.v = 200;
    }

    public final float a() {
        return this.f6271d;
    }

    public final int e() {
        if (this.t) {
            return this.f6269b;
        }
        return Math.max(this.f6268a, this.K ? 0 : this.P);
    }

    public final int f() {
        if (this.y) {
            return -1;
        }
        return this.x;
    }

    public final int g() {
        return this.f6275h;
    }

    final View i(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View viewI = i(viewGroup.getChildAt(i2));
                if (viewI != null) {
                    return viewI;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        this.f6279l = null;
        this.f6276i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        this.f6279l = null;
        this.f6276i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View viewT;
        int i2;
        WeakReference weakReference;
        ViewDragHelper viewDragHelper;
        if (!v.isShown() || !this.W) {
            this.aa = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            W();
            actionMasked = 0;
        }
        VelocityTracker velocityTrackerObtain = this.ag;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.ag = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.ah = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            List list = this.m;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View view2 = (View) ((WeakReference) it.next()).get();
                    if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x2, y)) {
                        view = view2;
                        break;
                    }
                }
            }
            WeakReference weakReference2 = new WeakReference(view);
            this.ai = weakReference2;
            if (this.f6275h != 2 && weakReference2.get() != null) {
                this.n = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.o = true;
            }
            this.aa = this.n == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.ah);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.o = false;
            this.ai = null;
            this.n = -1;
            if (this.aa) {
                this.aa = false;
                return false;
            }
        }
        if (!this.aa && (viewDragHelper = this.f6276i) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        if (actionMasked == 2 && ac() && !this.aa && this.f6275h != 1 && (!this.w ? (viewT = T()) == null || !coordinatorLayout.isPointInChildBounds(viewT, (int) motionEvent.getX(), (int) motionEvent.getY()) : (weakReference = this.ai) == null || weakReference.get() == null) && this.f6276i != null && (i2 = this.ah) != -1) {
            if (Math.abs(i2 - motionEvent.getY()) > this.f6276i.getTouchSlop()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(ah(i2, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.D, marginLayoutParams.width), ah(i4, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.E, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        return ac() && ae(view) && this.f6275h != 3 && !this.Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r4 == false) goto L32;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5, int r6, int[] r7, int r8) {
        /*
            r1 = this;
            r2 = 1
            if (r8 != r2) goto L5
            goto L8f
        L5:
            boolean r5 = r1.ae(r4)
            if (r5 == 0) goto L8f
            int r5 = r3.getTop()
            int r8 = r5 - r6
            if (r6 <= 0) goto L46
            boolean r0 = r1.ac
            if (r0 != 0) goto L22
            boolean r0 = r1.X
            if (r0 != 0) goto L22
            boolean r4 = r4.canScrollVertically(r2)
            if (r4 == 0) goto L22
            goto L58
        L22:
            int r4 = r1.e()
            if (r8 >= r4) goto L38
            int r4 = r1.e()
            int r5 = r5 - r4
            r7[r2] = r5
            int r4 = -r5
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r4 = 3
            r1.y(r4)
            goto L81
        L38:
            boolean r4 = r1.W
            if (r4 == 0) goto L8f
            r7[r2] = r6
            int r4 = -r6
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r1.y(r2)
            goto L81
        L46:
            if (r6 >= 0) goto L81
            r0 = -1
            boolean r4 = r4.canScrollVertically(r0)
            boolean r0 = r1.ac
            if (r0 != 0) goto L5b
            boolean r0 = r1.X
            if (r0 != 0) goto L5b
            if (r4 != 0) goto L58
            goto L5d
        L58:
            r1.Y = r2
            return
        L5b:
            if (r4 != 0) goto L81
        L5d:
            int r4 = r1.f6272e
            if (r8 <= r4) goto L74
            boolean r8 = r1.ab()
            if (r8 == 0) goto L68
            goto L74
        L68:
            int r5 = r5 - r4
            r7[r2] = r5
            int r4 = -r5
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r4 = 4
            r1.y(r4)
            goto L81
        L74:
            boolean r4 = r1.W
            if (r4 == 0) goto L8f
            r7[r2] = r6
            int r4 = -r6
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r1.y(r2)
        L81:
            int r3 = r3.getTop()
            r1.q(r3)
            r1.ab = r6
            r1.ac = r2
            r2 = 0
            r1.Y = r2
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        if (!this.Z || v.isInTouchMode()) {
            return false;
        }
        int i2 = this.f6275h;
        if (i2 != 4 && i2 != 6) {
            return false;
        }
        Rect rect2 = this.ak;
        if (v.getLocalVisibleRect(rect2)) {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(v);
            if (rootWindowInsets != null) {
                rect2.bottom -= rootWindowInsets.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL).bottom;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        x(3);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        h hVar = (h) parcelable;
        hVar.getSuperState();
        int i2 = this.s;
        int i3 = 4;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.x = hVar.f6290b;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.t = hVar.f6291c;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f6274g = hVar.f6292d;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.V = hVar.f6293e;
            }
        }
        int i4 = hVar.f6289a;
        if (i4 != 1 && i4 != 2) {
            i3 = i4;
        }
        this.f6275h = i3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new h(super.onSaveInstanceState(coordinatorLayout, v), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.ab = 0;
        this.ac = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.e()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.y(r0)
            return
        Lf:
            boolean r3 = r2.ae(r5)
            if (r3 == 0) goto Lb2
            boolean r3 = r2.ac
            if (r3 != 0) goto L1b
            goto Lb2
        L1b:
            int r3 = r2.ab
            r5 = 6
            if (r3 <= 0) goto L31
            boolean r3 = r2.t
            if (r3 == 0) goto L26
            goto Lac
        L26:
            int r3 = r4.getTop()
            int r6 = r2.f6270c
            if (r3 <= r6) goto Lac
        L2e:
            r0 = r5
            goto Lac
        L31:
            boolean r3 = r2.f6274g
            if (r3 == 0) goto L52
            android.view.VelocityTracker r3 = r2.ag
            if (r3 != 0) goto L3b
            r3 = 0
            goto L4a
        L3b:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.u
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.ag
            int r6 = r2.n
            float r3 = r3.getYVelocity(r6)
        L4a:
            boolean r3 = r2.M(r4, r3)
            if (r3 == 0) goto L52
            r0 = 5
            goto Lac
        L52:
            int r3 = r2.ab
            r6 = 4
            if (r3 != 0) goto L90
            int r3 = r4.getTop()
            boolean r1 = r2.t
            if (r1 == 0) goto L71
            int r5 = r2.f6269b
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f6272e
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L94
            goto Lac
        L71:
            int r1 = r2.f6270c
            if (r3 >= r1) goto L80
            int r6 = r2.f6272e
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L2e
            goto Lac
        L80:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f6272e
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L94
            goto L2e
        L90:
            boolean r3 = r2.t
            if (r3 == 0) goto L96
        L94:
            r0 = r6
            goto Lac
        L96:
            int r3 = r4.getTop()
            int r0 = r2.f6270c
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f6272e
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L94
            goto L2e
        Lac:
            r3 = 0
            r2.X(r4, r0, r3)
            r2.ac = r3
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6275h == 1 && actionMasked == 0) {
            return true;
        }
        if (af()) {
            this.f6276i.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            W();
        }
        VelocityTracker velocityTrackerObtain = this.ag;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.ag = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (af() && actionMasked == 2 && !this.aa && Math.abs(this.ah - motionEvent.getY()) > this.f6276i.getTouchSlop()) {
            this.f6276i.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.aa;
    }

    public final void p(f fVar) {
        ArrayList arrayList = this.af;
        if (arrayList.contains(fVar)) {
            return;
        }
        arrayList.add(fVar);
    }

    final void q(int i2) {
        float fE;
        View view = (View) this.f6279l.get();
        if (view != null) {
            ArrayList arrayList = this.af;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.f6272e;
            if (i2 > i3 || i3 == e()) {
                int i4 = this.f6272e;
                fE = (i4 - i2) / (this.f6278k - i4);
            } else {
                int i5 = this.f6272e;
                fE = (i5 - i2) / (i5 - e());
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                ((f) arrayList.get(i6)).a(view, fE);
            }
        }
    }

    final void r(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.m.add(new WeakReference(view));
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                r(viewGroup.getChildAt(i2));
            }
        }
    }

    public final void s(boolean z) {
        this.W = z;
    }

    public final void t(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f6268a = i2;
        Z(this.f6275h, true);
    }

    public final void u(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        if (this.f6279l != null) {
            U();
        }
        y((this.t && this.f6275h == 6) ? 3 : this.f6275h);
        Z(this.f6275h, true);
        Y();
    }

    public final void v(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f6271d = f2;
        if (this.f6279l != null) {
            V();
        }
    }

    public final void w(boolean z) {
        if (this.f6274g != z) {
            this.f6274g = z;
            if (!z && this.f6275h == 5) {
                x(4);
            }
            Y();
        }
    }

    public final void x(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f6274g && i2 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i3 = (i2 == 6 && this.t && this.f6270c <= this.f6269b) ? 3 : i2;
        WeakReference weakReference = this.f6279l;
        if (weakReference == null || weakReference.get() == null) {
            y(i2);
            return;
        }
        View view = (View) this.f6279l.get();
        a aVar = new a(this, view, i3);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(aVar);
        } else {
            aVar.run();
        }
    }

    final void y(int i2) {
        View view;
        if (this.f6275h == i2) {
            return;
        }
        this.f6275h = i2;
        int i3 = 4;
        if (i2 != 4 && i2 != 3 && i2 != 6 && this.f6274g && i2 == 5) {
            i2 = 5;
        }
        WeakReference weakReference = this.f6279l;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = 0;
        if (i2 == 3) {
            aa(true);
        } else {
            if (i2 == 6 || i2 == 5) {
                i3 = i2;
            } else if (i2 == 4) {
            }
            aa(false);
            i2 = i3;
        }
        Z(i2, true);
        while (true) {
            ArrayList arrayList = this.af;
            if (i4 >= arrayList.size()) {
                Y();
                return;
            } else {
                ((f) arrayList.get(i4)).b(view);
                i4++;
            }
        }
    }

    public BottomSheetBehavior() {
        this.s = 0;
        this.t = true;
        this.D = -1;
        this.E = -1;
        this.T = new j(this);
        this.f6271d = 0.5f;
        this.f6273f = -1.0f;
        this.W = true;
        this.X = true;
        this.Z = true;
        this.f6275h = 4;
        this.ad = 0.1f;
        this.m = new ArrayList();
        this.af = new ArrayList();
        this.ah = -1;
        this.p = new SparseIntArray();
        this.q = new SparseIntArray();
        this.r = new SparseIntArray();
        this.ak = new Rect();
        this.al = new d(this);
    }
}
