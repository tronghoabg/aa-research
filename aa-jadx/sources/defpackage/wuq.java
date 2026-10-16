package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wuq implements defpackage.wun {
    public final /* synthetic */ defpackage.wut a;

    public wuq(defpackage.wut wutVar) {
        this.a = wutVar;
    }

    public static final void g(android.view.View view, int i) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    private final int h(android.support.v7.widget.Toolbar toolbar) {
        defpackage.wut wutVar = this.a;
        int iB = wutVar.b(wutVar.q);
        android.widget.FrameLayout frameLayout = wutVar.e;
        int paddingStart = frameLayout.getPaddingStart();
        int marginStart = ((android.view.ViewGroup.MarginLayoutParams) toolbar.getLayoutParams()).getMarginStart();
        return defpackage.wqn.j(wutVar.q) ? (iB + wutVar.q.getWidth()) - ((frameLayout.getWidth() - paddingStart) - marginStart) : (iB - paddingStart) - marginStart;
    }

    private final defpackage.emv i(android.view.View view, defpackage.emu emuVar, float f, float f2) {
        defpackage.emv emvVar = new defpackage.emv(view, emuVar);
        emvVar.s = defpackage.wqn.d(this.a.r, com.google.android.projection.gearhead.R.style.Motion_Material3_Spring_Standard_Default_Spatial);
        emvVar.j(f);
        emvVar.s.d(f2);
        return emvVar;
    }

    private final defpackage.emv j(boolean z, android.view.View view) {
        defpackage.wut wutVar = this.a;
        android.widget.TextView textView = wutVar.q.E;
        if (android.text.TextUtils.isEmpty(textView.getText()) || z) {
            textView = wutVar.q.D;
        }
        float fA = wutVar.a(textView, view) - h(wutVar.f);
        if (defpackage.wqn.j(wutVar.q)) {
            fA += textView.getWidth() - view.getWidth();
        }
        float f = true != z ? 0.0f : fA;
        if (true == z) {
            fA = 0.0f;
        }
        return i(view, defpackage.emv.a, f, fA);
    }

    private final defpackage.emv k(boolean z, android.support.v7.widget.Toolbar toolbar) {
        int iH = h(toolbar);
        int i = true != z ? 0 : iH;
        if (true == z) {
            iH = 0;
        }
        return i(toolbar, defpackage.emv.a, i, iH);
    }

    private final defpackage.emv l(final boolean z, final android.support.v7.widget.Toolbar toolbar) {
        defpackage.wut wutVar = this.a;
        int width = wutVar.q.getWidth();
        android.widget.FrameLayout frameLayout = wutVar.e;
        int width2 = frameLayout.getWidth();
        int paddingStart = frameLayout.getPaddingStart() + frameLayout.getPaddingEnd();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) wutVar.f.getLayoutParams();
        int marginStart = (width2 - paddingStart) - (marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd());
        int i = true != z ? marginStart : width;
        if (true == z) {
            width = marginStart;
        }
        defpackage.emv emvVarI = i(toolbar, new defpackage.wup(), i, width);
        emvVarI.g(new defpackage.emq() { // from class: wuo
            @Override // defpackage.emq
            public final void a(defpackage.emt emtVar, boolean z2, float f) {
                if (z) {
                    defpackage.wuq.g(toolbar, -1);
                }
            }
        });
        return emvVarI;
    }

    private static final android.animation.ValueAnimator m(boolean z) {
        return android.animation.ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
    }

    private static final android.animation.Animator n(android.view.View view, boolean z, float f) {
        float f2 = true != z ? f : 0.0f;
        if (true != z) {
            f = 0.0f;
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(f2, f);
        valueAnimatorOfFloat.addUpdateListener(defpackage.wrd.b(view));
        return valueAnimatorOfFloat;
    }

    private static final android.animation.Animator o(android.view.View view, boolean z) {
        android.animation.ValueAnimator valueAnimatorM = m(!z);
        valueAnimatorM.addUpdateListener(defpackage.wrd.a(view));
        return valueAnimatorM;
    }

    @Override // defpackage.wun
    public final android.animation.AnimatorSet a(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        android.view.View view;
        boolean z4;
        android.view.View viewB;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.Animator[] animatorArr = new android.animation.Animator[6];
        android.animation.ValueAnimator valueAnimatorM = m(z);
        defpackage.wut wutVar = this.a;
        long j2 = wutVar.w;
        valueAnimatorM.setDuration(j2);
        long j3 = 0;
        if (z) {
            j = 0;
            z2 = true;
        } else {
            j = wutVar.v;
            z2 = false;
        }
        valueAnimatorM.setStartDelay(j);
        valueAnimatorM.setInterpolator(z2 ? wutVar.u : wutVar.t);
        android.view.View viewA = null;
        valueAnimatorM.addUpdateListener(new defpackage.nv(this, 18, null));
        animatorArr[0] = valueAnimatorM;
        android.animation.ValueAnimator valueAnimatorM2 = m(z);
        valueAnimatorM2.setDuration(j2);
        if (z) {
            j3 = wutVar.v;
            z3 = true;
        } else {
            z3 = false;
        }
        valueAnimatorM2.setStartDelay(j3);
        valueAnimatorM2.setInterpolator(z3 ? wutVar.t : wutVar.u);
        valueAnimatorM2.addUpdateListener(defpackage.wrd.a(wutVar.l));
        animatorArr[1] = valueAnimatorM2;
        android.animation.ValueAnimator valueAnimatorM3 = m(z);
        valueAnimatorM3.setDuration(j2);
        valueAnimatorM3.setInterpolator(z ? wutVar.u : wutVar.t);
        valueAnimatorM3.addUpdateListener(new defpackage.nv(this, 17, null));
        animatorArr[2] = valueAnimatorM3;
        if (z) {
            view = wutVar.q.D;
            z4 = true;
        } else {
            view = wutVar.j;
            z4 = false;
        }
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(view.getWidth(), (z4 ? wutVar.j : wutVar.q.D).getWidth());
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.setInterpolator(z4 ? wutVar.u : wutVar.t);
        valueAnimatorOfInt.addUpdateListener(new defpackage.nv(this, 19, null));
        animatorArr[3] = valueAnimatorOfInt;
        animatorArr[4] = wutVar.d(z);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        com.google.android.material.appbar.AppBarLayout appBarLayoutD = wutVar.q.D();
        com.google.android.material.search.SearchBar searchBar = wutVar.q;
        if (searchBar != null && appBarLayoutD != null) {
            int i = searchBar.K;
            if (i != -1) {
                viewB = appBarLayoutD.findViewById(i);
            } else {
                android.view.ViewParent parent = searchBar.getParent();
                viewB = !(parent instanceof android.support.v7.widget.Toolbar) ? null : defpackage.wrp.b((android.support.v7.widget.Toolbar) parent);
            }
            com.google.android.material.search.SearchBar searchBar2 = wutVar.q;
            int i2 = searchBar2.L;
            if (i2 != -1) {
                viewA = appBarLayoutD.findViewById(i2);
            } else {
                android.view.ViewParent parent2 = searchBar2.getParent();
                if (parent2 instanceof android.support.v7.widget.Toolbar) {
                    viewA = defpackage.wrp.a((android.support.v7.widget.Toolbar) parent2);
                }
            }
            boolean zJ = defpackage.wqn.j(wutVar.q);
            int width = appBarLayoutD.getWidth();
            if (viewB != null) {
                android.graphics.Rect rectF = defpackage.wqn.f(appBarLayoutD, viewB);
                animatorSet2.playTogether(n(viewB, z, zJ ? width - rectF.left : -rectF.right));
                animatorSet2.playTogether(o(viewB, z));
            }
            if (viewA != null) {
                android.graphics.Rect rectF2 = defpackage.wqn.f(appBarLayoutD, viewA);
                animatorSet2.playTogether(n(viewA, z, zJ ? -rectF2.right : width - rectF2.left));
                animatorSet2.playTogether(o(viewA, z));
            }
            animatorSet2.setDuration(j2);
            animatorSet2.setInterpolator(defpackage.wlm.a);
        }
        animatorArr[5] = animatorSet2;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // defpackage.wun
    public final java.util.List b(boolean z) {
        defpackage.emv[] emvVarArr = new defpackage.emv[7];
        defpackage.wut wutVar = this.a;
        android.support.v7.widget.Toolbar toolbar = wutVar.f;
        emvVarArr[0] = l(z, toolbar);
        emvVarArr[1] = k(z, toolbar);
        android.support.v7.widget.Toolbar toolbar2 = wutVar.g;
        emvVarArr[2] = l(z, toolbar2);
        emvVarArr[3] = k(z, toolbar2);
        int iC = wutVar.c(wutVar.q) - wutVar.c(toolbar);
        emvVarArr[4] = i(wutVar.e, defpackage.emv.b, true != z ? 0 : iC, true != z ? iC : 0);
        emvVarArr[5] = j(z, wutVar.j);
        emvVarArr[6] = j(z, wutVar.i);
        return java.util.Arrays.asList(emvVarArr);
    }

    @Override // defpackage.wun
    public final void c(boolean z) {
        defpackage.wut wutVar = this.a;
        if (z) {
            wutVar.k(1.0f);
            wutVar.l.setAlpha(1.0f);
        } else {
            wutVar.k(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            wutVar.l.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            wutVar.q.setVisibility(0);
        }
        defpackage.wut wutVar2 = this.a;
        wutVar2.g.setVisibility(4);
        g(wutVar2.i, -2);
    }

    @Override // defpackage.wun
    public final void d(boolean z) {
        defpackage.wut wutVar = this.a;
        if (z) {
            wutVar.k(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            wutVar.f.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            wutVar.l.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            wutVar.q.setVisibility(4);
        } else {
            wutVar.k(1.0f);
            wutVar.l.setAlpha(1.0f);
        }
        this.a.g.setVisibility(0);
    }

    @Override // defpackage.wun
    public final void e() {
        defpackage.wut wutVar = this.a;
        android.widget.TextView textView = wutVar.q.D;
        java.lang.CharSequence text = textView.getText();
        android.widget.TextView textView2 = wutVar.i;
        textView2.setText(text);
        textView2.setHint(textView.getHint());
        textView2.setVisibility(0);
        if (wutVar.q.getBackground() != null && wutVar.q.getBackground().getConstantState() != null) {
            wutVar.g.setBackground(wutVar.q.getBackground().getConstantState().newDrawable());
        }
        android.support.v7.widget.Toolbar toolbar = wutVar.g;
        android.view.Menu menuF = toolbar.f();
        if (menuF != null) {
            menuF.clear();
        }
        if (wutVar.m()) {
            toolbar.m(wutVar.q.I);
            defpackage.wut.n(toolbar);
        }
    }

    @Override // defpackage.wun
    public final void f() {
    }
}
