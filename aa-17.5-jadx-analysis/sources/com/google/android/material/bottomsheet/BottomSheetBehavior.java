package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
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
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.dsg;
import defpackage.dsj;
import defpackage.ebf;
import defpackage.ebm;
import defpackage.ecy;
import defpackage.edf;
import defpackage.eem;
import defpackage.een;
import defpackage.eow;
import defpackage.nw;
import defpackage.sha;
import defpackage.wkn;
import defpackage.wls;
import defpackage.wlt;
import defpackage.wlv;
import defpackage.wlw;
import defpackage.wlx;
import defpackage.wly;
import defpackage.wlz;
import defpackage.wmh;
import defpackage.wra;
import defpackage.wre;
import defpackage.wrf;
import defpackage.wtw;
import defpackage.wub;
import defpackage.wue;
import defpackage.wuk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends dsg<V> implements wra {
    int A;
    public int B;
    public WeakReference C;
    final List D;
    public final ArrayList E;
    wrf F;
    public int G;
    public WeakReference H;
    public boolean I;
    final SparseIntArray J;
    final SparseIntArray K;
    final SparseIntArray L;
    private int M;
    private float N;
    private boolean O;
    private int P;
    private int Q;
    private ColorStateList R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private wuk W;
    private boolean X;
    private final wlz Y;
    private ValueAnimator Z;
    public boolean a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private int ae;
    private boolean af;
    private final float ag;
    private int ah;
    private VelocityTracker ai;
    private int aj;
    private Map ak;
    private final Rect al;
    private final eem am;
    public int b;
    public boolean c;
    public int d;
    public wue e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    int p;
    public int q;
    public int r;
    float s;
    public int t;
    float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public een z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = 0;
        this.a = true;
        this.f = -1;
        this.S = -1;
        this.Y = new wlz(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.aa = true;
        this.ac = true;
        this.y = 4;
        this.ag = 0.1f;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.aj = -1;
        this.J = new SparseIntArray();
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.al = new Rect();
        this.am = new wlv(this);
        this.Q = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wmh.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.R = wub.h(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.W = new wuk(wuk.i(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal, new wtw(BitmapDescriptorFactory.HUE_RED)));
        }
        if (this.W != null) {
            wue wueVar = new wue(this.W);
            this.e = wueVar;
            wueVar.K(context);
            ColorStateList colorStateList = this.R;
            if (colorStateList != null) {
                this.e.O(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ae(), 1.0f);
        this.Z = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.Z.addUpdateListener(new wlt(this));
        this.u = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || typedValuePeekValue.data != -1) {
            ac(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            ac(typedValuePeekValue.data);
        }
        T(typedArrayObtainStyledAttributes.getBoolean(10, false));
        this.T = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.a != z) {
            this.a = z;
            if (this.C != null) {
                ai();
            }
            V((this.a && this.y == 6) ? 3 : this.y);
            am(this.y, true);
            al();
        }
        this.w = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.aa = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.M = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.s = f;
        if (this.C != null) {
            aj();
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            S(typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0));
        } else {
            S(typedValuePeekValue2.data);
        }
        this.b = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.c = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.ac = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.h = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.i = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.j = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.U = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.k = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.l = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.m = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.V = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.N = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static BottomSheetBehavior M(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof dsj)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        dsg dsgVar = ((dsj) layoutParams).a;
        if (dsgVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) dsgVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private final float ae() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.e == null || (weakReference = this.C) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (!ap() || (rootWindowInsets = ((View) this.C.get()).getRootWindowInsets()) == null) ? BitmapDescriptorFactory.HUE_RED : Math.max(as(this.e.x(), rootWindowInsets.getRoundedCorner(0)), as(this.e.y(), rootWindowInsets.getRoundedCorner(1)));
    }

    private final int af(View view, int i, int i2) throws Resources.NotFoundException {
        int iA;
        String string = view.getResources().getString(i);
        wlw wlwVar = new wlw(this, i2);
        List listG = ebm.g(view);
        int i3 = 0;
        while (true) {
            if (i3 >= listG.size()) {
                int i4 = -1;
                for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                    i4 = ebm.a[i5];
                    boolean z = true;
                    for (int i6 = 0; i6 < listG.size(); i6++) {
                        z &= ((edf) listG.get(i6)).a() != i4;
                    }
                    if (true != z) {
                        i4 = -1;
                    }
                }
                iA = i4;
            } else {
                if (TextUtils.equals(string, ((edf) listG.get(i3)).b())) {
                    iA = ((edf) listG.get(i3)).a();
                    break;
                }
                i3++;
            }
        }
        if (iA != -1) {
            ebm.h(view, new edf(null, iA, string, wlwVar, null));
        }
        return iA;
    }

    private final int ag() {
        int iMin;
        int i;
        int i2;
        if (this.O) {
            iMin = Math.min(Math.max(this.P, this.B - ((this.A * 9) / 16)), this.ah);
            i = this.n;
        } else {
            if (!this.T && !this.h && (i2 = this.g) > 0) {
                return Math.max(this.d, i2 + this.Q);
            }
            iMin = this.d;
            i = this.n;
        }
        return iMin + i;
    }

    private final int ah(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.r : this.B : this.t : J();
    }

    private final void ai() {
        int iAg = ag();
        boolean z = this.a;
        int i = this.B;
        if (z) {
            this.t = Math.max(i - iAg, this.q);
        } else {
            this.t = i - iAg;
        }
    }

    private final void aj() {
        this.r = (int) (this.B * (1.0f - this.s));
    }

    private final void ak() {
        this.G = -1;
        this.aj = -1;
        this.H = null;
        VelocityTracker velocityTracker = this.ai;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ai = null;
        }
    }

    private final void al() {
        View view;
        WeakReference weakReference = this.C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ebm.m(1048576, view);
        ebm.k(view, 0);
        ebm.m(524288, view);
        ebm.k(view, 0);
        ebm.m(262144, view);
        ebm.k(view, 0);
        SparseIntArray sparseIntArray = this.K;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            ebm.m(i, view);
            ebm.k(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.J;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            ebm.m(i2, view);
            ebm.k(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.L;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            ebm.m(i3, view);
            ebm.k(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.a && this.y != 6) {
            sparseIntArray2.put(0, af(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.v && this.y != 5) {
            ebm.u(view, edf.i, new wlw(this, 5));
        }
        int i4 = this.y;
        if (i4 == 3) {
            if (aa()) {
                sparseIntArray3.put(0, af(view, R.string.bottomsheet_action_collapse, 4));
            }
        } else if (i4 == 4) {
            sparseIntArray.put(0, af(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            if (aa()) {
                sparseIntArray3.put(0, af(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, af(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    private final void am(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.y == 3 && (this.V || ap());
        if (this.X == z2 || this.e == null) {
            return;
        }
        this.X = z2;
        if (!z || (valueAnimator = this.Z) == null) {
            ValueAnimator valueAnimator2 = this.Z;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Z.cancel();
            }
            this.e.P(this.X ? ae() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.Z.reverse();
        } else {
            this.Z.setFloatValues(this.e.p.k, z2 ? ae() : 1.0f);
            this.Z.start();
        }
    }

    private final void an(boolean z) {
        WeakReference weakReference = this.C;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.ak != null) {
                    return;
                } else {
                    this.ak = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.C.get() && z) {
                    this.ak.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.ak = null;
        }
    }

    private final boolean ao() {
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean ap() {
        WeakReference weakReference = this.C;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.C.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean aq(View view) {
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    private final boolean ar() {
        if (this.z != null) {
            return this.x || this.y == 1;
        }
        return false;
    }

    private static final float as(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > BitmapDescriptorFactory.HUE_RED && f > BitmapDescriptorFactory.HUE_RED) {
                return radius / f;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    private static final int at(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final int J() {
        if (this.a) {
            return this.q;
        }
        return Math.max(this.p, this.U ? 0 : this.o);
    }

    final View K(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewK = K(viewGroup.getChildAt(i));
                if (viewK != null) {
                    return viewK;
                }
            }
        }
        return null;
    }

    public final View L() {
        List list = this.D;
        if (list.isEmpty()) {
            return null;
        }
        return (View) ((WeakReference) list.get(0)).get();
    }

    public final void N(wlx wlxVar) {
        ArrayList arrayList = this.E;
        if (arrayList.contains(wlxVar)) {
            return;
        }
        arrayList.add(wlxVar);
    }

    @Override // defpackage.wra
    public final void O() {
        wrf wrfVar = this.F;
        if (wrfVar == null) {
            return;
        }
        wrfVar.f();
    }

    public final void P(int i) {
        View view = (View) this.C.get();
        if (view != null) {
            ArrayList arrayList = this.E;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.t;
            if (i <= i2 && i2 != J()) {
                J();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((wlx) arrayList.get(i3)).b(view);
            }
        }
    }

    @Override // defpackage.wra
    public final void Q() {
        wrf wrfVar = this.F;
        if (wrfVar == null) {
            return;
        }
        if (wrfVar.c() == null || Build.VERSION.SDK_INT < 34) {
            U(true == this.v ? 5 : 4);
            return;
        }
        boolean z = this.v;
        wrf wrfVar2 = this.F;
        if (!z) {
            Animator animatorE = wrfVar2.e();
            animatorE.setDuration(wkn.b(wrfVar2.b, wrfVar2.c, r0.b));
            animatorE.start();
            U(4);
            return;
        }
        wls wlsVar = new wls(this);
        View view = wrfVar2.a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight() * view.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new eow());
        objectAnimatorOfFloat.setDuration(wkn.b(wrfVar2.b, wrfVar2.c, r0.b));
        objectAnimatorOfFloat.addListener(new wre(wrfVar2));
        objectAnimatorOfFloat.addListener(wlsVar);
        objectAnimatorOfFloat.start();
    }

    final void R(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.D.add(new WeakReference(view));
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                R(viewGroup.getChildAt(i));
            }
        }
    }

    public final void S(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.p = i;
        am(this.y, true);
    }

    public final void T(boolean z) {
        if (this.v != z) {
            this.v = z;
            if (!z && this.y == 5) {
                U(4);
            }
            al();
        }
    }

    public final void U(int i) {
        if (!this.v && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && ah(6) <= this.q) ? 3 : i;
        WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() == null) {
            V(i);
            return;
        }
        View view = (View) this.C.get();
        sha shaVar = new sha(this, view, i2, 2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(shaVar);
        } else {
            shaVar.run();
        }
    }

    public final void V(int i) {
        View view;
        if (this.y == i) {
            return;
        }
        this.y = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.v && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            an(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            an(false);
            i = i2;
        }
        am(i, true);
        while (true) {
            ArrayList arrayList = this.E;
            if (i3 >= arrayList.size()) {
                al();
                return;
            } else {
                ((wlx) arrayList.get(i3)).a(view, i);
                i3++;
            }
        }
    }

    @Override // defpackage.wra
    public final void W(nw nwVar) {
        wrf wrfVar = this.F;
        if (wrfVar == null) {
            return;
        }
        wrfVar.e = nwVar;
    }

    public final void X(View view, int i, boolean z) {
        int iAh = ah(i);
        een eenVar = this.z;
        if (eenVar == null || (!z ? eenVar.j(view, view.getLeft(), iAh) : eenVar.h(view.getLeft(), iAh))) {
            V(i);
            return;
        }
        V(2);
        am(i, true);
        this.Y.a(i);
    }

    @Override // defpackage.wra
    public final void Y(nw nwVar) {
        wrf wrfVar = this.F;
        if (wrfVar == null) {
            return;
        }
        wrfVar.h(nwVar);
    }

    public final boolean Z() {
        return this.v;
    }

    final boolean aa() {
        return (this.w && this.v) ? false : true;
    }

    public final boolean ab(View view, float f) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.ag)) - ((float) this.t)) / ((float) ag()) > 0.5f;
    }

    public final void ac(int i) {
        boolean z = this.O;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.O = true;
            }
        } else {
            if (!z && this.d == i) {
                return;
            }
            this.O = false;
            this.d = Math.max(0, i);
        }
        ad();
    }

    public final void ad() {
        View view;
        if (this.C != null) {
            ai();
            if (this.y != 4 || (view = (View) this.C.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.dsg
    public final void c(dsj dsjVar) {
        this.C = null;
        this.z = null;
        this.F = null;
    }

    @Override // defpackage.dsg
    public final void d() {
        this.C = null;
        this.z = null;
        this.F = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    @Override // defpackage.dsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.J()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.V(r0)
            return
        Lf:
            boolean r3 = r2.aq(r5)
            if (r3 == 0) goto Lb2
            boolean r3 = r2.af
            if (r3 != 0) goto L1b
            goto Lb2
        L1b:
            int r3 = r2.ae
            r5 = 6
            if (r3 <= 0) goto L31
            boolean r3 = r2.a
            if (r3 == 0) goto L26
            goto Lac
        L26:
            int r3 = r4.getTop()
            int r6 = r2.r
            if (r3 <= r6) goto Lac
        L2e:
            r0 = r5
            goto Lac
        L31:
            boolean r3 = r2.v
            if (r3 == 0) goto L52
            android.view.VelocityTracker r3 = r2.ai
            if (r3 != 0) goto L3b
            r3 = 0
            goto L4a
        L3b:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.N
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.ai
            int r6 = r2.G
            float r3 = r3.getYVelocity(r6)
        L4a:
            boolean r3 = r2.ab(r4, r3)
            if (r3 == 0) goto L52
            r0 = 5
            goto Lac
        L52:
            int r3 = r2.ae
            r6 = 4
            if (r3 != 0) goto L90
            int r3 = r4.getTop()
            boolean r1 = r2.a
            if (r1 == 0) goto L71
            int r5 = r2.q
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L94
            goto Lac
        L71:
            int r1 = r2.r
            if (r3 >= r1) goto L80
            int r6 = r2.t
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L2e
            goto Lac
        L80:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L94
            goto L2e
        L90:
            boolean r3 = r2.a
            if (r3 == 0) goto L96
        L94:
            r0 = r6
            goto Lac
        L96:
            int r3 = r4.getTop()
            int r0 = r2.r
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.t
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L94
            goto L2e
        Lac:
            r3 = 0
            r2.X(r4, r0, r3)
            r2.af = r3
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.dsg
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View viewL;
        int i;
        WeakReference weakReference;
        een eenVar;
        if (!view.isShown() || !this.x) {
            this.ad = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ak();
            actionMasked = 0;
        }
        VelocityTracker velocityTrackerObtain = this.ai;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.ai = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.aj = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            List list = this.D;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View view3 = (View) ((WeakReference) it.next()).get();
                    if (view3 != null && coordinatorLayout.k(view3, x2, y)) {
                        view2 = view3;
                        break;
                    }
                }
            }
            WeakReference weakReference2 = new WeakReference(view2);
            this.H = weakReference2;
            if (this.y != 2 && weakReference2.get() != null) {
                this.G = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.I = true;
            }
            this.ad = this.G == -1 && !coordinatorLayout.k(view, x, this.aj);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
            this.H = null;
            this.G = -1;
            if (this.ad) {
                this.ad = false;
                return false;
            }
        }
        if (!this.ad && (eenVar = this.z) != null && eenVar.i(motionEvent)) {
            return true;
        }
        if (actionMasked == 2 && ao() && !this.ad && this.y != 1 && (!this.c ? (viewL = L()) == null || !coordinatorLayout.k(viewL, (int) motionEvent.getX(), (int) motionEvent.getY()) : (weakReference = this.H) == null || weakReference.get() == null) && this.z != null && (i = this.aj) != -1) {
            if (Math.abs(i - motionEvent.getY()) > this.z.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    @Override // defpackage.dsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.dsg
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (!this.ac || view.isInTouchMode()) {
            return false;
        }
        int i = this.y;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.al;
        if (view.getLocalVisibleRect(rect2)) {
            int[] iArr = ebm.a;
            ecy ecyVarA = ebf.a(view);
            if (ecyVarA != null) {
                rect2.bottom -= ecyVarA.f(519).e;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        U(3);
        return true;
    }

    @Override // defpackage.dsg
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        if (ar()) {
            this.z.e(motionEvent);
        }
        if (actionMasked == 0) {
            ak();
        }
        VelocityTracker velocityTrackerObtain = this.ai;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.ai = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (ar() && actionMasked == 2 && !this.ad) {
            float fAbs = Math.abs(this.aj - motionEvent.getY());
            een eenVar = this.z;
            if (fAbs > eenVar.b) {
                eenVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.ad;
    }

    @Override // defpackage.dsg
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(at(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f, marginLayoutParams.width), at(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.S, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.dsg
    public final boolean m(View view) {
        return ao() && aq(view) && this.y != 3 && !this.ab;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r5 == false) goto L32;
     */
    @Override // defpackage.dsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int[] r7, int r8) {
        /*
            r2 = this;
            r3 = 1
            if (r8 != r3) goto L5
            goto L97
        L5:
            boolean r8 = r2.aq(r5)
            if (r8 == 0) goto L97
            int r8 = r4.getTop()
            int r0 = r8 - r6
            if (r6 <= 0) goto L4a
            boolean r1 = r2.af
            if (r1 != 0) goto L22
            boolean r1 = r2.aa
            if (r1 != 0) goto L22
            boolean r5 = r5.canScrollVertically(r3)
            if (r5 == 0) goto L22
            goto L5c
        L22:
            int r5 = r2.J()
            if (r0 >= r5) goto L3a
            int r5 = r2.J()
            int r8 = r8 - r5
            r7[r3] = r8
            int[] r5 = defpackage.ebm.a
            int r5 = -r8
            r4.offsetTopAndBottom(r5)
            r5 = 3
            r2.V(r5)
            goto L89
        L3a:
            boolean r5 = r2.x
            if (r5 == 0) goto L97
            r7[r3] = r6
            int r5 = -r6
            int[] r7 = defpackage.ebm.a
            r4.offsetTopAndBottom(r5)
            r2.V(r3)
            goto L89
        L4a:
            if (r6 >= 0) goto L89
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            boolean r1 = r2.af
            if (r1 != 0) goto L5f
            boolean r1 = r2.aa
            if (r1 != 0) goto L5f
            if (r5 != 0) goto L5c
            goto L61
        L5c:
            r2.ab = r3
            return
        L5f:
            if (r5 != 0) goto L89
        L61:
            int r5 = r2.t
            if (r0 <= r5) goto L7a
            boolean r0 = r2.Z()
            if (r0 == 0) goto L6c
            goto L7a
        L6c:
            int r8 = r8 - r5
            r7[r3] = r8
            int[] r5 = defpackage.ebm.a
            int r5 = -r8
            r4.offsetTopAndBottom(r5)
            r5 = 4
            r2.V(r5)
            goto L89
        L7a:
            boolean r5 = r2.x
            if (r5 == 0) goto L97
            r7[r3] = r6
            int r5 = -r6
            int[] r7 = defpackage.ebm.a
            r4.offsetTopAndBottom(r5)
            r2.V(r3)
        L89:
            int r4 = r4.getTop()
            r2.P(r4)
            r2.ae = r6
            r2.af = r3
            r3 = 0
            r2.ab = r3
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.o(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int[], int):void");
    }

    @Override // defpackage.dsg
    public final void q(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.M;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = savedState.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.v = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.w = savedState.g;
            }
        }
        int i3 = savedState.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.y = i2;
    }

    @Override // defpackage.dsg
    public final Parcelable r(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.dsg
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.ae = 0;
        this.af = false;
        return (i & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new wly(0);
        final int a;
        final int b;
        final boolean e;
        final boolean f;
        final boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.a = bottomSheetBehavior.y;
            this.b = bottomSheetBehavior.d;
            this.e = bottomSheetBehavior.a;
            this.f = bottomSheetBehavior.v;
            this.g = bottomSheetBehavior.w;
        }
    }

    public BottomSheetBehavior() {
        this.M = 0;
        this.a = true;
        this.f = -1;
        this.S = -1;
        this.Y = new wlz(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.aa = true;
        this.ac = true;
        this.y = 4;
        this.ag = 0.1f;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.aj = -1;
        this.J = new SparseIntArray();
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.al = new Rect();
        this.am = new wlv(this);
    }

    @Override // defpackage.dsg
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
