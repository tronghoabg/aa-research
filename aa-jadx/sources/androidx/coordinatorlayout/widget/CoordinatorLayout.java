package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements defpackage.ean, defpackage.eao {
    public static final java.lang.String a;
    public static final java.lang.Class[] b;
    public static final java.lang.ThreadLocal c;
    static final java.util.Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final defpackage.dzr j;
    public defpackage.edf e;
    public boolean f;
    public android.view.ViewGroup.OnHierarchyChangeListener g;
    public final defpackage.eqa h;
    private final java.util.List k;
    private final java.util.List l;
    private final int[] m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private boolean q;
    private int[] r;
    private android.view.View s;
    private android.view.View t;
    private boolean u;
    private android.graphics.drawable.Drawable v;
    private defpackage.eap w;
    private defpackage.ffg x;
    private final defpackage.euf y;

    static {
        java.lang.Package r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new defpackage.cjd(6);
        b = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class};
        c = new java.lang.ThreadLocal();
        j = new defpackage.dzt(12);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout;
        android.content.Context context2;
        super(context, attributeSet, i2);
        this.k = new java.util.ArrayList();
        this.h = new defpackage.eqa();
        this.l = new java.util.ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.y = new defpackage.euf(null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, defpackage.dsl.a, 0, com.google.android.projection.gearhead.R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, defpackage.dsl.a, i2, 0);
        if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            defpackage.ebt.m(coordinatorLayout, context2, defpackage.dsl.a, attributeSet, typedArrayObtainStyledAttributes, 0, com.google.android.projection.gearhead.R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            defpackage.ebt.m(coordinatorLayout, context2, defpackage.dsl.a, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            android.content.res.Resources resources = context2.getResources();
            coordinatorLayout.r = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.r.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = coordinatorLayout.r;
                iArr[i3] = (int) (iArr[i3] * f);
            }
        }
        coordinatorLayout.v = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.y();
        super.setOnHierarchyChangeListener(new defpackage.dsp(coordinatorLayout));
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    private final boolean A(defpackage.dsn dsnVar, android.view.View view, android.view.MotionEvent motionEvent, int i2) {
        return i2 != 0 ? dsnVar.g(this, view, motionEvent) : dsnVar.d(this, view, motionEvent);
    }

    private final boolean B(android.view.MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        java.util.List list = this.l;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        java.util.Comparator comparator = d;
        if (comparator != null) {
            java.util.Collections.sort(list, comparator);
        }
        int size = list.size();
        android.view.MotionEvent motionEventD = null;
        boolean zA = false;
        for (int i4 = 0; i4 < size; i4++) {
            android.view.View view = (android.view.View) list.get(i4);
            defpackage.dsq dsqVar = (defpackage.dsq) view.getLayoutParams();
            defpackage.dsn dsnVar = dsqVar.a;
            if (!zA || actionMasked == 0) {
                if (!zA && dsnVar != null && (zA = A(dsnVar, view, motionEvent, i2))) {
                    this.s = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            android.view.View view2 = (android.view.View) list.get(i5);
                            defpackage.dsn dsnVar2 = ((defpackage.dsq) view2.getLayoutParams()).a;
                            if (dsnVar2 != null) {
                                if (motionEventD == null) {
                                    motionEventD = D(motionEvent);
                                }
                                A(dsnVar2, view2, motionEventD, i2);
                            }
                        }
                    }
                }
                if (dsqVar.a == null) {
                    dsqVar.m = false;
                }
                boolean z = dsqVar.m;
            } else if (dsnVar != null) {
                if (motionEventD == null) {
                    motionEventD = D(motionEvent);
                }
                A(dsnVar, view, motionEventD, i2);
            }
        }
        list.clear();
        if (motionEventD != null) {
            motionEventD.recycle();
        }
        return zA;
    }

    private static final void C(int i2, android.graphics.Rect rect, android.graphics.Rect rect2, defpackage.dsq dsqVar, int i3, int i4) {
        int iWidth;
        int iHeight;
        int i5 = dsqVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(r(dsqVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i3 / 2;
        } else if (i6 != 5) {
            iWidth -= i3;
        }
        if (i7 == 16) {
            iHeight -= i4 / 2;
        } else if (i7 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private static final android.view.MotionEvent D(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void E(android.view.View view, int i2) {
        defpackage.dsq dsqVar = (defpackage.dsq) view.getLayoutParams();
        int i3 = dsqVar.i;
        if (i3 != i2) {
            int[] iArr = defpackage.ebt.a;
            view.offsetLeftAndRight(i2 - i3);
            dsqVar.i = i2;
        }
    }

    private static final void F(android.view.View view, int i2) {
        defpackage.dsq dsqVar = (defpackage.dsq) view.getLayoutParams();
        int i3 = dsqVar.j;
        if (i3 != i2) {
            int[] iArr = defpackage.ebt.a;
            view.offsetTopAndBottom(i2 - i3);
            dsqVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final defpackage.dsq l(android.view.View view) {
        defpackage.dsq dsqVar = (defpackage.dsq) view.getLayoutParams();
        if (!dsqVar.b) {
            if (view instanceof defpackage.dsm) {
                defpackage.dsn dsnVarA = ((defpackage.dsm) view).a();
                if (dsnVarA == null) {
                    android.util.Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                dsqVar.b(dsnVarA);
                dsqVar.b = true;
                return dsqVar;
            }
            defpackage.dso dsoVar = null;
            for (java.lang.Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dsoVar = (defpackage.dso) superclass.getAnnotation(defpackage.dso.class);
                if (dsoVar != null) {
                    break;
                }
            }
            if (dsoVar != null) {
                try {
                    dsqVar.b((defpackage.dsn) dsoVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (java.lang.Exception e) {
                    android.util.Log.e("CoordinatorLayout", "Default behavior class " + dsoVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            dsqVar.b = true;
        }
        return dsqVar;
    }

    private final int n() {
        return o() - getHeight();
    }

    private final int o() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            android.view.View childAt = getChildAt(i2);
            defpackage.dsq dsqVar = (defpackage.dsq) childAt.getLayoutParams();
            height += childAt.getHeight() + dsqVar.topMargin + dsqVar.bottomMargin;
        }
        return height;
    }

    private final int p(int i2) {
        int[] iArr = this.r;
        if (iArr == null) {
            android.util.Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        android.util.Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int q() {
        return (int) (getHeight() * 0.2f);
    }

    private static int r(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int s(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static android.graphics.Rect u() {
        android.graphics.Rect rect = (android.graphics.Rect) j.a();
        return rect == null ? new android.graphics.Rect() : rect;
    }

    private final void v(defpackage.dsq dsqVar, android.graphics.Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = java.lang.Math.max(getPaddingLeft() + dsqVar.leftMargin, java.lang.Math.min(rect.left, ((width - getPaddingRight()) - i2) - dsqVar.rightMargin));
        int iMax2 = java.lang.Math.max(getPaddingTop() + dsqVar.topMargin, java.lang.Math.min(rect.top, ((height - getPaddingBottom()) - i3) - dsqVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void w(android.graphics.Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void x() {
        android.view.View view = this.s;
        if (view != null) {
            defpackage.dsn dsnVar = ((defpackage.dsq) view.getLayoutParams()).a;
            if (dsnVar != null) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0);
                dsnVar.g(this, this.s, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.s = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((defpackage.dsq) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = false;
    }

    private final void y() {
        int[] iArr = defpackage.ebt.a;
        if (!getFitsSystemWindows()) {
            defpackage.ebl.e(this, null);
            return;
        }
        if (this.w == null) {
            this.w = new defpackage.eef(this, 1, null);
        }
        defpackage.ebl.e(this, this.w);
        setSystemUiVisibility(1280);
    }

    private final boolean z(int i2) {
        android.view.View view;
        android.view.View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof android.view.ViewGroup ? ((android.view.ViewGroup) focusedChild).getFocusedChild() : null;
        }
        t(this, view, 2, 1);
        int[] iArr = this.o;
        d(view, 0, i2, iArr, 1);
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i3, 0, i2, 1, iArr);
        h(view, 1);
        return iArr[1] > 0;
    }

    public final java.util.List a(android.view.View view) {
        defpackage.aba abaVar = (defpackage.aba) this.h.d;
        int i2 = abaVar.d;
        java.util.ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) abaVar.g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(abaVar.d(i3));
            }
        }
        return arrayList == null ? java.util.Collections.EMPTY_LIST : arrayList;
    }

    public final void b(android.view.View view) {
        java.util.ArrayList arrayListB = this.h.b(view);
        if (arrayListB == null || arrayListB.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListB.size(); i2++) {
            android.view.View view2 = (android.view.View) arrayListB.get(i2);
            defpackage.dsn dsnVar = ((defpackage.dsq) view2.getLayoutParams()).a;
            if (dsnVar != null) {
                dsnVar.l(this, view2, view);
            }
        }
    }

    final void c(android.view.View view, boolean z, android.graphics.Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            defpackage.dsr.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.dsq) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.ean
    public final void d(android.view.View view, int i2, int i3, int[] iArr, int i4) {
        defpackage.dsn dsnVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                defpackage.dsq dsqVar = (defpackage.dsq) childAt.getLayoutParams();
                if (dsqVar.d(i4) && (dsnVar = dsqVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    dsnVar.m(this, childAt, view, i3, iArr2, i4);
                    iMax = i2 > 0 ? java.lang.Math.max(iMax, iArr2[0]) : java.lang.Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? java.lang.Math.max(iMax2, iArr2[1]) : java.lang.Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? z(-getHeight()) : z(-q());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? z(getHeight()) : z(q());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? z(-o()) : z(n());
            }
            if (keyCode == 92) {
                return z(-getHeight());
            }
            if (keyCode == 93) {
                return z(getHeight());
            }
            if (keyCode == 122) {
                return z(-o());
            }
            if (keyCode == 123) {
                return z(n());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j2) {
        defpackage.dsn dsnVar = ((defpackage.dsq) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.ean
    public final void e(android.view.View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.n);
    }

    @Override // defpackage.eao
    public final void f(android.view.View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        defpackage.dsn dsnVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                defpackage.dsq dsqVar = (defpackage.dsq) childAt.getLayoutParams();
                if (dsqVar.d(i6) && (dsnVar = dsqVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    dsnVar.n(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? java.lang.Math.max(iMax, iArr2[0]) : java.lang.Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? java.lang.Math.max(iMax2, iArr2[1]) : java.lang.Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.ean
    public final void g(android.view.View view, android.view.View view2, int i2, int i3) {
        this.y.c(i2, i3);
        this.t = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            defpackage.dsq dsqVar = (defpackage.dsq) getChildAt(i4).getLayoutParams();
            if (dsqVar.d(i3)) {
                defpackage.dsn dsnVar = dsqVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.dsq();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.dsq) {
            return new defpackage.dsq((defpackage.dsq) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.dsq((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.dsq(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.b();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return java.lang.Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return java.lang.Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.ean
    public final void h(android.view.View view, int i2) {
        this.y.d(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            defpackage.dsq dsqVar = (defpackage.dsq) childAt.getLayoutParams();
            if (dsqVar.d(i2)) {
                defpackage.dsn dsnVar = dsqVar.a;
                if (dsnVar != null) {
                    dsnVar.c(this, childAt, view, i2);
                }
                dsqVar.c(i2, false);
                dsqVar.a();
            }
        }
        this.t = null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0262  */
    /* JADX WARN: Code duplicated, block: B:123:0x0297  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    public final void i(int i2) {
        int i3;
        boolean z;
        defpackage.dsn dsnVar;
        boolean z2;
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout;
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int height;
        int i5;
        defpackage.dsq dsqVar;
        defpackage.dsn dsnVar2;
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout2 = this;
        int layoutDirection = coordinatorLayout2.getLayoutDirection();
        java.util.List list = coordinatorLayout2.k;
        int size = list.size();
        android.graphics.Rect rectU = u();
        android.graphics.Rect rectU2 = u();
        android.graphics.Rect rectU3 = u();
        int i6 = 0;
        while (i6 < size) {
            android.view.View view = (android.view.View) list.get(i6);
            defpackage.dsq dsqVar2 = (defpackage.dsq) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                coordinatorLayout = coordinatorLayout2;
                i3 = i6;
            } else {
                int i7 = 0;
                while (i7 < i6) {
                    if (dsqVar2.l == ((android.view.View) list.get(i7))) {
                        defpackage.dsq dsqVar3 = (defpackage.dsq) view.getLayoutParams();
                        if (dsqVar3.k != null) {
                            defpackage.dsq dsqVar4 = dsqVar2;
                            android.graphics.Rect rectU4 = u();
                            android.graphics.Rect rectU5 = u();
                            android.graphics.Rect rectU6 = u();
                            defpackage.dsr.a(coordinatorLayout2, dsqVar3.k, rectU4);
                            coordinatorLayout2.c(view, false, rectU5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            dsqVar = dsqVar4;
                            C(layoutDirection, rectU4, rectU6, dsqVar3, measuredWidth, measuredHeight);
                            boolean z5 = (rectU6.left == rectU5.left && rectU6.top == rectU5.top) ? false : true;
                            coordinatorLayout2.v(dsqVar3, rectU6, measuredWidth, measuredHeight);
                            int i8 = rectU6.left - rectU5.left;
                            int i9 = rectU6.top - rectU5.top;
                            if (i8 != 0) {
                                int[] iArr = defpackage.ebt.a;
                                view.offsetLeftAndRight(i8);
                            }
                            if (i9 != 0) {
                                int[] iArr2 = defpackage.ebt.a;
                                view.offsetTopAndBottom(i9);
                            }
                            if (z5 && (dsnVar2 = dsqVar3.a) != null) {
                                dsnVar2.l(coordinatorLayout2, view, dsqVar3.k);
                            }
                            w(rectU4);
                            w(rectU5);
                            w(rectU6);
                        } else {
                            dsqVar = dsqVar2;
                        }
                    } else {
                        dsqVar = dsqVar2;
                    }
                    i7++;
                    i6 = i6;
                    dsqVar2 = dsqVar;
                }
                defpackage.dsq dsqVar5 = dsqVar2;
                i3 = i6;
                coordinatorLayout2.c(view, true, rectU2);
                if (dsqVar5.g != 0 && !rectU2.isEmpty()) {
                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(dsqVar5.g, layoutDirection);
                    int i10 = absoluteGravity & 112;
                    if (i10 == 48) {
                        rectU.top = java.lang.Math.max(rectU.top, rectU2.bottom);
                    } else if (i10 == 80) {
                        rectU.bottom = java.lang.Math.max(rectU.bottom, coordinatorLayout2.getHeight() - rectU2.top);
                    }
                    int i11 = absoluteGravity & 7;
                    if (i11 == 3) {
                        rectU.left = java.lang.Math.max(rectU.left, rectU2.right);
                    } else if (i11 == 5) {
                        rectU.right = java.lang.Math.max(rectU.right, coordinatorLayout2.getWidth() - rectU2.left);
                    }
                }
                if (dsqVar5.h == 0 || view.getVisibility() != 0 || !view.isLaidOut() || view.getWidth() <= 0 || view.getHeight() <= 0) {
                    z = false;
                } else {
                    defpackage.dsq dsqVar6 = (defpackage.dsq) view.getLayoutParams();
                    defpackage.dsn dsnVar3 = dsqVar6.a;
                    android.graphics.Rect rectU7 = u();
                    android.graphics.Rect rectU8 = u();
                    rectU8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (dsnVar3 == null || !dsnVar3.r(view, rectU7)) {
                        rectU7.set(rectU8);
                    } else if (!rectU8.contains(rectU7)) {
                        throw new java.lang.IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectU7.toShortString() + " | Bounds:" + rectU8.toShortString());
                    }
                    w(rectU8);
                    if (rectU7.isEmpty()) {
                        w(rectU7);
                        z = false;
                    } else {
                        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(dsqVar6.h, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i5 = (rectU7.top - dsqVar6.topMargin) - dsqVar6.j) >= rectU.top) {
                            z3 = false;
                        } else {
                            F(view, rectU.top - i5);
                            z3 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectU7.bottom) - dsqVar6.bottomMargin) + dsqVar6.j) < rectU.bottom) {
                            F(view, height - rectU.bottom);
                        } else if (!z3) {
                            F(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i4 = (rectU7.left - dsqVar6.leftMargin) - dsqVar6.i) >= rectU.left) {
                            z4 = false;
                        } else {
                            E(view, rectU.left - i4);
                            z4 = true;
                        }
                        if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - rectU7.right) - dsqVar6.rightMargin) + dsqVar6.i) >= rectU.right) {
                            if (!z4) {
                                z = false;
                                E(view, 0);
                            }
                            w(rectU7);
                        } else {
                            E(view, width - rectU.right);
                        }
                        z = false;
                        w(rectU7);
                    }
                }
                if (i2 != 2) {
                    rectU3.set(((defpackage.dsq) view.getLayoutParams()).p);
                    if (!rectU3.equals(rectU2)) {
                        ((defpackage.dsq) view.getLayoutParams()).p.set(rectU2);
                        for (int i12 = i3 + 1; i12 < size; i12++) {
                            android.view.View view2 = (android.view.View) list.get(i12);
                            defpackage.dsq dsqVar7 = (defpackage.dsq) view2.getLayoutParams();
                            dsnVar = dsqVar7.a;
                            if (dsnVar == null && dsnVar.h(view)) {
                                if (i2 == 0 && dsqVar7.o) {
                                    dsqVar7.a();
                                } else {
                                    if (i2 != 2) {
                                        dsnVar.l(this, view2, view);
                                        z2 = z;
                                    } else {
                                        dsnVar.i(this, view);
                                        z2 = true;
                                    }
                                    if (i2 == 1) {
                                        dsqVar7.o = z2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i12 < size) {
                        android.view.View view3 = (android.view.View) list.get(i12);
                        defpackage.dsq dsqVar8 = (defpackage.dsq) view3.getLayoutParams();
                        dsnVar = dsqVar8.a;
                        if (dsnVar == null) {
                        }
                    }
                }
                coordinatorLayout = this;
            }
            i6 = i3 + 1;
            coordinatorLayout2 = coordinatorLayout;
        }
        w(rectU);
        w(rectU2);
        w(rectU3);
    }

    public final void j(android.view.View view, int i2) {
        int i3;
        defpackage.dsq dsqVar = (defpackage.dsq) view.getLayoutParams();
        android.view.View view2 = dsqVar.k;
        if (view2 == null && dsqVar.f != -1) {
            throw new java.lang.IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            android.graphics.Rect rectU = u();
            android.graphics.Rect rectU2 = u();
            try {
                defpackage.dsr.a(this, view2, rectU);
                defpackage.dsq dsqVar2 = (defpackage.dsq) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                C(i2, rectU, rectU2, dsqVar2, measuredWidth, measuredHeight);
                v(dsqVar2, rectU2, measuredWidth, measuredHeight);
                view.layout(rectU2.left, rectU2.top, rectU2.right, rectU2.bottom);
                return;
            } finally {
                w(rectU);
                w(rectU2);
            }
        }
        int i4 = dsqVar.e;
        if (i4 < 0) {
            defpackage.dsq dsqVar3 = (defpackage.dsq) view.getLayoutParams();
            android.graphics.Rect rectU3 = u();
            rectU3.set(getPaddingLeft() + dsqVar3.leftMargin, getPaddingTop() + dsqVar3.topMargin, (getWidth() - getPaddingRight()) - dsqVar3.rightMargin, (getHeight() - getPaddingBottom()) - dsqVar3.bottomMargin);
            if (this.e != null) {
                int[] iArr = defpackage.ebt.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectU3.left += this.e.b();
                    rectU3.top += this.e.d();
                    rectU3.right -= this.e.c();
                    rectU3.bottom -= this.e.a();
                }
            }
            android.graphics.Rect rectU4 = u();
            android.view.Gravity.apply(r(dsqVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectU3, rectU4, i2);
            view.layout(rectU4.left, rectU4.top, rectU4.right, rectU4.bottom);
            w(rectU3);
            w(rectU4);
            return;
        }
        defpackage.dsq dsqVar4 = (defpackage.dsq) view.getLayoutParams();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(s(dsqVar4.c), i2);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int iP = p(i4) - measuredWidth2;
        if (i5 == 1) {
            iP += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iP += measuredWidth2;
        }
        if (i6 != 16) {
            i3 = i6 != 80 ? 0 : measuredHeight2;
        } else {
            i3 = measuredHeight2 / 2;
        }
        int iMax = java.lang.Math.max(getPaddingLeft() + dsqVar4.leftMargin, java.lang.Math.min(iP, ((width - getPaddingRight()) - measuredWidth2) - dsqVar4.rightMargin));
        int iMax2 = java.lang.Math.max(getPaddingTop() + dsqVar4.topMargin, java.lang.Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - dsqVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean k(android.view.View view, int i2, int i3) {
        android.graphics.Rect rectU = u();
        defpackage.dsr.a(this, view, rectU);
        try {
            return rectU.contains(i2, i3);
        } finally {
            w(rectU);
        }
    }

    public final void m(android.view.View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
        if (this.u) {
            if (this.x == null) {
                this.x = new defpackage.ffg(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.x);
        }
        if (this.e == null) {
            int[] iArr = defpackage.ebt.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
        if (this.u && this.x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.x);
        }
        android.view.View view = this.t;
        if (view != null) {
            h(view, 0);
        }
        this.q = false;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.v == null) {
            return;
        }
        defpackage.edf edfVar = this.e;
        int iD = edfVar != null ? edfVar.d() : 0;
        if (iD > 0) {
            this.v.setBounds(0, 0, getWidth(), iD);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x();
            actionMasked = 0;
        }
        boolean zB = B(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zB;
        }
        this.s = null;
        x();
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        defpackage.dsn dsnVar;
        int layoutDirection = getLayoutDirection();
        java.util.List list = this.k;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view = (android.view.View) list.get(i6);
            if (view.getVisibility() != 8 && ((dsnVar = ((defpackage.dsq) view.getLayoutParams()).a) == null || !dsnVar.e(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Type inference failed for: r11v9, types: [dzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [dzr, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0097
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.View
    protected final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                defpackage.dsq dsqVar = (defpackage.dsq) childAt.getLayoutParams();
                if (dsqVar.n) {
                    defpackage.dsn dsnVar = dsqVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f, float f2) {
        defpackage.dsn dsnVar;
        int childCount = getChildCount();
        boolean zK = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                defpackage.dsq dsqVar = (defpackage.dsq) childAt.getLayoutParams();
                if (dsqVar.n && (dsnVar = dsqVar.a) != null) {
                    zK |= dsnVar.k(view);
                }
            }
        }
        return zK;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState savedState = (androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        android.util.SparseArray sparseArray = savedState.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            int id = childAt.getId();
            defpackage.dsn dsnVar = l(childAt).a;
            if (id != -1 && dsnVar != null && (parcelable2 = (android.os.Parcelable) sparseArray.get(id)) != null) {
                dsnVar.o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableP;
        androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState savedState = new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(super.onSaveInstanceState());
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            int id = childAt.getId();
            defpackage.dsn dsnVar = ((defpackage.dsq) childAt.getLayoutParams()).a;
            if (id != -1 && dsnVar != null && (parcelableP = dsnVar.p(childAt)) != null) {
                sparseArray.append(id, parcelableP);
            }
        }
        savedState.a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean zB;
        int actionMasked = motionEvent.getActionMasked();
        android.view.View view = this.s;
        boolean z = false;
        if (view != null) {
            defpackage.dsn dsnVar = ((defpackage.dsq) view.getLayoutParams()).a;
            zB = dsnVar != null ? dsnVar.g(this, this.s, motionEvent) : false;
        } else {
            zB = B(motionEvent, 1);
            if (actionMasked != 0 && zB) {
                z = true;
            }
        }
        if (this.s == null || actionMasked == 3) {
            zB |= super.onTouchEvent(motionEvent);
        } else if (z) {
            android.view.MotionEvent motionEventD = D(motionEvent);
            super.onTouchEvent(motionEventD);
            motionEventD.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zB;
        }
        this.s = null;
        x();
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        defpackage.dsn dsnVar = ((defpackage.dsq) view.getLayoutParams()).a;
        if (dsnVar == null || !dsnVar.f(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.p) {
            return;
        }
        if (this.s == null) {
            int childCount = getChildCount();
            android.view.MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                defpackage.dsn dsnVar = ((defpackage.dsq) childAt.getLayoutParams()).a;
                if (dsnVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                        motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0);
                    }
                    dsnVar.d(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        x();
        this.p = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        android.graphics.drawable.Drawable drawable = this.v;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.v.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.ean
    public final boolean t(android.view.View view, android.view.View view2, int i2, int i3) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout;
        android.view.View view3;
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        boolean z = false;
        while (i6 < childCount) {
            android.view.View childAt = this.getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                defpackage.dsq dsqVar = (defpackage.dsq) childAt.getLayoutParams();
                defpackage.dsn dsnVar = dsqVar.a;
                if (dsnVar != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i4 = i2;
                    i5 = i3;
                    boolean zQ = dsnVar.q(coordinatorLayout, childAt, view3, i4, i5);
                    z |= zQ;
                    dsqVar.c(i5, zQ);
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i4 = i2;
                    i5 = i3;
                    dsqVar.c(i5, false);
                }
            } else {
                coordinatorLayout = this;
                view3 = view;
                i4 = i2;
                i5 = i3;
            }
            i6++;
            this = coordinatorLayout;
            view = view3;
            i2 = i4;
            i3 = i5;
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.dsq(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: loaded from: classes2.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState> CREATOR = new defpackage.mk(4);
        android.util.SparseArray a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            android.os.Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new android.util.SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            android.util.SparseArray sparseArray = this.a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = (android.os.Parcelable) this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(android.content.Context context) {
        this(context, null);
    }
}
