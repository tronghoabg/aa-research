package D9;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import k1.Y;
import k1.b0;
import k1.g0;
import t3.AbstractC4096p;
import x.C4412e;

/* loaded from: classes4.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2568c;

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f2566a = i5;
        this.f2567b = obj;
        this.f2568c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2566a) {
            case 1:
                ((Y) this.f2567b).c();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2566a) {
            case 0:
                super.onAnimationEnd(animator);
                ((ViewGroup) this.f2567b).animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).alpha(1.0f).setDuration(((Application) this.f2568c).getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
                break;
            case 1:
                ((Y) this.f2567b).e();
                break;
            case 2:
                g0 g0Var = (g0) this.f2567b;
                g0Var.f38830a.d(1.0f);
                b0.e((View) this.f2568c, g0Var);
                break;
            default:
                ((C4412e) this.f2567b).remove(animator);
                ((AbstractC4096p) this.f2568c).f45709m.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2566a) {
            case 1:
                ((Y) this.f2567b).d();
                break;
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                ((AbstractC4096p) this.f2568c).f45709m.add(animator);
                break;
        }
    }

    public c(AbstractC4096p abstractC4096p, C4412e c4412e) {
        this.f2566a = 3;
        this.f2568c = abstractC4096p;
        this.f2567b = c4412e;
    }
}
