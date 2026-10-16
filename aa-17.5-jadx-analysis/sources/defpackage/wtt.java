package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class wtt implements wto {
    public final /* synthetic */ wtu a;

    public wtt(wtu wtuVar) {
        this.a = wtuVar;
    }

    private final int g(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        wtu wtuVar = this.a;
        int iB = wtuVar.b(wtuVar.q);
        return woy.J(wtuVar.q) ? iB - marginEnd : ((iB + wtuVar.q.getWidth()) + marginEnd) - wtuVar.a.getWidth();
    }

    private final int h() {
        wtu wtuVar = this.a;
        FrameLayout frameLayout = wtuVar.e;
        return (wtuVar.c(wtuVar.q) + (wtuVar.q.getHeight() / 2)) - (frameLayout.getTop() + (frameLayout.getHeight() / 2));
    }

    private final Animator i(boolean z, View view) {
        wtu wtuVar = this.a;
        TextView textView = wtuVar.q.E;
        if (TextUtils.isEmpty(textView.getText()) || z) {
            textView = wtuVar.q.D;
        }
        int iB = wtuVar.b(textView) - wtuVar.b(view);
        if (woy.J(wtuVar.q)) {
            iB += textView.getWidth() - view.getWidth();
        }
        return k(z, view, iB, h());
    }

    private final AnimatorSet j(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Toolbar toolbar = this.a.f;
        ImageButton imageButtonB = wqs.b(toolbar);
        if (imageButtonB != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(r1.a(wqs.b(r1.q), imageButtonB), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat.addUpdateListener(wqg.b(imageButtonB));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(h(), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat2.addUpdateListener(wqg.c(imageButtonB));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewA = wqs.a(toolbar);
        if (actionMenuViewA != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(r1.a(wqs.a(r1.q), actionMenuViewA), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat3.addUpdateListener(wqg.b(actionMenuViewA));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(h(), BitmapDescriptorFactory.HUE_RED);
            valueAnimatorOfFloat4.addUpdateListener(wqg.c(actionMenuViewA));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(wqk.a(z, wkn.b));
        return animatorSet;
    }

    private static final Animator k(boolean z, View view, int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(wqg.b(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i2, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.addUpdateListener(wqg.c(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(wqk.a(z, wkn.b));
        return animatorSet;
    }

    @Override // defpackage.wto
    public final AnimatorSet a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        wtu wtuVar = this.a;
        if (wtuVar.p == null) {
            animatorSet.playTogether(j(z));
        }
        Animator[] animatorArr = new Animator[10];
        TimeInterpolator timeInterpolator = z ? wkn.a : wkn.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(true != z ? 250L : 300L);
        valueAnimatorOfFloat.setStartDelay(true != z ? 0L : 100L);
        valueAnimatorOfFloat.setInterpolator(wqk.a(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(wqg.a(wtuVar.b));
        animatorArr[0] = valueAnimatorOfFloat;
        long j = true != z ? 250L : 300L;
        wri wriVar = wtuVar.o;
        Rect rectK = wriVar.g;
        Rect rectF = wriVar.h;
        if (rectK == null) {
            rectK = woy.K(wtuVar.a);
        }
        if (rectF == null) {
            rectF = woy.F(wtuVar.c, wtuVar.q);
        }
        final Rect rect = new Rect(rectF);
        final float fC = wtuVar.q.C();
        float[] fArr = wtuVar.c.b;
        float[] fArrI = wriVar.i();
        int i = 6;
        final float[] fArr2 = {Math.max(fArr[0], fArrI[0]), Math.max(fArr[1], fArrI[1]), Math.max(fArr[2], fArrI[2]), Math.max(fArr[3], fArrI[3]), Math.max(fArr[4], fArrI[4]), Math.max(fArr[5], fArrI[5]), Math.max(fArr[6], fArrI[6]), Math.max(fArr[7], fArrI[7])};
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new wqj(rect), rectF, rectK);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wts
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float[] fArr3 = fArr2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = fArr3[0];
                TimeInterpolator timeInterpolator2 = wkn.a;
                float f2 = fC;
                float[] fArr4 = {((f - f2) * animatedFraction) + f2, ((fArr3[1] - f2) * animatedFraction) + f2, ((fArr3[2] - f2) * animatedFraction) + f2, ((fArr3[3] - f2) * animatedFraction) + f2, ((fArr3[4] - f2) * animatedFraction) + f2, ((fArr3[5] - f2) * animatedFraction) + f2, f2 + ((fArr3[6] - f2) * animatedFraction), f2 + (animatedFraction * (fArr3[7] - f2))};
                Rect rect2 = rect;
                this.a.a.c.a(rect2.left, rect2.top, rect2.right, rect2.bottom, fArr4);
            }
        });
        valueAnimatorOfObject.setDuration(j);
        TimeInterpolator timeInterpolator2 = wkn.b;
        valueAnimatorOfObject.setInterpolator(wqk.a(z, timeInterpolator2));
        animatorArr[1] = valueAnimatorOfObject;
        animatorArr[2] = wtuVar.d(z);
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setDuration(true != z ? 83L : 150L);
        valueAnimatorOfFloat2.setStartDelay(true != z ? 0L : 75L);
        TimeInterpolator timeInterpolator3 = wkn.a;
        valueAnimatorOfFloat2.setInterpolator(wqk.a(z, timeInterpolator3));
        View view = wtuVar.k;
        TouchObserverFrameLayout touchObserverFrameLayout = wtuVar.l;
        valueAnimatorOfFloat2.addUpdateListener(wqg.a(view, touchObserverFrameLayout));
        animatorArr2[0] = valueAnimatorOfFloat2;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat3.setDuration(j);
        valueAnimatorOfFloat3.setInterpolator(wqk.a(z, timeInterpolator2));
        valueAnimatorOfFloat3.addUpdateListener(wqg.c(view));
        animatorArr2[1] = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat4.setDuration(j);
        valueAnimatorOfFloat4.setInterpolator(wqk.a(z, timeInterpolator2));
        valueAnimatorOfFloat4.addUpdateListener(new wqg(new wqe(0), touchObserverFrameLayout));
        animatorArr2[2] = valueAnimatorOfFloat4;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        View view2 = wtuVar.d;
        animatorArr[4] = k(z, view2, g(view2), h());
        Toolbar toolbar = wtuVar.g;
        animatorArr[5] = k(z, toolbar, g(toolbar) - (wtuVar.q.getPaddingEnd() - toolbar.getPaddingEnd()), h());
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat5.setDuration(j);
        valueAnimatorOfFloat5.setInterpolator(wqk.a(z, timeInterpolator2));
        if (wtuVar.a.r) {
            valueAnimatorOfFloat5.addUpdateListener(new wqb(wqs.a(toolbar), wqs.a(wtuVar.f)));
        }
        animatorArr[6] = valueAnimatorOfFloat5;
        EditText editText = wtuVar.j;
        animatorArr[7] = i(z, editText);
        animatorArr[8] = i(z, wtuVar.h);
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (wtuVar.q != null && !TextUtils.equals(editText.getText(), wtuVar.q.F())) {
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat6.addUpdateListener(new nt(this, 20, null));
            animatorSet3.playTogether(valueAnimatorOfFloat6);
        }
        if (wtuVar.q != null && TextUtils.equals(editText.getText(), wtuVar.q.F())) {
            Rect rect2 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(wtuVar.q.D.getWidth(), editText.getWidth());
            valueAnimatorOfInt.addUpdateListener(new ocf(this, rect2, i));
            animatorSet3.playTogether(valueAnimatorOfInt);
        }
        animatorSet3.setDuration(j);
        animatorSet3.setInterpolator(wqk.a(z, timeInterpolator3));
        animatorArr[9] = animatorSet3;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // defpackage.wto
    public final List b(boolean z) {
        return new ArrayList();
    }

    @Override // defpackage.wto
    public final void c(boolean z) {
        float f = true != z ? BitmapDescriptorFactory.HUE_RED : 1.0f;
        wtu wtuVar = this.a;
        wtuVar.l(f);
        EditText editText = wtuVar.j;
        editText.setAlpha(1.0f);
        SearchBar searchBar = wtuVar.q;
        if (searchBar != null) {
            searchBar.D.setAlpha(1.0f);
        }
        editText.setClipBounds(null);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = wtuVar.c;
        clippableRoundedCornerLayout.a = null;
        clippableRoundedCornerLayout.b = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        clippableRoundedCornerLayout.invalidate();
        if (z) {
            return;
        }
        wtuVar.o.i = null;
    }

    @Override // defpackage.wto
    public final void d(boolean z) {
        this.a.l(true != z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.wto
    public final void e() {
        wtu wtuVar = this.a;
        Toolbar toolbar = wtuVar.g;
        Menu menuF = toolbar.f();
        if (menuF != null) {
            menuF.clear();
        }
        if (!wtuVar.m()) {
            toolbar.setVisibility(8);
            return;
        }
        toolbar.m(wtuVar.q.I);
        wtu.n(toolbar);
        toolbar.setVisibility(0);
    }

    @Override // defpackage.wto
    public final void f() {
        j(false).start();
    }
}
