package androidx.coordinatorlayout.widget;

import A7.R0;
import D9.n;
import S3.l;
import U0.a;
import V0.b;
import V0.c;
import V0.d;
import V0.e;
import V0.f;
import V0.g;
import W9.u;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import j$.util.DesugarCollections;
import j1.C3075c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k1.H;
import k1.InterfaceC3129p;
import k1.InterfaceC3130q;
import k1.J;
import k1.S;
import k1.v0;
import x.C4429v;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC3129p, InterfaceC3130q {

    /* renamed from: t, reason: collision with root package name */
    public static final String f18038t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f18039u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f18040v;

    /* renamed from: w, reason: collision with root package name */
    public static final R0 f18041w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3075c f18042x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18043a;

    /* renamed from: b, reason: collision with root package name */
    public final u f18044b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18045c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18046d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f18047e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f18048f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18049g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18050h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f18051i;

    /* renamed from: j, reason: collision with root package name */
    public View f18052j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public e f18053l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18054m;

    /* renamed from: n, reason: collision with root package name */
    public v0 f18055n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18056o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f18057p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f18058q;

    /* renamed from: r, reason: collision with root package name */
    public l f18059r;

    /* renamed from: s, reason: collision with root package name */
    public final n f18060s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f18038t = r02 != null ? r02.getName() : null;
        f18041w = new R0(5);
        f18039u = new Class[]{Context.class, AttributeSet.class};
        f18040v = new ThreadLocal();
        f18042x = new C3075c(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f18043a = new ArrayList();
        this.f18044b = new u(3);
        this.f18045c = new ArrayList();
        this.f18046d = new ArrayList();
        this.f18047e = new int[2];
        this.f18048f = new int[2];
        this.f18060s = new n(9);
        int[] iArr = a.f11899a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f18051i = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i5 = 0; i5 < length; i5++) {
                this.f18051i[i5] = (int) (r2[i5] * f10);
            }
        }
        this.f18057p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new c(this));
        WeakHashMap weakHashMap = S.f38779a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f18042x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i5, Rect rect, Rect rect2, d dVar, int i10, int i11) {
        int i12 = dVar.f12871c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i5);
        int i13 = dVar.f12872d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i5);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        int iWidth = i16 != 1 ? i16 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i17 != 16 ? i17 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i14 == 1) {
            iWidth -= i10 / 2;
        } else if (i14 != 5) {
            iWidth -= i10;
        }
        if (i15 == 16) {
            iHeight -= i11 / 2;
        } else if (i15 != 80) {
            iHeight -= i11;
        }
        rect2.set(iWidth, iHeight, i10 + iWidth, i11 + iHeight);
    }

    public static d n(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.f12870b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    V0.a aVar = (V0.a) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    V0.a aVar2 = dVar.f12869a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        dVar.f12869a = aVar;
                        dVar.f12870b = true;
                        if (aVar != null) {
                            aVar.c(dVar);
                        }
                    }
                } catch (Exception e7) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                }
            }
            dVar.f12870b = true;
        }
        return dVar;
    }

    public static void u(int i5, View view) {
        d dVar = (d) view.getLayoutParams();
        int i10 = dVar.f12877i;
        if (i10 != i5) {
            WeakHashMap weakHashMap = S.f38779a;
            view.offsetLeftAndRight(i5 - i10);
            dVar.f12877i = i5;
        }
    }

    public static void v(int i5, View view) {
        d dVar = (d) view.getLayoutParams();
        int i10 = dVar.f12878j;
        if (i10 != i5) {
            WeakHashMap weakHashMap = S.f38779a;
            view.offsetTopAndBottom(i5 - i10);
            dVar.f12878j = i5;
        }
    }

    @Override // k1.InterfaceC3129p
    public final void a(int i5, View view) {
        n nVar = this.f18060s;
        if (i5 == 1) {
            nVar.f2593c = 0;
        } else {
            nVar.f2592b = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            d dVar = (d) childAt.getLayoutParams();
            if (dVar.a(i5)) {
                V0.a aVar = dVar.f12869a;
                if (aVar != null) {
                    aVar.p(childAt, view, i5);
                }
                if (i5 == 0) {
                    dVar.f12880m = false;
                } else if (i5 == 1) {
                    dVar.f12881n = false;
                }
            }
        }
        this.k = null;
    }

    @Override // k1.InterfaceC3129p
    public final void b(View view, View view2, int i5, int i10) {
        n nVar = this.f18060s;
        if (i10 == 1) {
            nVar.f2593c = i5;
        } else {
            nVar.f2592b = i5;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((d) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    @Override // k1.InterfaceC3129p
    public final void c(View view, int i5, int i10, int[] iArr, int i11) {
        V0.a aVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i11) && (aVar = dVar.f12869a) != null) {
                    int[] iArr2 = this.f18047e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i5, i10, iArr2, i11);
                    iMax = i5 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i10 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // k1.InterfaceC3130q
    public final void d(View view, int i5, int i10, int i11, int i12, int i13, int[] iArr) {
        V0.a aVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z2 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i13) && (aVar = dVar.f12869a) != null) {
                    int[] iArr2 = this.f18047e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i10, i11, i12, iArr2);
                    iMax = i11 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i12 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j8) {
        V0.a aVar = ((d) view.getLayoutParams()).f12869a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f18057p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // k1.InterfaceC3129p
    public final void e(View view, int i5, int i10, int i11, int i12, int i13) {
        d(view, i5, i10, i11, i12, 0, this.f18048f);
    }

    @Override // k1.InterfaceC3129p
    public final boolean f(View view, View view2, int i5, int i10) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                V0.a aVar = dVar.f12869a;
                if (aVar != null) {
                    boolean zO = aVar.o(childAt, i5, i10);
                    z2 |= zO;
                    if (i10 == 0) {
                        dVar.f12880m = zO;
                    } else if (i10 == 1) {
                        dVar.f12881n = zO;
                    }
                } else if (i10 == 0) {
                    dVar.f12880m = false;
                } else if (i10 == 1) {
                    dVar.f12881n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return DesugarCollections.unmodifiableList(this.f18043a);
    }

    public final v0 getLastWindowInsets() {
        return this.f18055n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n nVar = this.f18060s;
        return nVar.f2593c | nVar.f2592b;
    }

    public Drawable getStatusBarBackground() {
        return this.f18057p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(d dVar, Rect rect, int i5, int i10) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i5) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin));
        rect.set(iMax, iMax2, i5 + iMax, i10 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        C4429v c4429v = (C4429v) this.f18044b.f15390b;
        int i5 = c4429v.f47563c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i5; i10++) {
            ArrayList arrayList2 = (ArrayList) c4429v.k(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c4429v.g(i10));
            }
        }
        ArrayList arrayList3 = this.f18046d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f12885a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f12885a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f12886b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i5) {
        int[] iArr = this.f18051i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i5);
            return 0;
        }
        if (i5 >= 0 && i5 < iArr.length) {
            return iArr[i5];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i5 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i5, int i10) {
        C3075c c3075c = f18042x;
        Rect rectG = g();
        k(view, rectG);
        try {
            return rectG.contains(i5, i10);
        } finally {
            rectG.setEmpty();
            c3075c.c(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f18054m) {
            if (this.f18053l == null) {
                this.f18053l = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f18053l);
        }
        if (this.f18055n == null) {
            WeakHashMap weakHashMap = S.f38779a;
            if (getFitsSystemWindows()) {
                H.c(this);
            }
        }
        this.f18050h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f18054m && this.f18053l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f18053l);
        }
        View view = this.k;
        if (view != null) {
            a(0, view);
        }
        this.f18050h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f18056o || this.f18057p == null) {
            return;
        }
        v0 v0Var = this.f18055n;
        int iD = v0Var != null ? v0Var.d() : 0;
        if (iD > 0) {
            this.f18057p.setBounds(0, 0, getWidth(), iD);
            this.f18057p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zR;
        }
        t(true);
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        V0.a aVar;
        WeakHashMap weakHashMap = S.f38779a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f18043a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((aVar = ((d) view.getLayoutParams()).f12869a) == null || !aVar.g(this, view, layoutDirection))) {
                q(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z2) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0)) {
                    V0.a aVar = dVar.f12869a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        V0.a aVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (aVar = dVar.f12869a) != null) {
                    zI |= aVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i10, int[] iArr) {
        c(view, i5, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12) {
        e(view, i5, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        b(view, view2, i5, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f44826a);
        SparseArray sparseArray = fVar.f12884c;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id2 = childAt.getId();
            V0.a aVar = n(childAt).f12869a;
            if (id2 != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id2 = childAt.getId();
            V0.a aVar = ((d) childAt.getLayoutParams()).f12869a;
            if (id2 != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id2, parcelableN);
            }
        }
        fVar.f12884c = sparseArray;
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        return f(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f18052j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f18052j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            V0.d r6 = (V0.d) r6
            V0.a r6 = r6.f12869a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f18052j
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f18052j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0047 A[EDGE_INSN: B:133:0x0047->B:10:0x0047 BREAK  A[LOOP:2: B:119:0x02ad->B:124:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r25) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(int i5, View view) {
        Rect rectG;
        Rect rectG2;
        d dVar = (d) view.getLayoutParams();
        View view2 = dVar.k;
        if (view2 == null && dVar.f12874f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C3075c c3075c = f18042x;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                k(view2, rectG);
                d dVar2 = (d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i5, rectG, rectG2, dVar2, measuredWidth, measuredHeight);
                h(dVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                c3075c.c(rectG);
                rectG2.setEmpty();
                c3075c.c(rectG2);
            }
        }
        int i10 = dVar.f12873e;
        if (i10 < 0) {
            d dVar3 = (d) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin);
            if (this.f18055n != null) {
                WeakHashMap weakHashMap = S.f38779a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG.left = this.f18055n.b() + rectG.left;
                    rectG.top = this.f18055n.d() + rectG.top;
                    rectG.right -= this.f18055n.c();
                    rectG.bottom -= this.f18055n.a();
                }
            }
            rectG2 = g();
            int i11 = dVar3.f12871c;
            if ((i11 & 7) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            Gravity.apply(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i5);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        d dVar4 = (d) view.getLayoutParams();
        int i12 = dVar4.f12871c;
        if (i12 == 0) {
            i12 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i5);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i5 == 1) {
            i10 = width - i10;
        }
        int iM = m(i10) - measuredWidth2;
        if (i13 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i13 == 5) {
            iM += measuredWidth2;
        }
        int i15 = i14 != 16 ? i14 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) dVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar4).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) dVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i5) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f18045c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        R0 r02 = f18041w;
        if (r02 != null) {
            Collections.sort(arrayList, r02);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            V0.a aVar = ((d) view.getLayoutParams()).f12869a;
            if (zF && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    }
                    if (i5 == 0) {
                        aVar.f(this, view, motionEventObtain);
                    } else if (i5 == 1) {
                        aVar.q(view, motionEventObtain);
                    }
                }
            } else if (!zF && aVar != null) {
                if (i5 == 0) {
                    zF = aVar.f(this, view, motionEvent);
                } else if (i5 == 1) {
                    zF = aVar.q(view, motionEvent);
                }
                if (zF) {
                    this.f18052j = view;
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        V0.a aVar = ((d) view.getLayoutParams()).f12869a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f18049g) {
            return;
        }
        t(false);
        this.f18049g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f18058q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f18057p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f18057p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f18057p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f18057p;
                WeakHashMap weakHashMap = S.f38779a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f18057p.setVisible(getVisibility() == 0, false);
                this.f18057p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = S.f38779a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i5) {
        setStatusBarBackground(new ColorDrawable(i5));
    }

    public void setStatusBarBackgroundResource(int i5) {
        setStatusBarBackground(i5 != 0 ? Y0.e.getDrawable(getContext(), i5) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z2 = i5 == 0;
        Drawable drawable = this.f18057p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f18057p.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            V0.a aVar = ((d) childAt.getLayoutParams()).f12869a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                if (z2) {
                    aVar.f(this, childAt, motionEventObtain);
                } else {
                    aVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((d) getChildAt(i10).getLayoutParams()).getClass();
        }
        this.f18052j = null;
        this.f18049g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f18057p;
    }

    public final void w() {
        WeakHashMap weakHashMap = S.f38779a;
        if (!getFitsSystemWindows()) {
            J.l(this, null);
            return;
        }
        if (this.f18059r == null) {
            this.f18059r = new l(this);
        }
        J.l(this, this.f18059r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }
}
