package com.google.android.material.sidesheet;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.dsg;
import defpackage.dsj;
import defpackage.ebm;
import defpackage.edf;
import defpackage.edr;
import defpackage.eem;
import defpackage.een;
import defpackage.eow;
import defpackage.nw;
import defpackage.rgm;
import defpackage.wkn;
import defpackage.wly;
import defpackage.wra;
import defpackage.wrj;
import defpackage.wrk;
import defpackage.wub;
import defpackage.wue;
import defpackage.wuj;
import defpackage.wuk;
import defpackage.wuy;
import defpackage.wuz;
import defpackage.wva;
import defpackage.wvb;
import defpackage.wvc;
import defpackage.wvf;
import defpackage.wvg;
import defpackage.wvh;
import defpackage.wvi;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends dsg<V> implements wra {
    public wvc a;
    public boolean b;
    public int c;
    public een d;
    public final float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public WeakReference j;
    public final Set k;
    private wue l;
    private ColorStateList m;
    private wuk n;
    private final wvh o;
    private float p;
    private boolean q;
    private WeakReference r;
    private int s;
    private VelocityTracker t;
    private wrk u;
    private int v;
    private final eem w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new wvh(this);
        this.b = true;
        this.c = 5;
        this.e = 0.1f;
        this.s = -1;
        this.k = new LinkedHashSet();
        this.w = new wvf(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wuz.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.m = wub.h(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.n = new wuk(wuk.l(context, attributeSet, 0, R.style.Widget_Material3_SideSheet));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.s = resourceId;
            WeakReference weakReference = this.r;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.r = null;
            WeakReference weakReference2 = this.j;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        if (this.n != null) {
            wue wueVar = new wue(this.n);
            this.l = wueVar;
            wueVar.K(context);
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                this.l.O(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.l.setTint(typedValue.data);
            }
        }
        this.p = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.b = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private final int P() {
        wvc wvcVar = this.a;
        return (wvcVar == null || wvcVar.i() == 0) ? 5 : 3;
    }

    private final dsj R() {
        View view;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof dsj)) {
            return null;
        }
        return (dsj) view.getLayoutParams();
    }

    private final void S(View view, edf edfVar, final int i) {
        ebm.u(view, edfVar, new edr() { // from class: wvd
            @Override // defpackage.edr
            public final boolean a(View view2) {
                this.a.L(i);
                return true;
            }
        });
    }

    private final void T() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private final void U() {
        View view;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ebm.l(view, 262144);
        ebm.l(view, 1048576);
        if (this.c != 5) {
            S(view, edf.i, 5);
        }
        if (this.c != 3) {
            S(view, edf.h, 3);
        }
    }

    private final void V(wuk wukVar) {
        wue wueVar = this.l;
        if (wueVar != null) {
            wueVar.d(wukVar);
        }
    }

    private final void X(View view) {
        int i = this.c == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    private final boolean Z() {
        if (this.d != null) {
            return this.b || this.c == 1;
        }
        return false;
    }

    public final int J() {
        return this.a.c();
    }

    public final View K() {
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void L(int i) {
        WeakReference weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            M(i);
            return;
        }
        View view = (View) this.j.get();
        rgm rgmVar = new rgm(this, i, 15, null);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(rgmVar);
        } else {
            rgmVar.run();
        }
    }

    public final void M(int i) {
        View view;
        if (this.c == i) {
            return;
        }
        this.c = i;
        WeakReference weakReference = this.j;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X(view);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((wvb) it.next()).b();
        }
        U();
    }

    public final void N(View view, int i, boolean z) {
        int iJ;
        if (i == 3) {
            iJ = J();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.bp(i, "Invalid state to get outer edge offset: "));
            }
            iJ = this.a.d();
        }
        een eenVar = this.d;
        if (eenVar == null || (!z ? eenVar.j(view, iJ, view.getTop()) : eenVar.h(iJ, view.getTop()))) {
            M(i);
        } else {
            M(2);
            this.o.a(i);
        }
    }

    @Override // defpackage.wra
    public final void O() {
        wrk wrkVar = this.u;
        if (wrkVar == null) {
            return;
        }
        wrkVar.e();
    }

    @Override // defpackage.wra
    public final void Q() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        wrk wrkVar = this.u;
        if (wrkVar == null) {
            return;
        }
        nw nwVarC = wrkVar.c();
        if (nwVarC == null || Build.VERSION.SDK_INT < 34) {
            L(5);
            return;
        }
        wrk wrkVar2 = this.u;
        int iP = P();
        wvg wvgVar = new wvg(this);
        final View viewK = K();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (viewK != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewK.getLayoutParams()) != null) {
            final int iB = this.a.b(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: wve
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i2 = iB;
                    this.a.a.j(marginLayoutParams, wkn.b(i2, 0, valueAnimator.getAnimatedFraction()));
                    viewK.requestLayout();
                }
            };
        }
        boolean zH = wrkVar2.h(iP);
        View view = wrkVar2.a;
        float width = view.getWidth() * view.getScaleX();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = zH ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = width + i;
        Property property = View.TRANSLATION_X;
        if (zH) {
            f = -f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        boolean z = nwVarC.c == 0;
        objectAnimatorOfFloat.setInterpolator(new eow());
        objectAnimatorOfFloat.setDuration(wkn.b(wrkVar2.b, wrkVar2.c, nwVarC.b));
        objectAnimatorOfFloat.addListener(new wrj(wrkVar2, z, iP));
        objectAnimatorOfFloat.addListener(wvgVar);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.wra
    public final void W(nw nwVar) {
        wrk wrkVar = this.u;
        if (wrkVar == null) {
            return;
        }
        wrkVar.e = nwVar;
    }

    @Override // defpackage.wra
    public final void Y(nw nwVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        wrk wrkVar = this.u;
        if (wrkVar == null) {
            return;
        }
        wrkVar.f(nwVar, P());
        WeakReference weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.j.get();
        View viewK = K();
        if (viewK == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewK.getLayoutParams()) == null) {
            return;
        }
        this.a.j(marginLayoutParams, (int) ((this.f * view.getScaleX()) + this.i));
        viewK.requestLayout();
    }

    @Override // defpackage.dsg
    public final void c(dsj dsjVar) {
        this.j = null;
        this.d = null;
        this.u = null;
    }

    @Override // defpackage.dsg
    public final void d() {
        this.j = null;
        this.d = null;
        this.u = null;
    }

    @Override // defpackage.dsg
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        een eenVar;
        if ((!view.isShown() && ebm.f(view) == null) || !this.b) {
            this.q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
            actionMasked = 0;
        }
        VelocityTracker velocityTrackerObtain = this.t;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.t = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.v = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.q) {
            this.q = false;
            return false;
        }
        return (this.q || (eenVar = this.d) == null || !eenVar.i(motionEvent)) ? false : true;
    }

    @Override // defpackage.dsg
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        dsj dsjVarR;
        dsj dsjVarR2;
        int i2;
        View viewFindViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.j == null) {
            this.j = new WeakReference(view);
            this.u = new wrk(view);
            wue wueVar = this.l;
            if (wueVar != null) {
                view.setBackground(wueVar);
                wue wueVar2 = this.l;
                float elevation = this.p;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                wueVar2.N(elevation);
            } else {
                ColorStateList colorStateList = this.m;
                if (colorStateList != null) {
                    int[] iArr = ebm.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            X(view);
            U();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ebm.f(view) == null) {
                ebm.q(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(((dsj) view.getLayoutParams()).c, i);
        int iG = 0;
        int i3 = absoluteGravity != 3 ? 0 : 1;
        wvc wvcVar = this.a;
        if (wvcVar == null || wvcVar.i() != i3) {
            if (absoluteGravity != 3) {
                this.a = new wva(this);
                if (this.n != null && ((dsjVarR2 = R()) == null || dsjVarR2.rightMargin <= 0)) {
                    wuj wujVar = new wuj(this.n);
                    wujVar.d(BitmapDescriptorFactory.HUE_RED);
                    wujVar.b(BitmapDescriptorFactory.HUE_RED);
                    V(new wuk(wujVar));
                }
            } else {
                this.a = new wuy(this);
                if (this.n != null && ((dsjVarR = R()) == null || dsjVarR.leftMargin <= 0)) {
                    wuj wujVar2 = new wuj(this.n);
                    wujVar2.c(BitmapDescriptorFactory.HUE_RED);
                    wujVar2.a(BitmapDescriptorFactory.HUE_RED);
                    V(new wuk(wujVar2));
                }
            }
        }
        if (this.d == null) {
            this.d = een.b(coordinatorLayout, this.w);
        }
        int iG2 = this.a.g(view);
        coordinatorLayout.j(view, i);
        this.g = coordinatorLayout.getWidth();
        this.h = this.a.h(coordinatorLayout);
        this.f = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.i = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        int i4 = this.c;
        if (i4 == 1 || i4 == 2) {
            iG = iG2 - this.a.g(view);
        } else if (i4 != 3) {
            if (i4 != 5) {
                throw new IllegalStateException(a.bp(i4, "Unexpected value: "));
            }
            iG = this.a.d();
        }
        int[] iArr2 = ebm.a;
        view.offsetLeftAndRight(iG);
        if (this.r == null && (i2 = this.s) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.r = new WeakReference(viewFindViewById);
        }
        for (wvb wvbVar : this.k) {
            if (wvbVar instanceof wvi) {
            }
        }
        return true;
    }

    @Override // defpackage.dsg
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.c == 1 && actionMasked == 0) {
            return true;
        }
        if (Z()) {
            this.d.e(motionEvent);
        }
        if (actionMasked == 0) {
            T();
        }
        VelocityTracker velocityTrackerObtain = this.t;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.t = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (Z() && actionMasked == 2 && !this.q && Z()) {
            float fAbs = Math.abs(this.v - motionEvent.getX());
            een eenVar = this.d;
            if (fAbs > eenVar.b) {
                eenVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.q;
    }

    @Override // defpackage.dsg
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.dsg
    public final void q(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).a;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.c = i;
    }

    @Override // defpackage.dsg
    public final Parcelable r(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new wly(4);
        final int a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.a = sideSheetBehavior.c;
        }
    }

    public SideSheetBehavior() {
        this.o = new wvh(this);
        this.b = true;
        this.c = 5;
        this.e = 0.1f;
        this.s = -1;
        this.k = new LinkedHashSet();
        this.w = new wvf(this);
    }
}
