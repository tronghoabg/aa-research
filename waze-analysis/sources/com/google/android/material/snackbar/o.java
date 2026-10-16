package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.waze.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class o {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6771d = 0;
    private final AccessibilityManager A;
    private final SnackbarContentLayout B;

    /* renamed from: b, reason: collision with root package name */
    protected final n f6777b;

    /* renamed from: j, reason: collision with root package name */
    private final int f6779j;

    /* renamed from: k, reason: collision with root package name */
    private final int f6780k;

    /* renamed from: l, reason: collision with root package name */
    private final int f6781l;
    private final TimeInterpolator m;
    private final TimeInterpolator n;
    private final TimeInterpolator o;
    private final ViewGroup p;
    private final Context q;
    private int r;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private List z;

    /* renamed from: e, reason: collision with root package name */
    private static final TimeInterpolator f6772e = com.google.android.material.a.a.f6174b;

    /* renamed from: f, reason: collision with root package name */
    private static final TimeInterpolator f6773f = com.google.android.material.a.a.f6173a;

    /* renamed from: g, reason: collision with root package name */
    private static final TimeInterpolator f6774g = com.google.android.material.a.a.f6176d;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f6775h = {R.attr.snackbarStyle};

    /* renamed from: i, reason: collision with root package name */
    private static final String f6776i = "o";

    /* renamed from: a, reason: collision with root package name */
    static final Handler f6770a = new Handler(Looper.getMainLooper(), new e());
    private final Runnable s = new i(this, 1, (byte[]) null);

    /* renamed from: c, reason: collision with root package name */
    final h f6778c = new h(this);

    protected o(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.p = viewGroup;
        this.B = snackbarContentLayout;
        this.q = context;
        com.google.android.material.internal.n.c(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f6775h);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        n nVar = (n) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f6777b = nVar;
        nVar.f6760c = this;
        SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
        snackbarContentLayout2.d(nVar.a());
        snackbarContentLayout2.c(nVar.c());
        nVar.addView(view);
        nVar.setAccessibilityLiveRegion(1);
        nVar.setImportantForAccessibility(1);
        nVar.setFitsSystemWindows(true);
        ViewCompat.setOnApplyWindowInsetsListener(nVar, new f(this));
        ViewCompat.setAccessibilityDelegate(nVar, new g(this));
        this.A = (AccessibilityManager) context.getSystemService("accessibility");
        this.f6781l = com.google.android.material.internal.t.e(context, R.attr.motionDurationLong2, 250);
        this.f6779j = com.google.android.material.internal.t.e(context, R.attr.motionDurationLong2, 150);
        this.f6780k = com.google.android.material.internal.t.e(context, R.attr.motionDurationMedium1, 75);
        this.m = com.google.android.material.k.f.d(context, R.attr.motionEasingEmphasizedInterpolator, f6773f);
        this.o = com.google.android.material.k.f.d(context, R.attr.motionEasingEmphasizedInterpolator, f6774g);
        this.n = com.google.android.material.k.f.d(context, R.attr.motionEasingEmphasizedInterpolator, f6772e);
    }

    private final int B() {
        n nVar = this.f6777b;
        int height = nVar.getHeight();
        ViewGroup.LayoutParams layoutParams = nVar.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    private final ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.m);
        valueAnimatorOfFloat.addUpdateListener(new b(this, 1, (byte[]) null));
        return valueAnimatorOfFloat;
    }

    private final void D() {
        boolean zV = v();
        n nVar = this.f6777b;
        if (zV) {
            nVar.post(new i(this, 2, (char[]) null));
            return;
        }
        if (nVar.getParent() != null) {
            nVar.setVisibility(0);
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        n nVar = this.f6777b;
        ViewGroup.LayoutParams layoutParams = nVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f6776i, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (nVar.f6768k == null) {
            Log.w(f6776i, "Unable to update margins because original view margins are not set");
            return;
        }
        if (nVar.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = nVar.f6768k.bottom + this.t;
        int i3 = nVar.f6768k.left + this.u;
        int i4 = nVar.f6768k.right + this.v;
        int i5 = nVar.f6768k.top;
        if (marginLayoutParams.bottomMargin != i2 || marginLayoutParams.leftMargin != i3 || marginLayoutParams.rightMargin != i4 || marginLayoutParams.topMargin != i5) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            nVar.requestLayout();
        } else if (this.x == this.w) {
            return;
        }
        if (this.w > 0) {
            ViewGroup.LayoutParams layoutParams2 = nVar.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams2).getBehavior() instanceof SwipeDismissBehavior)) {
                Runnable runnable = this.s;
                nVar.removeCallbacks(runnable);
                nVar.post(runnable);
            }
        }
    }

    static /* bridge */ /* synthetic */ void l(o oVar) {
        ValueAnimator valueAnimatorC = oVar.C(0.0f, 1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(oVar.o);
        valueAnimatorOfFloat.addUpdateListener(new b(oVar, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorOfFloat);
        animatorSet.setDuration(oVar.f6779j);
        animatorSet.addListener(new k(oVar));
        animatorSet.start();
    }

    static /* bridge */ /* synthetic */ void m(o oVar) {
        int iB = oVar.B();
        oVar.f6777b.setTranslationY(iB);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iB, 0);
        valueAnimator.setInterpolator(oVar.n);
        valueAnimator.setDuration(oVar.f6781l);
        valueAnimator.addListener(new c(oVar));
        valueAnimator.addUpdateListener(new b(oVar, 2, (char[]) null));
        valueAnimator.start();
    }

    public final void A(com.google.android.play.core.a.t tVar) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(tVar);
    }

    public int e() {
        return this.r;
    }

    protected final void o(int i2) {
        u.a().c(this.f6778c, i2);
    }

    final void p(int i2) {
        if (v()) {
            n nVar = this.f6777b;
            if (nVar.getVisibility() == 0) {
                if (nVar.b() == 1) {
                    ValueAnimator valueAnimatorC = C(1.0f, 0.0f);
                    valueAnimatorC.setDuration(this.f6780k);
                    valueAnimatorC.addListener(new a(this, i2));
                    valueAnimatorC.start();
                    return;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(0, B());
                valueAnimator.setInterpolator(this.n);
                valueAnimator.setDuration(this.f6781l);
                valueAnimator.addListener(new d(this, i2));
                valueAnimator.addUpdateListener(new b(this, 3, (short[]) null));
                valueAnimator.start();
                return;
            }
        }
        z();
    }

    final void q() {
        WindowInsets rootWindowInsets = this.f6777b.getRootWindowInsets();
        if (rootWindowInsets != null) {
            this.w = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            E();
        }
    }

    final void r() {
        if (this.y) {
            D();
            this.y = false;
        }
    }

    final void s() {
        u.a().e(this.f6778c);
        List list = this.z;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((com.google.android.play.core.a.t) this.z.get(size)).a(this);
            }
        }
    }

    public final void t() {
        u.a().h(e(), this.f6778c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior, com.google.android.material.behavior.SwipeDismissBehavior, com.google.android.material.snackbar.BaseTransientBottomBar$Behavior] */
    final void u() {
        n nVar = this.f6777b;
        if (nVar.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = nVar.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                ?? r2 = new SwipeDismissBehavior<View>() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$Behavior

                    /* renamed from: f, reason: collision with root package name */
                    private final l f6738f = new l(this);

                    @Override // com.google.android.material.behavior.SwipeDismissBehavior
                    public final boolean c(View view) {
                        return view instanceof n;
                    }

                    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
                        this.f6738f.a(coordinatorLayout, view, motionEvent);
                        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
                    }
                };
                r2.f6738f.b(this);
                r2.b(new j(this));
                layoutParams2.setBehavior(r2);
                layoutParams2.insetEdge = 80;
            }
            nVar.f(this.p);
            E();
            nVar.setVisibility(4);
        }
        if (nVar.isLaidOut()) {
            D();
        } else {
            this.y = true;
        }
    }

    final boolean v() {
        AccessibilityManager accessibilityManager = this.A;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void x() {
        this.f6777b.g();
    }

    public final void y() {
        this.r = 4000;
    }

    final void z() {
        u.a().d(this.f6778c);
        List list = this.z;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((com.google.android.play.core.a.t) this.z.get(size)).c(this);
                }
            }
        }
        n nVar = this.f6777b;
        ViewParent parent = nVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(nVar);
        }
    }
}
