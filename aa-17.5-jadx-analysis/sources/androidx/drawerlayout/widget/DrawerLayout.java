package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import defpackage.dve;
import defpackage.ebe;
import defpackage.ebf;
import defpackage.ebm;
import defpackage.ecy;
import defpackage.edf;
import defpackage.edr;
import defpackage.een;
import defpackage.eln;
import defpackage.elp;
import defpackage.elq;
import defpackage.elr;
import defpackage.els;
import defpackage.elt;
import defpackage.elu;
import defpackage.mh;
import defpackage.nf;
import defpackage.onq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup {
    public static final /* synthetic */ int j = 0;
    private static final boolean l;
    private int A;
    private float B;
    private float C;
    private final ArrayList D;
    private Rect E;
    private Matrix F;
    private final edr G;
    public final een b;
    public final een c;
    public int d;
    public boolean e;
    public List f;
    public Drawable g;
    public ecy h;
    public boolean i;
    private float m;
    private final int n;
    private int o;
    private float p;
    private final Paint q;
    private final elu r;
    private final elu s;
    private boolean t;
    private boolean u;
    private OnBackInvokedCallback v;
    private OnBackInvokedDispatcher w;
    private int x;
    private int y;
    private int z;
    private static final int[] k = {R.attr.colorPrimaryDark};
    public static final int[] a = {R.attr.layout_gravity};

    static {
        l = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new elq();
        this.o = -1728053248;
        this.q = new Paint();
        int i2 = 1;
        this.u = true;
        this.x = 3;
        this.y = 3;
        this.z = 3;
        this.A = 3;
        this.G = new edr() { // from class: elo
            @Override // defpackage.edr
            public final boolean a(View view) {
                if (!DrawerLayout.w(view)) {
                    return false;
                }
                DrawerLayout drawerLayout = this.a;
                if (drawerLayout.a(view) == 2) {
                    return false;
                }
                drawerLayout.q(view);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.n = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        elu eluVar = new elu(this, 3);
        this.r = eluVar;
        elu eluVar2 = new elu(this, 5);
        this.s = eluVar2;
        een eenVarM = een.m(this, eluVar);
        this.b = eenVarM;
        eenVarM.j = 1;
        eenVarM.g = f2;
        eluVar.b = eenVarM;
        een eenVarM2 = een.m(this, eluVar2);
        this.c = eenVarM2;
        eenVarM2.j = 2;
        eenVarM2.g = f2;
        eluVar2.b = eenVarM2;
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        ebm.o(this, new elp(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            ebe.e(this, new onq(i2));
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(k);
            try {
                this.g = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, eln.a, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.m = typedArrayObtainStyledAttributes2.getDimension(0, BitmapDescriptorFactory.HUE_RED);
            } else {
                this.m = getResources().getDimension(com.google.android.projection.gearhead.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.D = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String f(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    static final boolean r(View view) {
        return ((els) view.getLayoutParams()).a == 0;
    }

    public static final boolean t(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((els) view.getLayoutParams()).a, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static final boolean w(View view) {
        if (t(view)) {
            return (((els) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException(a.bm(view, "View ", " is not a drawer"));
    }

    public static final boolean x(View view) {
        if (t(view)) {
            return ((els) view.getLayoutParams()).b > BitmapDescriptorFactory.HUE_RED;
        }
        throw new IllegalArgumentException(a.bm(view, "View ", " is not a drawer"));
    }

    public final int a(View view) {
        if (!t(view)) {
            throw new IllegalArgumentException(a.bm(view, "View ", " is not a drawer"));
        }
        int i = ((els) view.getLayoutParams()).a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.x;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.z : this.A;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.y;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.A : this.z;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.z;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.x : this.y;
            if (i7 != 3) {
                return i7;
            }
        } else {
            if (i != 8388613) {
                return 0;
            }
            int i8 = this.A;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.y : this.x;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!t(childAt)) {
                this.D.add(childAt);
            } else if (w(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            ArrayList arrayList2 = this.D;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.D.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (d() != null || t(view)) {
            view.setImportantForAccessibility(4);
        } else {
            view.setImportantForAccessibility(1);
        }
    }

    public final int b(View view) {
        return Gravity.getAbsoluteGravity(((els) view.getLayoutParams()).a, getLayoutDirection());
    }

    public final View c(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((b(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof els) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((els) getChildAt(i).getLayoutParams()).b);
        }
        this.p = fMax;
        een eenVar = this.b;
        een eenVar2 = this.c;
        boolean zL = eenVar.l();
        boolean zL2 = eenVar2.l();
        if (zL || zL2) {
            postInvalidateOnAnimation();
        }
    }

    final View d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((els) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.p <= BitmapDescriptorFactory.HUE_RED) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return false;
            }
            View childAt = getChildAt(childCount);
            Rect rect = this.E;
            if (rect == null) {
                rect = new Rect();
                this.E = rect;
            }
            childAt.getHitRect(rect);
            if (this.E.contains((int) x, (int) y) && !r(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    int scrollX2 = getScrollX() - childAt.getLeft();
                    int scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        Matrix matrix2 = this.F;
                        if (matrix2 == null) {
                            matrix2 = new Matrix();
                            this.F = matrix2;
                        }
                        matrix.invert(matrix2);
                        motionEventObtain.transform(this.F);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        Drawable background;
        int height = getHeight();
        boolean zR = r(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zR) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && t(childAt) && childAt.getHeight() >= height) {
                    if (o(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(iSave);
        float f = this.p;
        if (f > BitmapDescriptorFactory.HUE_RED && zR) {
            int i4 = this.o;
            Paint paint = this.q;
            paint.setColor((((int) ((i4 >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, BitmapDescriptorFactory.HUE_RED, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (t(childAt) && x(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final void g(boolean z) {
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            els elsVar = (els) childAt.getLayoutParams();
            if (t(childAt) && (!z || elsVar.c)) {
                zJ |= o(childAt, 3) ? this.b.j(childAt, -childAt.getWidth(), childAt.getTop()) : this.c.j(childAt, getWidth(), childAt.getTop());
                elsVar.c = false;
            }
        }
        this.r.n();
        this.s.n();
        if (zJ) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new els();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof els ? new els((els) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new els((ViewGroup.MarginLayoutParams) layoutParams) : new els(layoutParams);
    }

    public final void h(int i) {
        i(i, 3);
        i(i, 5);
    }

    public final void i(int i, int i2) {
        View viewC;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.x = i;
        } else if (i2 == 5) {
            this.y = i;
        } else if (i2 == 8388611) {
            this.z = i;
        } else if (i2 == 8388613) {
            this.A = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.b : this.c).c();
        }
        if (i != 1) {
            if (i == 2 && (viewC = c(absoluteGravity)) != null) {
                v(viewC);
                return;
            }
            return;
        }
        View viewC2 = c(absoluteGravity);
        if (viewC2 != null) {
            q(viewC2);
        }
    }

    public final void j(View view, float f) {
        els elsVar = (els) view.getLayoutParams();
        if (f == elsVar.b) {
            return;
        }
        elsVar.b = f;
        List list = this.f;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((elr) this.f.get(size)).d(f);
            }
        }
    }

    public void k(int i) {
        this.o = i;
        invalidate();
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 33) {
            View viewE = e();
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (viewE == null || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null || a(viewE) != 0 || !isAttachedToWindow()) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.w;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.v);
                    this.w = null;
                    return;
                }
                return;
            }
            if (this.w == null) {
                if (this.v == null) {
                    this.v = new nf(new elt(this, 1), 3);
                }
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.v);
                this.w = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            }
        }
    }

    public final void m(View view) {
        edf edfVar = edf.i;
        ebm.l(view, edfVar.a());
        if (!w(view) || a(view) == 2) {
            return;
        }
        ebm.u(view, edfVar, this.G);
    }

    public final void n(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (z ? childAt != view : t(childAt)) {
                childAt.setImportantForAccessibility(4);
            } else {
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final boolean o(View view, int i) {
        return (b(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = true;
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u = true;
        this.r.n();
        this.s.n();
        l();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.i || this.g == null) {
            return;
        }
        ecy ecyVar = this.h;
        int iD = ecyVar != null ? ecyVar.d() : 0;
        if (iD > 0) {
            this.g.setBounds(0, 0, getWidth(), iD);
            this.g.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            een r0 = r9.c
            een r1 = r9.b
            int r2 = r10.getActionMasked()
            boolean r3 = r1.i(r10)
            boolean r0 = r0.i(r10)
            r0 = r0 | r3
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            if (r2 == r3) goto L69
            r10 = 2
            if (r2 == r10) goto L1e
            r10 = 3
            if (r2 == r10) goto L69
        L1d:
            goto L6e
        L1e:
            float[] r10 = r1.c
            if (r10 != 0) goto L23
            goto L1d
        L23:
            r2 = r4
        L24:
            int r5 = r10.length
            if (r2 >= r5) goto L6e
            boolean r5 = r1.g(r2)
            if (r5 != 0) goto L2e
            goto L66
        L2e:
            float[] r5 = r1.c
            if (r5 == 0) goto L5f
            float[] r6 = r1.d
            if (r6 == 0) goto L5f
            float[] r7 = r1.e
            if (r7 == 0) goto L5f
            float[] r8 = r1.f
            if (r8 != 0) goto L3f
            goto L5f
        L3f:
            r7 = r7[r2]
            r5 = r5[r2]
            float r7 = r7 - r5
            r5 = r8[r2]
            r6 = r6[r2]
            float r5 = r5 - r6
            int r6 = r1.b
            int r6 = r6 * r6
            float r7 = r7 * r7
            float r5 = r5 * r5
            float r7 = r7 + r5
            float r5 = (float) r6
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L66
            elu r10 = r9.r
            r10.n()
            elu r10 = r9.s
            r10.n()
            goto L6e
        L5f:
            java.lang.String r5 = "ViewDragHelper"
            java.lang.String r6 = "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?"
            android.util.Log.w(r5, r6)
        L66:
            int r2 = r2 + 1
            goto L24
        L69:
            r9.g(r3)
            r9.e = r4
        L6e:
            r10 = r4
            goto L96
        L70:
            float r2 = r10.getX()
            float r10 = r10.getY()
            r9.B = r2
            r9.C = r10
            float r5 = r9.p
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L93
            int r2 = (int) r2
            int r10 = (int) r10
            android.view.View r10 = r1.a(r2, r10)
            if (r10 == 0) goto L93
            boolean r10 = r(r10)
            if (r10 == 0) goto L93
            r10 = r3
            goto L94
        L93:
            r10 = r4
        L94:
            r9.e = r4
        L96:
            if (r0 != 0) goto Lb8
            if (r10 != 0) goto Lb8
            int r10 = r9.getChildCount()
            r0 = r4
        L9f:
            if (r0 >= r10) goto Lb3
            android.view.View r1 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            els r1 = (defpackage.els) r1
            boolean r1 = r1.c
            if (r1 == 0) goto Lb0
            goto Lb8
        Lb0:
            int r0 = r0 + 1
            goto L9f
        Lb3:
            boolean r9 = r9.e
            if (r9 != 0) goto Lb8
            return r4
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (e() != null) {
                keyEvent.startTracking();
                return true;
            }
            i = 4;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewE = e();
        if (viewE != null && a(viewE) == 0) {
            g(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.t = true;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                els elsVar = (els) childAt.getLayoutParams();
                if (r(childAt)) {
                    childAt.layout(elsVar.leftMargin, elsVar.topMargin, elsVar.leftMargin + childAt.getMeasuredWidth(), elsVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    float f2 = measuredWidth;
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (o(childAt, 3)) {
                        i5 = (-measuredWidth) + ((int) (elsVar.b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        int i7 = (i3 - i) - ((int) (elsVar.b * f2));
                        float f3 = (r7 - i7) / f2;
                        i5 = i7;
                        f = f3;
                    }
                    int i8 = measuredWidth + i5;
                    float f4 = elsVar.b;
                    int i9 = elsVar.a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < elsVar.topMargin) {
                            i11 = elsVar.topMargin;
                        } else if (i11 + measuredHeight > i10 - elsVar.bottomMargin) {
                            i11 = (i10 - elsVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, i8, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, elsVar.topMargin, i8, elsVar.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - elsVar.bottomMargin) - childAt.getMeasuredHeight(), i8, i12 - elsVar.bottomMargin);
                    }
                    if (f != f4) {
                        j(childAt, f);
                    }
                    int i13 = elsVar.b > BitmapDescriptorFactory.HUE_RED ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
        }
        if (l) {
            int[] iArr = ebm.a;
            ecy ecyVarA = ebf.a(this);
            if (ecyVarA != null) {
                een eenVar = this.b;
                dve dveVarE = ecyVarA.b.E();
                eenVar.h = Math.max(eenVar.i, dveVarE.b);
                een eenVar2 = this.c;
                eenVar2.h = Math.max(eenVar2.i, dveVarE.d);
            }
        }
        this.t = false;
        this.u = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        View viewC;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        int i = savedState.a;
        if (i != 0 && (viewC = c(i)) != null) {
            v(viewC);
        }
        int i2 = savedState.b;
        if (i2 != 3) {
            i(i2, 3);
        }
        int i3 = savedState.e;
        if (i3 != 3) {
            i(i3, 5);
        }
        int i4 = savedState.f;
        if (i4 != 3) {
            i(i4, 8388611);
        }
        int i5 = savedState.g;
        if (i5 != 3) {
            i(i5, 8388613);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            els elsVar = (els) getChildAt(i).getLayoutParams();
            int i2 = elsVar.d;
            if (i2 == 1 || i2 == 2) {
                savedState.a = elsVar.a;
                break;
            }
        }
        savedState.b = this.x;
        savedState.e = this.y;
        savedState.f = this.z;
        savedState.g = this.A;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            een r0 = r6.b
            r0.e(r7)
            een r1 = r6.c
            r1.e(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L67
        L1a:
            r6.g(r3)
            r6.e = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.a(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = r(r4)
            if (r4 == 0) goto L54
            float r4 = r6.B
            float r1 = r1 - r4
            float r4 = r6.C
            float r7 = r7 - r4
            int r0 = r0.b
            int r0 = r0 * r0
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r1 = r1 + r7
            float r7 = (float) r0
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.d()
            if (r7 == 0) goto L54
            int r7 = r6.a(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.g(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.B = r0
            r6.C = r7
            r6.e = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        View viewC = c(8388611);
        if (viewC == null) {
            throw new IllegalArgumentException("No drawer view found with gravity ".concat(String.valueOf(f(8388611))));
        }
        q(viewC);
    }

    public final void q(View view) {
        if (!t(view)) {
            throw new IllegalArgumentException(a.bm(view, "View ", " is not a sliding drawer"));
        }
        els elsVar = (els) view.getLayoutParams();
        if (this.u) {
            elsVar.b = BitmapDescriptorFactory.HUE_RED;
            elsVar.d = 0;
        } else {
            elsVar.d |= 4;
            if (o(view, 3)) {
                this.b.j(view, -view.getWidth(), view.getTop());
            } else {
                this.c.j(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        View viewC = c(8388611);
        if (viewC != null) {
            return w(viewC);
        }
        return false;
    }

    public final boolean u() {
        View viewC = c(8388611);
        if (viewC != null) {
            return x(viewC);
        }
        return false;
    }

    public final void v(View view) {
        if (!t(view)) {
            throw new IllegalArgumentException(a.bm(view, "View ", " is not a sliding drawer"));
        }
        els elsVar = (els) view.getLayoutParams();
        if (this.u) {
            elsVar.b = 1.0f;
            elsVar.d = 1;
            n(view, true);
            m(view);
            l();
        } else {
            elsVar.d |= 2;
            if (o(view, 3)) {
                this.b.j(view, 0, view.getTop());
            } else {
                this.c.j(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new els(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new mh(5);
        int a;
        int b;
        int e;
        int f;
        int g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = 0;
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.a = 0;
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }
}
