package com.google.android.material.behavior;

import Ba.c;
import D9.o;
import V0.a;
import Va.M6;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vungle.ads.internal.protos.Sdk;
import com.wynauto.wyn.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: b, reason: collision with root package name */
    public int f26775b;

    /* renamed from: c, reason: collision with root package name */
    public int f26776c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f26777d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f26778e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f26781h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f26774a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f26779f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f26780g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // V0.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i5) {
        this.f26779f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f26775b = c.J(view.getContext(), R.attr.motionDurationLong2, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f26776c = c.J(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f26777d = c.K(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, J7.a.f5722d);
        this.f26778e = c.K(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, J7.a.f5721c);
        return false;
    }

    @Override // V0.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i5, int i10, int i11, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f26774a;
        if (i5 > 0) {
            if (this.f26780g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f26781h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f26780g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw M6.j(it);
            }
            this.f26781h = view.animate().translationY(this.f26779f).setInterpolator(this.f26778e).setDuration(this.f26776c).setListener(new o(this, 2));
            return;
        }
        if (i5 >= 0 || this.f26780g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f26781h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f26780g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw M6.j(it2);
        }
        this.f26781h = view.animate().translationY(0).setInterpolator(this.f26777d).setDuration(this.f26775b).setListener(new o(this, 2));
    }

    @Override // V0.a
    public boolean o(View view, int i5, int i10) {
        return i5 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
