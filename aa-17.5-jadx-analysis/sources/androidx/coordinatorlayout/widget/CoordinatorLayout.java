package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.aat;
import defpackage.cwg;
import defpackage.dsd;
import defpackage.dse;
import defpackage.dsf;
import defpackage.dsg;
import defpackage.dsh;
import defpackage.dsi;
import defpackage.dsj;
import defpackage.dsk;
import defpackage.dzk;
import defpackage.dzm;
import defpackage.eag;
import defpackage.eah;
import defpackage.eai;
import defpackage.eaj;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ecy;
import defpackage.fez;
import defpackage.mh;
import defpackage.mko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements eag, eah {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final dzk j;
    public ecy e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    public final mko h;
    private final List k;
    private final List l;
    private final int[] m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private boolean q;
    private int[] r;
    private View s;
    private View t;
    private boolean u;
    private Drawable v;
    private eaj w;
    private final eai x;
    private fez y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new cwg(3);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        j = new dzm(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i2);
        this.k = new ArrayList();
        this.h = new mko((byte[]) null, (byte[]) null);
        this.l = new ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.x = new eai();
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, dsd.a, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, dsd.a, i2, 0);
        if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            ebm.n(coordinatorLayout, context2, dsd.a, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            ebm.n(coordinatorLayout, context2, dsd.a, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.r = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.r.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.r[i3] = (int) (r11[i3] * f);
            }
        }
        coordinatorLayout.v = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.y();
        super.setOnHierarchyChangeListener(new dsi(coordinatorLayout));
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    private final boolean A(dsg dsgVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? dsgVar.i(this, view, motionEvent) : dsgVar.f(this, view, motionEvent);
    }

    private final boolean B(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventD = null;
        boolean zA = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            dsj dsjVar = (dsj) view.getLayoutParams();
            dsg dsgVar = dsjVar.a;
            if (!zA || actionMasked == 0) {
                if (!zA && dsgVar != null && (zA = A(dsgVar, view, motionEvent, i2))) {
                    this.s = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            dsg dsgVar2 = ((dsj) view2.getLayoutParams()).a;
                            if (dsgVar2 != null) {
                                if (motionEventD == null) {
                                    motionEventD = D(motionEvent);
                                }
                                A(dsgVar2, view2, motionEventD, i2);
                            }
                        }
                    }
                }
                if (dsjVar.a == null) {
                    dsjVar.m = false;
                }
                boolean z = dsjVar.m;
            } else if (dsgVar != null) {
                if (motionEventD == null) {
                    motionEventD = D(motionEvent);
                }
                A(dsgVar, view, motionEventD, i2);
            }
        }
        list.clear();
        if (motionEventD != null) {
            motionEventD.recycle();
        }
        return zA;
    }

    private static final void C(int i2, Rect rect, Rect rect2, dsj dsjVar, int i3, int i4) {
        int i5 = dsjVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(r(dsjVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
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

    private static final MotionEvent D(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void E(View view, int i2) {
        dsj dsjVar = (dsj) view.getLayoutParams();
        int i3 = dsjVar.i;
        if (i3 != i2) {
            int[] iArr = ebm.a;
            view.offsetLeftAndRight(i2 - i3);
            dsjVar.i = i2;
        }
    }

    private static final void F(View view, int i2) {
        dsj dsjVar = (dsj) view.getLayoutParams();
        int i3 = dsjVar.j;
        if (i3 != i2) {
            int[] iArr = ebm.a;
            view.offsetTopAndBottom(i2 - i3);
            dsjVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final dsj l(View view) {
        dsj dsjVar = (dsj) view.getLayoutParams();
        if (!dsjVar.b) {
            if (view instanceof dsf) {
                dsg dsgVarA = ((dsf) view).a();
                if (dsgVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                dsjVar.b(dsgVarA);
                dsjVar.b = true;
                return dsjVar;
            }
            dsh dshVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dshVar = (dsh) superclass.getAnnotation(dsh.class);
                if (dshVar != null) {
                    break;
                }
            }
            if (dshVar != null) {
                try {
                    dsjVar.b((dsg) dshVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dshVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            dsjVar.b = true;
        }
        return dsjVar;
    }

    private final int n() {
        return o() - getHeight();
    }

    private final int o() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            dsj dsjVar = (dsj) childAt.getLayoutParams();
            height += childAt.getHeight() + dsjVar.topMargin + dsjVar.bottomMargin;
        }
        return height;
    }

    private final int p(int i2) {
        int[] iArr = this.r;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
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

    private static Rect u() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    private final void v(dsj dsjVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + dsjVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - dsjVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + dsjVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - dsjVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void w(Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void x() {
        View view = this.s;
        if (view != null) {
            dsg dsgVar = ((dsj) view.getLayoutParams()).a;
            if (dsgVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                dsgVar.i(this, this.s, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.s = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((dsj) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = false;
    }

    private final void y() {
        int[] iArr = ebm.a;
        if (!getFitsSystemWindows()) {
            ebe.e(this, null);
            return;
        }
        if (this.w == null) {
            this.w = new dse(this, 0);
        }
        ebe.e(this, this.w);
        setSystemUiVisibility(1280);
    }

    private final boolean z(int i2) {
        View view;
        View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
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

    public final List a(View view) {
        aat aatVar = (aat) this.h.a;
        int i2 = aatVar.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) aatVar.g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aatVar.d(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void b(View view) {
        ArrayList arrayListX = this.h.x(view);
        if (arrayListX == null || arrayListX.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListX.size(); i2++) {
            View view2 = (View) arrayListX.get(i2);
            dsg dsgVar = ((dsj) view2.getLayoutParams()).a;
            if (dsgVar != null) {
                dsgVar.n(this, view2, view);
            }
        }
    }

    final void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            dsk.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof dsj) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.eag
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        dsg dsgVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                dsj dsjVar = (dsj) childAt.getLayoutParams();
                if (dsjVar.d(i4) && (dsgVar = dsjVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    dsgVar.o(this, childAt, view, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
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
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
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
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        dsg dsgVar = ((dsj) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.eag
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.n);
    }

    @Override // defpackage.eah
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        dsg dsgVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                dsj dsjVar = (dsj) childAt.getLayoutParams();
                if (dsjVar.d(i6) && (dsgVar = dsjVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    dsgVar.p(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
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

    @Override // defpackage.eag
    public final void g(View view, View view2, int i2, int i3) {
        this.x.b(i2, i3);
        this.t = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            dsj dsjVar = (dsj) getChildAt(i4).getLayoutParams();
            if (dsjVar.d(i3)) {
                dsg dsgVar = dsjVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dsj();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof dsj ? new dsj((dsj) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new dsj((ViewGroup.MarginLayoutParams) layoutParams) : new dsj(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.x.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.eag
    public final void h(View view, int i2) {
        this.x.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            dsj dsjVar = (dsj) childAt.getLayoutParams();
            if (dsjVar.d(i2)) {
                dsg dsgVar = dsjVar.a;
                if (dsgVar != null) {
                    dsgVar.e(this, childAt, view, i2);
                }
                dsjVar.c(i2, false);
                dsjVar.a();
            }
        }
        this.t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r22) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.i(int):void");
    }

    public final void j(View view, int i2) {
        Rect rectU;
        Rect rectU2;
        dzk dzkVar;
        dsj dsjVar = (dsj) view.getLayoutParams();
        View view2 = dsjVar.k;
        if (view2 == null && dsjVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            rectU = u();
            rectU2 = u();
            try {
                dsk.a(this, view2, rectU);
                dsj dsjVar2 = (dsj) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                C(i2, rectU, rectU2, dsjVar2, measuredWidth, measuredHeight);
                v(dsjVar2, rectU2, measuredWidth, measuredHeight);
                view.layout(rectU2.left, rectU2.top, rectU2.right, rectU2.bottom);
                return;
            } finally {
                rectU.setEmpty();
                dzkVar = j;
                dzkVar.b(rectU);
                rectU2.setEmpty();
                dzkVar.b(rectU2);
            }
        }
        int i3 = dsjVar.e;
        if (i3 < 0) {
            dsj dsjVar3 = (dsj) view.getLayoutParams();
            rectU = u();
            rectU.set(getPaddingLeft() + dsjVar3.leftMargin, getPaddingTop() + dsjVar3.topMargin, (getWidth() - getPaddingRight()) - dsjVar3.rightMargin, (getHeight() - getPaddingBottom()) - dsjVar3.bottomMargin);
            if (this.e != null) {
                int[] iArr = ebm.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectU.left += this.e.b();
                    rectU.top += this.e.d();
                    rectU.right -= this.e.c();
                    rectU.bottom -= this.e.a();
                }
            }
            rectU2 = u();
            Gravity.apply(r(dsjVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectU, rectU2, i2);
            view.layout(rectU2.left, rectU2.top, rectU2.right, rectU2.bottom);
            return;
        }
        dsj dsjVar4 = (dsj) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(s(dsjVar4.c), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int iP = p(i3) - measuredWidth2;
        if (i4 == 1) {
            iP += measuredWidth2 / 2;
        } else if (i4 == 5) {
            iP += measuredWidth2;
        }
        int i6 = i5 != 16 ? i5 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + dsjVar4.leftMargin, Math.min(iP, ((width - getPaddingRight()) - measuredWidth2) - dsjVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + dsjVar4.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight2) - dsjVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean k(View view, int i2, int i3) {
        Rect rectU = u();
        dsk.a(this, view, rectU);
        try {
            return rectU.contains(i2, i3);
        } finally {
            w(rectU);
        }
    }

    public final void m(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
        if (this.u) {
            if (this.y == null) {
                this.y = new fez(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.y);
        }
        if (this.e == null) {
            int[] iArr = ebm.a;
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
        if (this.u && this.y != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.y);
        }
        View view = this.t;
        if (view != null) {
            h(view, 0);
        }
        this.q = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.v == null) {
            return;
        }
        ecy ecyVar = this.e;
        int iD = ecyVar != null ? ecyVar.d() : 0;
        if (iD > 0) {
            this.v.setBounds(0, 0, getWidth(), iD);
            this.v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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
        dsg dsgVar;
        int layoutDirection = getLayoutDirection();
        List list = this.k;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((dsgVar = ((dsj) view.getLayoutParams()).a) == null || !dsgVar.g(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Type inference failed for: r11v9, types: [dzk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [dzk, java.lang.Object] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dsj dsjVar = (dsj) childAt.getLayoutParams();
                if (dsjVar.n) {
                    dsg dsgVar = dsjVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        dsg dsgVar;
        int childCount = getChildCount();
        boolean zM = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dsj dsjVar = (dsj) childAt.getLayoutParams();
                if (dsjVar.n && (dsgVar = dsjVar.a) != null) {
                    zM |= dsgVar.m(view);
                }
            }
        }
        return zM;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        SparseArray sparseArray = savedState.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            dsg dsgVar = l(childAt).a;
            if (id != -1 && dsgVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                dsgVar.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableR;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            dsg dsgVar = ((dsj) childAt.getLayoutParams()).a;
            if (id != -1 && dsgVar != null && (parcelableR = dsgVar.r(childAt)) != null) {
                sparseArray.append(id, parcelableR);
            }
        }
        savedState.a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zB;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.s;
        boolean z = false;
        if (view != null) {
            dsg dsgVar = ((dsj) view.getLayoutParams()).a;
            zB = dsgVar != null ? dsgVar.i(this, this.s, motionEvent) : false;
        } else {
            zB = B(motionEvent, 1);
            if (actionMasked != 0 && zB) {
                z = true;
            }
        }
        if (this.s == null || actionMasked == 3) {
            zB |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventD = D(motionEvent);
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        dsg dsgVar = ((dsj) view.getLayoutParams()).a;
        if (dsgVar == null || !dsgVar.h(this, view, rect, z)) {
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
            MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                dsg dsgVar = ((dsj) childAt.getLayoutParams()).a;
                if (dsgVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                    }
                    dsgVar.f(this, childAt, motionEventObtain);
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
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.v;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.v.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.eag
    public final boolean t(View view, View view2, int i2, int i3) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        boolean z = false;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                dsj dsjVar = (dsj) childAt.getLayoutParams();
                dsg dsgVar = dsjVar.a;
                if (dsgVar != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i4 = i2;
                    i5 = i3;
                    boolean zS = dsgVar.s(coordinatorLayout, childAt, view3, i4, i5);
                    z |= zS;
                    dsjVar.c(i5, zS);
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i4 = i2;
                    i5 = i3;
                    dsjVar.c(i5, false);
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
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dsj(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new mh(3);
        SparseArray a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
