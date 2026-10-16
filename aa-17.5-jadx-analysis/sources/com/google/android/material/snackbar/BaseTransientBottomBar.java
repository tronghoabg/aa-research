package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.projection.gearhead.R;
import defpackage.dsj;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.sf;
import defpackage.wil;
import defpackage.wkn;
import defpackage.woy;
import defpackage.wqr;
import defpackage.wvk;
import defpackage.wvn;
import defpackage.wvo;
import defpackage.wvp;
import defpackage.wvs;
import defpackage.wvv;
import defpackage.wvw;
import defpackage.ykd;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseTransientBottomBar {
    public final int c;
    public final int d;
    public final int e;
    public final TimeInterpolator f;
    public final TimeInterpolator g;
    public final ViewGroup h;
    public final Context i;
    public final wvs j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final SnackbarContentLayout r;
    private final TimeInterpolator x;
    private final AccessibilityManager z;
    private static final TimeInterpolator t = wkn.b;
    private static final TimeInterpolator u = wkn.a;
    private static final TimeInterpolator v = wkn.d;
    private static final int[] w = {R.attr.snackbarStyle};
    public static final String b = "BaseTransientBottomBar";
    public static final Handler a = new Handler(Looper.getMainLooper(), new wvn());
    private final Runnable y = new wil(this, 17, null);
    public final ykd s = new ykd(this, null);

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final sf g = new sf(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean J(View view) {
            return view instanceof wvs;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.dsg
        public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            sf sfVar = this.g;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    wvw.a().f((ykd) sfVar.a);
                }
            } else if (coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                wvw.a().e((ykd) sfVar.a);
            }
            return super.f(coordinatorLayout, view, motionEvent);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.h = viewGroup;
        this.r = snackbarContentLayout;
        this.i = context;
        wqr.d(context, wqr.a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(w);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        wvs wvsVar = (wvs) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.j = wvsVar;
        wvsVar.a = this;
        float f = wvsVar.d;
        if (f != 1.0f) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            snackbarContentLayout2.b.setTextColor(woy.o(woy.m(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
        }
        ((SnackbarContentLayout) view).d = wvsVar.e;
        wvsVar.addView(view);
        wvsVar.setAccessibilityLiveRegion(1);
        wvsVar.setImportantForAccessibility(1);
        wvsVar.setFitsSystemWindows(true);
        wvo wvoVar = new wvo(this, 0);
        int[] iArr = ebm.a;
        ebe.e(wvsVar, wvoVar);
        ebm.o(wvsVar, new wvp(this));
        this.z = (AccessibilityManager) context.getSystemService("accessibility");
        this.e = woy.u(context, R.attr.motionDurationLong2, 250);
        this.c = woy.u(context, R.attr.motionDurationLong2, 150);
        this.d = woy.u(context, R.attr.motionDurationMedium1, 75);
        this.x = woy.C(context, R.attr.motionEasingEmphasizedInterpolator, u);
        this.g = woy.C(context, R.attr.motionEasingEmphasizedInterpolator, v);
        this.f = woy.C(context, R.attr.motionEasingEmphasizedInterpolator, t);
    }

    public int a() {
        throw null;
    }

    public final int b() {
        wvs wvsVar = this.j;
        int height = wvsVar.getHeight();
        ViewGroup.LayoutParams layoutParams = wvsVar.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.x);
        valueAnimatorOfFloat.addUpdateListener(new wvk(this, 0));
        return valueAnimatorOfFloat;
    }

    public final void d(int i) {
        wvw wvwVarA = wvw.a();
        Object obj = wvwVarA.a;
        ykd ykdVar = this.s;
        synchronized (obj) {
            if (wvwVarA.g(ykdVar)) {
                wvwVarA.d(wvwVarA.c, i);
            } else if (wvwVarA.h(ykdVar)) {
                wvwVarA.d(wvwVarA.d, i);
            }
        }
    }

    public final void e() {
        wvw wvwVarA = wvw.a();
        Object obj = wvwVarA.a;
        ykd ykdVar = this.s;
        synchronized (obj) {
            if (wvwVarA.g(ykdVar)) {
                wvwVarA.b(wvwVarA.c);
            }
        }
    }

    public final void f() {
        wvw wvwVarA = wvw.a();
        Object obj = wvwVarA.a;
        int iA = a();
        ykd ykdVar = this.s;
        synchronized (obj) {
            if (wvwVarA.g(ykdVar)) {
                wvv wvvVar = wvwVarA.c;
                wvvVar.a = iA;
                wvwVarA.b.removeCallbacksAndMessages(wvvVar);
                wvwVarA.b(wvwVarA.c);
                return;
            }
            if (wvwVarA.h(ykdVar)) {
                wvwVarA.d.a = iA;
            } else {
                wvwVarA.d = new wvv(iA, ykdVar);
            }
            wvv wvvVar2 = wvwVarA.c;
            if (wvvVar2 == null || !wvwVarA.d(wvvVar2, 4)) {
                wvwVarA.c = null;
                wvwVarA.c();
            }
        }
    }

    public final void g() {
        boolean zI = i();
        wvs wvsVar = this.j;
        if (zI) {
            wvsVar.post(new wil(this, 19, null));
            return;
        }
        if (wvsVar.getParent() != null) {
            wvsVar.setVisibility(0);
        }
        e();
    }

    public final void h() {
        wvs wvsVar = this.j;
        ViewGroup.LayoutParams layoutParams = wvsVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (wvsVar.f == null) {
            Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (wvsVar.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = wvsVar.f.bottom + this.l;
        int i2 = wvsVar.f.left + this.m;
        int i3 = wvsVar.f.right + this.n;
        int i4 = wvsVar.f.top;
        if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            wvsVar.requestLayout();
        } else if (this.p == this.o) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || this.o <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = wvsVar.getLayoutParams();
        if ((layoutParams2 instanceof dsj) && (((dsj) layoutParams2).a instanceof SwipeDismissBehavior)) {
            Runnable runnable = this.y;
            wvsVar.removeCallbacks(runnable);
            wvsVar.post(runnable);
        }
    }

    public final boolean i() {
        AccessibilityManager accessibilityManager = this.z;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void j() {
        wvw wvwVarA = wvw.a();
        Object obj = wvwVarA.a;
        ykd ykdVar = this.s;
        synchronized (obj) {
            if (wvwVarA.g(ykdVar)) {
                wvwVarA.c = null;
                if (wvwVarA.d != null) {
                    wvwVarA.c();
                }
            }
        }
        wvs wvsVar = this.j;
        ViewParent parent = wvsVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(wvsVar);
        }
    }
}
