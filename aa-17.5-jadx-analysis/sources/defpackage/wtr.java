package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class wtr implements wto {
    public final /* synthetic */ wtu a;

    public wtr(wtu wtuVar) {
        this.a = wtuVar;
    }

    public static final void g(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    private final int h(Toolbar toolbar) {
        wtu wtuVar = this.a;
        int iB = wtuVar.b(wtuVar.q);
        FrameLayout frameLayout = wtuVar.e;
        int paddingStart = frameLayout.getPaddingStart();
        int marginStart = ((ViewGroup.MarginLayoutParams) toolbar.getLayoutParams()).getMarginStart();
        return woy.J(wtuVar.q) ? (iB + wtuVar.q.getWidth()) - ((frameLayout.getWidth() - paddingStart) - marginStart) : (iB - paddingStart) - marginStart;
    }

    private final emp i(View view, emn emnVar, float f, float f2) {
        emp empVar = new emp(view, emnVar);
        empVar.s = woy.D(this.a.r, R.style.Motion_Material3_Spring_Standard_Default_Spatial);
        empVar.j(f);
        empVar.s.d(f2);
        return empVar;
    }

    private final emp j(boolean z, View view) {
        wtu wtuVar = this.a;
        TextView textView = wtuVar.q.E;
        if (TextUtils.isEmpty(textView.getText()) || z) {
            textView = wtuVar.q.D;
        }
        float fA = wtuVar.a(textView, view) - h(wtuVar.f);
        if (woy.J(wtuVar.q)) {
            fA += textView.getWidth() - view.getWidth();
        }
        float f = true != z ? 0.0f : fA;
        if (true == z) {
            fA = 0.0f;
        }
        return i(view, emp.a, f, fA);
    }

    private final emp k(boolean z, Toolbar toolbar) {
        int iH = h(toolbar);
        int i = true != z ? 0 : iH;
        if (true == z) {
            iH = 0;
        }
        return i(toolbar, emp.a, i, iH);
    }

    private final emp l(final boolean z, final Toolbar toolbar) {
        wtu wtuVar = this.a;
        int width = wtuVar.q.getWidth();
        FrameLayout frameLayout = wtuVar.e;
        int width2 = frameLayout.getWidth();
        int paddingStart = frameLayout.getPaddingStart() + frameLayout.getPaddingEnd();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wtuVar.f.getLayoutParams();
        int marginStart = (width2 - paddingStart) - (marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd());
        int i = true != z ? marginStart : width;
        if (true == z) {
            width = marginStart;
        }
        emp empVarI = i(toolbar, new wtq(), i, width);
        empVarI.g(new emj() { // from class: wtp
            @Override // defpackage.emj
            public final void a(emm emmVar, boolean z2, float f) {
                if (z) {
                    wtr.g(toolbar, -1);
                }
            }
        });
        return empVarI;
    }

    private static final ValueAnimator m(boolean z) {
        return ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
    }

    private static final Animator n(View view, boolean z, float f) {
        float f2 = true != z ? f : 0.0f;
        if (true != z) {
            f = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        valueAnimatorOfFloat.addUpdateListener(wqg.b(view));
        return valueAnimatorOfFloat;
    }

    private static final Animator o(View view, boolean z) {
        ValueAnimator valueAnimatorM = m(!z);
        valueAnimatorM.addUpdateListener(wqg.a(view));
        return valueAnimatorM;
    }

    @Override // defpackage.wto
    public final AnimatorSet a(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        View view;
        boolean z4;
        View viewB;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[6];
        ValueAnimator valueAnimatorM = m(z);
        wtu wtuVar = this.a;
        long j2 = wtuVar.w;
        valueAnimatorM.setDuration(j2);
        long j3 = 0;
        if (z) {
            j = 0;
            z2 = true;
        } else {
            j = wtuVar.v;
            z2 = false;
        }
        valueAnimatorM.setStartDelay(j);
        valueAnimatorM.setInterpolator(z2 ? wtuVar.u : wtuVar.t);
        View viewA = null;
        valueAnimatorM.addUpdateListener(new nt(this, 18, null));
        animatorArr[0] = valueAnimatorM;
        ValueAnimator valueAnimatorM2 = m(z);
        valueAnimatorM2.setDuration(j2);
        if (z) {
            j3 = wtuVar.v;
            z3 = true;
        } else {
            z3 = false;
        }
        valueAnimatorM2.setStartDelay(j3);
        valueAnimatorM2.setInterpolator(z3 ? wtuVar.t : wtuVar.u);
        valueAnimatorM2.addUpdateListener(wqg.a(wtuVar.l));
        animatorArr[1] = valueAnimatorM2;
        ValueAnimator valueAnimatorM3 = m(z);
        valueAnimatorM3.setDuration(j2);
        valueAnimatorM3.setInterpolator(z ? wtuVar.u : wtuVar.t);
        valueAnimatorM3.addUpdateListener(new nt(this, 17, null));
        animatorArr[2] = valueAnimatorM3;
        if (z) {
            view = wtuVar.q.D;
            z4 = true;
        } else {
            view = wtuVar.j;
            z4 = false;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getWidth(), (z4 ? wtuVar.j : wtuVar.q.D).getWidth());
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.setInterpolator(z4 ? wtuVar.u : wtuVar.t);
        valueAnimatorOfInt.addUpdateListener(new nt(this, 19, null));
        animatorArr[3] = valueAnimatorOfInt;
        animatorArr[4] = wtuVar.d(z);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AppBarLayout appBarLayoutD = wtuVar.q.D();
        SearchBar searchBar = wtuVar.q;
        if (searchBar != null && appBarLayoutD != null) {
            int i = searchBar.K;
            if (i != -1) {
                viewB = appBarLayoutD.findViewById(i);
            } else {
                ViewParent parent = searchBar.getParent();
                viewB = !(parent instanceof Toolbar) ? null : wqs.b((Toolbar) parent);
            }
            SearchBar searchBar2 = wtuVar.q;
            int i2 = searchBar2.L;
            if (i2 != -1) {
                viewA = appBarLayoutD.findViewById(i2);
            } else {
                ViewParent parent2 = searchBar2.getParent();
                if (parent2 instanceof Toolbar) {
                    viewA = wqs.a((Toolbar) parent2);
                }
            }
            boolean zJ = woy.J(wtuVar.q);
            int width = appBarLayoutD.getWidth();
            if (viewB != null) {
                Rect rectF = woy.F(appBarLayoutD, viewB);
                animatorSet2.playTogether(n(viewB, z, zJ ? width - rectF.left : -rectF.right));
                animatorSet2.playTogether(o(viewB, z));
            }
            if (viewA != null) {
                Rect rectF2 = woy.F(appBarLayoutD, viewA);
                animatorSet2.playTogether(n(viewA, z, zJ ? -rectF2.right : width - rectF2.left));
                animatorSet2.playTogether(o(viewA, z));
            }
            animatorSet2.setDuration(j2);
            animatorSet2.setInterpolator(wkn.a);
        }
        animatorArr[5] = animatorSet2;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // defpackage.wto
    public final List b(boolean z) {
        emp[] empVarArr = new emp[7];
        wtu wtuVar = this.a;
        Toolbar toolbar = wtuVar.f;
        empVarArr[0] = l(z, toolbar);
        empVarArr[1] = k(z, toolbar);
        Toolbar toolbar2 = wtuVar.g;
        empVarArr[2] = l(z, toolbar2);
        empVarArr[3] = k(z, toolbar2);
        int iC = wtuVar.c(wtuVar.q) - wtuVar.c(toolbar);
        empVarArr[4] = i(wtuVar.e, emp.b, true != z ? 0 : iC, true != z ? iC : 0);
        empVarArr[5] = j(z, wtuVar.j);
        empVarArr[6] = j(z, wtuVar.i);
        return Arrays.asList(empVarArr);
    }

    @Override // defpackage.wto
    public final void c(boolean z) {
        wtu wtuVar = this.a;
        if (z) {
            wtuVar.k(1.0f);
            wtuVar.l.setAlpha(1.0f);
        } else {
            wtuVar.k(BitmapDescriptorFactory.HUE_RED);
            wtuVar.l.setAlpha(BitmapDescriptorFactory.HUE_RED);
            wtuVar.q.setVisibility(0);
        }
        wtu wtuVar2 = this.a;
        wtuVar2.g.setVisibility(4);
        g(wtuVar2.i, -2);
    }

    @Override // defpackage.wto
    public final void d(boolean z) {
        wtu wtuVar = this.a;
        if (z) {
            wtuVar.k(BitmapDescriptorFactory.HUE_RED);
            wtuVar.f.setAlpha(BitmapDescriptorFactory.HUE_RED);
            wtuVar.l.setAlpha(BitmapDescriptorFactory.HUE_RED);
            wtuVar.q.setVisibility(4);
        } else {
            wtuVar.k(1.0f);
            wtuVar.l.setAlpha(1.0f);
        }
        this.a.g.setVisibility(0);
    }

    @Override // defpackage.wto
    public final void e() {
        wtu wtuVar = this.a;
        TextView textView = wtuVar.q.D;
        CharSequence text = textView.getText();
        TextView textView2 = wtuVar.i;
        textView2.setText(text);
        textView2.setHint(textView.getHint());
        textView2.setVisibility(0);
        if (wtuVar.q.getBackground() != null && wtuVar.q.getBackground().getConstantState() != null) {
            wtuVar.g.setBackground(wtuVar.q.getBackground().getConstantState().newDrawable());
        }
        Toolbar toolbar = wtuVar.g;
        Menu menuF = toolbar.f();
        if (menuF != null) {
            menuF.clear();
        }
        if (wtuVar.m()) {
            toolbar.m(wtuVar.q.I);
            wtu.n(toolbar);
        }
    }

    @Override // defpackage.wto
    public final void f() {
    }
}
