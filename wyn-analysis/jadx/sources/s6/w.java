package s6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class w extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f45278b;

    public /* synthetic */ w(y yVar, int i5) {
        this.f45277a = i5;
        this.f45278b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f45277a) {
            case 0:
                y yVar = this.f45278b;
                View view = yVar.f45286b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = yVar.f45287c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = yVar.f45289e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f45278b.i(0);
                break;
            case 3:
                this.f45278b.i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.f45278b.f45290f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.f45278b.f45292h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        y yVar = this.f45278b;
        switch (this.f45277a) {
            case 0:
                View view = yVar.f45294j;
                if ((view instanceof C4017d) && !yVar.f45282A) {
                    C4017d c4017d = (C4017d) view;
                    ValueAnimator valueAnimator = c4017d.f45137E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(c4017d.f45138F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = yVar.f45286b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = yVar.f45287c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = yVar.f45289e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(yVar.f45282A ? 0 : 4);
                }
                View view3 = yVar.f45294j;
                if ((view3 instanceof C4017d) && !yVar.f45282A) {
                    C4017d c4017d2 = (C4017d) view3;
                    ValueAnimator valueAnimator2 = c4017d2.f45137E;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    c4017d2.f45139G = false;
                    valueAnimator2.setFloatValues(c4017d2.f45138F, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                yVar.i(4);
                break;
            case 3:
                yVar.i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = yVar.f45292h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    yVar.f45292h.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = yVar.f45292h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup5 = yVar.f45290f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
