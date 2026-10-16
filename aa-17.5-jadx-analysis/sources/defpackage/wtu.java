package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class wtu {
    public static final /* synthetic */ int x = 0;
    private static final TimeInterpolator y = wkn.a;
    private final ImageButton A;
    public final SearchView a;
    public final View b;
    public final ClippableRoundedCornerLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final Toolbar f;
    public final Toolbar g;
    public final TextView h;
    public final TextView i;
    public final EditText j;
    public final View k;
    public final TouchObserverFrameLayout l;
    public wkm m;
    public AnimatorSet n;
    public final wri o;
    public AnimatorSet p;
    public SearchBar q;
    public final Context r;
    public final wto s;
    public final TimeInterpolator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    private final View z;

    public wtu(Context context, SearchView searchView, boolean z) {
        this.r = context;
        this.a = searchView;
        this.b = searchView.a;
        this.z = searchView.c;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.b;
        this.c = clippableRoundedCornerLayout;
        this.d = searchView.e;
        this.e = searchView.f;
        this.f = searchView.g;
        this.g = searchView.h;
        this.h = searchView.i;
        this.i = searchView.j;
        this.j = searchView.k;
        this.A = searchView.l;
        this.k = searchView.m;
        this.l = searchView.n;
        this.o = new wri(clippableRoundedCornerLayout);
        TimeInterpolator timeInterpolator = y;
        this.t = woy.C(context, R.attr.motionEasingStandardAccelerateInterpolator, timeInterpolator);
        this.u = woy.C(context, R.attr.motionEasingStandardDecelerateInterpolator, timeInterpolator);
        this.v = woy.u(context, R.attr.motionDurationShort1, 100);
        this.w = woy.u(context, R.attr.motionDurationShort2, 100);
        this.s = z ? new wtr(this) : new wtt(this);
    }

    public static final void n(Toolbar toolbar) {
        ActionMenuView actionMenuViewA = wqs.a(toolbar);
        if (actionMenuViewA != null) {
            for (int i = 0; i < actionMenuViewA.getChildCount(); i++) {
                View childAt = actionMenuViewA.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private final void o(AnimatorSet animatorSet) {
        ImageButton imageButtonB = wqs.b(this.f);
        if (imageButtonB == null) {
            return;
        }
        Drawable drawableB = dth.b(imageButtonB.getDrawable());
        if (!this.a.q) {
            if (drawableB instanceof fu) {
                ((fu) drawableB).setProgress(1.0f);
            }
            if (drawableB instanceof wqa) {
                ((wqa) drawableB).a(1.0f);
                return;
            }
            return;
        }
        if (drawableB instanceof fu) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new nt((fu) drawableB, 14, null));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableB instanceof wqa) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new nt((wqa) drawableB, 15, null));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
        SearchBar searchBar = this.q;
        if (searchBar == null || searchBar.e() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new nt(imageButtonB, 16, null));
        animatorSet.playTogether(valueAnimatorOfFloat3);
    }

    public final int a(View view, View view2) {
        if (view != null) {
            return b(view) - b(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.q.getPaddingStart();
        int iB = b(this.q);
        return woy.J(this.q) ? (((iB + this.q.getWidth()) + marginStart) - paddingStart) - this.a.getRight() : (iB - marginStart) + paddingStart;
    }

    public final int b(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    public final int c(View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    public final Animator d(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(true != z ? 42L : 50L);
        valueAnimatorOfFloat.setStartDelay(true != z ? 0L : 250L);
        valueAnimatorOfFloat.setInterpolator(wqk.a(z, wkn.a));
        valueAnimatorOfFloat.addUpdateListener(wqg.a(this.A));
        return valueAnimatorOfFloat;
    }

    public final AnimatorSet e(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        o(animatorSet);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(wqk.a(z, wkn.b));
        return animatorSet;
    }

    public final AnimatorSet f(boolean z) {
        AnimatorSet animatorSetA = this.s.a(z);
        if (this.p == null) {
            animatorSetA.playTogether(e(z));
        }
        return animatorSetA;
    }

    public final AnimatorSet g(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(wqg.c(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        o(animatorSet);
        animatorSet.setInterpolator(wqk.a(z, wkn.b));
        animatorSet.setDuration(true != z ? 300L : 350L);
        return animatorSet;
    }

    public final AnimatorSet h() {
        j();
        SearchBar searchBar = this.q;
        SearchView searchView = this.a;
        if (searchBar == null) {
            if (searchView.j()) {
                this.j.clearFocus();
            }
            AnimatorSet animatorSetG = g(false);
            animatorSetG.addListener(new wtn(this, animatorSetG));
            animatorSetG.start();
            this.n = animatorSetG;
            return animatorSetG;
        }
        if (searchView.j()) {
            this.j.clearFocus();
        }
        wkm wkmVar = new wkm();
        AnimatorSet animatorSetF = f(false);
        wkmVar.a(animatorSetF);
        Iterator it = i(false).iterator();
        while (it.hasNext()) {
            wkmVar.b((emp) it.next());
        }
        wkmVar.c(new wtl(this, wkmVar, 0));
        wkmVar.e();
        this.m = wkmVar;
        return animatorSetF;
    }

    public final List i(boolean z) {
        return this.s.b(z);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void j() {
        wkm wkmVar = this.m;
        if (wkmVar != null) {
            ?? r3 = wkmVar.c;
            ArrayList arrayList = new ArrayList((Collection) r3);
            r3.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animator) arrayList.get(i)).end();
            }
            ?? r2 = wkmVar.d;
            ArrayList arrayList2 = new ArrayList((Collection) r2);
            r2.clear();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                emm emmVar = (emm) arrayList2.get(i2);
                if (emmVar instanceof emp) {
                    emp empVar = (emp) emmVar;
                    if (empVar.m()) {
                        empVar.l();
                    } else {
                        empVar.b();
                    }
                } else {
                    emmVar.b();
                }
            }
            wkmVar.e.clear();
            wkmVar.a = 0;
            wkmVar.b = false;
            this.m = null;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
    }

    public final void k(float f) {
        this.z.getBackground().mutate().setAlpha((int) (f * 255.0f));
    }

    public final void l(float f) {
        ActionMenuView actionMenuViewA;
        this.A.setAlpha(f);
        this.k.setAlpha(f);
        this.l.setAlpha(f);
        if (!this.a.r || (actionMenuViewA = wqs.a(this.f)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f);
    }

    public final boolean m() {
        Menu menuF;
        SearchBar searchBar = this.q;
        if (searchBar.I != -1 && this.a.r && (menuF = searchBar.f()) != null) {
            for (int i = 0; i < menuF.size(); i++) {
                if (menuF.getItem(i).isVisible()) {
                    return true;
                }
            }
        }
        return false;
    }
}
