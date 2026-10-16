package com.waze.view.navbar;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.content.ContextCompat;
import com.waze.car_lib.be;
import com.waze.da;
import com.waze.lm;
import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Window f45106a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f45107b;

    /* renamed from: c, reason: collision with root package name */
    private final n f45108c;

    /* renamed from: d, reason: collision with root package name */
    private final AnimatorSet f45109d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f45110e;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45113h;

    /* renamed from: f, reason: collision with root package name */
    private int f45111f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f45112g = -1;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f45114i = new Handler();

    public p(Window window) {
        this.f45106a = window;
        this.f45107b = (ViewGroup) window.getDecorView().findViewById(R.id.content);
        n nVar = new n(this);
        this.f45108c = nVar;
        this.f45109d = new AnimatorSet();
        o.d().f(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(int i2, float f2) {
        ViewGroup viewGroup = (ViewGroup) this.f45106a.getDecorView().findViewById(R.id.content);
        int i3 = 0;
        if (viewGroup.getChildCount() > 0 && (viewGroup.getChildAt(0) instanceof m)) {
            i3 = 1;
        }
        while (true) {
            ViewGroup viewGroup2 = this.f45107b;
            if (i3 >= viewGroup2.getChildCount()) {
                return;
            }
            View childAt = viewGroup2.getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.topMargin = i2;
            childAt.setLayoutParams(marginLayoutParams);
            childAt.setTranslationY(f2);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator B(float f2, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getAlpha(), f2);
        valueAnimatorOfFloat.addUpdateListener(new com.waze.design_components.button.timer.b(view, 7));
        valueAnimatorOfFloat.setDuration(100L);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator C(float f2, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getTranslationY(), f2);
        valueAnimatorOfFloat.addUpdateListener(new com.waze.design_components.button.timer.b(view, 6));
        valueAnimatorOfFloat.setDuration(100L);
        return valueAnimatorOfFloat;
    }

    public static /* synthetic */ void j(p pVar) {
        ViewGroup viewGroup = pVar.f45107b;
        if (viewGroup.getChildCount() > 0 && (viewGroup.getChildAt(0) instanceof m)) {
            viewGroup.removeViewAt(0);
            int i2 = pVar.f45111f;
            if (i2 != -1) {
                pVar.f45106a.setStatusBarColor(i2);
                pVar.f45111f = -1;
            }
            if (pVar.f45110e != null) {
                pVar.f45106a.getDecorView().setBackground(pVar.f45110e);
                pVar.f45110e = null;
            }
            int i3 = pVar.f45112g;
            if (i3 != -1) {
                pVar.z(i3);
                pVar.f45112g = -1;
            }
        }
        pVar.f45113h = false;
        pVar.A(0, 0.0f);
    }

    static /* bridge */ /* synthetic */ void l(p pVar) {
        if (pVar.f45113h) {
            m mVarY = pVar.y();
            if (mVarY == null) {
                com.waze.shared_infra.i.h.j("Attempt to recreate typing-while-driving-bar-view failed. Bar not attached to layout.");
                return;
            }
            mVarY.a();
            Window window = pVar.f45106a;
            window.setStatusBarColor(ContextCompat.getColor(window.getContext(), com.waze.R.color.background_default));
            com.waze.sharedui.a.e eVarE = lm.d().e();
            if (eVarE != null) {
                com.waze.shared_infra.i.h.B(eVarE);
            }
        }
    }

    static /* bridge */ /* synthetic */ void n(p pVar) throws Resources.NotFoundException {
        m mVar;
        pVar.f45114i.removeCallbacksAndMessages(null);
        if (pVar.f45113h) {
            return;
        }
        ViewGroup viewGroup = pVar.f45107b;
        if (viewGroup.getChildCount() == 0) {
            return;
        }
        pVar.f45113h = true;
        Window window = pVar.f45106a;
        float dimension = window.getContext().getResources().getDimension(com.waze.R.dimen.typing_while_driving_bar_height);
        if (viewGroup.getChildAt(0) instanceof m) {
            mVar = (m) viewGroup.getChildAt(0);
        } else {
            mVar = new m(pVar, window.getContext());
            viewGroup.addView(mVar, 0);
            mVar.setTranslationY(-dimension);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mVar.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.height = (int) dimension;
        mVar.setLayoutParams(marginLayoutParams);
        AnimatorSet animatorSet = pVar.f45109d;
        if (!animatorSet.isRunning()) {
            mVar.setAlpha(0.0f);
            pVar.f45110e = window.getDecorView().getBackground();
            pVar.f45111f = window.getStatusBarColor();
            pVar.f45112g = window.getDecorView().getSystemUiVisibility();
        }
        animatorSet.removeAllListeners();
        animatorSet.cancel();
        HashSet hashSet = new HashSet();
        hashSet.add(x(window.getStatusBarColor(), ContextCompat.getColor(window.getContext(), com.waze.R.color.background_default), window));
        hashSet.add(C(0.0f, mVar));
        hashSet.add(B(1.0f, mVar));
        for (int i2 = 1; i2 < viewGroup.getChildCount(); i2++) {
            hashSet.add(C(dimension, viewGroup.getChildAt(i2)));
        }
        animatorSet.addListener(new j(pVar, dimension));
        animatorSet.playTogether(hashSet);
        animatorSet.start();
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE == null || com.waze.shared_infra.i.h.B(eVarE)) {
            return;
        }
        pVar.z(8192);
    }

    public static boolean t() {
        com.waze.sharedui.a.e eVarE = lm.d().e();
        return (eVarE instanceof com.waze.ifs.ui.a) && ((com.waze.ifs.ui.a) eVarE).aC();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Animator x(int i2, int i3, Window window) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i2), Integer.valueOf(i3));
        valueAnimatorOfObject.addUpdateListener(new com.waze.design_components.button.timer.b(window, 5));
        valueAnimatorOfObject.setDuration(100L);
        return valueAnimatorOfObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m y() {
        View childAt = this.f45107b.getChildAt(0);
        if (childAt instanceof m) {
            return (m) childAt;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i2) {
        this.f45106a.getDecorView().post(new da(this, i2, 4));
    }

    public final void p() {
        o.d().h(this.f45108c);
    }

    public final void q() {
        o.d().f(this.f45108c);
        this.f45114i.postDelayed(new be(this, 4), 500L);
    }

    public final boolean s() {
        return this.f45113h;
    }
}
